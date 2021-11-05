import java.util.Collections;
import java.util.TreeMap;

enum gen{
	male, female;
}
class contact {
	private long phno;
	private String name;
	private String email;
	gen gender;
	public contact(long Phoneno, String Name, String Email,gen Gender) {
		this.phno=Phoneno;
		this.name=Name;
		this.email=Email;
		this.gender=Gender;
		
	}
	
	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public gen getGender() {
		return gender;
	}

	public void setGender(gen gender) {
		this.gender = gender;
	}

	void show() {
		System.out.println("Number: "+phno+" Name:"+name+" Email:"+email+" Gender:"+gender);
	}

}

public class TreeMapCollections {

	public static void main(String[] args) {
		
		contact c1 = new contact(9682534844l,"bedsfer","djgdu@gdg.in",gen.male);
		contact c2 = new contact(7282570286l,"ydfgsd","jdfwe@gdg.in",gen.male);
		contact c3 = new contact(3767827623l,"adgwerstg","rtdgdu@gdg.in",gen.male);
		contact c4 = new contact(8377287723l,"nrfsfd","fwetu@gdg.in",gen.male);
		
		TreeMap<Long,contact> cmap = new TreeMap<>(Collections.reverseOrder()); // Inserting in Descending Order
		cmap.put(c1.getPhno(), c1);
		cmap.put(c2.getPhno(), c2);
		cmap.put(c3.getPhno(), c3);
		cmap.put(c4.getPhno(), c4);
		
		
		System.out.println(cmap.keySet());   // Fetching all keys
		System.out.println(cmap.values());   // Fetching all Values
		System.out.println(cmap);   // Fetching all key-Value pairs
	}


	}
