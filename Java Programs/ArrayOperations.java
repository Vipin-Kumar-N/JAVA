import java.util.Scanner;

class ArrayOper{
    int sumArray(int a[],int n){
        int j,sum=0;
        for(j=0;j<n;j++)
        sum+=a[j];
        return sum;
    }
    float avgArray(int a[],int n){
        int sum=sumArray(a, n);
        float avg=sum/n;
        return avg;
    }
    void sort(int a[],int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

}

public class ArrayOperations {
    public static void main(String[] args) {
        int a[]=new int[20];
    int n,i,choice=0;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the range");
    n=in.nextInt();
    for(i=0;i<n;i++){
        System.out.println("Enter the "+(i+1)+" Element");
        in.skip("[\r\n]+");
        a[i]=in.nextInt();
    }
    ArrayOper a1=new ArrayOper();
    while(choice!=4){
        System.out.println("1.Sum\n2.Average\n3.Sort");
        in.skip("[\r\n]");
        choice=in.nextInt();
        switch(choice){
            case 1:System.out.println("Sum of element of array : "+a1.sumArray(a, n));
            break;
            case 2:System.out.println("Average of array is : "+a1.avgArray(a, n));
            break;
            case 3:System.out.println("Sorted Array is : ");
            a1.sort(a, n);
            for(int k=0;k<n;k++)
            System.out.println(a[k]);
            break;
        }
        
    }
    
    }
    
}
