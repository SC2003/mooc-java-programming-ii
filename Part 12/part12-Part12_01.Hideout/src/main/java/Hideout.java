
public class Hideout<T> {

    private T t;

    public void putIntoHideout(T toHide) {
        this.t = toHide;
    }

    public T takeFromHideout() {
        if (this.t == null) {
            return null;
        }
        T temp = this.t;
        this.t = null;
        return temp;
    }

    public boolean isInHideout() {
        if (this.t != null) {
            return true;
        }
        return false;
    }
}
