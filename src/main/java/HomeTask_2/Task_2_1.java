package HomeTask_2;
/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
   и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
   приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckInput.isFloat(input);
    }

}
