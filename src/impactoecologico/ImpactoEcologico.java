/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impactoecologico;
import java.util.ArrayList;
/**
 *
 * @author Keva
 */
public class ImpactoEcologico {
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<ImpactoEcologicoI> objetos = new ArrayList<>();
        // Creación de objetos de cada clase
        Edificio edificio = new Edificio(0.5, 100);
        Auto auto = new Auto(0.3, 50);
        Bicicleta bicicleta = new Bicicleta(0.1, 200);
        
        // Agregar objetos al ArrayList
        objetos.add(edificio);
        objetos.add(auto);
        objetos.add(bicicleta);

        // Iterar y calcular el impacto ecológico para cada objeto
        for (ImpactoEcologicoI objeto : objetos) {
            double impacto = objeto.obtenerImpactoEcologico();
            System.out.println("Tipo de objeto: " + objeto.getClass().getSimpleName());
            System.out.println("Impacto ecológico del carbono: " + impacto);
            System.out.println("-------------------------------------------");
        }
        
    }
    
}
