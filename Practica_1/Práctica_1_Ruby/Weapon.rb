
require_relative 'Dice'
class Weapon
    #Atributos de instancia privados.
    @power = nil
    @uses = nil
    #Constructor con parámetros.
    def initialize(power, uses)
      @power = power
      @uses = uses
    end
    #Devuelve la intensidad del ataque del jugador y quita un uso.
    def attack
      if @uses > 0
        @uses -= 1
        return @power
      else
        return 0
      end
    end
    #Representa en forma de cadena de caracteres el estado interno del objeto.
    def to_s
        puts "W[#{@power}, #{@uses}]"
    end
    #Implementa si el arma se descarta o no.
    def discard()
      Dice.discardElement(@uses)
    end
end

#Pruebas para la clase Weapon
weapon = Weapon.new(10, 8)
puts weapon.discard
puts weapon.to_s  # Debería mostrar "W[10, 3]"
# Llamar a los métodos y probar la clase
puts "Attack: #{weapon.attack}"  # Debería mostrar "Attack: 10"
puts "Attack: #{weapon.attack}"  # Debería mostrar "Attack: 10"
puts "Attack: #{weapon.attack}"  # Debería mostrar "Attack: 10"
puts "Attack: #{weapon.attack}"  # Debería mostrar "Attack: 0"

# Llamar al método to_s para obtener una representación en cadena de la instancia
puts weapon.to_s  # Debería mostrar "W[10, 0]"

puts weapon.discard


