package ast;

public class NodoFuncion extends NodoBase {

	private String Tipo,nombre;

	private NodoBase Parametros;
	private NodoBase Cuerpo;
	private NodoBase retorno;

	
	public NodoFuncion(String tipo, String nombre, NodoBase parametros, NodoBase cuerpo, NodoBase retorno ) {
		super();
		this.Tipo = tipo;
		this.nombre = nombre;
		this.Parametros = parametros;
		this.Cuerpo = cuerpo;
		this.retorno = retorno;

	}
	
	public NodoFuncion(String tipo, String nombre,NodoBase cuerpo, NodoBase retorno ) {
		super();
		this.Tipo = tipo;
		this.nombre = nombre;
		this.Cuerpo = cuerpo;
		this.retorno = retorno;	
	}
	
	public NodoFuncion( ) {
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
	public String getnombre() {
		return nombre;
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
	public void  setnombre(String nombre) {
		this.nombre = nombre;
	}


	
	
	
	
	
}
