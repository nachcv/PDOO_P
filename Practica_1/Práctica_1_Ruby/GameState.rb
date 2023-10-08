class GameState
    #Atributos de instancia privados.
    @labyrinthv = nil
    @players = nil
    @monsters = nil
    @currentPlayer = nil
    @winner = nil
    @log = nil
    
    #Constructor  de la clase con parámetros.
    def initialize(labytinthv, players, monsters, currentplayer, winner, log )
      # Set the instance variables within the constructor
      @labyrinthv = labyrinthv
      @players = players
      @monsters = monsters
      @currentPlayer = currentplayer
      @winner = winner
      @log = log
    end
    #Get para Labyrinthv.
    def getlabyrinthv()
        @labyrinthv
    end
    #Get para players.
    def getplayers()
        @players
    end
    #Get para monsters.
    def getmonsters()
        @monsters
    end
    #Get para currentPlayer.
    def getcurrentPlayer()
        @currentPlayer
    end
    #Get para winner.
    def getWinner()
        @winner
    end
    #Get para Log.
    def getLog()
        @log
    end
    
end

