package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) 
	{
		Float Celsius, Fahrenheit;
        Scanner sc= new Scanner(System.in);
        List strList = new ArrayList<>();
        String itr = "y";
        int i=0;
        while(itr.equals("y"))
        {
        	System.out.println("Enter The Temprature in Fahrenheit"); 
        	Fahrenheit = sc.nextFloat();
            Celsius  = ((Fahrenheit-32)*5)/9;  
            System.out.println("Temperature in celsius is: "+Celsius);
            strList.add(i, "Temperature in celsius for " + Fahrenheit + " is : "+Celsius);
            System.out.println("Data Stored");
            i=i+1;
            System.out.println();
            System.out.println("Want to convert more y/n");
            itr=sc.nextLine();
            itr=sc.nextLine();
            System.out.println();
        }
        
        for (i = 0; i < strList.size(); i++)
        {
            System.out.println(strList.get(i) + " "); 
        }
    }

}
