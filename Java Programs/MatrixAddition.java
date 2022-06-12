import java.util.Scanner;

class Matrix
{
    Scanner in=new Scanner(System.in);
    int[][] insert(int m,int n){
        int[][] arr=new int[10][10];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        return arr;
    }

    int[][] add(int a[][],int b[][],int m,int n){
        int[][] sum=new int[10][10];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        return sum;
    }
}

public class MatrixAddition{
    public static void main(String[] args) {
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
        int i,j;
        Matrix mat=new Matrix();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Rows of Matrix1: ");
        int m1=in.nextInt();
        System.out.println("Enter the Columns of Matrix1: ");
        int n1=in.nextInt();
        System.out.println("Enter the Rows of Matrix2: ");
        int m2=in.nextInt();
        System.out.println("Enter the Columns of Matrix2: ");
        int n2=in.nextInt();
        if(m1==m2&&n1==n2){
            System.out.println("Enter the elements of first Matrix 1: ");
            a=mat.insert(m1, n1);
            System.out.println("Enter the elements of Matrix 2: ");
            b=mat.insert(m2, n2);
            c=mat.add(a, b, m1, n1);
            System.out.println("Sum of Two Matrixes are: ");
            for(i=0;i<m1;i++){
                System.out.println();
                for(j=0;j<n1;j++){
                    System.out.print(c[i][j]+" ");
                }
            }
        }
        else
        System.out.println("Matrix Addition Not Possible !!");
    }
}