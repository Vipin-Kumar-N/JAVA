import java.util.Scanner;
class ArrSum
{
    int sum_array(int a[],int n){
        int total=0;
        for(int k=0;k<n;k++)
        total+=a[k];
        return total;
    }
}
public class ArraySum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] a= new int[10];
        int n = in.nextInt();
        for(int i=0;i<n;i++)
          a[i]=in.nextInt();
        for(int i=0;i<n;i++)
          System.out.println(a[i]);
        ArrSum n1 = new ArrSum();
        int n2 = n1.sum_array(a, n);
        System.out.println(n2);
    }
    
}
