package compilador;

public class RegistroSimbolo {
	private String id;
	private int fila;
	private int columna;
	private int dir;
	private String ambito;
    private String tipo;
    private Object valor;
    private int vector;
        
	public RegistroSimbolo(String id, int fila,int columna,int dir,String ambito,String tipo, Object valor) {
		super();
		this.id = id;
		this.fila = fila;
		this.columna = columna;
		this.dir = dir;
        this.ambito = ambito;
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
	public String getambito() {
		return this.ambito;
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
