import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Test
	void testMinMaxFind() {
		MinMaxFinder mnf = new MinMaxFinder();
		
		int expected[] = new int[] {3,56};
		
		assertArrayEquals(expected,mnf.arr(new int[] {56,34,7,3,54,3,34,34,53}));
	}
	
	@Test
	void testMinMaxFind1() {
		MinMaxFinder mnf1 = new MinMaxFinder();
		
		int expected1[] = new int[] {0,99};
		assertArrayEquals(expected1,mnf1.arr(new int[] {30,1,10,25,56,99,87,45,0}));
	}
	
	@Test
	void testMinMaxFind2() {
		MinMaxFinder mnf2 = new MinMaxFinder();
		
		int expected2[] = new int[] {101,999};
		assertArrayEquals(expected2,mnf2.arr(new int[] {999,101,205,665,777,854,465}));
	}

}
