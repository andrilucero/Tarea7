
package negocio;

import dominio.ClsVendedores;
import java.util.List;

/**
 *
 * @author Luisa
 */

/**
 AQUÍ SE DEFINE LA LÓGICA DE NEGOCIOS, ES DECIR LA FUNCIONALIDAD DEL PROGRAMA
 * POR ESO SE CREA LA INTERFAZ CON MÉTODOS RELACIONADOS A COMISIONES Y EMPLEADOS
 * AGREGAR, LISTAR, BUSCAR, ETC.
 * AQUÍ SOLO SE DEFINEN LA LÓGICA. NADA RELACIONADO A LOS DATOS
 */
public interface IComisiones {
    public void agregarComisiones(ClsVendedores empleado, String nombreArchivo);
    public List<ClsVendedores> listarComisiones(String nombreArchivo);
    public void buscarComisiones(String nombreArchivo, String buscar);
    public void iniciarArchivo(String nombreArchivo);
}
