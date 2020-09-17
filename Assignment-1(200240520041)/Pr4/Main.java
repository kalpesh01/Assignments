import java.util.Scanner;

class Main{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter two numbers a and b");
            byte a=sc.nextByte();
            byte b=sc.nextByte();

            int c= a + b;
            byte result= (byte)c;

            System.out.println("Sum" + result);
            
        }
}