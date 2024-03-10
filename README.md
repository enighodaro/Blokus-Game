# Blokus-Game
This is a group project and the goal is to replicate a game called Blokus
This game is implemented using Java

Use case descriptions available in iterations

Game Components
a board of 400 squares
84 pieces in four different colors (21 pieces per color).
Each of the 21 pieces for a color is of a different shape.
There are: 1 piece of only one square, 1 piece of two squares, 2 pieces of three squares, 5 pieces of four squares, and 12 pieces of five squares.


Object of the game
Each player has to fit as many of his/her 21 pieces on the board as possible.


Game Play
Each player chooses a color and places that set of 21 pieces in front of his/her side of the board. The order of play is as follows: blue, yellow, red, green.

The first piece played by each player must cover a corner square.



Each new piece must touch at least one other piece of the same color, but only at the corners. Pieces of the same color cannot be in contact along an edge.


There are no restrictions on how many pieces of different colors may be in contact with each other.



Once a piece has been placed on the board it cannot be moved during subsequent turns.

End of Game 

The user has no more available moves and all other players are done playing. The system provides the scores of each player with their relative positions. Scores indicate how many blocks each player had left. The player(s) with the smallest amount of squares (lowest score) is the winner. 

Implemented using: JAVA 

copied from https://www.ultraboardgames.com/blokus/game-rules.php (with some changes to end of game flow)

Edited by Esosa Naomi Ighodaro
