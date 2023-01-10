public class user extends people implements printable{
    public user(String name, int age){
        super(name, age);
    }

    public void print() {
        System.out.printf("User: %s %d\n\n", name, age);
    }
    public String toString() {
        return "User: " + name + " " + Integer.toString(age);
    }
}
