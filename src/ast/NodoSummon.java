package ast;

public class NodoSummon extends NodoBase{
	

	private NodoBase Parametros;
	

	
	public NodoSummon(NodoBase parametros) {
		super();
		
		this.Parametros = parametros;
		

	}
	
	public NodoSummon() {
		super();

	}
	

	
	
	public NodoBase getParametros() {
		return Parametros;
	}

	
	public void  setParametros(NodoBase parametros) {
		this.Parametros = parametros;
	}
	

	
	
	
	

}
