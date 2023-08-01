package HomeTask_3;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class InputData {
     String data;
     public InputData(){
          Scanner input = new Scanner(System.in);
          System.out.println( "Type your data \"Surname, Name, Patronymic, Data Of birth, Phone Number\" " +
                              "separated by space" +
                              "\nEXAMPLE \"Ivanov Ivan Ivanovich 01.01.1980 +79991112233\"");
          this.data = input.nextLine();
     }
     public String toString(){
          return this.data;
     }
}
