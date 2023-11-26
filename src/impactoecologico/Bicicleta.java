/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impactoecologico;

/**
 *
 * @author Keva
 */
public class Bicicleta implements ImpactoEcologicoI{
  private double emisionesCarbono;
    private int cantidadActividad;

    public Bicicleta(double emisionesCarbono, int cantidadActividad) {
        this.emisionesCarbono = emisionesCarbono;
        this.cantidadActividad = cantidadActividad;
    }  
    @Override
    public double obtenerImpactoEcologico() {
        return emisionesCarbono * cantidadActividad;
    }
}
