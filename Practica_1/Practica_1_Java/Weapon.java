/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;
import irrgarten.Dice;

/**
 *
 * @author usuario
 */
public class Weapon {
    //Atributos de instancia privados.
    private float power;
    private int uses;
    
    //Constructor con parámetros.
    public Weapon(float power, int uses)
    {
        this.power = power;
        this.uses = uses;
    }
    //Devuelve la intensidad del ataque del jugador y quita un uso.
    float attack(){
        if(uses > 0) {
            uses --;
            return power;
        } else {
            return 0;
        }        
    }
    //Representa en forma de cadena de caracteres el estado interno del objeto.
    @Override
    public String toString(){
        return "W[" + power + ", " + uses +"]";
    }
    //Implementa si el arma se descarta o no.
    boolean discard(){
        Dice dado = new Dice();
        return dado.discardElement(uses);
    }
     
}
