/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import Enum.Numeros;
import Enum.Palos;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Usuario
 */
public class Baraja {
    ArrayList<Carta> mazo = new ArrayList();
    ArrayList<Carta> mazoRepartido = new ArrayList();
    public Baraja() {
        for (Palos var : Palos.values() ) {
            for (Numeros  aux : Numeros.values()) {
                mazo.add(new Carta(aux, var) );
                
//                System.out.println(var + " "+ aux );
        }
        
    }
    
    }  
//    • barajar(): cambia de posición todas las cartas aleatoriamente.
    /**
     *  baraja el mazo de cartas aleatoriamente  
     */
    public void barajar(){
        Collections.shuffle(mazo);
         
    }
//    siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    
    public Carta siguienteCarta(){
        
        Carta siguiente_carta= mazo.get(0);
        mazo.remove(0);
         mazoRepartido.add(siguiente_carta);
         System.out.println(siguiente_carta);
        return siguiente_carta;
    }
//    cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles (){
        
        return mazo.size();
    }
    
//    darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    
    public void darCartas(int cantidad){
        ArrayList<Carta> mostrar = new ArrayList();
         for (int i = 0; i < cantidad; i++) {
            mostrar.add(siguienteCarta());
        }
         mostrar.forEach((carta) -> {
             System.out.println(carta);
        });
    }
//    cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton(){
        if (mazoRepartido.size()== 0) {
            System.out.println(" aun no ha salido ninguna carta ");
        }else{
            mazoRepartido.forEach((carta) -> {
                System.out.println( carta);
            });
        }
        
    }
//    mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    
    public void mostrarBaraja(){
        if (mazo.isEmpty()) {
            System.out.println(" no hay cartas en el mazo ");
            
        }
        mazo.forEach((carta_aux) -> {
            System.out.println(carta_aux);
        });
    }
}
