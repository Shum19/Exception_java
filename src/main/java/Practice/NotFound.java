package Practice;

import java.io.FileNotFoundException;

public class NotFound extends FileNotFoundException {
    public NotFound(String msg){
        super(msg);
    }
}
