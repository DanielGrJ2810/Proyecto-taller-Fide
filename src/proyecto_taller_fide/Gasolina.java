/*
U.Fidelitas
Introduccion a la Programacion
Realizado por: Daniel Granados, Bryan Brenes, Jostin Bermudez.
Programa Taller_FIDE
17/12/2020
 */
package proyecto_taller_fide;

import javax.swing.*;
public class Gasolina 
{
    public Servicio LitroGasolina(double litro)
    {
        
        String nombre_servicio="Gasolina";
        
        Servicio objeto_servicio=new Servicio(nombre_servicio,litro);
         JOptionPane.showMessageDialog(null,"Servicio contratado: "+nombre_servicio+"\n"
                 + "monto del servicio por litro: "+litro);
         return objeto_servicio;
    }
}
