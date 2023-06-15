package Ejercicio_Extra1;

public enum Razas {

    BEAGLE("Beagle"), BULLDOG("Bulldog"), BOXER("Boxer"), DALMATA("Dalmata"), GOLDEN_RETRIEVER("Golden Retriever"),
    ROTTWEILER("Rottweiler"), YORKSHIRE_TERRIER("Yorkshire Terrier"), CANICHE("Caniche"), WEIMARANER("Weimaraner"), CANICHE_TOY("Caniche Toy");

    private final String nombre;

    private Razas(String nombre) {
        this.nombre = nombre;
    }

    @Override

    public String toString() {
        return "RazaPerro{" + "nombre=" + nombre + '}';
    }

}
