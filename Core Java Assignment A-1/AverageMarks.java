import java.util.Scanner;

public class AverageMarks {
	
	public static void main(String args[])
	{
		float A,B,C; 
		double total, average, percentage;
		int cnt=0;
		while(cnt<3)
		{
			cnt++;
			Scanner op=new Scanner(System.in);
			/* Input marks of all five subjects */
			System.out.println("Enter marks of 3 subjects for Student "+cnt+" : ");
	    	System.out.print("Enter marks of A:");
		    A=op.nextFloat();
		    System.out.print("Enter marks of B:");
		    B=op.nextFloat();
		    System.out.print("Enter marks of C:");
		    C=op.nextFloat();
	
		    /* Calculate total, average and percentage */
		    total = A+B+C;
		    average = (total / 3.0);
		    percentage = (total / 300.0) * 100;
		
		    /* Print all results */
		    System.out.println("Total marks ="+total);
		    System.out.println("Average marks = "+average);
		    System.out.println("Percentage = "+percentage);
		}

   }

}
