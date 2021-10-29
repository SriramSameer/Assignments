
public class StringOperations {

	public static void main (String[] args) {
		
		String str = new String("JavaString pool refers to collection of Strings which are stored in heap memory");
		
		String s1 = str.toLowerCase();
		System.out.println(s1);
		
		String s2 = str.toUpperCase();
		System.out.println(s2);
		
		String s3 = str.replace('a','$');
		System.out.println(s3);
		
		if(str.contains("collections"))
			System.out.println("Contains");
		else
			System.out.println("Does not contain");
		
		String str2 = new String("JavaString pool refers to collection of Strings which are stored in heap memory");
		if(str.contentEquals(str2))
			System.out.println("The content matches");
		else
			System.out.println("The content does not match");
		
		
		//String Buffer
		
		StringBuffer str3 = new StringBuffer("String Buffer");
		str3.append(" is a peer class of string ");
		str3.append(" that provides much of ");
		str3.append(" the functionality of strings ");
		System.out.println(str3);
		
		StringBuffer str4 = new StringBuffer("It is used to  at the specified index position");
		str4.insert(13, " insert text");
		System.out.println(str4);
		
		
		StringBuffer str5 = new StringBuffer("This method returns the reversed object on which it was called");
		str5.reverse();
		System.out.println(str5);
	}
		
		
		
	}


