package ast;

public class NodoDeclaracion extends NodoBase{
	
	
    private String tipo;
	private NodoBase secuencia,vector;
	

	
	public NodoDeclaracion(String tipo, NodoBase secuencia) {
		super();
		this.vector=null;
		this.tipo=tipo;
		this.secuencia = secuencia;
	
	}
	
	public NodoDeclaracion(String tipo,NodoBase secuencia, NodoBase vector) {
		super();
		
		this.tipo=tipo;
		this.vector=vector;
		this.secuencia = secuencia;
		
	}


	
	public NodoDeclaracion() {
		super();
		this.tipo=null;
		this.secuencia=null;
		this.vector=null;
	

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
