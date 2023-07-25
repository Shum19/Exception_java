package HomeTask_1;
/*
    Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива
    a и b, и возвращающий новый массив с, каждый элемент которого равен частному элементов
    двух входящих массивов в той же ячейке.
    Если длины массивов не равны - верните нулевой массив длины 1.
    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть
    - RuntimeException, т.е. ваше.
    Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:
    int[] a - первый массив
    int[] b - второй массив
    a = new int[]{12, 8, 16};
    b = new int[]{4, 2, 4};
    Вывод: [3, 4, 4]
    a = new int[]{12, 8, 16, 25};
    b = new int[]{4, 2, 4};

    Вывод: [0]
 */
public class Task_3 {public static void main(String[] args) {
    int [] a = {12, 8, 16};
    int [] b = {4, 2, 0};
    int [] c = subArrays(a, b);
    System.out.print("[ ");
    for (int i = 0; i < c.length; i++){
        System.out.print(c[i] + " ");
    }
    System.out.println("]");
}
    public static int [] subArrays(int [] a, int []b){
        if (a.length != b.length) {
            int [] c = new int[1];
            c[0] = 0;
            return c;
        }
        int [] c = new int[a.length];
        for (int i = 0; i < c.length; i++){
            if (b[i] == 0){
                throw new ArithmeticException("Do not divide by zero");
            }
            c[i] = a[i]/b[i];
        }
        return c;
    }
}
