
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
    
     public void addBombs(int bombs) throws Exception{
        }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++){
                System.out.print(board[r][c].getValue() + " ");
            }
            System.out.println();
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
