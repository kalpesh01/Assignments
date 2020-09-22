class Person{
    void getDetails(){
        System.out.println("Person Details ");
    }

    void getJob()
    {
        System.out.println("Person Job");
    }
}

class Employee extends Person{
    
    void getJob()
    {
        System.out.println("Employee Job");
    }

    void getDept(){
        System.out.println("Employee dept ");
    }

}

class EmployeeDemo16{
    public static void main(String args[]){
            Employee p=new Employee();
            p.getDetails();
            p.getJob();
            p.getDept();
    }
}