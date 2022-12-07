/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package entidad;

import Enum.Numeros;
import Enum.Palos;

/**
 *
 * @author Usuario
 */
public class Carta {
    private Numeros num;
    private Palos palo;

  

    public Carta(Numeros num, Palos palo) {
        this.num = num;
        this.palo = palo;
    }

    public Numeros getNum() {
        return num;
    }

    public void setNum(Numeros num) {
        this.num = num;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    

    @Override
    public String toString() {
        return  num + " " + palo ;
    }
    
    
    
}
