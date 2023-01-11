import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        int key = 3;
        if(key == 1){
            int amount_on_shelf = 5, amount_shelfs = 3;
            t_cpu[][] rack_with_cpus = new t_cpu[amount_shelfs][amount_on_shelf];

            // Creating cpu with invalid frequency.
            rack_with_cpus[0][0] = new t_cpu("Ryxen", -4, 324, 2, 4);
            rack_with_cpus[0][0].printParams();

            // Setting for cpu invalid cores.
            rack_with_cpus[0][0].setCores(0);
            rack_with_cpus[0][0].printParams();

            // Setting for cpu correct cores.
            rack_with_cpus[0][0].setCores(3);
            rack_with_cpus[0][0].printParams();

            return;
        }
        if(key == 2){
            System.out.println("\tOverload method printParams():\n");
            t_cpu cpu1 = new t_cpu();
            cpu1.printParams();

            System.out.println("\tAbstract and interface():\n");
            user user1 = new user("Klass", 19);
            user1.print();

            System.out.println("\tDeep cloning and changing field in cloned:\n");
            t_pc pc = new t_pc();
            t_pc clonedPc = pc.clone();
            System.out.println("\nOriginal:\t");
            pc.printInfo();
            System.out.println("Clone:   \t");
            clonedPc.printInfo();

            t_cpu clonedPcCpu = clonedPc.getCpu();
            clonedPcCpu.setName("Ryzen");

            System.out.println("\nOriginal after cloning:\t");
            pc.printInfo();
            System.out.println("Clone after cloning:   \t");
            clonedPc.printInfo();

            System.out.println("\n\tClass pattern:\n");
            storage<user> strg = new storage<user>(user1);
            strg.print();

            return;
        }
        if(key == 3){
            int result;
            ArrayList<t_part> list_of_parts = new ArrayList<t_part>();

            t_part part1  = new t_part();
            t_cpu cpu1 = new t_cpu("SomeCPU",1000, 10, 20, 100);
            list_of_parts.add(part1);
            list_of_parts.add(cpu1);

            System.out.print("\nItems in list:\n");
            for (t_part var : list_of_parts) {
                var.printParams();
            }
            list_of_parts.sort(new Compare());
            System.out.print("\nItems in list after sorting:\n");
            for (t_part var : list_of_parts) {
                var.printParams();
            }
            System.out.print("\nSearch in list:");
            result = t_part.FindByName(list_of_parts, "SomeCPU");
            if (result == -1) System.out.print("Item not Found\n");
            System.out.print("\nFound element:\n");
            list_of_parts.get(result).printParams();
            System.out.println();


            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int cpu_max_amount = 5, gpu_max_amount = 5, ram_max_amount = 5, ssd_max_amount = 5; // Max parts amounts
        int i = 0, f = 0, frequency = 0, cores = 0, threads = 0, power = 0, memory = 0, speed = 0;

        t_cpu[] cpus = new t_cpu[cpu_max_amount];
        cpus[0] = new t_cpu();
        t_gpu[] gpus = new t_gpu[gpu_max_amount];
        gpus[0] = new t_gpu();
        t_ram[] rams = new t_ram[ram_max_amount];
        rams[0] = new t_ram();
        t_ssd[] ssds = new t_ssd[ssd_max_amount];
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
                    reader.readLine();
                }
                case 2 -> {
                    System.out.println("Benchmark:");
                    System.out.printf("\tResult performance test: %d points \n", pc.benchmark());
                    System.out.println("Press [Enter] for continue...");
                    reader.readLine();
                }
                case 3 -> {
                    System.out.println("Energy consumption:");
                    System.out.printf("\tCPU + GPU + RAM + SSD consume: %d W\n", pc.consumption());
                    System.out.printf("\tYou need PSU of about: %d W\n", (pc.consumption() + 200) / 50 * 50);
                    System.out.println("Press [Enter] for continue...");
                    reader.readLine();
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
                        case 1 -> {
                            System.out.println("Change CPU:");
                            System.out.println("\tSelect in list:");
                            for (i = 0; i < cpu_max_amount && i < t_cpu.getAmount(); i++) {
//                                if (cpus[i] != null) System.out.printf("\t\t%d. %s\n", i + 1, cpus[i].getName());
                                System.out.printf("\t\t%d. %s\n", i + 1, cpus[i].getName());
                            }
                            System.out.println("\t\t" + ++i + ". Create new...");
                            System.out.print("> ");
                            f = Integer.parseInt(reader.readLine());
                            while (f < 1 || f > i) {
                                System.out.print("Error! Choose correct menu item.\n> ");
                                f = Integer.parseInt(reader.readLine());
                            }
                            if (f == i) {
                                System.out.println("\nCreate new CPU:");
                                System.out.print("\tInput name of CPU: ");
                                name = reader.readLine();
                                System.out.print("\tInput frequency: ");
                                frequency = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput cores: ");
                                cores = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput threads: ");
                                threads = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput power: ");
                                power = Integer.parseInt(reader.readLine());
                                pc.setCpu(new t_cpu(name, frequency, cores, threads, power));
                                if (f - 1 < cpu_max_amount) cpus[f - 1] = pc.getCpu();
                            }
                            else pc.setCpu(cpus[f - 1]);
                        }
                        case 2 -> {
                            System.out.println("Change GPU:");
                            System.out.println("\tSelect in list:");
                            for (i = 0; i < gpu_max_amount; i++) {
                                if (gpus[i] != null) System.out.printf("\t\t%d. %s\n", i + 1, gpus[i].getName());
                                else break;
                            }
                            System.out.println("\t\t" + ++i + ". Create new...");
                            System.out.print("> ");
                            f = Integer.parseInt(reader.readLine());
                            while (f < 1 || f > i) {
                                System.out.print("Error! Choose correct menu item.\n> ");
                                f = Integer.parseInt(reader.readLine());
                            }

                            if (f == i) {
                                System.out.println("\nCreate new GPU:");
                                System.out.print("\tInput name of GPU: ");
                                name = reader.readLine();
                                System.out.print("\tInput frequency: ");
                                frequency = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput memory: ");
                                memory = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput power: ");
                                power = Integer.parseInt(reader.readLine());
                                pc.setGpu(new t_gpu(name, frequency, memory, power));
                                if (f - 1 < gpu_max_amount) gpus[f - 1] = pc.getGpu();
                            }
                            else pc.setGpu(gpus[f - 1]);
                        }
                        case 3 -> {
                            System.out.println("Change RAM:");
                            System.out.println("\tSelect in list:");
                            for (i = 0; i < ram_max_amount; i++) {
                                if (rams[i] != null) System.out.printf("\t\t%d. %s\n", i + 1, rams[i].getName());
                                else break;
                            }
                            System.out.println("\t\t" + ++i + ". Create new...");
                            System.out.print("> ");
                            f = Integer.parseInt(reader.readLine());
                            while (f < 1 || f > i) {
                                System.out.print("Error! Choose correct menu item.\n> ");
                                f = Integer.parseInt(reader.readLine());
                            }

                            if (f == i) {
                                System.out.println("\nCreate new RAM:");
                                System.out.print("\tInput name of RAM: ");
                                name = reader.readLine();
                                System.out.print("\tInput frequency: ");
                                frequency = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput memory: ");
                                memory = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput power: ");
                                power = Integer.parseInt(reader.readLine());
                                pc.setRam(new t_ram(name, frequency, memory, power));
                                if (f - 1 < ram_max_amount) rams[f - 1] = pc.getRam();
                            }
                            else pc.setRam(rams[f - 1]);
                        }
                        case 4 -> {
                            System.out.println("Change SSD:");
                            System.out.println("\tSelect in list:");
                            for (i = 0; i < ssd_max_amount; i++) {
                                if (ssds[i] != null) System.out.printf("\t\t%d. %s\n", i + 1, ssds[i].getName());
                                else break;
                            }
                            System.out.println("\t\t" + ++i + ". Create new...");
                            System.out.print("> ");
                            f = Integer.parseInt(reader.readLine());
                            while (f < 1 || f > i) {
                                System.out.print("Error! Choose correct menu item.\n> ");
                                f = Integer.parseInt(reader.readLine());
                            }

                            if (f == i) {
                                System.out.println("\nCreate new SSD:");
                                System.out.print("\tInput name of RAM: ");
                                name = reader.readLine();
                                System.out.print("\tInput speed: ");
                                speed = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput memory: ");
                                memory = Integer.parseInt(reader.readLine());
                                System.out.print("\tInput power: ");
                                power = Integer.parseInt(reader.readLine());
                                pc.setSsd(new t_ssd(name, speed, memory, power));
                                if (f - 1 < ssd_max_amount) ssds[f - 1] = pc.getSsd();
                            }
                            else pc.setSsd(ssds[f - 1]);
                        }
                    }
                    System.out.println("Press [Enter] for continue...");
                    reader.readLine();
                }
            }

        }

    }
}