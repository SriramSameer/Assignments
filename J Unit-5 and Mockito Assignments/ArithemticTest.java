import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithemeticTest {
	
ArithemticTest addsub;
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("this nedds to run before all");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("We are at the end of the Programming");
	}
	
	@BeforeEach
	void init() {
		 junit = new MyJuintProject();

	}
	@AfterEach
	void afterEach() {
		System.out.println("The code run successfully");
	}
	
	@Test
	void addtest() {
		int result = junit.add(10, 20);
		assertEquals(30, result);
	}
	
	@Test
	void subtracttest() {
		int result = junit.subtraction(10, 9);
		assertEquals(1, result);
	}

}
	
	
	
}

