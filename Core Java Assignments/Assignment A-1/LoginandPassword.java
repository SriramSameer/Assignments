import java.util.Scanner;

public class LoginandPassword {

	public static void main(String[] args) {
		
		int limit=0;
		String username,password;
		Scanner s =new Scanner(System.in);
		while(limit<3)
		{
			System.out.println("Enter Username : ");
			username = s.toString();
			System.out.println("Enter password : ");
			password = s.toString();
			if(username == "Sriram" && password == "Sameer")
			{
				System.out.println("Welcome Sriram"); 
				break;
			}
			else
			{
				++limit;
				System.out.println("Invalid Username or password ");
			}
			if(limit>=3)
			{
				System.out.println("Contact Admin");
			}
			
		}

	}

}
