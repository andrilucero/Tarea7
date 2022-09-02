
package dominio;

/**
 *
 * @author andrilucero
 */
public class ClsVendedores {
    String nom;
    double enero;
    double febrero;
    double marzo;
    double prom;
    double total;

    public double getPromedio() {
        return prom;
    }

    public void setPromedio(double promedio) {
        this.prom = promedio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNombre() {
        return nom;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }

    public double getEnero() {
        return enero;
    }

    public void setEnero(double enero) {
        this.enero = enero;
    }

    public double getFebrero() {
        return febrero;
    }

    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    public double getMarzo() {
        return marzo;
    }

    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }

    public ClsVendedores(String nombre, double enero, double febrero, double marzo, double promedio, double total) {
        this.nom = nombre;
        this.enero = enero;
        this.febrero = febrero;
        this.marzo = marzo;
        this.prom = promedio;
        this.total = total;
    }
  

    public void setMes(int mes, double valor) {

        switch (mes) {
            case 1:
                setEnero(valor);
                break;
            case 2:
                setFebrero(valor);

                break;
            case 3:
                setMarzo(valor);

                break;

            default:
                System.out.println("Inserte un numero correcto");
        }

    }
    
    @Override
    public String toString(){

        return "|| Nombre del empleado: " + this.getNombre() + " || Enero: " + this.getEnero() + " || Febrero: " + this.getFebrero()+ " || Marzo: " + this.getMarzo();
    }
}
