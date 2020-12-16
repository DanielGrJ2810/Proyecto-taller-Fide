/*
U.Fidelitas
Introduccion a la Programacion
Realizado por: Daniel Granados, Bryan Brenes, Jostin Bermudez.
Programa Taller_FIDE
17/12/2020
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
       Identificacion_Usuario ident=new Identificacion_Usuario();
       ident.getCedula();
       ident.getNombre();
       
       ident.Usuario();
       
       Factura= "Nombre: "+ident.getNombre()+"\nCedula: "+
               ident.getCedula()+"\n";
       
       
       Gasolina gas=new Gasolina();
       
       Ruedas llantas=new Ruedas();
       AutoLavado lavado=new AutoLavado();
       CambioAceite cambio=new CambioAceite();
       
       
       
       double descuento=0;
       
       
       
      
         String reconocimiento;
    
        
        boolean decision=true;
        for(int j=0;decision==true;)
        {
            reconocimiento=JOptionPane.showInputDialog(null,"Digite su cedula otra vez");
        if(reconocimiento.equalsIgnoreCase(ident.getCedula()))
        {
            
              int opcion;
       
      do{
          
           opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija el servicio que desea Utilizar"
                   + "\n1.AutoLavado"
                   + "\n2.Cambio de Aceite"
                   + "\n3.Revision General"
                   + "\n4.Cambio de Ruedas"
                   + "\n5.Gasolina"
                   + "\n0.Salir"));
           
           switch(opcion)
           {
               case 1:
                   monto_servicio=menu1.getAutoLavado();
                   Servicio auto=new Servicio();
                   auto=lavado.Autolavar(monto_servicio);
                   montoTotal=montoTotal+auto.getGastos();
                   
                   Factura+="\n"
                           +"AutoLavado: "+menu1.getAutoLavado();
                   Factura+="\n";
                           
                    
                   break;
              
               case 2:
            monto_servicio=menu1.getCambioAceite();
                   Servicio ace=new Servicio();
                   ace=cambio.CambiarAceite(monto_servicio);
                   montoTotal=montoTotal+ace.getGastos();
                   
                   Factura+="\n"
                           +"Cambio de Aceite: "+menu1.getCambioAceite();
                   Factura+="\n";
                           
                   
                   
                   break;
                   
               case 3:
                   monto_servicio=menu1.getRevisionGeneral();
                   Servicio resultado=new Servicio();
                   resultado=revision.Revisar2(monto_servicio);
                   montoTotal=montoTotal+resultado.getGastos();
                   
                   Factura+="\n"
                           +"Revision General: "+menu1.getRevisionGeneral();
                   Factura+="\n";
                           
                 
                 

                   
                   break;
                   
               case 4:
                   int Rueda=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas ruedas va a comprar"));
                   monto_servicio=Rueda*menu1.getPrecioRuedas();
                   Servicio llan=new Servicio();
                   llan=llantas.PrecioRuedas(menu1.getPrecioRuedas());
                   montoTotal=montoTotal+monto_servicio;
                                     
                   Factura+="\n"
                           +"Precio x Rueda "+menu1.getPrecioRuedas()+" "+Rueda+"ruedas: "+monto_servicio;
                   Factura+="\n";
                           
                  
                   break;
                   
               case 5:
                   int litro=Integer.parseInt(JOptionPane.showInputDialog(null,"cuantos litros de gasolina va a comprar"));
                   monto_servicio=litro*menu1.getGasolinaLitro();
                   Servicio gaso=new Servicio();
                   gaso=gas.LitroGasolina(menu1.getGasolinaLitro());
                   montoTotal=montoTotal+monto_servicio;
                                      
                   Factura+="\n"
                           +"Gasolina x Litro: "+menu1.getGasolinaLitro()+" "+litro+"litros: "+monto_servicio;
                   Factura+="\n";
                           
                    
                   
                   break;
                   
             
      
                   
               case 0:   
                   if(montoTotal>=40000)
                   {
                       descuento=montoTotal*0.10;
                       montoTotal=montoTotal-descuento;
                       
                   }
                   
                   JOptionPane.showMessageDialog(null,"Gracias por visitar nuestro Taller FIDE"
                           + "\n Su factura es: "
                           + "\n"+Factura+
                           "\nDescuento: "+descuento+
                           "\nMonto Total es: "+montoTotal);
                   break;
                   
                   
               default:
                   JOptionPane.showMessageDialog(null,"Digite una de las opciones disponibles");
                   break;
           }
       
          
      }while(opcion!=0);
      
          decision=false;
       
   }
        else
        {
            JOptionPane.showMessageDialog(null, "Cedula incorrecta, vuelva a intentarlo");
           
        }
        
            
        

      
          
       
   }
   }
}
