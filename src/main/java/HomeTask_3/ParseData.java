package HomeTask_3;

import java.text.ParseException;
import java.util.ArrayList;

public class ParseData {
    public static String [] ParseData(String data)  {
        String [] dataArr = data.split(" ");
        if (CheckData.CheckData(dataArr)){
            return dataArr;
        }else{
            System.out.println("Check your DATA and Try again " + data);
            InputData data2 = new InputData();
            String dataStr = data2.toString();
            return ParseData(dataStr);
        }
    }

}
