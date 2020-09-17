import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Five Subjetcts Marks :");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();


        int sum = s1+s2+s3+s4+s5;
        int total=500;
        System.out.println(sum);
        float res = (sum * 100)/500;
        // System.out.println(res);
        // System.out.println("Percentage "+res);
        System.out.format("%.4f",res);

    }
}