import java.util.Scanner;

class Person
{
    Scanner in=new Scanner(System.in);
    String name,gender,address;
    int age;
    Person(){
        System.out.println("Enter the name");
        name=in.nextLine();
        System.out.println("Enter M/F");
        gender=in.nextLine();
        System.out.println("Enter the Address Place");
        address=in.nextLine();
        System.out.println("Enter the Age");
        age=in.nextInt();
    }
    void Display(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(age);
    }
}
class Employee extends Person
{
    int empid;
    float salary;
    String companyName,qualification;

    Employee(){
        System.out.println("Enter the Employee Id: ");
        empid=in.nextInt();
        System.out.println("Enter Company Name: ");
        companyName=in.next();
        System.out.println("Enter Qualification: ");
        qualification=in.next();
        System.out.println("EnterSalary: ");
        salary=in.nextFloat();
    }
    void Display(){
        super.Display();
        System.out.println(empid);
        System.out.println(companyName);
        System.out.println(qualification);
        System.out.println(salary);
    }
}
class Teacher extends Employee
{
    int teacherid;
    String subject,departmet;
    Teacher(){
        System.out.println("Enter Teacher id: ");
        teacherid=in.nextInt();
        System.out.println("Enter Subject: ");
        subject=in.next();
        System.out.println("Enter Department: ");
        in.skip("[\r\n]");
        departmet=in.next();
    }
    void Display(){
        super.Display();
        System.out.println(teacherid);
        System.out.println(subject);
        System.out.println(departmet);
    }
}
public class Details {
    public static void main(String[] args) {
        int i=-1;
        Teacher[] t=new Teacher[10];
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("1.Insert Teacher\n2.Display Teacher\n3.Exit\nEnter Your Choice: ");
            int choice=in.nextInt();
            switch(choice){
                case 1: t[++i]=new Teacher();
                        break;
                case 2: for(int j=0;j<=i;j++)
                        t[j].Display();
                        break;
                case 3: System.exit(1);
                        break;
            }
        }
    }
    
}
