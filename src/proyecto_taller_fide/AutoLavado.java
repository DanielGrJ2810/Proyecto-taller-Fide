/*
U.Fidelitas
Introduccion a la Programacion
Realizado por: Daniel Granados, Bryan Brenes, Jostin Bermudez.
Programa Taller_FIDE
17/12/2020
 */
package proyecto_taller_fide;

import javax.swing.*;
public class AutoLavado 
{
    public Servicio Autolavar(double lavar)
    {
          String nombre_servicio="AutoLavado";
        
        Servicio objeto_servicio=new Servicio(nombre_servicio,lavar);
         JOptionPane.showMessageDialog(null,"Servicio contratado: "+nombre_servicio+"\n"
                 + "monto del servicio por : "+lavar);
         return objeto_servicio;
    }
}
