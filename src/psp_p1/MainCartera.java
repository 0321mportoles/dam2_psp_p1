package psp_p1;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainCartera {

    public static void main(String[] args) {
        ArrayList<Thread> arrayThreads = new ArrayList<Thread>();
        Random aleatorio = new Random();
        String nombres [] = {"Pepe", "Marta", "Mario", "Dani", "Roberto", "Pepito", "Edelmiro", "Francisco", "Ana", "Bea"};
        
        for(int x = 0; x < 10; x++) {
        	int dinero = aleatorio.nextInt(5000)+1000;
            Cliente cliente = new Cliente(nombres[x], dinero);
            Worker worker = new Worker(nombres[x], dinero);
            
            arrayThreads.add(cliente);
            arrayThreads.add(worker);
        }

        for(int x = 0; x<arrayThreads.size(); x++) {
            arrayThreads.get(x).start();
        }
    }
}

