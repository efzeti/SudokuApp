package pl.edu.agh.mwo.java1.sudoku;

public class SudokuApp {

    private SudokuBoardGenerator generator;
    private SudokuBoardWriter writer;

    public SudokuApp() {
        generator = new SudokuBoardGenerator();
        writer = new SudokuBoardWriter();
    }

    public void EmptySudoku(){

        System.out.println("Empty Sudoku Board");
        SudokuBoard board = generator.generateEmptyBoard();
        writer.writeBoard(board);
        SudokuBoardChecker checker = new SudokuBoardChecker(board);
        System.out.println("Board corect: " + checker.verifyBoard());


    }

    public void PartialSudoku(){

        System.out.println("Partially Filled Sudoku Board");
        SudokuBoard board = generator.generateSampleBoard();
        writer.writeBoard(board);
        SudokuBoardChecker checker = new SudokuBoardChecker(board);

        System.out.println("Board corect: " + checker.verifyBoard());

    }

    public void FullSudoku(){

        System.out.println("Full Sudoku Board");
        SudokuBoard board = generator.generateFullBoard();
        writer.writeBoard(board);
        SudokuBoardChecker checker = new SudokuBoardChecker(board);
        System.out.println("Board corect: " + checker.verifyBoard());


    }
}
