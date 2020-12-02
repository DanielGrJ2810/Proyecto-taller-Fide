/*

 */
package proyecto_taller_fide;

import javax.swing.*;


public class Menú 
{
    private int a_pagar;
    private int contador;
    
    public Menú(){
        
    }
    public Menú(int a_pagar,int contador)
    {
        this.a_pagar=a_pagar;
        this.contador=contador;
    }

    public int getA_pagar() {
        return a_pagar;
    }

    public void setA_pagar(int a_pagar) {
        this.a_pagar = 0;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = 0;
    }
    
    
    
    
    
    
    
    
   public void MENU()
   {
       Menú menu2=new Menú();
       menu2.setA_pagar(0);
       menu2.setContador(0);
       
       Inicializar_Precios menu1=new Inicializar_Precios();
       menu1.setAutoLavado(0);
       menu1.setCambioAceite(0);
       menu1.setRevisionGeneral(0);
       menu1.setGasolinaLitro(0);
       menu1.setPrecioRuedas(0);
       
       Revision_General revision=new Revision_General();
       
       
       int opcion;
       
      do{
          
           opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija el servicion que desea aplicar!!!!"
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
                   revision.Revisar();
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
