package myexception;

//расширяем Exception
public class MyException extends Exception {

    //Конструктор
    public MyException(String message) {
        super(message); //выводим сообщение об ошибке
    }
}
