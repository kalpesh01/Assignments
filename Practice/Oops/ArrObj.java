//Array of Objects

import java.util.Scanner;

class Employee{
    private int empId;
    private String empName;

    void set(int empId,String empName)
    {
        this.empId=empId;
        this.empName=empName;
    }

    void show(){
        System.out.println(empId+" "+empName);
    }
}


class ArrObj{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee ar[]=new Employee[3];

        for(int i=0;i<ar.length;i++ )
        {
            System.out.println("Enter the Employee Id");
                int empId=sc.nextInt();
                System.out.println("Enter the Emloyee Name");
                String empName=sc.next();

                Employee e=new Employee();
                e.set(empId,empName);
                ar[i]=e;
        }

        for(Employee a:ar)
        {
            a.show();
        }
    }
}