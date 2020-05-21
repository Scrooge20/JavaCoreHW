package L2ArrayExeption;

/**
 * Ооочень длинный код. Так как учимся, хочется поэтапно получить результат
 */
public class L2testExeption {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String [][] myArray = {
                {"1", "2", "3", "4" },
                {"5", "6", "7", "8" },
                {"9", "10", "a", "12" },
                {"13", "14", "15", "16" }
        };


        // простой вывод массива (вспомнить)
//        for (int i = 0; i < myArray.length ; i++) {
//            for (int j = 0; j < myArray.length; j++) {
//                System.out.print(myArray[i][j] + " ");
//                }
//            System.out.println();
//        }

        // преобразовываем используя второй массив (запрета небыло на использование второго массива)
//        int myArrayD[][] = new int[4][4];
//        for (int i = 0; i < myArray.length ; i++) {
//            int sum = 0;
//            for (int j = 0; j < myArray.length; j++) {
//                myArrayD [i][j] = Integer.parseInt(myArray[i][j]);
//                sum = sum + myArrayD[i][j];// суммируем числа в строке
//                System.out.print(myArrayD[i][j] + " ");
//            }
//            System.out.print(" sum = " + sum);
//            System.out.println();
//        }

        // далее выполнение домашнего задания
        String array5x5[][] = new String[5][5]; // для примера 5 на 5

        //создаем охраняемый блок кода когда передаем в метод массив размером больше 4
        try {
            inArray(array5x5);
        }catch (MyArraySizeException ex){
            ex.printStackTrace();
            System.out.println("Номер ошибки : " + ex.getNumberEx());
        }catch (MyArrayDataException ex){
            ex.printStackTrace();
            System.out.println(" в массиве обнаружен не строковый элемент ");
        }

        // и далее обрабатываем следующий массив
        inArray(myArray);
    }

    // тут напишем метод в который будем передавать наш массив :
    public static void inArray(String array1[][]) throws MyArraySizeException, MyArrayDataException {
        System.out.println("длинна численного массива : " + array1.length);

        // проверяем размер массива который передан в метод как аргумент
        if (array1.length != 4){
            throw new MyArraySizeException("Размер массива не равен 4 : ", array1.length);
        }

        int myArrayD[][] = new int[4][4];// создаем второй численный массив, для передачи ему преобразованнных элементов

        for (int i = 0; i < array1.length ; i++) {
            // проверяем размер строки массива который передан в метод как аргумент
            if (array1[i].length != 4){
                throw new MyArraySizeException("Размер строки массива не равен 4 : ", array1[i].length);
            }

            int sum = 0;
            for (int j = 0; j < array1.length; j++) {

                // проводим проверку строковый ли у нас тип, если true - преобразовываем
                if (array1[i][j] instanceof String) {
                    myArrayD[i][j] = Integer.parseInt(array1[i][j]);
                }else{
                    throw new MyArrayDataException("Это не строковый тип : ");
                }

                sum = sum + myArrayD[i][j];// суммируем числа в строке
                System.out.print(myArrayD[i][j] + " ");
            }
            System.out.print(" sum = " + sum);
            System.out.println();
        }

    }
}
