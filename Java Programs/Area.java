class Shapes
{
    int area(int a){
        return a*a;
    }
    int area(int a,int b){
        return a*b;
    }
    double area(double r){
        return 3.14*r*r;
    }
}
public class Area {
    public static void main(String[] args) {
        Shapes shapes=new Shapes();
        System.out.println(shapes.area(5));
        System.out.println(shapes.area(5,4));
        System.out.println(shapes.area(2.00));
    }
}
