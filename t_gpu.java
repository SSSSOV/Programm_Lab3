public class t_gpu {
    private String name;
    private int frequency;
    private int memory;
    private int power;

    public t_gpu(){
        name = "DefaultGPU";
        frequency = 1000;
        memory = 1;
        power = 10;
        System.out.printf("GPU '%s' was created with default params.\n", name);
    }
    public t_gpu(String name){
        this.name = name;
        frequency = 1000;
        memory = 1;
        power = 10;
        System.out.printf("GPU '%s' was created with default params.\n", this.name);
    }
    public t_gpu(String name, int frequency, int memory, int power){
        this.name = name;
        this.frequency = frequency;
        this.memory = memory;
        this.power = power;
        System.out.printf("GPU '%s' was created.\n", this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
    public int getFrequency() {
        return frequency;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
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
}
