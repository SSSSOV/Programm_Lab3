public class t_part {
    protected static int amount;
    protected int id;
    protected String name;
    protected int power;

    static { amount = 0; }
    public t_part() {
        name = "defaultPart";
        power = 10;
        amount++;
        id = amount;
    }
    public t_part(String name, int power) {
        this.name = name;
        try {
            if (power < 1) throw new Exception("InvalidPower");
            this.power = power;
        }
        catch (Exception e) {
            System.out.println("Error! " + e.toString() + ".");
            this.power = 10;
        }
        amount++;
        id = amount;
    }

    public void getId(t_int id) { id.num = this.id; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        try {
            if (power < 1) throw new Exception("InvalidPower");
            this.power = power;
            System.out.println("Power value was changed.");
        }
        catch (Exception e) {
            System.out.println("Error! " + e.toString() + ".");
            System.out.println("Power value has not changed.");
        }
    }

    public void printParams() {
        System.out.printf("\tPART (#%d): %s, %d W\n", this.id, this.name, this.power);
    }
    static int getAmount() {
        return amount;
    }

    public int Benchmark() {
        return 0;
    }
}
