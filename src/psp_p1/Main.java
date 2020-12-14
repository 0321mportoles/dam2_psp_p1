package psp_p1;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ArrayList<Thread> arrayThreads = new ArrayList<Thread>();
        Random aleatorio = new Random();
        
        for(int x = 0; x < 100; x++) {
        	int segundos = aleatorio.nextInt(5)+1;
            Hilo hilo1 = new Hilo(x, segundos * 1000);
//            Thread thread1 = new Thread(hilo1);

            arrayThreads.add(hilo1);
//            synchronized(hilo1) {
//	        	hilo1.sleep(segundos * 1000);
//            }
        }

        for(int x = 0; x<100; x++) {
            arrayThreads.get(x).start();
        }

      
		
    }

}

