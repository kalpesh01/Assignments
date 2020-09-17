import java.util.Scanner;

class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
         float PI=3.14F;

       System.out.println("Enter the Radius");
       float r=sc.nextFloat();

       System.out.println("Circumference");
        float area=PI*(r*r);
        System.out.println("Area of circle : "+area);

        float Circumference=2*PI*r;
        System.out.println("Circumference of Circle : "+Circumference);

    }
}