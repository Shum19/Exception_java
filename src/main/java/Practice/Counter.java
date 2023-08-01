package Practice;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private Integer value = 0;
    public void add () throws IOException {
        if (this.value == null) {
            throw new IOException();
        }
        this.value += 1;
    }
    public int getValue(){
        return this.value;
    }public void close(){
        this.value = null;
    }
    public boolean isClosed(){
        if (this.value == null) return true;
        else return false;
    }
}
