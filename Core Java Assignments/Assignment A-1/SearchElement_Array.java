import java.util.Scanner;

public class SearchElement_Array {

	public static void main(String[] args) {
		int n,x,flag=0;
		int a[] = {23,54,63,256,75,12,4,75,1,4};
		System.out.println("Given Array ");
        for(int j=0;j<a.length;j++)
        	System.out.print(a[j]+" ");  
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the element you want to find:");
        x = s.nextInt();
        int k;
        for(k = 0; k <a.length; k++)
        {
            if(a[k] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+ k);
        }
        else
        {
            System.out.println("Element not found");
        }
		
	}

}
