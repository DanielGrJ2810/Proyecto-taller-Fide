/*

 */
package proyecto_taller_fide;


public class Servicio
{
    private String nombre;
    private double Gastos;
    
    public Servicio(String Nombre, double Gastos)
    {
        this.nombre=Nombre;
     this.Gastos=Gastos;   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGastos() {
        return Gastos;
    }

    public void setGastos(double Gastos) {
        this.Gastos = Gastos;
    }

    public Servicio() {
    }
}
