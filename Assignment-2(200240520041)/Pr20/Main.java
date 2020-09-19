//20.	Print all prime numbers between two given numbers
import java.util.Scanner;

class Main{ 
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the two numbers for Range ");    
            int no1=sc.nextInt();
            int no2=sc.nextInt();
            int count=0;

            for(int i=no1;i<=no2;i++) 
            {
                count=0;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                        count++;
                    else
                        continue;
                }

                if(count > 0)
                    continue;
                else
                    System.out.println(i);
            }  
        }
    }