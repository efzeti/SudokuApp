package pl.edu.agh.mwo.java1.sudoku;

import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;

public class SudokuBoardWriter
{

    public void writeBoard(SudokuBoard board)
    {
        for (int i = 0; i < SudokuBoard.SIZE; i++){
            Joiner joiner = Joiner.on(" ");
            String row = joiner.join(Ints.asList(board.getBoard()[i]));
            System.out.println(row);
        }
    }

}
