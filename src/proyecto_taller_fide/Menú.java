/*

 */
package proyecto_taller_fide;

import javax.swing.*;


public class Menú 
{
private double montoTotal;
private String Factura;

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFactura() {
        return Factura;
    }

    public void setFactura(String Factura) {
        this.Factura = Factura;
    }

    
    
   
   

   
    
    
    
    
    
    
    
    
   public void MENU()
   {
      
     double monto_servicio=0;
       
      
     
       Inicializar_Precios menu1=new Inicializar_Precios();
       menu1.getAutoLavado();
       menu1.getCambioAceite();
       menu1.getRevisionGeneral();
       menu1.getGasolinaLitro();
       menu1.getPrecioRuedas();
       
       Revision_General revision=new Revision_General();
      
       
       
       
       int opcion;
       
      do{
          
           opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija el servicio que desea aplicar!!!!"
                   + "\n1.AutoLavado"
                   + "\n2.Cambio de Aceite"
                   + "\n3.Revision General"
                   + "\n4.Cambio de Ruedas"
                   + "\n5.Gasolina"
                   + "\n0.Salir"));
           
           switch(opcion)
           {
               case 1:
                   
                   break;
              
               case 2:
           
                   
                   break;
                   
               case 3:
                   monto_servicio=menu1.getRevisionGeneral();
                   Servicio resultado=new Servicio();
                   resultado=revision.Revisar2(monto_servicio);
                   montoTotal=montoTotal+resultado.getGastos();
                   JOptionPane.showMessageDialog(null,"monto total a pagar: "+montoTotal);
                   Factura+="\n"
                           +"Revision General: "+menu1.getRevisionGeneral();
                   Factura+="\n";
                           
                    JOptionPane.showMessageDialog(null, Factura);
                 

                   
                   break;
                   
               case 4:
                   
                   break;
                   
               case 5:
                   
                   break;
               
      
                   
               case 0:    
                   JOptionPane.showMessageDialog(null,"Gracias por visitar nuestro Taller");
                   break;
                   
                   
               default:
                   JOptionPane.showMessageDialog(null,"Digite una de las opciones disponibles");
                   break;
           }
       
          
      }while(opcion!=0);
      
          
       
   }
}
