package compilador;

public class RegistroAmbito {

	
	private String id;
	private int fila;
	private int columna;
	private int dir;
	private String retorno;
    private String tipo;
    private Object valor;
  
        
	public RegistroAmbito(String id, int fila,int columna,int dir,String retorno,String tipo, Object valor) {
		super();
		this.id = id;
		this.fila = fila;
		this.columna = columna;
		this.dir = dir;
        this.retorno = retorno;
        this.tipo = tipo;
        this.valor=valor;
	}

	public String getid() {
		return this.id;
	}

	public int getNumFila() {
		return this.fila;
	}
	public int getNumColumna() {
		return this.columna;
	}
	public String getRetorno() {
		return this.retorno;
	}
	public String gettipo() {
		return this.tipo;
	}

	public int getdir() {
		return this.dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}
}
