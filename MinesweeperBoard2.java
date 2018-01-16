
/**
 * This is the game Minesweeper recreated in BlueJ.
 * @author Kameko Yamanaka
 * @version 11.29.17
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard2{
    Cell[][] board;
    int rows;
    int columns;
    boolean n = false;
    public MinesweeperBoard2(int row, int column){
        //Put the constructor here.
        this.rows = row;
        this.columns = column;
        board = new Cell[rows][columns];
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard2() {
        this(10, 10);
    }

    public void addNums() {
        if(!n){
            for (int r = 0; r < rows; r++){ //for every cell
                for (int c = 0; c < columns; c++) {
                    if(board[r][c].getValue() == -1){ //if bomb, then...
                        if(r < columns){ 
                            if((r % columns) == 0){
                                if(board[r + 1][c].getValue() == -1){} //if bomb, do nothing
                                else{board[r + 1][c].Value(); //else, add 1 to value
                                }
                                if(board[r + columns][c].getValue() == -1){}
                                else{board[r + columns][c].Value();
                                }
                                if(board[(r + 1) + columns][c].getValue() == -1){}
                                else{board[(r + 1) + columns][c].Value();
                                }
                            }
                            else if((r % columns) == (columns - 1)){
                                if(board[r - 1][c].getValue() == -1){}
                                else{board[r - 1][c].Value();
                                }
                                if(board[r + columns][c].getValue() == -1){}
                                else{board[r + columns][c].Value();
                                }
                                if(board[(r - 1) + columns][c].getValue() == -1){}
                                else{board[(r - 1) + columns][c].Value();
                                }
                            }

                            else{
                                if(board[r + 1][c].getValue() == -1){}
                                else{board[r + 1][c].Value();
                                }
                                if(board[r + columns][c].getValue() == -1){}
                                else{board[r + columns][c].Value();
                                }
                                if(board[(r + 1) + columns][c].getValue() == -1){}
                                else{board[(r + 1) + columns][c].Value();
                                }
                                if(board[r - 1][c].getValue() == -1){}
                                else{board[r - 1][c].Value();
                                }
                                if(board[(r - 1) + columns][c].getValue() == -1){}
                                else{board[(r - 1) + columns][c].Value();
                                }
                            }
                        }
                        else if(r >= (rows*columns) - rows){
                            if((r % columns) == 0){
                                if(board[r + 1][c].getValue() == -1){}
                                else{board[r + 1][c].Value();
                                }
                                if(board[r - columns][c].getValue() == -1){}
                                else{board[r - columns][c].Value();
                                }
                                if(board[(r + 1) - columns][c].getValue() == -1){}
                                else{board[(r + 1) - columns][c].Value();
                                }
                            }
                            else if((r % columns) == (columns - 1)){
                                if(board[r - 1][c].getValue() == -1){}
                                else{board[r - 1][c].Value();
                                }
                                if(board[r - columns][c].getValue() == -1){}
                                else{board[r - columns][c].Value();
                                }
                                if(board[(r - 1) - columns][c].getValue() == -1){}
                                else{board[(r - 1) - columns][c].Value();
                                }
                            }

                            else{
                                if(board[r + 1][c].getValue() == -1){}
                                else{board[r + 1][c].Value();
                                }
                                if(board[r - columns][c].getValue() == -1){}
                                else{board[r - columns][c].Value();
                                }
                                if(board[(r + 1) - columns][c].getValue() == -1){}
                                else{board[(r + 1) - columns][c].Value();
                                }
                                if(board[r - 1][c].getValue() == -1){}
                                else{board[r - 1][c].Value();
                                }
                                if(board[(r - 1) - columns][c].getValue() == -1){}
                                else{board[(r - 1) - columns][c].Value();
                                }
                            }
                        }
                        else{
                            if((r % columns) == 0){
                                if(board[r + 1][c].getValue() == -1){}
                                else{board[r + 1][c].Value();
                                }
                                if(board[r - columns][c].getValue() == -1){}
                                else{board[r - columns][c].Value();
                                }
                                if(board[(r + 1) - columns][c].getValue() == -1){}
                                else{board[(r + 1) - columns][c].Value();
                                }
                                if(board[r + columns][c].getValue() == -1){}
                                else{board[r + columns][c].Value();
                                }
                                if(board[(r + 1) + columns][c].getValue() == -1){}
                                else{board[(r + 1) + columns][c].Value();
                                }
                            }
                            else if((r % columns) == (columns - 1)){
                                if(board[r - 1][c].getValue() == -1){}
                                else{board[r - 1][c].Value();
                                }
                                if(board[r - columns][c].getValue() == -1){}
                                else{board[r - columns][c].Value();
                                }
                                if(board[(r - 1) - columns][c].getValue() == -1){}
                                else{board[(r - 1) - columns][c].Value();
                                }
                                if(board[r + columns][c].getValue() == -1){}
                                else{board[r + columns][c].Value();
                                }
                                if(board[(r - 1) + columns][c].getValue() == -1){}
                                else{board[(r - 1) + columns][c].Value();
                                }
                            }

                            else{
                                if(board[r + 1][c].getValue() == -1){}
                                else{board[r + 1][c].Value();
                                }
                                if(board[r - 1][c].getValue() == -1){}
                                else{board[r - 1][c].Value();
                                }
                                if(board[(r + 1) - columns][c].getValue() == -1){}
                                else{board[(r + 1) - columns][c].Value();
                                }
                                if(board[(r + 1) + columns][c].getValue() == -1){}
                                else{board[(r + 1) + columns][c].Value();
                                }
                                if(board[r - columns][c].getValue() == -1){}
                                else{board[r - columns][c].Value();
                                }
                                if(board[(r - 1) - columns][c].getValue() == -1){}
                                else{board[(r - 1) - columns][c].Value();
                                }
                                if(board[r + columns][c].getValue() == -1){}
                                else{board[r + columns][c].Value();
                                }
                                if(board[(r - 1) + columns][c].getValue() == -1){}
                                else{board[(r - 1) + columns][c].Value();
                                }
                            }
                        }
                    }
                }
                n = true;
            }
        }
    }

    public void addBombs(int bombs) throws Exception{
        for (int i = 0; i < bombs; i++) { // for every bomb
            int r = (int)(Math.random() * rows); // get rand coordinates
            int c = (int)(Math.random() * columns);
            while (board[r][c].isBomb() == true) { // while coordinates are a bomb
                r = (int)(Math.random() * rows); // new rand coordinates until conditions are met
                c = (int)(Math.random() * columns);
            }
            board[r][c].setBomb(); //sets bomb
        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        for (int r = 0; r < rows; r++) { //for every row
            for (int c = 0; c < columns; c++){ //for every column
                if (board[r][c].getValue() == -1) {
                    System.out.print("X ");
                }else {
                    System.out.print(board[r][c].getValue() + " "); //prints values for each row
                }
            }
            System.out.println(); // starts new row
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int r = 0; r< rows; r++){
            for (int c = 0; c < columns; c++){
                board[r][c]= new Cell();
                panel.add(board[r][c].getButton());
            }
        }
        return panel;
    }

}
