package ast;

public class NodoProc extends NodoBase{

	
	
	private NodoIdentificador nombre;
	private NodoBase Parametros;
	private NodoBase Cuerpo;


	
	public NodoProc( NodoIdentificador nombre, NodoBase parametros, NodoBase cuerpo) {
		super();
	
		this.nombre = nombre;
		this.Parametros = parametros;
		this.Cuerpo = cuerpo;

	}
	
	public NodoProc(NodoIdentificador nombre,NodoBase cuerpo) {
		super();
		this.nombre = nombre;
		this.Cuerpo = cuerpo;
		
	}
	
	public NodoProc( ) {
		super();
		this.nombre = null;
		this.Cuerpo = null;
	}
	

	public NodoBase getParametros() {
		return Parametros;
	}

	public NodoBase getcuerpo() {
		return Cuerpo;
	}
	public NodoIdentificador getnombre() {
		return nombre;
	}
	
	public void  setParametros(NodoBase parametros) {
		this.Parametros = parametros;
	}

	public void  setcuerpo(NodoBase cuerpo) {
		this.Cuerpo = cuerpo;
	}
	public void  setnombre(NodoIdentificador nombre) {
		this.nombre = nombre;
	}


	
	
	
	
}
