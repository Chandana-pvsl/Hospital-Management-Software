package user1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegisterTest {
	Register reg;
	@Test
	public void testRegister() {
		reg = new Register();
		assertNotNull(reg);
	}

}
