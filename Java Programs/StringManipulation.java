import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String txtString=in.nextLine();
        System.out.println("To LowerCase: "+txtString.toLowerCase());
        System.out.println("To UpperCase: "+txtString.toUpperCase());
        System.out.println("String Length: "+txtString.length());
        System.out.println("String Trimmed"+txtString.trim());
        System.out.println("Enter the Character to be Replaced: ");
        String a=in.nextLine();
        System.out.println("Enter New Character: ");
        String b=in.nextLine();
        String txtString2=txtString.replace(a, b);
        System.out.println("Replaced string is : "+txtString2);
        Integer number=123456789;
        System.out.println("Sting output of Integer: "+number.toString());

    }
    
}
