package Ejercicio;

import Ejercicio_Extra1.Razas;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona e1 = new Persona();
        System.out.println("Ingrese el nombre");
        e1.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        e1.setApellido(leer.next());
        System.out.println("Ingrese la edad");
        e1.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento");
        e1.setDni(leer.nextLong());
        
        return e1;
    }

    public Perro crearPerro() {
        Perro p1 = new Perro();
        System.out.println("Vamos a crear un perro...");
        System.out.println("Ingrese el nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la raza");
        p1.setRaza(leer.next());

        for (Razas aux : Razas.values()) {
            if (aux.toString().equalsIgnoreCase(p1.getRaza())) {
                p1.setRaza(String.valueOf(aux));
                break;
            }
        }
        System.out.println("Ingrese la edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño");
        p1.setTamanio(leer.nextDouble());
        return p1;
    }

}
