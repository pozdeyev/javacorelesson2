package myexception;

public class MyArrayDataException extends MyException {

    public MyArrayDataException(int row, int col) {
        super(String.format("Ошибка преобразования в integer [строка, столбец] [%d, %d]", row, col));
    }


}
