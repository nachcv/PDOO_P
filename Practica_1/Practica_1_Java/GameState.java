package irrgarten;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class GameState {
    //Atributos de instancia privados.
    private String labyrinthv;
    private String players;
    private String monsters;
    private int currentPlayer;
    private boolean winner;
    private String log;
    
    //Constructor  de la clase con parámetros.
    public GameState(String labyrinthv,String players,String monsters,int currentPlayer,boolean winner,String log)
    {
        this.labyrinthv= labyrinthv;
        this.players = players;
        this.monsters = monsters;
        this.currentPlayer = currentPlayer;
        this.winner = winner;
        this.log = log;
    }
    //Get para Labyrinthv.
    public String getLabyrinthv(){
        return labyrinthv;
    }
    //Get para players.
    public String getPlayers(){
        return players;
    }
    //Get para monsters.
    public String getMonsters(){
        return monsters;
    }
    //Get para currentPlayer.
    public int getcurrentPlayer(){
        return currentPlayer;
    }
    //Get para winner.
    public boolean getWinner(){
        return winner;
    }
    //Get para Log.
    public String getLog(){
        return log;
    }
}
