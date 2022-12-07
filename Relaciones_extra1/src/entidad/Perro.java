/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import enums.Tamaño;
import java.util.ArrayList;


 
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private Tamaño tamaño;
   // private boolean adoptado;
   
    
    public Perro(String nombre, String raza, int edad, Tamaño tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }

 //   public boolean isAdoptado() {
   //     return adoptado;
   // }

 //   public void setAdoptado(boolean adoptado) {
     //   this.adoptado = adoptado;
 //   }

    
    
  
    @Override
    public String toString() {
        return "Perro  nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamaño=" + tamaño  ;
    }
    
}
