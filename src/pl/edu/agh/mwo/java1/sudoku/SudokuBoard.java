package pl.edu.agh.mwo.java1.sudoku;

public class SudokuBoard {

    private final int[][] board;
    public static final int SIZE = 9;

    public SudokuBoard(int[][] board) {
//        super(); // po co jest ten super??
        this.board = board;
    }

    public int[][] getBoard() {
        return board;
    }



}
