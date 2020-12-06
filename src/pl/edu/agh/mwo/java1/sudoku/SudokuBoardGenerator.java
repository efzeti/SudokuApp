package pl.edu.agh.mwo.java1.sudoku;

import java.util.*;

public class SudokuBoardGenerator {

    public SudokuBoard generateEmptyBoard() {

        SudokuBoard board = new SudokuBoard(new int[9][9]);

        for (int i = 0; i < SudokuBoard.SIZE ; i++) {
            for (int j = 0; j < SudokuBoard.SIZE; j++) {
                board.getBoard()[i][j] = 0;
            }
        }

        return board;

    }

    public SudokuBoard generateSampleBoard() { // TA FUNKCJA TWORZY PRZYKŁADOWĄ WYPEŁNIONĄ CZĘŚCIOWO SUDOKUBOARD. NIE WIADOMO CZY PLANSZA JEST PRAWIDŁOWA CZY NIE.

        SudokuBoard sampleBoard = generateEmptyBoard();

        Random r = new Random();


        for (int i = 0; i < SudokuBoard.SIZE; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                sampleBoard.getBoard()[i][r.nextInt(8)] = (int) Math.ceil(r.nextDouble()*9);
            }
        }


        return sampleBoard;

    }



    public SudokuBoard generateFullBoard() { // TA FUNKCJA TWORZY SUDOKUBOARD Z ZAPEŁNIONYMI POLAMI. NIE WIADOMO CZY PRAWIDŁOWO

        Random rand = new Random();
        SudokuBoard fullBoard = generateEmptyBoard();

        int randIndex;
        List<Integer> numList;


        for (int i = 0; i < SudokuBoard.SIZE; i++)
        {

            numList = fullRow();

            for (int j = 0; j < SudokuBoard.SIZE; j++)
            {

                randIndex = rand.nextInt(numList.size());
                fullBoard.getBoard()[i][j] = numList.get(randIndex);
                numList.remove(randIndex);

            }
        }

        return fullBoard;

    }

    public List<Integer> fullRow(){

        List<Integer> row = new LinkedList<>();
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        row.addAll(Arrays.asList(numbers));

        return row;
    }





}
