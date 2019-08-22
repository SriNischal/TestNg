package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTest {
	@Test
	public void test1() {
		Assert.assertEquals("a", "a");
	}

	@Test
	public void test2() {
		Assert.assertNotEquals("a", "s");
	}
}
