import java.util.Scanner;

class Complex
{
    int rp,ip;
    Complex(int r, int i){
        rp=r;
        ip=i;
    }
    void sum(Complex c1, Complex c2){
        int rsum=c1.rp+c2.rp;
        int isum=c1.ip+c2.ip;
        System.out.println(rsum+"+"+isum+"i");
    }
}

public class ComplexProgram
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first complex number \n Enter the real part: ");
        int frp=in.nextInt();
        System.out.println("Enter the Imaginary part : ");
        int fip=in.nextInt();
        System.out.println("Entert the second complex number \n Enter the real part: ");
        int srp=in.nextInt();
        System.out.println("Enter the imaginary part: ");
        int sip=in.nextInt();
        Complex c1=new Complex(frp, fip);
        Complex c2=new Complex(srp, sip);
        c1.sum(c1, c2);
    }
}