abstract class people {
    protected String name;
    protected int age;
    public people(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "people: " + name + " " + Integer.toString(age);
    }
}
