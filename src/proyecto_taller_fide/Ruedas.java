/*
U.Fidelitas
Introduccion a la Programacion
Realizado por: Daniel Granados, Bryan Brenes, Jostin Bermudez.
Programa Taller_FIDE
17/12/2020
 */
package proyecto_taller_fide;

import javax.swing.*;


public class Ruedas 
{
    public Servicio PrecioRuedas(double rueda)
    {
         String nombre_servicio="Ruedas";
        
        Servicio objeto_servicio=new Servicio(nombre_servicio,rueda);
         JOptionPane.showMessageDialog(null,"Servicio contratado: "+nombre_servicio+"\n"
                 + "monto del servicio por : "+rueda);
         return objeto_servicio;
    }
}
