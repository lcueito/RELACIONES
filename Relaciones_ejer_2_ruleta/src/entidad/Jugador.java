/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Jugador {
    private  int iid;
    private String nombre;
     private boolean mojado;
    Jugador s;
       ArrayList<Jugador> jugadores ;
    Scanner leer = new Scanner(System.in);
    public Jugador(int iid, String nombre) {
        this.iid = iid;
        this.nombre = nombre;
    }

    public Jugador(boolean mojado, ArrayList<Jugador> jugadores) {
        this.mojado = false;
        this.jugadores = new ArrayList();
    }

    public Jugador() {
        
    }
            public  void crearJugadores (){
                System.out.println("ingrese la cantida de jugadores");
                int cantidad = leer.nextInt();
                if (cantidad < 7 && cantidad > 0)   {
                    for (Integer i = 0; i <=cantidad; i++) {
                        s = new Jugador ( i , "Jugador" + i.toString());
                      jugadores.add(s);
                    } 
                }else{
                            crearJugadores(6);
                            }
            }
    public boolean disparar(Revolver r , Jugador j){
        if (r.mojar()) {
            j.setMojado(true);
            return true;
        } else {
            r.siguienteChorro();
            return false;
        
    }
        
        
}

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Jugador getS() {
        return s;
    }

    public void setS(Jugador s) {
        this.s = s;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    private void crearJugadores(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
