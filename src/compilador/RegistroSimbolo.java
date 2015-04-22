package compilador;

import ast.NodoBase;

public class RegistroSimbolo {
	private String id;
	private int fila;
	private int columna;
	private int dir;
	private String ambito;
    private String tipo;
    private Object valor;
    private NodoBase vector=null;
        
	public RegistroSimbolo(String id, int fila,int columna,int dir,String ambito,String tipo, Object valor,NodoBase vector) {
		super();
		this.id = id;
		this.fila = fila;
		this.columna = columna;
		this.dir = dir;
        this.ambito = ambito;
        this.tipo = tipo;
        this.valor=valor;
        this.vector=vector;
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
	public NodoBase getvector() {
		return this.vector;
	}
	public int getdir() {
		return this.dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}
}
