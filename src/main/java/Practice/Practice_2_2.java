package Practice;

import java.io.*;

public class Practice_2_2 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] string = {"adfs", "adfs"};
            String string1 = string[0];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("adgj");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage()+ "not found");
        }catch (StackOverflowError e){
            System.out.println("Stack");
        }catch (ArithmeticException e){
            System.out.println("by zero");
        }finally {
            System.out.println("any way");
        }
        System.out.println("The end");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
//        test();
    }
}
