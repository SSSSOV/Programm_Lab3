public class t_ssd {
    private String name;
    private int speed;
    private int memory;
    private int power;

    public t_ssd() {
        name = "DefaultSSD";
        speed = 1000;
        memory = 128;
        power = 10;
        System.out.printf("SSD '%s' was created with default params.\n", name);
    }
    public t_ssd(String name) {
        this.name = name;
        speed = 1000;
        memory = 128;
        power = 10;
        System.out.printf("SSD '%s' was created with default params.\n", this.name);
    }
    public t_ssd(String name, int speed, int memory, int power) {
        this.name = name;
        this.speed = speed;
        this.memory = memory;
        this.power = power;
        System.out.printf("SSD '%s' was created.\n", this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
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

    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }

    public void printParams() {
        System.out.printf("\tSSD: %s, %d Mb/s, %d Gb, %d W\n", this.name, this.speed, this.memory, this.power);
    }
}
