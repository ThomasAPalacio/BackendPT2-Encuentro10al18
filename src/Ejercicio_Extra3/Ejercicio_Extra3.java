//Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
//ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
//coberturas integrales para vehículos.
//Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
//que quiere realizar la empresa.
//a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
//cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
//domicilio, teléfono.
//b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
//modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
//c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
//vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
//póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
//asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
//terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
//relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
//muchos a uno o de muchos a muchos.
//d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
//Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
//cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
//etc.).
//Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
//requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
//relaciones.
package Ejercicio_Extra3;

import java.util.Scanner;

public class Ejercicio_Extra3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Servicios service = new Servicios();

        int menu = 0;
        do {
            System.out.println("--------------------------");
            System.out.println("Elija una opcion: ");
            System.out.println("1. Cargar Clientes");
            System.out.println("2. Cargar Vehiculos");
            System.out.println("3. Crear Seguros(Poliza)");
            System.out.println("4. Mostrar Seguros");
            System.out.println("5. Mostrar Clientes");
            System.out.println("6. Mostrar Vehiculos");
            System.out.println("7. Gestion de Cuotas");
            System.out.println("8. Salir");
            System.out.println("--------------------------");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    service.cargarClientes();
                    break;
                case 2:
                    service.cargarVehiculos();
                    break;
                case 3:
                    service.cargarPolizas();
                    break;
                case 4:
                    service.mostrarPoliza();
                    break;
                case 5:
                    service.mostrarClientes();
                    break;
                case 6:
                    service.mostrarVehiculos();
                    break;
                case 7:
                    service.gestionarCuotas();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (menu != 8);
    }
}
