public class admin extends people implements printable {
    public admin(String name, int age){
        super(name, age);
    }

    public void print() {
        System.out.printf("Admin: %s %d\n\n", name, age);
    }
    public String toString() {
        return "Admin: " + name + " " + Integer.toString(age);
    }
}
