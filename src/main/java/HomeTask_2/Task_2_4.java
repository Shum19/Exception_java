package HomeTask_2;

import java.util.Scanner;

/*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task_2_4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println(CheckInput.isEmpty(input));
    }
}
