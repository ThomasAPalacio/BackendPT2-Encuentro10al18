//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.
package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Perro perro1 = new Perro("Uma","Labrador",5,"grande");
        Perro perro2 = new Perro("Brisa","Callejera",10,"chiquita");
        
        Persona p1 = new Persona("Maria","Perez",35,33688567,perro1);
        Persona p2 = new Persona("Hernan","Gonzalez",33,33688567,perro2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}
