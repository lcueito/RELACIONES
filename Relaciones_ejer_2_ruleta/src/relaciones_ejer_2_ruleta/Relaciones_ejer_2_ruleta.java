/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejer_2_ruleta;

import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Relaciones_ejer_2_ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner scan = new Scanner(System.in);
        Jugador a = new Jugador();
        Revolver rda = new Revolver();
        Juego jue = new Juego();
      
        
        
        System.out.println(" cuantos jugadores seran :");
      //  int cantida= scan.nextInt();
        a.crearJugadores();
        rda.llenarRevolver();
        System.out.println(rda.toString());
        jue.llenarJuego(a.getJugadores(), rda);
         jue.ronda();
    }
    
}
