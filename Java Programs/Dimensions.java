import java.util.Scanner;

interface Shapes
{
    Scanner in=new Scanner(System.in);
    static double PI=3.14;
    double area();
    double perimeter();
}

class Circle implements Shapes
{
    public double area(){
        System.out.println("Enter the Radius: ");
        int radius=in.nextInt();
        return PI*radius*radius;
    }
    public double perimeter(){
        System.out.println("Enter The Radius: ");
        int radius=in.nextInt();
        return 2*PI*radius;
    }
}

class Rectangle implements Shapes
{
    public double area(){
        System.out.println("Enter Length: ");
        int length=in.nextInt();
        System.out.println("Enter Breadth: ");
        int breadth=in.nextInt();
        return length*breadth;
    }
    public double perimeter(){
        System.out.println("Enter Length: ");
        int length=in.nextInt();
        System.out.println("Enter Breadth: ");
        int breadth=in.nextInt();
        return 2*(length+breadth);
    }
}
public class Dimensions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int choice;
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        while(true){
            System.out.println("1.Area of Circle\n2.Perimeter of Circle\n3.Area of Rectangle\n4.Perimeter of Rectangle\n5.Exit\nEnter Your Choice: ");
            choice=in.nextInt();
            switch(choice){
                case 1: System.out.println(c.area());
                break;
                case 2: System.out.println(c.perimeter());
                break;
                case 3: System.out.println(r.area());
                break;
                case 4: System.out.println(r.perimeter());
                break;
                case 5: System.exit(0);
                break;
            }
        }
    }
}
