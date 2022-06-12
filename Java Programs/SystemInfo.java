class Cpu
{
    double price = 40000.99;

    public class Processor
    {
        int numberOfCores = 9;
        String processorManufacturer = "Intel";
    }

    public static class Ram
    {
        int memory = 8;
        String ramManufacturer = "Samsung";
    }
}

public class SystemInfo
{
    public static void main(String[] args) {
        Cpu c1 = new Cpu();
        Cpu.Processor p1 = new Cpu().new Processor();
        Cpu.Ram r1 = new Cpu.Ram();
        System.out.println(c1.price);
        System.out.println(p1.numberOfCores);
        System.out.println(p1.processorManufacturer);
        System.out.println(r1.memory);
        System.out.println(r1.ramManufacturer);
    }
}