package irrgarten;
import irrgarten.Dice;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Shield {
    //Atributos de instancia privados.
    private float protection;
    private int uses;
    //Constructor con parámetros.
    public Shield(float protection, int uses)
    {
        this.protection = protection;
        this.uses = uses;
    }
    //Devuelve la intensidad de la defensa del jugador y reduce uno el uso.
    float protect(){
        if(uses > 0) {
            uses --;
            return protection;
        } else {
            return 0;
        }        
    }
    //Devuelve el estado interno del objeto.
    @Override
    public String toString(){
        return "S[" + protection + ", " + uses +"]";
    }
    //Dice si un escudo se devuelve o no.
    boolean discard(){
        Dice dado = new Dice();
        return dado.discardElement(uses);
    }
}
