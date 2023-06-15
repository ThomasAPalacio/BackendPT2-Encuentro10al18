package Ejercicio_2;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(Revolver r1) {
        boolean esMojado = false;
        System.out.println("El jugador " + id + " se apunta y...");

        if (r1.mojar() == true) {
            System.out.println(" se MOJA");
            mojado = true;
            esMojado = true;
        } else {
            System.out.println(" se SALVA");
            r1.siguienteChorro();
        }
        return esMojado;
    }
}
