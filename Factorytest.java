package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Factorytest {
	@Test
	public void testtopass() {
		Assert.assertTrue(true);
	}

	@Test
	public void testtofail() {
		Assert.assertFalse(false);
	}
}