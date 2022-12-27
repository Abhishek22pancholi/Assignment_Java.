package Assignment;
import java.util.HashMap;
import java.util.Scanner;

public class Question3 {
	
	static HashMap<String, Employee> employeeMap = new HashMap<>();
	static Scanner sc= new Scanner(System.in);
	
	public static void Manage()
	{
		String itr = "1";
		while(itr.equals("1"))
		{
		System.out.println("Enter your choice.");
		System.out.println("1. Add Record");
		System.out.println("2. Edit Record");
		System.out.println("3. Exit");
		String choice = sc.nextLine();
		String FirstName;
		String LastName;
		switch(choice)
		{
		
		case "1":	
			System.out.println("Enter Employee Id");
			String Id = sc.nextLine();
			Employee e = employeeMap.get(Id);
			if(e==null)
			{
				System.out.println("Enter Employee Frist Name");
				FirstName = sc.nextLine();
				System.out.println("Enter Employee Last Name");
				LastName = sc.nextLine();
				Employee employee1 = new Employee(FirstName, LastName, Id);
				employeeMap.put(employee1.getEmployeeId(), employee1);
				System.out.println("Employee Added");
				break;
			}
			else
			{
				System.out.println("Employee Alread Exist");
				break;
			}
					
		case "2":	
			System.out.println("Enter Id to edit Employee");
			String id = sc.nextLine();
			e = employeeMap.get(id);
	        if(e != null)
	        {
	        	System.out.println(e);	        
				System.out.println("Enter Employee Frist Name");
				FirstName = sc.nextLine();
				System.out.println("Enter Employee Last Name");
				LastName = sc.nextLine();
		        e.SetFristName(FirstName);
		        e.SetLastName(LastName);
		        System.out.println("Employee Name Edited");
		        e = employeeMap.get(id);
				System.out.println(e);
	        }
	        else
	        {
	        	System.out.println("Not Found");
	        }
	        break;
	        
		case "3":	
			itr="0";
			break;
					
		default : 	
			System.out.println("Retry");
			break;
		
		}
		}
	}
	
	public static void Delete()
	{
		System.out.println("Enter Id to Delete Employee");
		String id = sc.nextLine();
		Employee e = employeeMap.get(id);
		if(e != null)
		{
			System.out.println(e);	        
			employeeMap.remove(e.getEmployeeId());
			System.out.println("Deleted");
		}
		else
		{
			System.out.println("Not Found");
		}

	}
	
	public static void Search()
	{
		System.out.println("Enter Id to Search Employee");
		String id = sc.nextLine();
		Employee e = employeeMap.get(id);
		if(e != null)
		{
		System.out.println(e);	        
		System.out.println("Searched");
		}
		else
		{
			System.out.println("Not Found");
		}
		
	}
	
	public static void main(String[] args) {  

		System.out.println("Enter Username");
		String Username=sc.nextLine();
		if(Username.equals("Admin"))
		{
			System.out.println("Enter Password");
			String Pass = sc.nextLine();
			
			if(Pass.equals("Admin"))
			{
				String itr1="1";
				System.out.println("Login Success");
				
				while(itr1.equals("1"))
				{
					
					System.out.println("Enter Your Choice");
					System.out.println("1. Manage employee module");
					System.out.println("2. Delete module");
					System.out.println("3. Search module");
					System.out.println("4. Exit");
					String module = sc.nextLine();
					switch(module) 
					{
					  case "1":
						  Manage();
						  break;
						  
					  case "2":
						  Delete();
						  break;
						  
					  case "3":
						  Search();
						  break;
						  
					  case "4":
						  itr1="2";
						  break;
					
					  default : 
						  System.out.println("Retry");
						  break;
						  
					}
				}
				
				for(HashMap.Entry<String, Employee> entry : employeeMap.entrySet())
				{
					System.out.println(entry.getKey()+ "=" + entry.getValue());
				}
				System.out.println("Logged Out Success");
				
			}
			else
			{
				System.out.println("Wrong Pass");
			}
			
		}
		else
		{
			System.out.println("Wrong Username");
		}
    }


}

class Employee {
    private String firstName;
    private String lastName;
    private String employeeId;

    public Employee(String firstName, String lastName, String i) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = i;
    }
    
    public void SetFristName(String fName) {
    	this.firstName = fName;
    }
    
    public void SetLastName(String lName) {
    	this.lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}

