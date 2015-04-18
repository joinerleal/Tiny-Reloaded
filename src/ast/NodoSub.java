package ast;

public class NodoSub extends NodoBase {

	private String Tipo;

	private NodoBase Parametros,nombre;
	private NodoBase Cuerpo;
	private NodoBase retorno;
	private boolean main=false;

	
	public NodoSub(String tipo, NodoBase nombre, NodoBase parametros, NodoBase cuerpo, NodoBase retorno ) {
		super();
		this.Tipo = tipo;
		this.nombre = nombre;
		this.Parametros = parametros;
		this.Cuerpo = cuerpo;
		this.retorno = retorno;
		
		if(tipo==null) main=true;
	}
	

	
	
	public NodoSub( ) {
		super();
		this.Tipo = null;
		this.nombre = null;
		this.Cuerpo = null;
		this.retorno = null;	
	}
	
	public String getTipo() {
		return Tipo;
	}
	public NodoBase getParametros() {
		return Parametros;
	}
	public NodoBase getRetorno() {
		return retorno;
	}
	public NodoBase getcuerpo() {
		return Cuerpo;
	}
	public NodoBase getnombre() {
		return nombre;
	}
	public boolean getmain() {
		return main;
	}

	public void setTipo(String tipo) {
		this.Tipo = tipo;
	}
	public void  setParametros(NodoBase parametros) {
		this.Parametros = parametros;
	}
	public void  setRetorno(NodoBase Retorno) {
		this.retorno = Retorno;
	}
	public void  setcuerpo(NodoBase cuerpo) {
		this.Cuerpo = cuerpo;
	}
	public void  setnombre(NodoBase nombre) {
		this.nombre = nombre;
	}


	
	
	
	
	
}
