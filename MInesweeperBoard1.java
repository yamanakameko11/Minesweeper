
/**
 * Write a description of class Minesweeper here.
 * public void addNums(){
} else if (index == (rows*columns - columns)) {
while (board[index].getValue() != -1) {
board[index + 1].setValue();
board[columns].setValue();
board[].setValue();
}
} else if (index == (rows*columns - 1)) {
while (board[index].getValue() != -1) {
board[index + 1].setValue();
board[columns].setValue();
board[].setValue();
}
}
}
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MInesweeperBoard1{
    Cell[] board;
    int rows;
    int columns;
    public MInesweeperBoard1(int row, int column){
        //Put the constructor here.
        this.rows = row;
        this.columns = column;
        board = new Cell[rows*columns];
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());

        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MInesweeperBoard1() {
        this(10, 10);
    }

    public void addNums() {
        for (int i = 0; i < rows*columns; i++) 
        {
            if (board[i] == -1) {
                if (board[i] = 0)  // not top and left
                {
                    board[i+1].setValue();
                    board[columns.setValue();
                }
                if ()  // not top
                {
                    
                }
                if ()  //not top and right row
                {

                }
                if ()  // not left
                {

                }
                if ()  // not right
                {

                }
                if ()  // not bottom and left
                {

                }
                if ()  // not bottom
                {

                }
                if ()  //not bottom and right
                {

                }
            }
        }
    }

    public void addBombs(int bombs) throws Exception{
        for (int i = 0; i < bombs; i++) { 
            int x = (int)(Math.random() * (rows*columns) - 1);
            while (board[x].getValue() != 0) {
                x = (int)(Math.random() * (rows*columns) - 1);
            }
            board[x].setBomb();
        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[index].isBomb()) {
                    System.out.print("X ");
                } else {
                    System.out.print(board[index].getValue() + " ");
                }
                index++;
            }
            System.out.println();
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
            board[i]= new Cell();
            panel.add(board[i].getButton());
        }
        return panel;
    }

}
