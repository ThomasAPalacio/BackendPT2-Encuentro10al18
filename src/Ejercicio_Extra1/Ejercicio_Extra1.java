//Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.
package Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_Extra1 {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Servicio service = new Servicio();
        List<Persona> persona1 = new ArrayList<>();
        List<Perro> perro1 = new ArrayList<>();
        System.out.println("Cargando Personas...");
        for (int i = 0; i < 2; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            persona1.add(service.crearPersona());
        }

        System.out.println("Cargando Perros...");
        for (int i = 0; i < 2; i++) {
            System.out.println("Perro " + (i + 1) + ":");
            perro1.add(service.crearPerro());
        }

        System.out.println("Adoptando Perros...");
        for (Persona aux : persona1) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido()
                    + " seleccione el nombre de un perro que quiera adoptar: ");
            for (Perro aux2 : perro1) {
                System.out.println("Nombre del perro: " + aux2.getNombre()
                        + "\n La raza:" + aux2.getRaza());
            }
            String adoptable = leer.next();
            int control = 0;
            for (Perro aux3 : perro1) {
                if (adoptable.equalsIgnoreCase(aux3.getNombre())) {
                    aux.setPerro(aux3);
                    control++;
                    perro1.remove(aux3);
                    break;
                }
            }
            if (control == 0) {
                System.out.println(" No se ha adoptado ningun perro valido");
            }
        }
        System.out.println();
        System.out.println(" Las siguientes pesonas han adoptado un perro:");
        for (Persona aux : persona1) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no se ha adoptado ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " ha adoptado "
                        + aux.getPerro().getNombre() + " de la raza: " + aux.getPerro().getRaza());
            }
        }

    }

}
