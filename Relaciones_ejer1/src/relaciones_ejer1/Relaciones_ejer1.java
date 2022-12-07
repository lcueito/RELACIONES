/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ejer1;

import Entidad.Perro;
import Entidad.Persona;

/**
 *private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Perro perro;
 * @author Usuario
 */
public class Relaciones_ejer1 {

   
    public static void main(String[] args) {
      Persona per1 = new Persona();
       Persona per2 = new Persona();
     
       
       per1.setNombre("leandro");
       per1.setApellido("cueito");
       per1.setEdad(40);
       per1.setDocumento(29222548);
       
       per2.setNombre("cristobal");
       per2.setApellido("cueito");
               per2.setEdad(4);
               per2.setDocumento(46925487);
               
               Perro p1 = new Perro("pascua", " boxer",2,"mediano");
                 Perro p2 = new Perro("branco", " labradorr",3,"grande");
                 
                 
                 per1.setPerro(p1);
                 per2.setPerro(p2);
                 
                 System.out.println(per1.toString());
                 System.out.println(per2.toString());
    }
    
}
