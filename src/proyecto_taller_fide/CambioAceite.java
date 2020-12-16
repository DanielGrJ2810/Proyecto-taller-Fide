/*
U.Fidelitas
Introduccion a la Programacion
Realizado por: Daniel Granados, Bryan Brenes, Jostin Bermudez.
Programa Taller_FIDE
17/12/2020
 */
package proyecto_taller_fide;

import javax.swing.*;


public class CambioAceite 
{
    public Servicio CambiarAceite(double aceite)
    {
         String nombre_servicio="Cambio Aceite";
        
        Servicio objeto_servicio=new Servicio(nombre_servicio,aceite);
         JOptionPane.showMessageDialog(null,"Servicio contratado: "+nombre_servicio+"\n"
                 + "monto del servicio por : "+aceite);
         return objeto_servicio;
    }
}
