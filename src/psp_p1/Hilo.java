package psp_p1;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import javax.management.monitor.Monitor;

public class Hilo extends Thread {
    private int x;
    private int milisegundos;

    //CONSTRUCTOR
    public Hilo(int x, int segundos) {
        this.x = x;
        this.milisegundos = segundos;
    }

    public void run() {
    	try {
    		System.out.println("Soy hilo " + x + " y me pongo " + milisegundos/1000  +" segundos a dormir");
			sleep(this.milisegundos);
			System.out.println("Soy hilo " + x + " y he terminado de dormir");
		} catch (InterruptedException e) {
			return;
		}	
    }
    
	public static Callable<String> tarea(Hilo hilo) {
		
		return ()->{
			System.out.println("Inicio Hilo" + hilo.x);
			try {
				TimeUnit.MILLISECONDS.sleep(hilo.milisegundos);
				System.out.println("Finaliza Hilo " + hilo.x);
				return "Resultado hilo " + hilo.x;
			} catch (InterruptedException e) {
				System.out.println("Sleep ha interrumpido el Hilo " + hilo.x);
				return null;
			}
		};
	}
}