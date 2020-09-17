// Accept person’s gender (character m for male and f for female),
// age (integer), as input and then check whether person is eligible for marriage or not.
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
       System.out.println("Enter m for Male and f for Female");
       Scanner sc =new Scanner(System.in);
        char gender = sc.next().charAt(0); 
    
        System.out.println("Enter Age");
       int age = sc.nextInt();

       if(gender == 'm')
       {
           if(age>=21){
            System.out.println("Eligible for marriege");
           }else{
            System.out.println("Not Eligible for marriege");
           }
            
       }

       if(gender == 'f')
       {
            if(age>=18){
                System.out.println("Eligible for marriege");
           }else{
                System.out.println("Not Eligible for marriege");
           }
       }
    }
}