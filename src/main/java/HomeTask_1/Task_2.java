package HomeTask_1;
/*
    Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива
    a и b, и возвращающий новый массив c, каждый элемент которого равен разности элементов
    двух входящих массивов в той же ячейке.
    Если длины массивов не равны - верните нулевой массив длины 1.
    Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:
    int[] a - первый массив
    int[] b - второй массив
    Пример
    a = new int[]{4, 5, 6};
    b = new int[]{1, 2, 3};
    Вывод: [3, 3, 3]
    a = new int[]{4, 5, 6};
 */
public class Task_2 {
    public static void main(String[] args) {
        int [] a = {4, 5, 6};
        int [] b = {1, 2, 3, 5};
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
            c[i] = a[i] - b[i];
        }
        return c;
    }
}
