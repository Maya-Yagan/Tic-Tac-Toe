import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * This class represents the user interface for the game
 * @author maya2002yagan
 */
public class UI extends Application {
    //player1 and player2 are flags to keep track of whose turn it is 
    private boolean player1 = true, player2 = false;
    //board represents the board that the game will take place on
    private Button[][] board;
    //engine represents the brain of the game
    private final Engine game = new Engine();

    @Override
    /**
     * This method initializes the game and starts it
     * @param primaryStage 
     */
    public void start(Stage primaryStage) {
        //intiliazing the board. It will always be 3x3
        board = new Button[3][3];
        // this will make the 3x3 layout of the borad 
        GridPane grid = new GridPane();
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                board[i][j] = new Button(" ");
                board[i][j].setMinSize(100, 100);
            }
            grid.addRow(i, board[i]);
        }
        charToButton(game.getBoard());
        board[0][0].setOnAction(e -> {
            if (isEmpty(board, 0, 0)) {
                if (player1) {
                    game.setBoard('x', 0, 0);
                    charToButton(game.getBoard());
                    board[0][0].setText("x");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                } else if (player2) {
                    game.setBoard('o', 0, 0);
                    charToButton(game.getBoard());
                    board[0][0].setText("o");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                }
            }
        });

        board[0][1].setOnAction(e -> {
             if (isEmpty(board, 0,1)) {
                if (player1) {
                    game.setBoard('x', 1, 0);
                    charToButton(game.getBoard());
                    board[0][1].setText("x");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                } else if (player2) {
                    game.setBoard('o', 1, 0);
                    charToButton(game.getBoard());
                    board[0][1].setText("o");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                }
            }
        });

        board[0][2].setOnAction(e -> {
             if (isEmpty(board,0,2)) {
                if (player1) {
                    game.setBoard('x', 2, 0);
                    charToButton(game.getBoard());
                    board[0][2].setText("x");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                } else if (player2) {
                    game.setBoard('o', 2, 0);
                    charToButton(game.getBoard());
                    board[0][2].setText("o");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                }
            }
        });

        board[1][0].setOnAction(e -> {
             if (isEmpty(board,1,0)) {
                if (player1) {
                    game.setBoard('x', 0, 1);
                    charToButton(game.getBoard());
                    board[1][0].setText("x");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                } else if (player2) {
                    game.setBoard('o', 0, 1);
                    charToButton(game.getBoard());
                    board[1][0].setText("o");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                }
            }
        });

        board[1][1].setOnAction(e -> {
             if (isEmpty(board,1,1)) {
                if (player1) {
                    game.setBoard('x', 1, 1);
                    charToButton(game.getBoard());
                    board[1][1].setText("x");
                    changeTurn();
                } else if (player2) {
                    game.setBoard('o', 1, 1);
                    charToButton(game.getBoard());
                    board[1][1].setText("o");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                }
            }
        });

        board[1][2].setOnAction(e -> {
             if (isEmpty(board,1,2)) {
                if (player1) {
                    game.setBoard('x', 2, 1);
                    charToButton(game.getBoard());
                    board[1][2].setText("x");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                } else if (player2) {
                    game.setBoard('o', 2, 1);
                    charToButton(game.getBoard());
                    board[1][2].setText("o");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                }
            }
        });

        board[2][0].setOnAction(e -> {
             if (isEmpty(board,2,0)) {
                if (player1) {
                    game.setBoard('x', 0, 2);
                    charToButton(game.getBoard());
                    board[2][0].setText("x");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                } else if (player2) {
                    game.setBoard('o', 0, 2);
                    charToButton(game.getBoard());
                    board[2][0].setText("o");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                }
            }
        });

        board[2][1].setOnAction(e -> {
             if (isEmpty(board,2,1)) {
                if (player1) {
                    game.setBoard('x', 1, 2);
                    charToButton(game.getBoard());
                    board[2][1].setText("x");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                } else if (player2) {
                    game.setBoard('o', 1, 2);
                    charToButton(game.getBoard());
                    board[2][1].setText("o");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                }
            }
        });

        board[2][2].setOnAction(e -> {
             if (isEmpty(board,2,2)) {
                if (player1) {
                    game.setBoard('x', 2, 2);
                    charToButton(game.getBoard());
                    board[2][2].setText("x");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                } else if (player2) {
                    game.setBoard('o', 2, 2);
                    charToButton(game.getBoard());
                    board[2][2].setText("o");
                    changeTurn();
                    if (game.isGameOver()) {
                        gameOver();
                    }
                }
            }
        });
        if (game.isGameOver()) {
            gameOver();
        }
        Scene scene = new Scene(grid);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }

    /**
     * a helper method to convert from an array of characters to an array of buttons
     * @param array an array of characters
     */
    public void charToButton(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 'E') {
                    board[i][j].setText(" ");
                } else {
                    board[i][j].setText(Character.toString(array[i][j]));
                }
            }
        }
    }

    /**
     * a helper method to convert an array of buttons to an array of characters
     * @param buttons an array of buttons
     * @return an array of characters
     */
    public char[][] buttonToChar(Button[][] buttons) {
        char[][] finalArray = new char[buttons.length][buttons[0].length];
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                if (buttons[i][j].getText().equals(" ")) {
                    finalArray[i][j] = 'E';
                } else {
                    finalArray[i][j] = (buttons[i][j].getText()).charAt(0);
                }
            }
        }
        return finalArray;
    }

    /**
     * a helper method to check if a specific tile on the board is empty
     * @param array the game board
     * @param i the column
     * @param j the row
     * @return true if the tile is empty 
     */
    public boolean isEmpty(Button[][] array, int i, int j) {
        return array[i][j].getText().equals(" ");
    }

    /**
     * a helper method to change turn of the players
     */
    public void changeTurn() {
        if (player1) {
            player1 = false;
            player2 = true;
        } else {
            player1 = true;
            player2 = false;
        }
    }

    /**
     * this method shows a message when the game is over stating the winner 
     */
    public void gameOver() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Game Over");
        alert.setHeaderText(null);
        switch (game.getWinner()) {
            case 1:
                alert.setContentText("Congratulations!\n" + "Player 1 won!");
                break;
            case 2:
                alert.setContentText("Congratulations!\n" + "Player 2 won!");
                break;
            case -1:
                alert.setContentText("Game Over!\n" + "No one won.\nGood luck next time!");
        }
        alert.setOnCloseRequest(event -> {
            Platform.exit();
        });
        alert.showAndWait();
    }

    public static void main(String[] args) {
        UI.launch(args);
    }
}
