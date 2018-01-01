package hcl.in;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CommonTest {
	
	@BeforeClass(groups={"Sanity","Regression","Database"})
	public void test4(){
		System.out.println("test4");
	}
	
	
	@Test(groups={"Sanity","Regression"})
	public void test1(){
		System.out.println("test1");
	}
	
	@Test(groups={"Sanity","Database"})
	public void test2(){
		System.out.println("test2");
	}
	
	@Test(groups="Sanity")
	public void test3(){
		System.out.println("test3");
	}
	
	
	
	
	
}