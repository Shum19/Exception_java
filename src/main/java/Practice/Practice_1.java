package Practice;


public class Practice_1 {
    public static void main(String[] args) {

//        int [][] arr = {{1, 1, 1}, {0, 0, 1}, {0, 1, 1, 1}};
//        System.out.println(arr.length + " " + arr[0].length);
//        printArr(arr);
//        System.out.println(sumOfValues(arr));
        int [] arr_1 = { 2, 1, 1, 5};
        System.out.println(arr_1[4]);




// метод принимающиц целочисленый массив и значениие, метод ищет значение и возвращает его индекс
//если значение не найдено то возвращаем -2; если null то -3
    }
    public static Integer findValue(Integer arr [], int value){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null){
                return -3;
            } else if (arr[i] == value) return i;
        }
        return -2;
    }

    /* Метод принимающий двумерный массив вернуть сумму значенией; метод может работать только с квадратными
   массивами и в каждой ячейки может лежать нуль или один
*/
    public static int sumOfValues(int [][] arr){
        int result = 0;
        int rowSize = arr.length;

//        if (rowSize != colSize){
//            throw new RuntimeException("Size of array is not valid");
//        }
        for (int i = 0; i < rowSize; i++){
            int colSize = arr[i].length;
            for (int j = 0; j < colSize; j++){
                if (rowSize != arr[j].length) throw new RuntimeException(   "Array size " + rowSize +
                        "x" + arr[j].length );
                if (arr[i][j] != 0 && arr[i][j] != 1){
                    throw new RuntimeException("Value is not valid");
                }else result = result + arr[i][j];
            }
        }
        return result;
    }
    public static void printArr(int [][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    /* Реализовать метод checkArray который принимает на вход целочисленый одномерный массив
       метод должен пройтись по каждому элемнету и проверрить что он не равен null;
       усли null то оповестить пользователя, если ввстретилис в нескольких ячейках то их необходимо
       подсветить
    */
    public static String checkArr(Integer [] arr){
        String error = "";
//        boolean flag = false;  // добавлял флаг чтобы уйтии в ошибку, так это еще одна переменная
        // то это занимает пямять; перепесал метод добавив условие если
        // если размер error больше нуля то по условию выбросит ошиибку
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null){
//                flag = true;
                error = error + i + " ";
            }
        }if (error.length() > 0){
            throw new RuntimeException("Inedxes of null values " + error);
        }
        return "ok";
    }

}

