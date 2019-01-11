package user1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Doctor2Test {
	Doctor2 ins;
	
	 @Before
	    public void setUp() {
	        ins = new Doctor2();
	    }

	/*@Test
	public void testPatient2() {
	}*/

	@Test
	public void testGetpassword() {
		System.out.println("get password");
		assertEquals("chandu", ins.getpassword("chandu"));
		assertFalse("a".compareTo(ins.getpassword("a"))==0);
		assertNull(ins.getpassword("murthy"));
	}

	@Test
	public void testGetquantity() {
		System.out.println("get quantity");
		assertEquals(1, ins.getquantity("murthy"));
		assertEquals(0, ins.getquantity("abcd"));
	}
	@After
	public void teardown() {
		System.out.println("all success");
	}


}
