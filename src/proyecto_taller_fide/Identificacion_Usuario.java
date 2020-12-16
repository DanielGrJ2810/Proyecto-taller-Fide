/*
U.Fidelitas
Introduccion a la Programacion
Realizado por: Daniel Granados, Bryan Brenes, Jostin Bermudez.
Programa Taller_FIDE
17/12/2020
 */
package proyecto_taller_fide;

import javax.swing.*;


public class Identificacion_Usuario 
{
    private String cedula;
    private String Nombre;
    
    public int i;
    
    
    public Identificacion_Usuario()
    {
        
    }
    
    public Identificacion_Usuario(String cedula, String Nombre)
    {
        this.Nombre=Nombre;
        this.cedula=cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

   

    

  
    
    public void Usuario()
    {
       
       
       
      
       
           Nombre=JOptionPane.showInputDialog(null,"Digite su nombre");
           cedula=JOptionPane.showInputDialog(null,"Digite su cedula");
       
    }
    
  
    
}
