import java.lang.Exception; 
import java.util.Scanner; 
class NegativeVerification extends Exception 
{     
	NegativeVerification(String message)     
	{ 
		super(message);     
	} 
} 
public class AverageOfNumbers 
{     
	public static void main(String args[])     
	{         
		int number[]=new int[30];         
		int sum=0,input=0;         
		Scanner in=new Scanner(System.in);
        System.out.println("Enter No.of Numbers to be entered (Max 30) :");
        final int temp=in.nextInt();         
		try         
		{             
			int i=-1;             
			System.out.println("Enter "+temp+" Numbers");             
			while(input<temp)             
			{   System.out.print("Enter Number "+(input+1)+" : ");         
				number[++i]=in.nextInt();                 
				input++;                 
				if(number[i]<0)                 
				{                     
					input--;                     
					throw new NegativeVerification("!!! Only Positive Numbers Please !!!");                 
				}             
			} 
        }         
		catch(NegativeVerification msg)        
		{            
			System.out.println("\n"+msg.getMessage()+"\n");         
		} 
        finally         
		{             
			for(int j=0;j<input;j++)             
			{                 
				sum+=number[j];             
			}             
			float AverageN= sum/input;                 
			System.out.println("Average Of given "+input+" Number is : "+AverageN);         
		}     
	} 
} 
