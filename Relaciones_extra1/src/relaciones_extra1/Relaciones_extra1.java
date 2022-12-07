/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
    
 */
package relaciones_extra1;

import java.util.ArrayList;
import java.util.Iterator;
import serviciio.Servicio;

/**
 *
 * @author Usuario
 */
public class Relaciones_extra1 {

   
    public static void main(String[] args) {
        Servicio s = new Servicio();
        s.crearUsuario();
        s.crearPerro();
        System.out.println("*************************************");
      //  s.mostrarPerros();
        System.out.println("*****************************************");
        System.out.println("******************************************");
        s.adopcion();
        
        System.out.println("*******************************************");
      //  s.mostrarUsuario();
        
        
        
        
        
//        
//ArrayList<String> animales = new ArrayList();
//animales.add("gato");
//
//animales.add("perro");
//animales.add("caballo");
//animales.add("zorro");
//animales.add("conejo");
//
//        for (String animale : animales) {
//            System.out.println(animale);
//        }
//
//        Iterator<String> it = animales.iterator();
//        while (it.hasNext()) {
//            if (it.next()=="perro") {
//                it.remove();
//            }
//          
//        }
//
//        animales.forEach((animale) -> {
//            System.out.println(animale);
//        });
        
        
    }
    
}
