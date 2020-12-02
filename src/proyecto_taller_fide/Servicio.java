/*

 */
package proyecto_taller_fide;


public class Servicio
{
    private String nombre;
    private int Gastos;
    
    public Servicio(String Nombre, int Gastos)
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

    public int getGastos() {
        return Gastos;
    }

    public void setGastos(int Gastos) {
        this.Gastos = Gastos;
    }
}
