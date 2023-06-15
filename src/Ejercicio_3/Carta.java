package Ejercicio_3;

import java.util.Scanner;

public class Carta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private Integer num;
    private String palo;

    public Carta() {
    }

    public Carta(Integer num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num + " de " + palo;
    }
    
    
}
