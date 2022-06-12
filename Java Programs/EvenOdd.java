import java.util.Scanner;;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = scanner.nextInt();
        if (n%2==0)
            System.out.println(n+" Even");
        else
         System.out.println(n+" Odd");
    }
}
