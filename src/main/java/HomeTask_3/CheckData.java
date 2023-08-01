package HomeTask_3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckData {
    public static boolean CheckData(String [] data){
        if (data.length < 5 ){
            System.out.println("Wrong completion. You Input less DATA then required");
            return false;
        } else if (data.length > 5) {
            System.out.println("Wrong completion. You Input more DATA then required");
            return false;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = dateFormat.parse(data[3]);
        }catch (ParseException e){
            System.out.println("Check your Date Of Birth input " + data[3]);
        }

        String dateOB = data[3].replace('.', ' ');
        String [] dateOfBirth = dateOB.split(" ");
        if((Integer.parseInt(dateOfBirth[0] ) > 31 || Integer.parseInt(dateOfBirth[0]) < 1)){
            System.out.println("Check your DAY Of Birth " + dateOfBirth[0]);
            return false;
        }else if(Integer.parseInt(dateOfBirth[1]) > 12 || Integer.parseInt(dateOfBirth[1]) < 1){
            System.out.println("Check your MONTH Of Birth " + dateOfBirth[1]);
            return false;
        }
        int phoneNumberLength = data[4].length();
        if (phoneNumberLength != 11 && phoneNumberLength != 12){
            System.out.println(phoneNumberLength);
            System.out.println("Check your PHONE NUMBER input " + data[4]);
            return false;
        }if (phoneNumberLength == 11){
            if(data[4].charAt(0) == '+') return false;
        }
        return true;
    }
}
