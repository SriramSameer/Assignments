import java.util.HashMap;

public class IntandDoubleGenerics {

	public static void main(String[] args) {
		HashMap<Integer,Double> map = new HashMap<>();
		map.put(10, 72.48);
		map.put(20, 63.57);
		map.put(30, 54.66);
		map.put(40, 45.75);
		map.put(50, 36.84);
		System.out.println(map);
	}

}
