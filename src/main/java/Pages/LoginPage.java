package Pages;

public class LoginPage extends BasePage{
	
	String name;
	int size;
	String username;
	String password;
	
	public LoginPage(String name, int size, String username, String password) {
		this.name = name;
		this.size = size;
		this.username = username;
		this.password = password;
	}
	
	public void login(String username, String password){
		System.out.println("login to app....");
		System.out.println("login successful....");
	}
	
	
	

}
