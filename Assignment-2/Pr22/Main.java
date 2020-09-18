import java.util.*;
class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
     int arr[] = new int[5];

     for (int i =0 ; i<arr.length ; i++){
         System.out.print("Enter the Number "+i+ " : ");
         arr[i] = sc.nextInt();
     }
    int temp=0;
    for (int m=0; m < arr.length ; m++){
        for(int j=0 ; j < arr.length ; j++){
            if (arr[m] > arr[j]){
                temp = arr[m];
                arr[m] = arr[j];
                arr[j] = temp;
            }
        }
    }
    // Arrays.sort(arr); 

    for (int k : arr)
        System.out.println(k+ " ");

    }
}
