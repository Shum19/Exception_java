package Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice_3 {
    public static void main(String[] args) throws IOException {
//        try (Counter counter = new Counter()){
//            System.out.println(counter.getValue());
//            counter.close();// так как закрывается поток то проичходить ошибка
//             System.out.println(counter.isClosed());
//            counter.add();
//            System.out.println(counter.getValue());
//        }catch (IOException e){
//            System.out.println("IOException");
//        }

//        try {
//            int a = 10/0;
//            System.out.println(a);
//        }catch (DivZeroException e){
//            throw new DivZeroException("zero");
//        }
        try (FileReader reader = new FileReader("/Users/Mikle/Downloads/GeekBrains/" +
                                                        "Исключения_в_программировании_и_их_обработка_(семинары)/" +
                                                        "Exception_course/src/main/java/Practice_2_3.txt")){
            System.out.println("file exist");
        }catch (FileNotFoundException e){
            throw new NotFound("file not exist");
        }
    }

}
