import java.util.LinkedList;
import java.time.*;
class date {
	LocalDate datee;
	
	public date(LocalDate datee) {
		this.datee = datee;
	}
	
	public LocalDate getDatee() {
		return datee;
	}
}
public class LeapYearCollections {

	public static void main(String[] args) {
		
		LinkedList<date> db = new LinkedList<>();
		db.add(new date(LocalDate.of(1999, 12, 17)));
		db.add(new date(LocalDate.of(2000, 12, 23)));
		db.add(new date(LocalDate.of(1998, 01, 01)));
		db.add(new date(LocalDate.of(2003, 10, 19)));
		
		for(date e:db) {
			if(e.getDatee().isLeapYear()==true)
				System.out.println("Your DOB is "+e.getDatee()+" and was a leap Year");
			else if(e.getDatee().isLeapYear()==false)
				System.out.println("Your DOB is "+e.getDatee()+" and was NOT a leap Year");
		}
	}

}
