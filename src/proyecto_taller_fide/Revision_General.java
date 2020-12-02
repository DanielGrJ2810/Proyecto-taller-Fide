/*

 */
package proyecto_taller_fide;


public class Revision_General 
{
 
    public void Revisar()
    {
        Menú revisar= new Menú();
        revisar.getContador();
        revisar.getA_pagar();
      
        Servicio datos[]=new Servicio [1];
       
        
        Inicializar_Precios revisar2=new Inicializar_Precios();
        revisar2.setRevisionGeneral(0);
     
       
      
       
      
           for(int j=revisar.getContador();j<revisar.getContador()+1;j++)
           {
               String nombre="Revision General";
               int Gastos=(int)(revisar.getA_pagar()+revisar2.getRevisionGeneral());
               
               datos[j]=new Servicio(nombre, Gastos);
           }
           
           
       
       
        revisar.setA_pagar((int) (revisar.getA_pagar()+revisar2.getRevisionGeneral()));
        revisar.setContador(revisar.getContador()+1);
       
       
    }
}
