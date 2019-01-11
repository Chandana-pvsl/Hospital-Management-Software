package user1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Patientdetails1Test {


	@Test
	public void testCheckavailable() {
		Patientdetails1 ins =new Patientdetails1("chandana");
		assertEquals("AVAILABLE",ins.checkavailable("a","b","02-01-2018"));
		assertEquals("NOT AVAILABLE",ins.checkavailable("yashwant","k","03-01-2018"));
	}


	@Test
	public void testGettotalpayment() {
		Patientdetails1 ins1 =new Patientdetails1("aish");
		System.out.println(ins1.gettotalpayment("Aishwarya","A"));
		assertEquals(50000,ins1.gettotalpayment("Aishwarya","A"),1);
		assertFalse(ins1.gettotalpayment("Ram","A")==20000);
	}

	@Test
	public void testMakepayment() {
		Patientdetails1 ins2 =new Patientdetails1("chandana");
		ins2.makepayment("chandana", "pvsl",20000, "02-04-2018");
		assertNotNull(ins2);
		Patientdetails1 ins3 = ins2;
		assertSame(ins2,ins3);
	}
	

}
