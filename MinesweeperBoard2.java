
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

public class MinesweeperBoard2{
    Cell[] board;
    int rows;
    int columns;
    public MinesweeperBoard2(int row, int column){
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

    public MinesweeperBoard2() {
        this(10, 10);
    }

    public void addNums() {
        int index = 0;
        for (int x = 0; x < rows*columns; x++) 
        {
            while (board[index].getValue() == -1) 
            {
                //CORNERS
                if (index == 0) //top left corner
                {
                    if (board[index + 1].getValue() != -1) 
                    {
                        board[index + 1].setValue();
                    }
                    if (board[columns].getValue() != -1) 
                    {
                        board[columns].setValue();
                    }
                    if (board[columns + 1].getValue() != -1) 
                    {
                        board[columns + 1].setValue();
                    }
                }
                if (index == (rows-1)) //top right corner
                {
                    if (board[columns - 2].getValue() != -1) 
                    {
                        board[columns - 2].setValue();
                    }
                    if (board[(columns*2) - 1].getValue() != -1) 
                    {
                        board[(columns*2) - 1].setValue();
                    }
                    if (board[(columns*2) - 2].getValue() != -1) 
                    {
                        board[(columns*2) - 2].setValue();
                    }
                }
                if (index == (rows*columns - columns)) //bottom left corner
                {
                    if (board[rows*(columns - 1) - columns].getValue() != -1) 
                    {
                        board[rows*(columns - 1) - columns].setValue();
                    }
                    if (board[rows*(columns - 1) - (columns + 1)].getValue() != -1) 
                    {
                        board[rows*(columns - 1) - (columns + 1)].setValue();
                    }
                    if (board[rows*columns - (columns + 1)].getValue() != -1) 
                    {
                        board[rows*columns - (columns + 1)].setValue();
                    }
                }
                if (index == (rows*columns - 1)) //bottom right corner
                {
                    if (board[(rows*columns) - 2].getValue() != -1) 
                    {
                        board[(rows*columns) - 2].setValue();
                    }
                    if (board[rows*(columns-1) - 1].getValue() != -1) 
                    {
                        board[rows*(columns-1) - 1].setValue();
                    }
                    if (board[rows*(columns-1) - 2].getValue() != -1) 
                    {
                        board[rows*(columns-1) - 2].setValue();
                    }
                } 
                //TOP ROW (NO CORNERS)
                //BOTTOM ROW (NO CORNERS)
                //LEFT (NO CORNERS)
                //RIGHT (NO CORNERS)
                index++;
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
