class Cpu
{
    int Price = 54000;
    public class Processor
    {
        int numberOfCores = 12;
        String cpuManufacturer = "AMD"; 
    }
    public static class Ram
    {
        int memCapacity=16;
        String ramManufacturer = "SAMSUNG Micro Technologies";

    }
}
public class CpuDetails
{
    public static void main(String[] args) {
        Cpu objCpu=new Cpu();         
		Cpu.Processor objProcessor=new Cpu().new Processor();         
		Cpu.Ram objRam=new Cpu.Ram(); 
		System.out.println("CPU Price : "+objCpu.Price+"/-");                  
		System.out.println("No.of CPU Cores : "+objProcessor.numberOfCores);                 
		System.out.println("Processor Manufacturer : "+objProcessor.cpuManufacturer);        
		System.out.println("Ram Memory Capacity : "+objRam.memCapacity+"GB");         
		System.out.println("Ram Manufacturer :  "+objRam.ramManufacturer);
    }
} 