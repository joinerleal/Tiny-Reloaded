package ast;

public class NodoSummon extends NodoBase{
	
    private String nombre;
	private NodoBase Parametros;
	

	
	public NodoSummon(String nombre, NodoBase parametros) {
		super();
		
		this.nombre=nombre;
		this.Parametros = parametros;
		

	}
	
	public NodoSummon(String nombre) {
		super();
		this.nombre=nombre;

	}
	

	

	public String getnombre() {
		return nombre;
	}
	public NodoBase getParametros() {
		return Parametros;
	}
	public void  setParametros(NodoBase parametros) {
		this.Parametros = parametros;
	}
	
	public void  setnombre(String nombre) {
		this.nombre = nombre;
	}
	

	
	
	
	

}
