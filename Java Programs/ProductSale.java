import java.util.Scanner;

class Product
{
    int pcode,price;
    String pname;
    Product(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter pcode: ");
        pcode=in.nextInt();
        System.out.println("Enter pname: ");
        in.skip("\r\n");
        pname=in.nextLine();
        System.out.println("Enter the price: ");
        price=in.nextInt();
    }
    void minprice(Product p1,Product p2,Product p3){
        if(p1.price<p2.price){
            if(p1.price<p3.price)
            System.out.println(p1.price);
            else
            System.out.println(p3.price);
        }
        else
        {
            if(p2.price<p3.price)
            System.out.println(p2.price);
            else
            System.out.println(p3.price);
        }
    }
}
public class ProductSale {
    public static void main(String[] args) {
        Product p1=new Product();
        System.out.println("2nd Product");
        Product p2=new Product();
        System.out.println("3rd Product");
        Product p3=new Product();
        System.out.println("Min Price");
        p1.minprice(p1, p2, p3);
    }    
}
