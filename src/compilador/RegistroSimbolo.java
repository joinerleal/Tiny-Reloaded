package compilador;

public class RegistroSimbolo {
	private String id;
	private int linea;
	private int dir;
	private String ambito;
    private String tipo;
    private Object valor;
        
	public RegistroSimbolo(String id, int linea,int dir,String ambito,String tipo, Object valor) {
		super();
		this.id = id;
		this.linea = linea;
		this.dir = dir;
        this.ambito = ambito;
        this.tipo = tipo;
        this.valor=valor;
	}

	public String getid() {
		return this.id;
	}

	public int getNumLinea() {
		return this.linea;
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
