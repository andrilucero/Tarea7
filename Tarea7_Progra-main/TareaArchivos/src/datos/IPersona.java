
package datos;
import dominio.ClsVendedores;
import excepciones.*;
import java.util.*;
/**
 *
 * @author andrilucero
 */
public interface IPersona {
    

    boolean existe(String nombreArchivo)throws AccesoDatosEx;
    public List<String> listar(String nombreArchivo) throws LecturaDatosEx;
    void escribir(ClsVendedores empleado,String nombreArchivo, boolean anexar)throws EscrituraDatosEx;
    public String buscar(String nombreArchivo,String buscar)throws LecturaDatosEx;
    public void crear(String nombreArchivo)throws AccesoDatosEx;
    public void borrar(String nombreArchivo)throws AccesoDatosEx;
}
