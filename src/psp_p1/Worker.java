package psp_p1;

import java.util.Random;

public class Worker  extends Thread {
	private Cartera miCartera;
	private String nombre;
	
	public Worker(String nombre, double cantidad) {
		super();
		this.nombre = nombre;
		miCartera = new Cartera(cantidad);
	}    

	public void run() {
		do {
			try {
				this.sleep(1000); // wait 1 second
				Random aleatorio = new Random();
		        int dineroDecrementado = aleatorio.nextInt(101);
				miCartera.decrementarDinero(dineroDecrementado);
				System.out.println("Soy el Worker (" + this.nombre + ") y he decrementado " + dineroDecrementado + " dinero en mi cuenta. Ahora tengo: " + miCartera.getDinero());
			} catch (InterruptedException e) {
				return;
			}
		} while (true);
    	
    }
}