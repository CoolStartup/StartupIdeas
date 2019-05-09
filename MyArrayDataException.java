package Lesson2;

public class MyArrayDataException extends RuntimeException {

    int i, j;



    public MyArrayDataException(int i, int j) {

        super("Wrong data. You have: row " + i + ", column " + j);

        this.i = i;

        this.j = j;

    }

}