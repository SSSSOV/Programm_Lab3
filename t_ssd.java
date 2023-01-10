public class t_ssd extends t_part implements Cloneable{
    private int speed;
    private int memory;

    public t_ssd() {
        super("DefaultSSD", 10);
        speed = 1000;
        memory = 128;
        System.out.printf("SSD '%s' was created with default params.\n", name);
    }
    public t_ssd(String name) {
        super(name, 10);
        speed = 1000;
        memory = 128;
        System.out.printf("SSD '%s' was created with default params.\n", this.name);
    }
    public t_ssd(String name, int speed, int memory, int power) {
        super(name, power);
        this.speed = speed;
        this.memory = memory;
        System.out.printf("SSD '%s' was created.\n", this.name);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    public int getMemory() {
        return memory;
    }

    public void printParams() {
        System.out.printf("\tSSD: %s, %d Mb/s, %d Gb, %d W\n", this.name, this.speed, this.memory, this.power);
    }
    public t_ssd clone() throws CloneNotSupportedException {
        return (t_ssd) super.clone();
    }
}
