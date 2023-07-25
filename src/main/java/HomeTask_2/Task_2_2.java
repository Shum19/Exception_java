package HomeTask_2;

public class Task_2_2 {
//    corrected code
    public static void main(String[] args) {
        int [] intArray = {2, 3, 4};
        try {
            int d = 5;
            double catchedRes1 =(double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are exceeded Array size");
        }
    }
}
