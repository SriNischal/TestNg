package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerClass {
	@Test
	public void test1() {
		Assert.assertEquals("", "a");
	}

	@Test
	public void test2() {
		Assert.assertEquals("a", "s");
	}

}
