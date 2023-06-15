package Ejercicio_Extra3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Poliza {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int numeroPoliza;
    private Calendar fechaInicio;
    private Calendar fechaFin;
    private int cantidadCuotas;
    private String formaPago;
    private double montoAsegurado;
    private boolean granizo;
    private double montoMaximoGranizo;
    private String tipoCobertura;
    private ArrayList<Vehiculos> vehiculos;
    private ArrayList<Clientes> clientes = new ArrayList<>();
    private boolean pagada;

    public Poliza() {
    }

    public Poliza(int numeroPoliza, Calendar fechaInicio, Calendar fechaFin, int cantidadCuotas, String formaPago, double montoAsegurado, boolean granizo, double montoMaximoGranizo, String tipoCobertura, ArrayList<Vehiculos> vehiculos, ArrayList<Clientes> clientes, boolean pagada) {
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.vehiculos = vehiculos;
        this.clientes = clientes;
        this.pagada = pagada;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    @Override
    public String toString() {
        return "Poliza: " + "numeroPoliza = " + numeroPoliza + ", fecha Inicio = " + fechaInicio + ", fecha de Fin = " + fechaFin + "\n cantidadCuotas = " + cantidadCuotas + ", formaPago = " + formaPago + ", montoAsegurado = " + montoAsegurado + "\n granizo = " + granizo + ", montoMaximoGranizo = " + montoMaximoGranizo + ", tipoCobertura = " + tipoCobertura + "\n vehiculo = " + vehiculos + ", cliente = " + clientes + ", pagada = " + pagada + "\n";
    }

}
