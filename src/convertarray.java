import myexception.MyArrayDataException;
import myexception.MyArraySizeException;



public class convertarray {


    public static int strConvert (String[][] Array)
            throws MyArraySizeException, MyArrayDataException {

        int  total = 0; //Инициализируем переменную (для рассчета суммы чисел массива)
        if (4 != Array.length) throw new MyArraySizeException(); //Если длина массива под одному направлению
                                                                 // не равна 4 - вызываем ошибку

        for (int i = 0; i < Array.length; i++) {
            if (4 != Array[i].length) throw new MyArraySizeException();
                for (int k = 0; k < Array[i].length; k++) {
                    try {
                        total += Integer.parseInt(Array[i][k]);     //преобразовываем элемент в integer и суммируем
                    } catch (NumberFormatException e) {             //если исключение (не число)
                      throw new MyArrayDataException(i, k);       //вызываем NyArrayDataException
                    }
                }

            }

        return total;
    }

}
