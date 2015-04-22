package compilador;

import ast.*;
import java_cup.runtime.*;

public class Compilador {
	
	
	
	/***********
	SymbolFactory es una nueva caracteristica que ha sido añadida a las version 11a de cup, la cual facilita la implementacion de clases Symbol personalizadas
	, esto debido a que dicha clase no provee mucha información de contexto que podria ser util para el analisis semantico o ayudar en la construccion del AST
	Mas informacion en: http//4thmouse.com/index.php/2007/02/15/using-custom-symbols-in-cup/
	***********/

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("deprecation")
		DefaultSymbolFactory sf = new DefaultSymbolFactory();
		
		parser parser_obj=null; Scanner lexico; 
	 
	   
		System.out.println("\nCompilador del lenguaje tiny  // René Martinez y Joiner Leal \n\n");
		
		/*if (args.length==0) 
			parser_obj=new parser(lexico,sf);
		else */
		 
		   lexico = new Scanner(new java.io.FileInputStream("./prueba.txt"),sf);
		  parser_obj=new parser(lexico,sf);
		  parser_obj.parse();
          if(!lexico.error())
          {
  			System.out.println("\n\nAnalisis Lexico sin errores.");

      	     
      		if(!parser_obj.gethayerrores()){	
				
    			System.out.println("Analisis sintactico sin errores, arbol generado. \n");

    			NodoBase root=parser_obj.action_obj.getASTroot();
    		/*	System.out.println("IMPRESION DEL AST GENERADO");
    			System.out.println();
    			ast.Util.imprimirAST(root); */
    			
    			TablaSimbolos ts = new TablaSimbolos();
    			ts.cargarTabla(root);
    			ts.ImprimirClaves();
    			
    			
					//UtGen.debug=true; //NO muestro mensajes de depuracion del generador (UTGen) para que el codigo sea compatible con la version visual de la TM
					//Para ver depuracion de analisis sintactico se debe ir al parser.java y colocar modoDepuracion en true
				
		
    		 /* //REALIZAR ACA ANALISIS SEMANTICO
    			Generador.setTablaSimbolos(ts);
    			Generador.generarCodigoObjeto(root); */
    			
    		}
    		else
    		System.out.println("Errores encontrados en analisis sintactico.");
          
          }
          else
      		System.out.println("\n\nErrores encontrados en analisis lexico/sintactico");


	

	}

}
