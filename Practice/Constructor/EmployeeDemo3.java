// constructors in Java

class Employee{
    private  int empId;
    private  String empName;
     Employee(){
        empId=100;
        empName="ABC";
    }

    Employee(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }
    void show(){
        System.out.println(empId+" "+empName);
    }

}

class EmployeeDemo3{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.show();

        Employee e1=new Employee(101,"ram");
        e1.show();
    }
}