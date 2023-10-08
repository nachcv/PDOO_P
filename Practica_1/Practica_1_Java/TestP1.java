package irrgarten;
import irrgarten.Dice;
import irrgarten.Shield;
import irrgarten.Weapon;
import irrgarten.GameState;
import irrgarten.Irrgarten.Directions;
import irrgarten.Irrgarten.Orientation;
import irrgarten.Irrgarten.GameCharacter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class TestP1 {
    public static void main(String[] args) {
        // Crea varias instancias de cada clase creada en esta práctica y utiliza todos sus métodos.
        
        //Declaración de tres escudos para realizar las pruebas.
        Shield Escudo1 = new Shield(10.0F,5);
        Shield Escudo2 = new Shield(15.0F,8);
        Shield Escudo3 = new Shield(5.0F,1);
        
        //Salidas de las pruebas con el escudo(se ha probado también con 1 y 2).
        //System.out.println(Escudo3.toString());
        //System.out.println(Escudo3.protect());
        //System.out.println(Escudo3.toString());
        //System.out.println(Escudo3.discard());
        //-------------------------------------------------------------------------------------//
        
        //Declaración de tres armas para realizar las pruebas.
        Weapon Weapon1 = new Weapon(10.0F,5);
        Weapon Weapon2 = new Weapon(15.0F,8);
        Weapon Weapon3 = new Weapon(5.0F,1);
        
        //Salidas de las pruebas con las armas(se ha probado también con 1 y 2)
        //System.out.println(Weapon3.toString());
        //System.out.println(Weapon3.attack());
        //System.out.println(Weapon3.toString());
        //System.out.println(Weapon3.discard());
        

        // No se prueba GameState porque no sabemos los valores que usar.
        
        //-------------------------------------------------------------------------------------//
        //Prueba a utilizar los valores de los tipos enumerados creados.
        Directions Direccion1 = Directions.LEFT;
        Directions Direccion2 = Directions.RIGHT;
        Directions Direccion3 = Directions.UP;
        Directions Direccion4 = Directions.DOWN;
        //System.out.println(Direccion3);
        
        Orientation Orientation1 = Orientation.Horizontal;
        Orientation Orientation2 = Orientation.Vertical;
        //System.out.println(Orientation1);
        
        GameCharacter player = GameCharacter.PLAYER;
        GameCharacter monster = GameCharacter.MONSTER;
        //System.out.println(player);
        
        //-------------------------------------------------------------------------------------//
        
        //Prueba la clase Dice: llama a cada método 100 veces y comprueba si se cumplen a nivelpráctico las instrucciones relativas a las probabilidades de cada evento.
        
        Dice Dado = new Dice();

        //randomPos->funciona 
        //whostarts funciona 
        //randomIntelligence es entre [0,MAX_INTELLIGENCE[
        //randomStrength es entre [0,MAX_STRENGTH[
        //resurrectPlayer funciona da los dos.
        //usesLeft funciona
        //discardElement también funciona
        //weaponReward funciona 
        //shieldReward funciona 
        //healthReward funciona 
        for (int i = 0; i < 100; i++) {
            System.out.println(Dado.randomIntelligence());
        }
    }
}
