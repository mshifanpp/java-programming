import java.util.Scanner;

class CPU {
    double price;

    class Processor {
        int cores;
        String Mf;
    }

    static class RAM {
        int memory;
        String Mf;
    }
}

public class CPUMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CPU cpu = new CPU();

        System.out.println("Enter CPU price:");
        cpu.price = sc.nextDouble();
        sc.nextLine();

        CPU.Processor p = cpu.new Processor();

        System.out.println("Enter number of cores:");
        p.cores = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter processor manufacturer:");
        p.Mf = sc.nextLine();

        CPU.RAM r = new CPU.RAM();

        System.out.println("Enter RAM memory:");
        r.memory = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter RAM manufacturer:");
        r.Mf = sc.nextLine();

System.out.println("\n--- CPU DETAILS ---");
System.out.println("Price: " + cpu.price);
System.out.println("Processor cores: " + p.cores);
System.out.println("Processor Manufacturer: " + p.Mf);
System.out.println("RAM Memory: " + r.memory+"GB");
System.out.println("RAM Manufacturer: " + r.Mf);
}
}

