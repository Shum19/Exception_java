package HomeTask_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteDataInFile {
    public static void WriteDataInFile(String [] dataArr) {
        try {
            String dataString = "";
            for (String item:dataArr) {
                dataString += item + " ";
            }
            System.out.println(dataString);
            String absPath = System.getProperty("user.dir");
            File path = new File (absPath + "/src/main/java/HomeTask_3/" + dataArr[0]);
            if (path.exists()){
                try (FileWriter writer = new FileWriter(path, true)){
                    writer.append("\n" + dataString);
                    System.out.println("Data added to File " + path);
                } catch (IOException e) {
                    System.out.println("Data is not added");;
                }
            }else {
                try {
                    path.createNewFile();
                } catch (IOException e) {
                    System.out.println("File not created");
                }
                try (FileWriter writer = new FileWriter(path)){
                    writer.write(dataString);
                    System.out.println("File created and Data added to File " + path);
                }catch (IOException e){
                    System.out.println("Data is not written");
                }
            }
        }catch (NullPointerException e){
            System.out.println("Your DATA is null\n" + e.getMessage());
        }
    }
}
