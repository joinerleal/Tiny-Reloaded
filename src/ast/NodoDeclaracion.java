package ast;

public class NodoDeclaracion extends NodoBase{
	
	
    private String tipo;
	private NodoBase secuencia,vector;
	private int linea,columna;
	

	
	public NodoDeclaracion(String tipo, NodoBase secuencia,int linea, int columna) {
		super();
		this.vector=null;
		this.tipo=tipo;
		this.secuencia = secuencia;
		this.linea=linea;
		this.columna=columna;
	
	}
	
	public NodoDeclaracion(String tipo,NodoBase secuencia, NodoBase vector,int linea,int columna) {
		super();
		
		this.tipo=tipo;
		this.vector=vector;
		this.secuencia = secuencia;
		this.linea=linea;
		this.columna=columna;
		
	}


	
	public NodoDeclaracion() {
		super();
		this.tipo=null;
		this.secuencia=null;
		this.vector=null;
	

	}
	public int getcolumna() {
		return columna;
	}
	public int getlinea() {
		return linea;
	}
	public String gettipo() {
		return tipo;
	}
	public NodoBase getsecuencia() {
		return secuencia;
	}
	public void  setsecuencia(NodoBase secuencia) {
		this.secuencia = secuencia;
	}
	
	public void  setnombre(String tipo) {
		this.tipo = tipo;
	}
	

	
	

	
	
}
