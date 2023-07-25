package HomeTask_2;
// Corrected code Task_3
public class Task_2_3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[0] = 9;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Массив выходит за пределы своего размера!");
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
