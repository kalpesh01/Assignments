import java.util.Scanner;

class Main{ 
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Number That You Want To reverse : ");
            int no=sc.nextInt();
            int reverse=0;

            while(no!=0)   //2345
            {
                int dig=no%10;        //
                reverse= reverse * 10 + dig;
                no=no/10;
            }
           System.out.println("Reversed number is : "+reverse);
        }
    }