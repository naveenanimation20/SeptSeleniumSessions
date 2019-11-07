package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	
	@Test(invocationCount=10)
	public void login(){
		System.out.println("login to app");
	}
	
	
	
	
	
	

}
