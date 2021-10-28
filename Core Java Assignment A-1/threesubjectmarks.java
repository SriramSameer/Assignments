import java.util.Scanner;

public class threesubjectmarks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first subject marks ");
		int subject1 = s.nextInt();
		System.out.println("Enter second subject marks ");
		int subject2 = s.nextInt();
		System.out.println("Enter third subject marks ");
		int subject3 = s.nextInt();
		
		if(subject1>=60 && subject2>=60 && subject3>=60) {
			System.out.println("Passed");
		}
		
		else if (((subject1>=60 && subject2>=60)) || ((subject2>=60 && subject3>=60)) || ((subject3>=60 && subject1>=60))) {
			System.out.println("Promoted");
		}
		
		else if ((subject1>60 || subject2>60 || subject3>60) || (subject1<60 && subject2<60 && subject3<60)) {
			System.out.println("Failed");
		}
		
		else {
			System.out.println("Entered data is invalid");
		}
		

	}

}
