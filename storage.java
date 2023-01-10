public class storage<T> {
    private T t;

    public storage(T t) {
        this.t = t;
    }
    public void print(){
        System.out.println((t.toString() + "\n\n"));
    }
}
