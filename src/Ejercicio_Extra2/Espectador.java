package Ejercicio_Extra2;


public record Espectador(String nombre, int edad, double dineroDisponible) {

    @Override
    public String toString() {
        return "Espectador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dineroDisponible=" + dineroDisponible +
                '}';
    }

}
