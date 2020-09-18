class Main{
    public static void main(String []args) {
        int no= 8;
        boolean flag=true;

        
        for(int i=2;i<no;i++)  //2 3 4 5 6 7 
        {
            if(no%i == 0)
            {
                System.out.println("Not a Prime a number");
                flag=false;
                break;
            }

        }
        if(flag)
        {
            System.out.println("Prime Number");
        }
    }
}