/**
 * This class basically represents the brain of the game. It has nothing to do with the user interface
 * @author maya2002yagan
 */
public class Engine {
   //board represents the board that the game will take place on
   private final char[][] board = new char[3][3];
   //this will keep track of the winner
   private int winner;
   
   /**
    * This constructor initializes an empty board. E stands for empty
    */
   public Engine(){
       for(int i=0; i<=2; i++){
           for(int j=0; j<=2; j++)
               board[i][j]= 'E';
       } 
   }
   
   /**
    * This method sets the board to a specific value
    * @param value the value that the tile will hold
    * @param column the column of the wanted tile
    * @param row the row of the wanted
    */
   public void setBoard(char value, int column, int row){
       board[row][column]= value;
   }
   
   /**
    * This method returns the board
    * @return the game board
    */
   public char[][] getBoard(){
       return board;
   }
   
   /**
    * This method returns the winner
    * @return the winner of the game
    */
   public int getWinner(){
       return winner;
   }
   
   /**
    * This methods checks if the game is over. 
    * @return true if there is a winner or if there are no more moves
    */
   public boolean isGameOver(){
       if(isHorizontalLine()|| isVerticalLine() || isDiagonalLine())
           return true;
       else{
           int emptyCounter = 9;
           for(int i=0; i<=2; i++){
               for(int j=0; j<=2; j++){
                   if(board[i][j] != 'E')
                       emptyCounter--;
               }
           }
           if(emptyCounter == 0){
               winner = -1;
               return true;
           }
       }
       return false;
   }
   
   /**
    * This method checks if 3 consecutive tiles are equal vertically
    * @return true if there is a vertical line
    */
   public boolean isVerticalLine(){
       for(int i=0; i<=2; i++){
           for(int j=0; j<=2; j++){
               if(board[i][j] == 'E')
                   continue;
               else if(board[i][j] == 'x' && i+1 < board.length){
                   if(board[i+1][j] == 'x' && i+2 < board.length){
                       if(board[i+2][j] == 'x'){
                           winner = 1;
                           return true;
                       }
                   }
               }
               else if(board[i][j] == 'o' && i+1 < board.length){
                   if(board[i+1][j] == 'o' && i+2 < board.length){
                       if(board[i+2][j] == 'o'){
                           winner = 2;
                           return true;
                       }
                   }
               }
           }
       }
       return false;
   }
   
   /**
    * This method checks if 3 consecutive tiles are equal horizontally
    * @return true if there is a horizontal line
    */
   public boolean isHorizontalLine(){
       for(int i=0; i<=2; i++){
           for(int j=0; j<=2; j++){
               if(board[i][j] == 'E')
                   continue;
               else if(board[i][j] == 'x' && j+1 < board.length){
                   if(board[i][j+1] == 'x' && j+2 < board.length){
                       if(board[i][j+2] == 'x'){
                           winner = 1;
                           return true;
                       }
                   }
               }
               else if(board[i][j] == 'o' && j+1 < board.length){
                   if(board[i][j+1] == 'o' && j+2 < board.length){
                       if(board[i][j+2] == 'o'){
                           winner = 2;
                           return true;
                       }
                   }
               }
           }
       }
       return false;
   }
   
   /**
    * This method checks if 3 consecutive tiles are equal diagonally
    * @return true if there is a diagonal line
    */
   public boolean isDiagonalLine(){
       for(int i=0; i<=2; i++){
           for(int j=0; j<=2; j++){
               if(board[i][j] == 'E')
                   continue;
               else if(board[i][j] == 'x' && i+1 < board.length && j+1 < board.length){
                   if(board[i+1][j+1] == 'x' && i+2 < board.length && j+2 < board.length){
                       if(board[i+2][j+2] == 'x'){
                           winner = 1;
                           return true;
                       }
                   }
               }
               else if(board[i][j] == 'o' && i+1 < board.length && j+1 < board.length){
                   if(board[i+1][j+1] == 'o' && i+2 < board.length && j+2 < board.length){
                       if(board[i+2][j+2] == 'o'){
                           winner = 2;
                           return true;
                       }
                   }
               }
               else if(board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x'){
                   winner = 1;
                   return true;
               }
               else if(board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o'){
                   winner = 2;
                   return true;
               }
           }
       }
       return false;
   }
   
   /**
    * This method is just for testing the game without the interface
    */
   public void printBoard(){
       for(int i=0; i<=2; i++){
           for(int j=0; j<=2; j++)
               System.out.print(board[i][j] + " ");
           System.out.println("");
       }
   }
}
