
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

    public void addNums(){
        for (int r = 0; r < rows; r++){ //for every cell
            for (int c = 0; c < columns; c++) {
                if (board[r][c].isBomb()){
                    if(r-1 >= 0 && c-1 >=0 && !board[r-1][c-1].isBomb()){board[r-1][c-1].addValue();} //upper left
                    if(r-1 >= 0 && c+1 < columns && !board[r-1][c+1].isBomb()){board[r-1][c+1].addValue();} //upper right
                    if(r+1 < rows && c-1 >=0 && !board[r+1][c-1].isBomb()){board[r+1][c-1].addValue();} //lower left
                    if(r+1 < rows && c+1 < columns && !board[r+1][c+1].isBomb()){board[r+1][c+1].addValue();} //lower right
                    if(r-1 >=0 && !board[r-1][c].isBomb()){board[r-1][c].addValue();} //left
                    if(r+1 < rows && !board[r+1][c].isBomb()){board[r+1][c].addValue();} //right
                    if(c-1 >=0 && !board[r][c-1].isBomb()){board[r][c-1].addValue();} //top
                    if(c+1 < columns && !board[r][c+1].isBomb()){board[r][c+1].addValue();} //bottom
                }
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
                if (board[r][c].isBomb()) {
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
