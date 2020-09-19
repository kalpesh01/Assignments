import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i =0 ; i<arr.length ; i++){
            System.out.print("Enter the Number "+i+ " : ");
            arr[i] = sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int j =0 ; j<arr.length ; j++){
            if(arr[j]%2 == 0){
                even=even+arr[j];
            }
            else{
                odd=odd+arr[j];
            }
        }

        System.out.println("Sum of Even No is : " + even);
        System.out.println("Sum of Odd No is : "+odd);
    }   
}
