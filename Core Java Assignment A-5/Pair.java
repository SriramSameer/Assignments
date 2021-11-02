package Generics;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
public class Pair {

	public static void main(String[] args) {
		
		HashMap<String,String> myobj = new HashMap<String,String>();
		
		myobj.put("Ronaldo","Man Utd");
		myobj.put("Benzema","Real Madrid");
		myobj.put("Messi", "PSG");
		myobj.put("Suarez", "Atletico Madrid");
		myobj.put("Lukaku", "Chelsea");
		
		for(Map.Entry<String,String> e:myobj.entrySet())
			System.out.println("Key : as NAME : --> " +e.getKey() + " /" + " Value : as STREAM : --> " +e.getValue());
	}

}
