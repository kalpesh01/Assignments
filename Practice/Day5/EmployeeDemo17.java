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

class EmployeeDemo17{
    public static void main(String args[]){
            Person p=new Employee(); //reference upcasting
            // due to this line the only person class methods can access and 
                                    //from sub class only overriden methods can access 
            p.getDetails();
            p.getJob();
            //p.getDept();  // this line will give error because 

            Employee e=(Employee)p;  // reference downcasting

    }
}