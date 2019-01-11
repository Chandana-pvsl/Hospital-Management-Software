package user1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Doctordetails1Test {
	Doctordetails1 ins = new Doctordetails1("a");
	@Test
	public void testGettreatmentdetails() {
		assertEquals("wertyuiopasdfghjklxcvbnm",ins.gettreatmentdetails("chandana","pvsl","Ram","A","20","03","2018"));
	}

}
