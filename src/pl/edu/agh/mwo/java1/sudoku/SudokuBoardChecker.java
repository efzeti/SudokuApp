package pl.edu.agh.mwo.java1.sudoku;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SudokuBoardChecker {

    private SudokuBoard board;
    private Set<Integer> numbers;
    private Integer[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


    public SudokuBoardChecker(SudokuBoard board) {
        this.board = board;
        numbers = new HashSet<>();
    }

    public boolean verifyBoardStructure(){

        numbers.addAll(Arrays.asList(nums));


        for (int i = 0; i < SudokuBoard.SIZE; i++)
        {
            for (int j = 0; j < SudokuBoard.SIZE; j++)
            {
//                System.out.println(board.getBoard()[i][j] + " ok");

                if (!(numbers.contains(board.getBoard()[i][j])))
                {
//                    System.out.println(board.getBoard()[i][j] + " not ok");

                    return false;
                }
            }
        }

        return true;

    }

    public boolean verifyBoard(){   // W TEJ FUNKCJI TRAKTUJEMY "0" JAKO PUSTE POLE

        Set<Integer> checkSet = new HashSet<>();
        int temp;

        // SPRAWDZANIE RZEDOW
        for (int i = 0; i < SudokuBoard.SIZE; i++)
        {
            for (int j = 0; j < SudokuBoard.SIZE; j++)
            {

                temp = board.getBoard()[i][j];


                if (temp != 0)
                {
                    if (checkSet.contains(temp))
                    {
                        return false;
                    }
                    else
                    {
                        checkSet.add(temp);
                    }
                }
            }

            checkSet.clear();
        }

        // SPRAWDZANIE KOLUMN
        for (int i = 0; i < SudokuBoard.SIZE; i++)
        {
            for (int j = 0; j < SudokuBoard.SIZE; j++)
            {

                temp = board.getBoard()[j][i];


                if (temp != 0)
                {
                    if (checkSet.contains(temp))
                    {
                        return false;
                    }
                    else
                    {
                        checkSet.add(temp);
                    }
                }
            }

            checkSet.clear();
        }

        //SPRAWDZANIE CELLI 3X3
        for (int i = 0; i < 9 ; i = i + 3)
        {
            for (int j = 0; j < 9; j = j + 3)
            {
                for (int k = i; k < i + 3; k++)
                {
                    for (int l = j; l < j + 3; l++)
                    {
                        temp = board.getBoard()[k][l];
//                        System.out.println(String.format("[%s][%s]",k,l));
                        if (temp != 0)
                        {
                            if (checkSet.contains(temp))
                            {
                                return false;
                            }
                            else
                            {
                                checkSet.add(temp);
                            }
                        }

                    }
                }

//                System.out.println("Checkset Clear");
                checkSet.clear();
            }
        }


        return true;

    }
}
