package hcl.in;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test002 extends BaseSetUp{
	

	
	@DataProvider(name="fdata")
	public String[][] getedata() throws IOException{
	String[][] fTestdata=getTestData("Test");
		return fTestdata;
	}
	
	@Test(dataProvider="fdata")
	public void printdata(String uName,String pwd){
		System.out.println(uName+" "+pwd);
		
	}
	
	
	
}


