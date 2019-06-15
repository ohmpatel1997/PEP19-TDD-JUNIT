import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class removeA {
	
	functionality f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TEST CASES
	/*
	 	1. "ABCD" -> "BCD"
	 	2. "AACD" -> "CD"
	 	3. "BACD" -> "BCD"
	 	4. "BBAA" -> "BBAA"
	 	5. "AABAA" -> "BAA" 
	 	6. "" -> ""
	 	7. "A" -> ""
	 	8. "B" -> "B"
	 	9. "AA" -> ""	
	 */
	
		
	}
	@BeforeEach
	void setUp() {
		f = new functionality();
	}
	
	@Test
	void testABCD() {
		
		assertEquals("BCD",f.removea("ABCD"));
		
	}
	@Test
	void testAACD() {
		
		
		assertEquals("CD",f.removea("AACD"));
		
	}
	@Test
	void testBACD() {
		
		
		assertEquals("BCD",f.removea("BACD"));
		
	}
	@Test
	void testBBAA() {
		
		assertEquals("BBAA",f.removea("BBAA"));
		
	}
	@Test
	void testAABAA() {
		
		assertEquals("BAA",f.removea("AABAA"));
		
	}
	@Test
	void testempty() {
		
		assertEquals("",f.removea(""));
		
	}
	@Test
	void testA() {
		
		assertEquals("",f.removea("A"));
		
	}
	@Test
	void testB() {
		
		assertEquals("B",f.removea("B"));
		
	}
	@Test
	void testAA() {
		
		assertEquals("",f.removea("AA"));
		
	}
}
