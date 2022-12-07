/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * 
 * @author Usuario
 */
public class Juego {
     ArrayList< Jugador> jugadores=new ArrayList();
     Revolver rda;
   
     
     public void llenarJuego(ArrayList<Jugador> jugadores, Revolver rda){
        this.jugadores= jugadores;
        this.rda = rda;
     }
      
     
     public void ronda() {
        boolean juegoTerminado = false;
        do {
            for (Jugador j : jugadores) {
                if (j.disparar(rda, j)) {
                    System.out.println("El " + j.getNombre() + " se mojó. Ha finalizado el juego");
                    juegoTerminado = true;
                    break;
                } else {
                    System.out.println("El " + j.getNombre() + " se salvó, continúe el siguiente");
                    //System.out.println(rda);
                }
            }
        } while (!juegoTerminado);
    }
}
