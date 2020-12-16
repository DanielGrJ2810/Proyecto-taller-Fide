/*
U.Fidelitas
Introduccion a la Programacion
Realizado por: Daniel Granados, Bryan Brenes, Jostin Bermudez.
Programa Taller_FIDE
17/12/2020
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
        this.autoLavado=11000;
        this.cambioAceite=10000;
        this.revisionGeneral=20000;
        this.gasolinaLitro=570;
        this.precioRuedas=50000;
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
        this.autoLavado = autoLavado;
    }

    public double getCambioAceite() {
        return cambioAceite;
    }

    public void setCambioAceite(double cambioAceite) {
        this.cambioAceite = cambioAceite;
    }

    public double getRevisionGeneral() {
        return revisionGeneral;
    }

    public void setRevisionGeneral(double revisionGeneral) {
        this.revisionGeneral = revisionGeneral;
    }

    public double getGasolinaLitro() {
        return gasolinaLitro;
    }

    public void setGasolinaLitro(double gasolinaLitro) {
        this.gasolinaLitro = gasolinaLitro;
    }

    public double getPrecioRuedas() {
        return precioRuedas;
    }

    public void setPrecioRuedas(double precioRuedas) {
        this.precioRuedas = precioRuedas;
    }
    
    
    
    
    
}
