public class t_cpu extends t_part implements Cloneable{
    private int frequency;
    private int cores;
    private int threads;

    public t_cpu() {
        super("DefaultCPU", 10);
        frequency = 1000;
        cores = 1;
        threads = 1;
        amount++;
        id = amount;
        System.out.printf("CPU '%s' was created with default params.\n", name);
    }
    public t_cpu(String name) {
        super(name, 10);
        frequency = 1000;
        cores = 1;
        threads = 1;
        amount++;
        id = amount;
        System.out.printf("CPU '%s' was created with default params.\n", this.name);
    }
    public t_cpu(String name, int frequency, int cores, int threads, int power) {
        super(name, power);
        try {
            if (frequency < 1) throw new Exception("InvalidFrequency");
            this.frequency = frequency;
        }
        catch (Exception e) {
            System.out.println("Error! " + e.toString() + ".");
            this.frequency = 1000;
        }
        try {
            if (cores < 1) throw new Exception("InvalidCores");
            this.cores = cores;
        }
        catch (Exception e) {
            System.out.println("Error! " + e.toString() + ".");
            this.cores = 1;
        }
        try {
            if (threads < 1) throw new Exception("InvalidThreads");
            this.threads = threads;
        }
        catch (Exception e) {
            System.out.println("Error! " + e.toString() + ".");
            this.threads = 1;
        }
        amount++;
        id = amount;
        System.out.printf("CPU '%s' was created.\n", this.name);
    }

    public int getCores() {
        return cores;
    }
    public void setCores(int cores) {
        try {
            if (cores < 1) throw new Exception("InvalidCores");
            this.cores = cores;
            System.out.println("Cores value was changed.");
        }
        catch (Exception e) {
            System.out.println("Error! " + e.toString() + ".");
            System.out.println("Cores value has not changed.");
        }
    }

    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        try {
            if (frequency < 1) throw new Exception("InvalidFrequency");
            this.frequency = frequency;
            System.out.println("Frequency value was changed.");
        }
        catch (Exception e) {
            System.out.println("Error! " + e.toString() + ".");
            System.out.println("Frequency value has not changed.");
        }
    }

    public int getThreads() {
        return threads;
    }
    public void setThreads(int threads) {
        try {
            if (threads < 1) throw new Exception("InvalidThreads");
            this.threads = threads;
            System.out.println("Threads value was changed.");
        }
        catch (Exception e) {
            System.out.println("Error! " + e.toString() + ".");
            System.out.println("Threads value has not changed.");
        }
    }

    public void printParams() {
        System.out.printf("\tCPU (#%d): %s, %d MHz, %d cores, %d threads, %d W\n", this.id, this.name, this.frequency, this.cores, this.threads, this.power);
    }
    public t_cpu clone() throws CloneNotSupportedException {
        return (t_cpu) super.clone();
    }
}
