package Ejercicio_Extra3;

import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private String apellido;
    private long dni;
    private String mail;
    private String domicilio;
    private long telefono;
    private ArrayList<Vehiculos> vehiculoArrayList = new ArrayList<>();
    private ArrayList<Poliza> polizaArrayList = new ArrayList<>();

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, long dni, String mail, String domicilio, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes: " + "nombre = " + nombre + ", apellido = " + apellido + ", DNI = " + dni + "\n mail=" + mail + ", domicilio = " + domicilio + ", telefono = " + telefono + "\n";
    }

}
