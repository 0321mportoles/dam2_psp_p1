package psp_p1;

import java.util.Random;
import java.util.concurrent.Callable;

public class Cliente  extends Thread {
	private Cartera miCartera;
	private String nombre;
	
	public Cliente(String nombre, double cantidad) {
		super();
		this.nombre = nombre;
		miCartera = new Cartera(cantidad);
	}   

	public void run() {
		do {
			try {
				this.sleep(1000); // wait 1 second
				Random aleatorio = new Random();
		        int dineroAumentado = aleatorio.nextInt(101);
				miCartera.aumentarDinero(dineroAumentado);
				System.out.println("Soy el Cliente ("+ this.nombre +") y he aumentado " + dineroAumentado + " dinero en mi cuenta. Ahora tengo: " + miCartera.getDinero());
			} catch (InterruptedException e) {
				return;
			}
		} while (true);
    	
    }
}