package Ejercicio_2;

import java.util.Random;

public class Revolver {

    private int posActual;
    private int posAgua;

    public Revolver() {
    }

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    public void llenarRevolver() {
        Random rand = new Random();
        this.posActual = rand.nextInt(6) + 1;
        this.posAgua = rand.nextInt(6) + 1;
    }

    public boolean mojar() {
        boolean aux = false;
        if (posActual == posAgua) {
            aux = true;
        }
        return aux;
    }

    public void siguienteChorro() {
        if (posActual == 6) {
            setPosActual(1);
        } else {
            posActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
}
