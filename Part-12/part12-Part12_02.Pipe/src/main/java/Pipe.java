
import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> pipe;
    private int start, end;

    public Pipe() {
        this.pipe = new ArrayList<>();
        this.start = 0;
        this.end = 0;
    }

    public void putIntoPipe(T value) {
        if (this.pipe.isEmpty()) {
            this.pipe.add(value);
            this.start = this.pipe.indexOf(value);
            this.end = this.pipe.indexOf(value);
        } else {
            this.pipe.add(value);
            this.end = this.pipe.indexOf(value);
        }
    }

    public T takeFromPipe() {
        if (!(this.pipe.isEmpty())) {
            end--;
            return this.pipe.remove(start);
        }
        return null;
    }

    public boolean isInPipe() {
        return (!(this.pipe.isEmpty()));
    }
}
