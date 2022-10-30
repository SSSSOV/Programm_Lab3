public class t_pc {
    private t_cpu cpu;
    private t_gpu gpu;
    private t_ram ram;
    private t_ssd ssd;

    t_pc(){
        cpu = new t_cpu();
        gpu = new t_gpu();
        ram = new t_ram();
        ssd = new t_ssd();
        System.out.print("PC was created with default params.\n\n");
    }
    t_pc(t_cpu cpu, t_gpu gpu, t_ram ram, t_ssd ssd) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.ssd = ssd;
        System.out.print("PC was created.\n\n");
    }

    public void setCpu(t_cpu cpu) {
        System.out.print("CPU was changed for pc.\n\n");
        this.cpu = cpu;
    }
    public void setGpu(t_gpu gpu) {
        System.out.print("GPU was changed for pc.\n\n");
        this.gpu = gpu;
    }
    public void setRam(t_ram ram) {
        System.out.print("RAM was changed for pc.\n\n");
        this.ram = ram;
    }
    public void setSsd(t_ssd ssd) {
        System.out.print("SSD was changed for pc.\n\n");
        this.ssd = ssd;
    }

    public int benchmark() {
        return cpu.getFrequency() * cpu.getCores() + gpu.getFrequency() * gpu.getMemory() + ram.getFrequency() * ram.getMemory() + ssd.getSpeed();
    }
    public int consumption() {
        return cpu.getPower() + gpu.getPower() + ram.getPower() + ssd.getPower();
    }

    public void printInfo(){
        System.out.print("Info about PC:\n");
        cpu.printParams();
        gpu.printParams();
        ram.printParams();
        ssd.printParams();
//        System.out.printf("Benchmark: %d points, Energy consumption: %d W.\n\n", benchmark(), consumption());
    }
}