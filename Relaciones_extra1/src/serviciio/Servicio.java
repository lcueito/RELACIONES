/*
 
 */
package serviciio;

import entidad.Perro;
import entidad.Persona;
import enums.Tamaño;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Servicio {
    ArrayList<Perro> perros= new ArrayList();
    ArrayList<Persona> personas= new ArrayList();
    ArrayList<Perro> perros2= new ArrayList();
    
    
    Scanner leer = new Scanner(System.in);
    String op = "";
    public  void crearPerro(){
        
        perros.add(new Perro("toto", "Rotwailer", 3, Tamaño.GRANDE));
        perros.add(new Perro("pipo", "callejeror", 4, Tamaño.MEDIANO));
        perros.add(new Perro("manchita", "dogo argentino", 1, Tamaño.GRANDE));
        perros.add(new Perro("negrito", "ovejero", 5, Tamaño.GRANDE));
        perros.add(new Perro("tomy", "caniche", 2, Tamaño.CHICO));
        perros.add(new Perro("ciro", "labrador", 6, Tamaño.MEDIANO));
    }
     public void crearUsuario(){
         personas.add(new Persona("leandro", "cueito", 40, 29222458));
         personas.add(new Persona("seba ", "girolmini", 32, 35452239));
         personas.add(new Persona("johana", "carrizo", 26, 39851489));
         personas.add(new Persona("max", "gimenez", 33, 33821487));
         personas.add(new Persona("roberto ", "sampi", 56, 13458789));
         personas.add(new Persona("diego", "deharo", 35, 32258963));
         
         
     }
     
     public void mostrarPerros(){
         for (Perro aux : perros) {
             System.out.println(aux.toString());
         } 
         }
     
     
     
         public void mostrarUsuario(){
             
              for (Persona per : personas) {
                  System.out.println(per);
             }
              
     }
         
         public void adopcion(){
             Persona c = new Persona();
           String resp= "";
 
             for (int i = 0; i < personas.size(); i++) {
                // do {                     
                      System.out.println(" hola " + personas.get(i).getNombre() + " vamos a adoptar un perrito ");
                 mostrarPerros();
                 System.out.println("**************************************************");
                 System.out.println(" elige el nombre del perrito que te gustaria adoptar ");
                 op = leer.next();
                 
                         //  for (Perro aux_perro : perros) {
                  
                          // if (aux_perro.isAdoptado()) {
                            //     System.out.println(" ese perro ya fue adoptado");
                             //    System.out.println(" usted quiere adoptar otro perrito (y/n) ");
                              //   resp= leer.next();
                                 
                               //  i-=1;
                     // }
                                for (int j = 0; j < perros.size(); j++) {
                                    if (perros.get(j).getNombre().equalsIgnoreCase(op)) {
                                           System.out.println( personas.get(i).getNombre() + " usted eligio al perro " + perros.get(j).getNombre());
                         perros2.add(perros.get(j));
                         Iterator<Perro> it= perros.iterator();
                               while (it.hasNext()) {
                                   if (it.next().getNombre().equalsIgnoreCase(op)) {
                                        it.remove();
                                   }
                                 personas.get(i).setMascota(perros.get(j));
                                   
                               }
                                    }
                 }
                     
                 }
             
                     
                     
//                        if (perros.getNombre().equalsIgnoreCase(op)) {
//                          System.out.println( personas.get(i).getNombre() + " usted eligio al perro " + aux_perro .getNombre());
//                         perros2.add(aux_perro);
//                         Iterator<Perro> it= perros.iterator();
//                               while (it.hasNext()) {
//                                   if (it.next().getNombre().equalsIgnoreCase(op)) {
//                                        it.remove();
//                                   }
//                                 
//                                   
//                               }
//                                      personas.get(i).setMascota(aux_perro);
//                                    //  aux_perro.setAdoptado(true);
//                                // resp="n";
//                      }
//                        
      
                                   
                                   
                      }
                 
                     
                 
              //   } while (resp.equalsIgnoreCase("y"));
         
   
                
                 
               
             }
             
         

             
             
        
         


