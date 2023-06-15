package Ejercicio_Extra3;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String marca;
    private String modelo;
    private int anio;
    private int numeroMotor;
    private String chasis;
    private String color;
    private String tipo;
    private ArrayList<Poliza> polizas = new ArrayList<>();
    private ArrayList<Clientes> clientes = new ArrayList<>();
    
    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, int anio, int numeroMotor, String chasis, String color, String tipo, ArrayList<Poliza> polizas, ArrayList<Clientes> clientes) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.polizas = polizas;
        this.clientes = clientes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    
    
    @Override
    public String toString() {
        return "Vehiculos: " + "marca = " + marca + ", modelo = " + modelo + ", año = " + anio + "\n numeroMotor = " + numeroMotor + ", chasis = " + chasis + ", color = " + color + "\n tipo = " + tipo + ", poliza = " + polizas + ", cliente = " + clientes + "\n";
    }

}
