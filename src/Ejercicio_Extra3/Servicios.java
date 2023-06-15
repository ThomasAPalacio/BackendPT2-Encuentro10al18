package Ejercicio_Extra3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Clientes> clientes = new ArrayList<>();
    ArrayList<Vehiculos> vehiculos = new ArrayList<>();
    ArrayList<Poliza> polizas = new ArrayList<>();

    public void cargarClientes() {
        String continuar = "";
        do {
            System.out.println("Ingrese su nombre: ");
            String nombre = leer.next();
            System.out.println("Ingrese su apellido: ");
            String apellido = leer.next();
            System.out.println("Ingrese su DNI: ");
            long dni = leer.nextLong();
            System.out.println("Ingrese su email: ");
            String mail = leer.next();
            System.out.println("Ingrese su domicilio: ");
            String domicilio = leer.next();
            System.out.println("Ingrese su numero de telefono: ");
            long telefono = leer.nextInt();
            clientes.add(new Clientes(nombre, apellido, dni, mail, domicilio, telefono));
            System.out.println("Quiere agregar a otra persona? (S/N)");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("S"));
    }

    public void mostrarClientes() {
        for (Clientes auxClientes : clientes) {
            System.out.println(auxClientes);
        }
    }

    public void cargarVehiculos() {
        String continuar = "";
        do {
            System.out.println("Ingrese el nombre de la marca: ");
            String marca = leer.next();
            System.out.println("Ingrese el modelo: ");
            String modelo = leer.next();
            System.out.println("Ingrese el año del auto: ");
            int anio = leer.nextInt();
            System.out.println("Ingrese el numero de motor: ");
            int numeroMotor = leer.nextInt();
            System.out.println("Ingrese el chasis: ");
            String chasis = leer.next();
            System.out.println("Ingrese el color del auto: ");
            String color = leer.next();
            System.out.println("Ingrese el tipo de auto: ");
            String tipo = leer.next();
            vehiculos.add(new Vehiculos(marca, modelo, anio, numeroMotor, chasis, color, tipo, polizas, clientes));
            System.out.println("Quiere agregar otro auto? (S/N)");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("S"));
    }

    public void mostrarVehiculos() {
        for (Vehiculos auxVehiculos : vehiculos) {
            System.out.println(auxVehiculos);
        }
    }

    public void cargarPolizas() {
        String continuar = "";
        do {
            System.out.println("Ingrese el numero de la poliza: ");
            int numeroPoliza = leer.nextInt();
            System.out.println("Ingrese la fecha de inicio: ");
            Calendar fechaInicio = new GregorianCalendar();
            System.out.println("Ingrese el dia: ");
            fechaInicio.set(Calendar.DAY_OF_MONTH, leer.nextInt());
            System.out.println("Ingrese el mes: ");
            fechaInicio.set(Calendar.MONTH, leer.nextInt());
            System.out.println("Ingrese el año: ");
            fechaInicio.set(Calendar.YEAR, leer.nextInt());
            System.out.println("Ingrese la fecha de fin:");
            Calendar fechaFin = new GregorianCalendar();
            System.out.println("Ingrese el dia::");
            fechaFin.set(Calendar.DAY_OF_MONTH, leer.nextInt());
            System.out.println("Ingrese el mes:");
            fechaFin.set(Calendar.MONTH, leer.nextInt());
            System.out.println("Ingrese el año:");
            fechaFin.set(Calendar.YEAR, leer.nextInt());
            System.out.println("Ingrese la cantidad de cuotas: ");
            int cantidadCuotas = leer.nextInt();
            System.out.println("Ingrese la forma de pago: ");
            String formaPago = leer.next();
            System.out.println("Ingrese el monto asegurado: ");
            double montoAsegurado = leer.nextDouble();
            System.out.println("Ingrese si tiene proteccion contra el granizo (true o false): ");
            boolean granizo = leer.nextBoolean();
            System.out.println("Ingrese el monto maximo de granizo: ");
            double montoMaximoGranizo = leer.nextDouble();
            System.out.println("Ingrese el tipo de cobertura (total, parcial, terceros, etc): ");
            String tipoCobertura = leer.next();
            System.out.println("Ingrese la poliza esta pagada (true o false): ");
            boolean pagada = leer.nextBoolean();
            polizas.add(new Poliza(numeroPoliza, fechaInicio, fechaFin, cantidadCuotas, formaPago, montoAsegurado, granizo, montoMaximoGranizo, tipoCobertura, vehiculos, clientes, pagada));
            System.out.println("Quiere agregar otra poliza? (S/N)");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("S"));
    }

    public void mostrarPoliza() {
        for (Poliza auxPolizas : polizas) {
            System.out.println(auxPolizas);
        }
    }
    
    public void gestionarCuotas() {
        System.out.println("Fecha Actual:");
        Calendar fechaActual = new GregorianCalendar();
        System.out.println(fechaActual.get(Calendar.YEAR) + "/" + (fechaActual.get(Calendar.MONTH) + 1) + "/" + fechaActual.get(Calendar.DAY_OF_MONTH));
        System.out.println("Desea registrar un pago o gestionar las cuotas? (1.Pago / 2.Gestionar)");
        int opcion = leer.nextInt();
        if (opcion == 1) {
            System.out.println("Ingrese el numero de la poliza que desea gestionar");
            int opcion2 = leer.nextInt();
            for (int i = 0; i < polizas.size(); i++) {
                if (polizas.get(i).getNumeroPoliza() == opcion2) {
                    System.out.println("Debe pagar: " + polizas.get(i).getMontoAsegurado() / (polizas.get(i).getCantidadCuotas()));
                    System.out.println("Ingrese el monto del pago");
                    double monto = leer.nextDouble();
                    if (monto >= polizas.get(i).getMontoAsegurado() / (polizas.get(i).getCantidadCuotas())) {
                        System.out.println("Pago exitoso");
                        polizas.get(i).setPagada(true);
                    } else {
                        System.out.println("Pago fallido");
                        polizas.get(i).setPagada(false);
                    }
                }
            }
        } else if (opcion == 2) {
            System.out.println("Ingrese el numero de la poliza que desea gestionar");
            int opcion3 = leer.nextInt();
            for (int i = 0; i < polizas.size(); i++) {
                if (polizas.get(i).getNumeroPoliza() == opcion3) {
                    System.out.println("Cuotas");
                    System.out.println(polizas.get(i).getCantidadCuotas());
                    System.out.println("Monto total");
                    System.out.println(polizas.get(i).getMontoAsegurado() / (polizas.get(i).getCantidadCuotas()));
                    System.out.println("Fecha de vencimiento");
                    System.out.println(polizas.get(i).getFechaFin().get(Calendar.YEAR) + "/" + polizas.get(i).getFechaFin().get(Calendar.MONTH) + "/" + polizas.get(i).getFechaFin().get(Calendar.DAY_OF_MONTH) + 1);
                    System.out.println("Forma de pago");
                    System.out.println(polizas.get(i).getFormaPago());
                    System.out.println("Pagada:");
                    System.out.println(polizas.get(i).isPagada());
                }
            }
        }
    }
}
