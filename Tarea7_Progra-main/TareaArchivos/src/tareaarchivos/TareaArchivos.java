
package tareaarchivos;

import dominio.ClsVendedores;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import negocio.ComisionesImpl;
import negocio.Funciones;

/**
 *
 * @author andrilucero
 */
public class TareaArchivos {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "C:\\Users\\osori\\OneDrive\\Escritorio\\ArchivoTarea.txt";
    private static final ComisionesImpl comisiones = new ComisionesImpl();
    private static List<ClsVendedores> empleados = new ArrayList<>();

    public static void main(String[] args) {
        
        empleados = comisiones.listarComisiones(nombreArchivo);
        while (opcion != 0) {
            try {
                System.out.println("1. Ingresar empleado:");
                System.out.println("0. Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese nombre del empleado: ");
                        String nombre = scanner.nextLine();
                        System.out.println("Ingrese informacion del mes de enero: ");
                        String enero = scanner.nextLine();
                        System.out.println("Ingrese informacion del mes de febrero: ");
                        String febrero = scanner.nextLine();
                        System.out.println("Ingrese informacion del mes de marzo: ");
                        String marzo = scanner.nextLine();

                        ClsVendedores emp = new ClsVendedores(nombre, Integer.parseInt(enero), Integer.parseInt(febrero), Integer.parseInt(marzo), 0, 0);
                        comisiones.agregarComisiones(emp, nombreArchivo);
                        break;
                    case 0:
                        System.out.println("!ADIOS!");
                        break;
                    default:
                        System.out.println("Opción erronea");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }

    }
}
