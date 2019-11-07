package SeleniumSessions;

public class CustomCSSSelector {

	public static void main(String[] args) {

		//id: #{id}
	//	#username
	// input#username	
	// input[id='username']	
	// input[id='username'][type='email']
	// button#loginBtn	
		
	//class: .{classname}	
	// .form-control.private-form__control.login-email
	// input.form-control.private-form__control.login-email
	// input.login-email	
	// button.login-submit	
		
	//text:
	//	input[id^='username'] -- starting text
	// 	input[id$='username'] -- ending text
	//	input[id$='name'] 
		
	//	input[id*='username'] -- contains text
	//	input[id*='user']
		
	// div>input[id='username']
	// div.private-form__input-wrapper>input#username	
		
	}

}
