import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Amount time rate");
            float amount=sc.nextFloat();
            int time=sc.nextInt();
            float rate=sc.nextFloat();

            double SI=(amount*time*rate)/100;

            // System.out.println("Simple Intrest = "+SI);
            System.out.format("Simple Intrest = %.3f",SI);
    }
}