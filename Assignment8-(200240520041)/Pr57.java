package assignments;

//56.	Write a program to convert very first character of every word in uppercase in a String.
public class Pr57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="Write a program to convert very first character ";

		
			String temp ="";
		 String[] arr = str.split(" ");
		    for(String st:arr)
		    {
		    	StringBuffer sb=new StringBuffer(st);
		    	temp+=sb.reverse()+" ";
		    }
		    	
		 System.out.println(temp);  
		   
	}

}
