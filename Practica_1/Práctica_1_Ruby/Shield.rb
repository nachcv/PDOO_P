
require_relative 'Dice'

class Shield
    #Atributos de instancia privados.
    @protection = nil
    @uses = nil
    #Constructor con parámetros.
    def initialize(protection, uses)
      @protection = protection
      @uses = uses
    end
    #Devuelve la intensidad de la defensa del jugador y reduce uno el uso.
    def protect
      if @uses > 0
        @uses -= 1
        return @protection
      else
        return 0
      end
    end
    #Devuelve el estado interno del objeto.
    def to_s
        puts "S[#{@protection}, #{@uses}]"
    end
    ##Dice si un escudo se devuelve o no.
    def discard()
      Dice.discardElement(@uses)
    end
end

#Pruebas para la clase shield-
shield = Shield.new(10, 3)
puts shield.discard
puts shield.to_s  # Debería mostrar "S[10, 3]"
# Llamar a los métodos y probar la clase
puts "Defence: #{shield.protect}"  # Debería mostrar "protect: 10"
puts "Defence: #{shield.protect}"  # Debería mostrar "protect: 10"
puts "Defence: #{shield.protect}"  # Debería mostrar "protect: 10"
puts "Defence: #{shield.protect}"  # Debería mostrar "protect: 0"

# Llamar al método to_s para obtener una representación en cadena de la instancia
puts shield.to_s  # Debería mostrar "S[10, 0]"
puts shield.discard