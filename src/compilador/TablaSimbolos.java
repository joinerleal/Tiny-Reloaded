package compilador;

import java.util.*;

import ast.NodoAsignacion;
import ast.NodoBase;
import ast.NodoDeclaracion;
import ast.NodoEscribir;
import ast.NodoIdentificador;
import ast.NodoIf;
import ast.NodoOperacion;
import ast.NodoRepeat;
import ast.NodoSub;

public class TablaSimbolos {
	
	// Tablas hash
	private HashMap<String, RegistroSimbolo> tablambitos; // K= String  ambito V= simbolos (clase RegistroSimbolo)
	private HashMap<String, RegistroSimbolo> tablasimbolos; // K= string identificador V= simbolos (clase RegistroSimbolo)
	private HashMap<String, HashMap<String, RegistroSimbolo>> ambito; // K=  string ambito V= TablaSimbolos (tabla Hash) 
	NodoBase aux; String amb;
	
	
	private int direccion;  //Contador de las localidades de memoria asignadas a la tabla
	
	public TablaSimbolos() {
		
		super();
		
	    tablambitos = new HashMap<String,RegistroSimbolo>();
	    tablasimbolos = new HashMap<String,RegistroSimbolo>();
	    ambito = new HashMap<String, HashMap<String, RegistroSimbolo>>();
		direccion=0; aux=null;
	}

	public void cargarTabla(NodoBase raiz){
		
		while (raiz != null) {
			
		
	    if (raiz instanceof NodoDeclaracion){
	    	
	    	aux=((NodoDeclaracion) raiz).getsecuencia();
	    	InsertarSimbolo(((NodoIdentificador) aux).getNombre(),-1,((NodoDeclaracion) raiz).gettipo(),null,amb);
	    	
	    	while(aux.TieneHermano())
	    	{	
	    		
	    		aux=aux.getHermanoDerecha(); 
		    	InsertarSimbolo(((NodoIdentificador) aux).getNombre(),-1,((NodoDeclaracion) raiz).gettipo(),null,amb);

	    		//TODO: Añadir el numero de linea y localidad de memoria correcta
	    	}
	    	
	    	
	    	
	    }

	    /* Hago el recorrido recursivo */
	    if (raiz instanceof  NodoSub){
	    	
	    	if(!((NodoSub)raiz).getmain())
	    	{	NodoBase Identificador=((NodoSub)raiz).getnombre();
	    		amb= (((NodoIdentificador)Identificador).getNombre());
	    		cargarTabla(((NodoSub)raiz).getcuerpo());
		    	cargarTabla(((NodoSub)raiz).getParametros());
	    	}else{
	    		amb="main";
	    		cargarTabla(((NodoSub)raiz).getcuerpo());
		    
	    	}
	    	
	    	
	    }
	    
	     if (raiz instanceof  NodoIf){
	    	cargarTabla(((NodoIf)raiz).getPrueba());
	    	cargarTabla(((NodoIf)raiz).getParteThen());
	    	if(((NodoIf)raiz).getParteElse()!=null){
	    		cargarTabla(((NodoIf)raiz).getParteElse());
	    	}
	    }
	    else if (raiz instanceof  NodoRepeat){
	    	cargarTabla(((NodoRepeat)raiz).getCuerpo());
	    	cargarTabla(((NodoRepeat)raiz).getPrueba());
	    }
	    else if (raiz instanceof  NodoAsignacion)
	    	cargarTabla(((NodoAsignacion)raiz).getExpresion());
	    else if (raiz instanceof  NodoEscribir)
	    	cargarTabla(((NodoEscribir)raiz).getExpresion());
	    else if (raiz instanceof NodoOperacion){
	    	cargarTabla(((NodoOperacion)raiz).getOpIzquierdo());
	    	cargarTabla(((NodoOperacion)raiz).getOpDerecho());
	    }
	    raiz = raiz.getHermanoDerecha();  
	  }
	}
	
	//true es nuevo no existe se insertara, false ya existe NO se vuelve a insertar 
	public boolean InsertarSimbolo(String identificador, int numLinea,String tipo,Object valor,String amb){
		RegistroSimbolo simbolo;
		if(tablasimbolos.containsKey(identificador)){
			
			System.err.println("[ERROR Semántico] Declaracion duplicada, variable: "+identificador);
			return false;
		}else{
			simbolo=new RegistroSimbolo(identificador,numLinea,direccion++,amb,tipo,valor);
			tablasimbolos.put(identificador,simbolo);
			return true;			
		}
	}
	
	public RegistroSimbolo BuscarSimbolo(String identificador){
		RegistroSimbolo simbolo=(RegistroSimbolo)tablambitos.get(identificador);
		return simbolo;
	}
	
	public void ImprimirClaves(){
		System.out.println("*** Tabla de Simbolos ***");
		for( Iterator <String>it = tablambitos.keySet().iterator(); it.hasNext();) { 
			String s = (String)it.next();
	  //  System.out.println("Consegui Key: "+s+" con direccion: " + BuscarSimbolo(s).getDireccionMemoria());
		}
	}

	public int getDireccion(String Clave){
		return BuscarSimbolo(Clave).getdir();
	}
	
	/*
	 * TODO:
	 * 1. Crear lista con las lineas de codigo donde la variable es usada.
	 * */
}
