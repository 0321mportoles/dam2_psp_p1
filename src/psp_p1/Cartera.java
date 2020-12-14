package psp_p1;

import java.util.Random;

public class Cartera {
	
	private double dinero;

	public Cartera(double cantidad) {
		this.dinero = cantidad;
	}

	public double getDinero() {
		return this.dinero;
	}

	public void setDinero(double cantidad) {
		this.dinero = cantidad;
	}

	public synchronized void aumentarDinero(double cantidad) {
		this.dinero = cantidad + this.dinero;
	}

	public synchronized void decrementarDinero(double cantidad) {
		this.dinero = this.dinero - cantidad;
	}
}
