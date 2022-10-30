public class t_cpu {
    private String name;
    private int frequency;
    private int cores;
    private int threads;
    private int power;

    public t_cpu() {
        name = "DefaultCPU";
        frequency = 1000;
        cores = 1;
        threads = 1;
        power = 10;
        System.out.printf("CPU '%s' was created with default params.\n", name);
    }
    public t_cpu(String name) {
        this.name = name;
        frequency = 1000;
        cores = 1;
        threads = 1;
        power = 10;
        System.out.printf("CPU '%s' was created with default params.\n", this.name);
    }
    public t_cpu(String name, int frequency, int cores, int threads, int power) {
        this.name = name;
        this.frequency = frequency;
        this.cores = cores;
        this.threads = threads;
        this.power = power;
        System.out.printf("CPU '%s' was created.\n", this.name);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getCores() {
        return cores;
    }
    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getThreads() {
        return threads;
    }
    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public void printParams() {
        System.out.printf("\tCPU: %s, %d MHz, %d cores, %d threads, %d W\n", this.name, this.frequency, this.cores, this.threads, this.power);
    }
}
