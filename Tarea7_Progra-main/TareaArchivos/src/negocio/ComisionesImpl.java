
package negocio;

import dominio.ClsVendedores;
import datos.*;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luisa
 */
/**
 AQUÍ SE IMPLEMENTAN LOS MÉTODOS DEFINIDOS PARA LA LÓFICA DE NEGOCIOS,
 * AQUÍ SE INDICA CÓMO FUNCIONAR, ES DECIR, CÓMO SE AGREGA UNA COMISIÓN, CÓMO SE LEE ETC.
 **/
public class ComisionesImpl implements IComisiones {

    //SE HACE REFERENCIA AL OBJETO PARA ACCEDER A LOS DATOS, ES DECIR PARA PODER ACCEDER AL ARCHIVO
    private final IPersona datos;
    // SE CREÓ UNA CLASE QUE SIRVE PARA CONVERTIR CADA LÍNEA DE STRING, A UNA LISTA DE EMPLEADOS
    private final Convertir convertir;

    public ComisionesImpl() {
        this.datos = new ClsPersona(); //poner * en el import datos.*
        this.convertir = new Convertir();
    }

    @Override
    public void agregarComisiones(ClsVendedores emp, String nombreArchivo) {
        boolean anexar = false;
        try {
            anexar = datos.existe(nombreArchivo);//bandera si anexa o no

            datos.escribir(emp, nombreArchivo, anexar);

        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public List<ClsVendedores> listarComisiones(String nombreArchivo) {
        List<ClsVendedores> empleados = new ArrayList<>();
        try {
            
            /**
             EL MÉTODO LISTAR DE ACCESO A DATOS NOS DEVUELVE UNA LISTA DE STRING, 
             * CREAMOS ESA LISTA Y EN ELLA GUARDAMOS LO QUE VENGA DEL ARCHIVO
             */
            List<String> lineas = datos.listar(nombreArchivo);
            
            //CON EL MÉTODO CONVERTIR CREAMOS UNA LISTA DE EMPLEADOS A PARTIR DE LA LISTA DE STRING
            empleados = convertir.StringAObjeto(lineas);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
        return empleados;
    }

    @Override
    public void buscarComisiones(String nombreArchivo, String buscar) {
        String resultado = null;
        try {

            resultado = datos.buscar(nombreArchivo, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar la peli");
            ex.printStackTrace();
        }
        System.out.println("Resultado Busqueda:" + resultado);

    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {

        try {
            if (datos.existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }

    }
}
