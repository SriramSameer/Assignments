import java.util.Scanner;
public class Divisionexception {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of X : ");
		int x = sc.nextInt();
		
		System.out.println("Enter the value of Y : ");
		int y = sc.nextInt();
		int z;
		
		try {
			z = x/y;
			System.out.println("Z value is : " +z);
		}catch(ArithmeticException e) {
			System.out.println("Avoid dividing by integer 0 " +e);
		}
		if(y==0) {
			System.out.println("Exception is handled");
		}
	}

}
