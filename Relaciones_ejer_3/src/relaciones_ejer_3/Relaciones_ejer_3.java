/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejer_3;

import entidad.Baraja;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Relaciones_ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Baraja b = new Baraja();
        Scanner leer = new Scanner(System.in);
        int op = 0;
       int resp = 0;
        
       do {            
            System.out.println("vammos a jugar un juego de cartas ");
            System.out.println(" vamos a mostar las opciones ");
            System.out.println(" 1 = BARAJAR");
            System.out.println(" 2 = SIGUIENTE CARTA ");
             System.out.println(" 3 = MUESTRA LA CANTIDAD DE CARTAS DISPONIBLES EN EL MAZO ");
              System.out.println(" 4 = DAR CARTAS  ");
               System.out.println(" 5 = MUESTRA LAS CARTAS QUE YA SALIERON ");
                System.out.println(" 6 = MUESTRA LAS CARTAS QUE QUEDARON EN EL MAZO");
                 System.out.println(" 7 = SALIR ");
                 op= leer.nextInt();
                 
                 switch(op){
                     case 1:
                         b.barajar();
                         break;
                     case 2:
                         b.siguienteCarta();
                                 break;
                     case 3 :
                       
                         System.out.println(  b.cartasDisponibles());
                         break;
                     case 4:
                         System.out.println("ingrese la cantidad de cartas que desea ");
                         
                         b.darCartas(leer.nextInt());
                         break;
                     case 5 :
                         b.cartasMonton();
                         break;
                     case 6 :
                         b.mostrarBaraja();
                     case 7 :
                          break;
                                  default:
                                      System.out.println(" no existe la opcion elegida ");
      break;
                 } 
      
    }while (op != 7);
    
}
}