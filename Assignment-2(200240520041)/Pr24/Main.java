import java.util.Scanner;

class Main{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];

        System.out.println("enter the 10 array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number you want to search");
        int srh=sc.nextInt();
        int flag=0;
        for(int k:arr)
        {
            if(srh==k)
            {
                flag=1;
                break;
            }
        }
        
        if(flag==1)
        {
            System.out.println("Element found");
        }
        else{
            System.out.println("Element Not found");
        }
    }
}