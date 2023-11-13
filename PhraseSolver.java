/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */ 
 private Player player_1;
 private Player player_2;
 private BoardGame boardGame;
 private boolean solved ;
  
  /* your code here - constructor(s) */ 
public PhraseSolver 
  this.player_1 = newPlayer()
  this.player_2 = newPlayer()
  this.boardgame = new boardgame();
  solved = false;
  
  /* your code here - accessor(s) */
public Players getPlayers(int PlayerNum){
  if (playerNum == 1) {
  return player_1;
} else if (playerNum == 2) {
  return player_2;
}
return player_2;
}

  
  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */

      
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}
