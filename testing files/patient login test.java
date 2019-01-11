package user1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Patient2Test {
	Patient2 ins;
	
	 @Before
	    public void setUp() {
	        ins = new Patient2();
	    }

	/*@Test
	public void testPatient2() {
	}*/

	@Test
	public void testGetpassword() {
		System.out.println("get password");
		assertEquals("ram12", ins.getpassword("ram"));
		assertFalse("krish12".compareTo(ins.getpassword("krish"))==0);
		assertNull(ins.getpassword("chandana"));
	}

	@Test
	public void testGetquantity() {
		System.out.println("get quantity");
		assertEquals(1, ins.getquantity("ram"));
		assertEquals(0, ins.getquantity("abcd"));

	}
	
	@After
	public void teardown() {
		System.out.println("all success");
	}

}
