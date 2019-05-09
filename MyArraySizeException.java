package Lesson2;

public class MyArraySizeException extends RuntimeException {



    int row, column;



    public MyArraySizeException(int row, int column) {

        super("Wrong data, row and column can be only 4. You have: row " + row + ", column " + column);

        this.row = row;

        this.column = column;

    }

}