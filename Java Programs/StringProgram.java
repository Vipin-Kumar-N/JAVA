import java.util.Scanner;

class StringSort
{
    String[] sort(String a[],int n){
        String[] arr=a;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i].compareTo(arr[j])<1){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
public class StringProgram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String arr[]=new String[10];
        int i,n;
        StringSort s=new StringSort();
        System.out.println("Enter No.of String Inputs: ");
        n=in.nextInt();
        System.out.println("Enter "+n+" Strings");
        for(i=0;i<n;i++){
            arr[i]=in.next();
        }
        System.out.println("Given Strings: ");
        for(i=0;i<n;i++)
        System.out.println(arr[i]+"\t");
        arr=s.sort(arr, n);
        System.out.println("After String Sort: ");
        for(i=0;i<n;i++)
        System.out.println(arr[i]+"\t");
    }
}
