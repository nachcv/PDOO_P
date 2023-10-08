package irrgarten;
import java.util.Random;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Dice {
    //Atributos de clase privados.
    private static final int MAX_USES=5;
    private static final float MAX_INTELLIGENCE=10.0F;
    private static final float MAX_STRENGHT=10.0F;
    private static final float RESURRECT_PROB=0.3F;
    private static final int WEAPONS_REWARD=2;
    private static final int SHIELD_REWARD=3;
    private static final int HEALTH_REWARD=5;
    private static final int MAX_ATTACK=3;
    private static final int MAX_SHIELD=2;
    private static final Random generator=new Random();
    
    //Devuelve número de fila o columna aleatorio siendo el argumento el máximo posible.
    int randomPos(int max){
        return generator.nextInt(max);  
    }
    //Devuelve el índice del jugador que inicia la partida.
    int whoStarts(int nplayers){
        return generator.nextInt(nplayers);
    }
    //Devuelve un valor aleatorio de inteligencia en [0,MAX_INTELLIGENCE].
    float randomIntelligence(){
        return generator.nextFloat(MAX_INTELLIGENCE);
    }
    //Devuelve un valor aleatorio de fuerza en [0,MAX_STRENGHT].
    float randomStrength(){
        return generator.nextFloat(MAX_STRENGHT);
    }
    //Indica si el jugador revive o no.
    boolean resurrectPlayer(){
        if(generator.nextDouble() <= RESURRECT_PROB)
            return true;
        else
            return false;
    }
    //Indica la cantidad de armas que recibirá el jugador por ganar el combate.
    int weaponsReward(){
        return generator.nextInt(WEAPONS_REWARD+1);
    }
    //Indica la cantidad de escudos que recibirá el jugador por ganar el combate.
    int shieldReward(){
        return generator.nextInt(SHIELD_REWARD +1);
    }
    //Indica la cantidad de unidades de salud que recibirá el jugador por ganar el combate.
    int healthReward(){
        return generator.nextInt(HEALTH_REWARD +1);
    }
    //Devuelve un valor aleatorio en el intervalo [0, MAX_ATTACK[.
    float weaponPower(){
        return generator.nextFloat(MAX_ATTACK );
    }
    //Devuelve un valor aleatorio en el intervalo [0, MAX_SHIELD[.
    float shieldPower(){
        return generator.nextFloat(MAX_SHIELD);
    }
    //Devuelve el número de usos que se asignará a un arma o escudo. 
    int usesLeft(){
        return generator.nextInt(MAX_USES +1);
    }
    //Devuelve la cantidad de competencia aplicada.
    float intensity(float competence){
        return generator.nextFloat(competence);
    }
    //Dice si un arma o un escudo es descartado o no.
    boolean discardElement(int usesLeft){
        switch(usesLeft){
            case MAX_USES:
                return false;
            case 0:
                return true;
            default:
                double probability = 1.0 - (double) usesLeft / MAX_USES;
                return generator.nextDouble() <= probability;
        }
            
    }
   
}
