

import myexception.MyException;

/**
 * Java. Level 2. Lesson 2.
 * @author Dmitry Pozdeyev
 * @version 28.01.2018
 */

/*

Урок 2. Исключения

1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
 при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
 Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
MyArrayDataException и вывести результат расчета.

*/

public class lesson2_exception {

    public static void main(String[] args){
// Создаем двумерный массив 4х4 с ошибкой содержимого (для MyArrayDataException)

        String[][] errorDataArray = {
            {"10", "12", "80", "30"},
            {"21", "34", "12", "15"},
            {"7",  "8",  "21", "13"},
            {"4", "r",  "2",  "15"}
        };

// Создаем двумерный массив с ошибкой размера массива (для MyArraySizeException)
        String[][] errorSizeArray = {
                {"10", "12", "80", "30"},
                {"21", "34", "12", "15"},
                {"7",  "8",  "21", "13"},
                {"24",  "2", "15"}
        };

// Создаем корректный массив
        String[][] originalArray = {
                {"10", "12", "80", "30"},
                {"21", "34", "12", "15"},
                {"7",  "8",  "21", "13"},
                {"4", "24",  "2",  "15"}
        };

// Обрабатываем ошибку содержимого
        try {
            System.out.println(convertarray.strConvert(errorDataArray));
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }


// Обрабатываем ошибку размера массива
        try {
            System.out.println(convertarray.strConvert(errorSizeArray));
        } catch (MyException e) {
            System.err.println(e.getMessage());
        }


        try {
            System.out.println("Cумма элементов массива: "+ convertarray.strConvert(originalArray));
        } catch (MyException e) {
            e.getMessage(); //выводим сообщение
        }

    }



}
