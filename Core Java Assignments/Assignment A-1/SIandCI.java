
public class SIandCI {

	public static void main(String[] args) {
		
		//(p*r*t)/100
		float p=1256;
		double r=1.7;
		float t=3;
		double simple_interest = (p*r*t)/100;
		System.out.println("Simple Interest : "+simple_interest);
		
		//p(1+r)^n
		double amount;
		double principal=2900;
		double rate=2.1;
		for(int days=1;days<=10;days++)
		{
			amount=principal*Math.pow(1+rate, days);
			System.out.println(days + "  " +amount);
		}

	}

}
