/*

 */
package proyecto_taller_fide;

import javax.swing.*; 


public class Revision_General 
{
 
 
    
     public Servicio Revisar2(double monto)
     {
        String nombre_servicio="Revision General";
        
        Servicio objeto_servicio=new Servicio(nombre_servicio,monto);
         JOptionPane.showMessageDialog(null,"Servicio contratado: "+nombre_servicio+"\n"
                 + "monto del servicio: "+monto);
         return objeto_servicio;
     }
         
     
    
    
}
