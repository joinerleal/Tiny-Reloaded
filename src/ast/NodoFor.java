package ast;

public class NodoFor extends NodoBase {
	
	private NodoBase cuerpo;
	private NodoBase variable,condicion,incremento;
	
	public NodoFor(NodoBase variable, NodoBase condicion, NodoBase incremento, NodoBase cuerpo) {
		super();
		
		this.variable = variable;
		this.condicion = condicion;
		this.incremento = incremento;
		this.cuerpo = cuerpo;
	}
	
	public NodoFor() {
		super();
		this.variable = null;
		this.condicion = null;
		this.incremento = null;
		this.cuerpo = null;
	}

	public NodoBase getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(NodoBase cuerpo) {
		this.cuerpo = cuerpo;
	}

	public NodoBase getcondicion() {
		return condicion;
	}

	public void setcondicion(NodoBase condicion) {
		this.condicion = condicion;
	}
	
	public NodoBase getincremento() {
		return incremento;
	}

	public void setincremento(NodoBase incremento) {
		this.incremento = incremento;
	}
	public NodoBase getvariable() {
		return variable;
	}

	public void setvariable(NodoBase variable) {
		this.variable = variable;
	}
	

}
