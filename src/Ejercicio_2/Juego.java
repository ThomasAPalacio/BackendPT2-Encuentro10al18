package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Jugador> lista = new ArrayList<>();
    private Revolver pistola;

    public Juego() {
    }

    public Juego(Revolver pistola, List<Jugador> lista) {
        this.pistola = pistola;
        this.lista = lista;
    }

    public List<Jugador> getLista() {
        return lista;
    }

    public void setLista(List<Jugador> lista) {
        this.lista = lista;
    }

    public Revolver getPistola() {
        return pistola;
    }

    public void setPistola(Revolver pistola) {
        this.pistola = pistola;
    }

    public void llenarJuego(ArrayList<Jugador> lista, Revolver pistola) {
        this.lista = lista;
        this.pistola = pistola;
    }

    public void ronda() {
        Random rand = new Random();

        int turno = rand.nextInt(lista.size());

        while (true) {
            Jugador j1 = lista.get(turno);
            System.out.println("La posicion del tambor es: " + pistola.getPosActual());
            System.out.println(j1.getNombre() + " es tu turno");
            System.out.println("Presiona enter para disparar");
            leer.nextLine();

            if (j1.disparo(pistola)) {
                System.out.println(j1.getNombre() + " usted ha perdido");
                System.out.println(pistola.getPosAgua());
                j1.setMojado(true);
            } else {
                System.out.println("Estuviste cerca... siga jugando");
                turno++;

                if (turno == lista.size()) {
                    turno = 0;
                }
            }
            System.out.println("Proximo turno");

            if (j1.isMojado()) {
                System.out.println(j1.getNombre() + " perdio");
                System.out.println("El juego termino: ");
                System.out.println("La posicion: " + pistola.getPosActual());
                System.out.println("La posicion del agua: " + pistola.getPosAgua());
                break;
            }
        }
    }
}
