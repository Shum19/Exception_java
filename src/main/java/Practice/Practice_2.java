package Practice;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;

//"/Users/Mikle/Downloads/GeekBrains" +
//"/Исключения_в_программировании_и_их_обработка_(семинары)/Exception_course/"
public class Practice_2 {
    public static void main(String[] args) throws IOException {
        String absPath = System.getProperty("user.dir");
        File file = new File(absPath + "/src/main/java/Practice_2_3.txt");
        writeData(getData(file), file);
        }

    public static HashMap<String, String> getData(File path) throws IOException {
        FileReader reader = new FileReader(path, StandardCharsets.UTF_8);
        HashMap<String, String> myMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(reader)){
            String line;
            while ((line = br.readLine()) != null){
                line= line.replace(" ", "");
                String [] splittedLine = line.split("=");
                if(splittedLine[1].equals("?")){
                    splittedLine[1] = String.valueOf(splittedLine[0].length());
                }
                myMap.put(splittedLine[0], splittedLine[1]);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return myMap;
    }
    public static void writeData(HashMap<String, String> map, File path) throws IOException {
        FileWriter writer = new FileWriter(path, StandardCharsets.UTF_8, true);
        try (BufferedWriter bw = new BufferedWriter(writer)){
            bw.write("\n");
            for (Map.Entry< String, String> k : map.entrySet()) {
                String str = k.toString();
                bw.write(str);
                bw.write("\n");
            }
            System.out.println("Done!");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
