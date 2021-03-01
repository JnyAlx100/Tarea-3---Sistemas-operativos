package clases;

import java.util.logging.Level;

public class ProcesoLetra extends Thread{
    
    private int contador;
    private char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                            'n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    private char letra;

    public ProcesoLetra(char letra) {
        for (int x = 0; x < alfabeto.length; x++) {
            if (alfabeto[x] == letra) {
                contador = x;
                break;
            }
        }
        this.letra = letra;
    }
    
    @Override
    public void run() {
        while (contador <= 26) {
            letra = alfabeto[contador];
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(ProcesoLetra.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(letra);
            contador++;
        }
    }

    public char getLetra() {
        return letra;
    }
    
}
