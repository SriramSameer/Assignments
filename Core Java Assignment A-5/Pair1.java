package Generics;
import java.util.*;
import java.lang.String;

public class Pair1 {

	public static void main(String[] args) {
		HashMap<String,java.util.Date> myobj = new HashMap<>();
		myobj.put("Today is " , new java.util.Date());
		
		System.out.println("Time and Date of my object " +myobj);
	}

}
