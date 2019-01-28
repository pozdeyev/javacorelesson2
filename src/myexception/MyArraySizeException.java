package myexception;

public class MyArraySizeException extends MyException  {

    public MyArraySizeException() {
        super("Размер массива должен быть 4x4");
    }

}
