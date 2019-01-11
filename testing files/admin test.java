package user1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class administrationTest {
	administration ins;
	/*@Test
	public void testAdministration() {
		fail("Not yet implemented"); // TODO
	}*/
	 @Before
	public void setUp() {
	     ins = new administration();
	  }
	@Test
	public void testGetincome() {
		System.out.println("outgo of salary");
		assertEquals(String.valueOf(Double.valueOf(268500)),String.valueOf(ins.getincome()));
		assertFalse(ins.getincome()==125469);
	}

	@Test
	public void testCheckavailability() {
		System.out.println("check availability");
		assertEquals("NOT AVAILABLE",ins.checkavailability("jandu balm"));
		assertEquals("AVAILABLE",ins.checkavailability("a"));
		assertFalse("NOT AVAILABLE".compareTo(ins.checkavailability("jandu balm"))!=0);
	}

	@Test
	public void testRemoveDoctor() {
		System.out.println("removing doctor");
		assertEquals("removed",ins.removeDoctor("abc"));
		assertEquals("not removed",ins.removeDoctor("yashu"));
	}
	@After
	public void teardown() {
		System.out.println("all success");
	}
}
