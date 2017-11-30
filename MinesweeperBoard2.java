
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
    Cell[] board;
    int rows;
    int columns;
    boolean n = false;
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
        if(!n){
            for (int i = 0; i < ((rows)*(columns)); i++){ //for every cell
                if(board[i].getValue() == -1){ //if bomb, then...
                    if(i < columns){ 
                        if((i % columns) == 0){
                            if(board[i + 1].getValue() == -1){} //if bomb, do nothing
                            else{board[i + 1].Value(); //else, add 1 to value
                            }
                            if(board[i + columns].getValue() == -1){}
                            else{board[i + columns].Value();
                            }
                            if(board[(i + 1) + columns].getValue() == -1){}
                            else{board[(i + 1) + columns].Value();
                            }
                        }
                        else if((i % columns) == (columns - 1)){
                            if(board[i - 1].getValue() == -1){}
                            else{board[i - 1].Value();
                            }
                            if(board[i + columns].getValue() == -1){}
                            else{board[i + columns].Value();
                            }
                            if(board[(i - 1) + columns].getValue() == -1){}
                            else{board[(i - 1) + columns].Value();
                            }
                        }

                        else{
                            if(board[i + 1].getValue() == -1){}
                            else{board[i + 1].Value();
                            }
                            if(board[i + columns].getValue() == -1){}
                            else{board[i + columns].Value();
                            }
                            if(board[(i + 1) + columns].getValue() == -1){}
                            else{board[(i + 1) + columns].Value();
                            }
                            if(board[i - 1].getValue() == -1){}
                            else{board[i - 1].Value();
                            }
                            if(board[(i - 1) + columns].getValue() == -1){}
                            else{board[(i - 1) + columns].Value();
                            }
                        }
                    }
                    else if(i >= (rows*columns) - rows){
                        if((i % columns) == 0){
                            if(board[i + 1].getValue() == -1){}
                            else{board[i + 1].Value();
                            }
                            if(board[i - columns].getValue() == -1){}
                            else{board[i - columns].Value();
                            }
                            if(board[(i + 1) - columns].getValue() == -1){}
                            else{board[(i + 1) - columns].Value();
                            }
                        }
                        else if((i % columns) == (columns - 1)){
                            if(board[i - 1].getValue() == -1){}
                            else{board[i - 1].Value();
                            }
                            if(board[i - columns].getValue() == -1){}
                            else{board[i - columns].Value();
                            }
                            if(board[(i - 1) - columns].getValue() == -1){}
                            else{board[(i - 1) - columns].Value();
                            }
                        }

                        else{
                            if(board[i + 1].getValue() == -1){}
                            else{board[i + 1].Value();
                            }
                            if(board[i - columns].getValue() == -1){}
                            else{board[i - columns].Value();
                            }
                            if(board[(i + 1) - columns].getValue() == -1){}
                            else{board[(i + 1) - columns].Value();
                            }
                            if(board[i - 1].getValue() == -1){}
                            else{board[i - 1].Value();
                            }
                            if(board[(i - 1) - columns].getValue() == -1){}
                            else{board[(i - 1) - columns].Value();
                            }
                        }
                    }
                    else{
                        if((i % columns) == 0){
                            if(board[i + 1].getValue() == -1){}
                            else{board[i + 1].Value();
                            }
                            if(board[i - columns].getValue() == -1){}
                            else{board[i - columns].Value();
                            }
                            if(board[(i + 1) - columns].getValue() == -1){}
                            else{board[(i + 1) - columns].Value();
                            }
                            if(board[i + columns].getValue() == -1){}
                            else{board[i + columns].Value();
                            }
                            if(board[(i + 1) + columns].getValue() == -1){}
                            else{board[(i + 1) + columns].Value();
                            }
                        }
                        else if((i % columns) == (columns - 1)){
                            if(board[i - 1].getValue() == -1){}
                            else{board[i - 1].Value();
                            }
                            if(board[i - columns].getValue() == -1){}
                            else{board[i - columns].Value();
                            }
                            if(board[(i - 1) - columns].getValue() == -1){}
                            else{board[(i - 1) - columns].Value();
                            }
                            if(board[i + columns].getValue() == -1){}
                            else{board[i + columns].Value();
                            }
                            if(board[(i - 1) + columns].getValue() == -1){}
                            else{board[(i - 1) + columns].Value();
                            }
                        }

                        else{
                            if(board[i + 1].getValue() == -1){}
                            else{board[i + 1].Value();
                            }
                            if(board[i - 1].getValue() == -1){}
                            else{board[i - 1].Value();
                            }
                            if(board[(i + 1) - columns].getValue() == -1){}
                            else{board[(i + 1) - columns].Value();
                            }
                            if(board[(i + 1) + columns].getValue() == -1){}
                            else{board[(i + 1) + columns].Value();
                            }
                            if(board[i - columns].getValue() == -1){}
                            else{board[i - columns].Value();
                            }
                            if(board[(i - 1) - columns].getValue() == -1){}
                            else{board[(i - 1) - columns].Value();
                            }
                            if(board[i + columns].getValue() == -1){}
                            else{board[i + columns].Value();
                            }
                            if(board[(i - 1) + columns].getValue() == -1){}
                            else{board[(i - 1) + columns].Value();
                            }
                        }
                    }
                }
            }
            n = true;
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
        int id = 0;
        int x = 0;
        for (int i = 0; i < (rows*columns); i++) {
            if (x == columns){
                System.out.println();
                x = 0;
            }
            if (board[id].getValue() == -1) {
                System.out.print("X ");
            } 
            else {
                System.out.print(board[id].getValue() + " ");
            }
            x++; id++;
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
