public class t_gpu extends t_part implements Cloneable{
    private int frequency;
    private int memory;

    public t_gpu() {
        super("DefaultGPU", 10);
        frequency = 1000;
        memory = 1;
        System.out.printf("GPU '%s' was created with default params.\n", name);
    }
    public t_gpu(String name) {
        super(name, 10);
        frequency = 1000;
        memory = 1;
        System.out.printf("GPU '%s' was created with default params.\n", this.name);
    }
    public t_gpu(String name, int frequency, int memory, int power) {
        super(name, power);
        this.frequency = frequency;
        this.memory = memory;
        System.out.printf("GPU '%s' was created.\n", this.name);
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
        System.out.printf("\tGPU: %s, %d MHz, %d Gb, %d W\n", this.name, this.frequency, this.memory, this.power);
    }
    public t_gpu clone() throws CloneNotSupportedException {
        return (t_gpu) super.clone();
    }
}
