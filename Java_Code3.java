package Assignment;

public class Question2 {
	
	 public static void main(String[] args) 
	 {  
        String str1="This   is    a   practice     questions"; 
        System.out.println("String before removing all the white spaces : " + str1);
        str1 = str1.replaceAll("\\s+", " ");
        System.out.println("String after removing all the white spaces : " + str1);  
	 } 

}
