/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseur;

/**
 *
 * @author mfautras
 */
public class ConvertisseurBasique {
    
    private double tauxConversion;
    
    public ConvertisseurBasique (double tauxConversion){
        this.tauxConversion = tauxConversion;
    }

    public double getTauxConversion() {
        return tauxConversion;
    }

    public void setTauxConversion(double tauxConversion) {
        this.tauxConversion = tauxConversion;
    }
    
    public double convertirEnEuros(double nombreEnFranc){
        return nombreEnFranc /tauxConversion;
    }
    
    public double convertirEnFranc(double nombreEnEuros){
        return nombreEnEuros * tauxConversion;
    }
}
