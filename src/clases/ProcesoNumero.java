package clases;

import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.util.logging.Level;
import javax.swing.Timer;

public class ProcesoNumero extends Thread {

    private int contador;

    public ProcesoNumero(int contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        while (contador <= 100) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(ProcesoNumero.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(contador);
            contador++;
        }
    }

    public int getContador() {
        return contador;
    }
    
}
