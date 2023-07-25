package HomeTask_2;

import java.util.Scanner;

public class CheckInput {
    public static float isFloat(Scanner input ){
        Scanner input_2 = new Scanner(System.in);
        System.out.println("Enter number");
        if (input.hasNextFloat()){
            float num = input.nextFloat();
            System.out.println("Your type value is FLOAT " + num);
            return num;
        }else {
            System.out.println("You entered wrong type of vaLue! You have to enter FLOAT with comma \',\' " +
                                "\nTry again. For example \"45,6\"");
            float num = isFloat(input_2);
            return num;
        }
    }
    public static  String isEmpty(Scanner input) throws Exception {
        System.out.println("Enter number");
        String data = input.nextLine();
        if (data.isEmpty()) {
            throw new Exception("To enter Empty Line is not permitted");
        }
        return data;
    }
}
