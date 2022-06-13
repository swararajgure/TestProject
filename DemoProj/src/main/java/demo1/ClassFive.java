package demo1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassFive {
	@BeforeTest
	public void testn() {
		System.out.println("This will executed Before every test module in the testng.xml file");
	}
	
	@Test
	public void testFive()
	{
		System.out.println("test Five got executed");
	}
	@AfterTest
	public void testm() {
		System.out.println("This will executed After every test module in the testng.xml file");
	}
}
