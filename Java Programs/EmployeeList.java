import java.util.Scanner;
class Employee
{
    int eNo;
    String eName;
    float eSalary;
    Employee(int eId,String eN,float eS){
        eNo=eId;
        eName=eN;
        eSalary=eS;
    }
}
public class EmployeeList {
    public static void main(String[] args) {
        int choice,i=-1,flag=0,empid,j=0;
        float emps;
        String empn;
        Employee[] emp=new Employee[10];
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("1.Insert new Employee\n2.Search Employee\n3.Exit\nEnter your Choice: ");
            choice=in.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the Employee Number: ");
                        empid=in.nextInt();
                        System.out.println("Enter the Employee Name: ");
                        empn=in.next();
                        System.out.println("Enter Employee Salary: ");
                        emps=in.nextFloat();
                        emp[++i]=new Employee(empid, empn, emps);
                        break;
                case 2: System.out.println("Enter Employee Number: ");
                        flag=0;
                        empid=in.nextInt();
                        for(j=0;j<i+1;j++){
                            if(emp[j].eNo==empid){
                                System.out.println(emp[j].eNo+"\n"+emp[j].eName+"\n"+emp[j].eSalary);
                                flag=1;
                            }
                        }
                        if(flag==0)
                            System.out.println("Employee not Found");
                        break;
                case 3: System.exit(0);
            }
        }
    }
}
