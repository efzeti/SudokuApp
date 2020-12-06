package pl.edu.agh.mwo.java1.sudoku;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
		SudokuBoardGenerator generator = new SudokuBoardGenerator();

		SudokuBoard board = generator.generateSampleBoard();

		SudokuBoard fullBoard = generator.generateFullBoard();

		SudokuBoardChecker checker = new SudokuBoardChecker(board);

		SudokuBoardWriter writer = new SudokuBoardWriter();

		writer.writeBoard(board);

		System.out.println();


		System.out.println(checker.verifyBoardStructure());
		System.out.println(checker.verifyBoard());

		SudokuApp app = new SudokuApp();

		app.EmptySudoku();
		System.out.println();

		app.FullSudoku();
		System.out.println();

		app.PartialSudoku();
		System.out.println();


	}
}
