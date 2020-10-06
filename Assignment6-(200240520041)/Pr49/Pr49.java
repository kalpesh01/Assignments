package assignments;

import java.util.Scanner;

interface Taxable{
	int salesTax=7;
	double incomeTax=10.5;
	
	double calcTax();
}

class Employee1 implements Taxable{
	int empId;
	String name;
	double salary;
	
	Employee1(int id,String name,double salary){
		this.empId=id;
		this.name=name;
		this.salary=salary;	
	}
	
	@Override
	public double calcTax() {
		// TODO Auto-generated method stub
		
		return salary*0.07;
	}
}

class Product implements Taxable{
	int pid;
	int price;
	int quantity;
	
	Product(int pid,int price,int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	@Override
	public double calcTax() {
		// TODO Auto-generated method stub
		return price*0.105;
	}
} 

public class Pr49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id");
		int empId=sc.nextInt();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the Salary");
		double salary=sc.nextDouble();
		
		Employee1 e=new Employee1(empId,name,salary);
		double tax=e.calcTax();
		
		System.out.println("Income Tax Of employee "+tax);
		
		System.out.println("Enter the Pid");
		int pid=sc.nextInt();
		
		System.out.println("ENter the price");
		int price=sc.nextInt();
		
		System.out.println("ENter the Quantity");
		int quantity=sc.nextInt();
		Product p=new Product(pid, price, quantity);
		
		double productTax=p.calcTax();
		System.out.println("Sales Tax of Product "+productTax);
	}

}
