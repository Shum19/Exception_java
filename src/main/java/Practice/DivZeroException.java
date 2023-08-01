package Practice;

public class DivZeroException extends ArithmeticException{
    private String illegalValue;
    public DivZeroException(String msg){
        super(msg);

    }

    public void getMessage(String error) {
        System.out.println(error);
    }
}
