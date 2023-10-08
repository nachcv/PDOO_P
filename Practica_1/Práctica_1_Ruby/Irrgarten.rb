
#Modulos que servirían como los enum de java.
module Directions
    LEFT = :left
    RIGHT = :right
    UP = :up
    DOWN = :down
end
module GameCharacter
    PLAYER = :player
    MONSTER = :monster
end
module Orientation
    VERTICAL= :vertical
    HORIZONTAL= :horizontal
end


#Pruebas de estos módulos.
class Character
    include Directions
    include GameCharacter
    include Orientation
end


left_direction= Character::LEFT
puts left_direction

vertical_orientation= Character::VERTICAL
puts vertical_orientation

player= Character::PLAYER
puts player

