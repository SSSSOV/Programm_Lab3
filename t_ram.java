public class t_ram extends t_part implements Cloneable{
    private int frequency;
    private int memory;

    public t_ram(){
        super("DefaultRAM", 10);
        name = "DefaultRAM";
        frequency = 1000;
        memory = 1;
        System.out.printf("RAM '%s' was created with default params.\n", name);
    }
    public t_ram(String name){
        super(name, 10);
        frequency = 1000;
        memory = 1;
        System.out.printf("RAM '%s' was created with default params.\n", this.name);
    }
    public t_ram(String name, int frequency, int memory, int power){
        super(name, power);
        this.frequency = frequency;
        this.memory = memory;
        System.out.printf("RAM '%s' was created.\n", this.name);
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public int getFrequency() {
        return frequency;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    public int getMemory() {
        return memory;
    }

    public void printParams() {
        System.out.printf("\tRAM: %s, %d MHz, %d Gb, %d W\n", this.name, this.frequency, this.memory, this.power);
    }
    public t_ram clone() throws CloneNotSupportedException {
        return (t_ram) super.clone();
    }
}
