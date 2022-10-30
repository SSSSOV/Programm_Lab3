import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int i = 0, f = 0, frequency = 0, cores = 0, threads = 0, power = 0, memory = 0, speed = 0;

        t_cpu cpus[] = new t_cpu[5];
        cpus[0] = new t_cpu();
        t_gpu gpus[] = new t_gpu[5];
        gpus[0] = new t_gpu();
        t_ram rams[] = new t_ram[5];
        rams[0] = new t_ram();
        t_ssd ssds[] = new t_ssd[5];
        ssds[0] = new t_ssd();
        t_pc pc = new t_pc(cpus[0], gpus[0], rams[0], ssds[0]);
        System.out.println();

        while (true) {
            System.out.println("Menu:");
            System.out.println("\t1. Info about PC.");
            System.out.println("\t2. Benchmark.");
            System.out.println("\t3. Energy consumption.");
            System.out.println("\t4. Change parts in PC.");
            System.out.println("\t5. Exit.");
            System.out.print("> ");
            f = Integer.parseInt(reader.readLine());
            while (f < 1 || f > 5) {
                System.out.print("Error! Choose correct menu item.\n> ");
                f = Integer.parseInt(reader.readLine());
            }
            System.out.println();
            if (f == 5) break;

            switch (f) {
                case 1 -> {
                    pc.printInfo();
                    System.out.println("Press [Enter] for continue...");
                    reader.read();
                }
                case 2 -> {
                    System.out.println("Benchmark:");
                    System.out.printf("\tResult performance test: %d points \n", pc.benchmark());
                    System.out.println("Press [Enter] for continue...");
                    reader.read();
                }
                case 3 -> {
                    System.out.println("Energy consumption:");
                    System.out.printf("\tCPU + GPU + RAM + SSD consume: %d W\n", pc.consumption());
                    System.out.printf("\tYou need PSU of about: %d W\n", (pc.consumption() + 200) / 50 * 50);
                    System.out.println("Press [Enter] for continue...");
                    reader.read();
                }
                case 4 -> {
                    System.out.println("Change parts in PC:");
                    System.out.println("\tWhich part you want to change?");
                    System.out.println("\t\t1. CPU.");
                    System.out.println("\t\t2. GPU.");
                    System.out.println("\t\t3. RAM.");
                    System.out.println("\t\t4. SSD.");
                    System.out.println("\t\t5. Back to menu.");
                    System.out.print("> ");
                    f = Integer.parseInt(reader.readLine());
                    while (f < 1 || f > 5) {
                        System.out.print("Error! Choose correct menu item.\n> ");
                        f = Integer.parseInt(reader.readLine());
                    }
                    System.out.println();
                    if (f == 5) break;

                    switch (f) {
                        case 1: {
                            System.out.println("Change CPU:");
                            System.out.println("\tSelect in list:");
                            for (i = 0; i < 5; i++) {
                                if (cpus[i] != null) System.out.printf("\t\t%d. %s\n", i + 1, cpus[i].getName());
                            }
                            System.out.println("\t\t" + i++ + ". Create new.");
                            System.out.print("> ");
                            f = Integer.parseInt(reader.readLine());
                            while (f < 1 || f > i) {
                                System.out.print("Error! Choose correct menu item.\n> ");
                                f = Integer.parseInt(reader.readLine());
                            }

                            if (f < i) pc.setCpu(cpus[f]);
                            else {
                                System.out.print("Input name of CPU:");
                                name = reader.readLine();
                                System.out.print("Input frequency:");
                                frequency = Integer.parseInt(reader.readLine());
                                System.out.print("Input cores:");
                                cores = Integer.parseInt(reader.readLine());
                                System.out.print("Input threads:");
                                threads = Integer.parseInt(reader.readLine());
                                System.out.print("Input power:");
                                power = Integer.parseInt(reader.readLine());
                            }

                        }
                    }
                }
            }

        }

    }
}