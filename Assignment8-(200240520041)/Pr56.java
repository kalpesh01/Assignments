package assignments;

//56.	Write a program to convert very first character of every word in uppercase in a String.
public class Pr56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="Write a program to convert very first character ";

		
			String temp ="";
		 String[] arr = str.split(" ");
//		    StringBuffer sb = new StringBuffer();
		    	
		    for (int i = 0; i < arr.length; i++) {
//		        sb.append(Character.toUpperCase(arr[i].charAt(0)))
//		            .append(arr[i].substring(1)).append(" ");
		    	
		    	 temp += Character.toUpperCase(arr[i].charAt(0));
		    	 temp+=arr[i].substring(1)+" ";
		    	 
		    	 
		    }          
		    System.out.println(temp);
	}

}
