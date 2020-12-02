/*

 */
package proyecto_taller_fide;


public class Inicializar_Precios
{
    private double autoLavado;
    private double cambioAceite;
    private double revisionGeneral;
    private double gasolinaLitro;
    private double precioRuedas;
    
    public Inicializar_Precios()
    {
        this.autoLavado=0;
        this.cambioAceite=0;
        this.revisionGeneral=0;
        this.gasolinaLitro=0;
        this.precioRuedas=0;
    }
    public Inicializar_Precios(double autoLavado, double cambioAceite, double revisionGeneral,double gasolinaLitro, double precioRuedas)
    {
        this.autoLavado=autoLavado;
        this.cambioAceite=cambioAceite;
        this.revisionGeneral=revisionGeneral;
        this.gasolinaLitro=gasolinaLitro;
        this.precioRuedas=precioRuedas;
    }

    public double getAutoLavado() {
        return autoLavado;
    }

    public void setAutoLavado(double autoLavado) {
        this.autoLavado = 11000;
    }

    public double getCambioAceite() {
        return cambioAceite;
    }

    public void setCambioAceite(double cambioAceite) {
        this.cambioAceite = 10000;
    }

    public double getRevisionGeneral() {
        return revisionGeneral;
    }

    public void setRevisionGeneral(double revisionGeneral) {
        this.revisionGeneral = 20000;
    }

    public double getGasolinaLitro() {
        return gasolinaLitro;
    }

    public void setGasolinaLitro(double gasolinaLitro) {
        this.gasolinaLitro = 570;
    }

    public double getPrecioRuedas() {
        return precioRuedas;
    }

    public void setPrecioRuedas(double precioRuedas) {
        this.precioRuedas = 50000;
    }
    
    
    
    
    
}
