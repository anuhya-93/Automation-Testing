import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Capgemini.Training.App;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app=new App();
		String regex="^(.+)@(.+)$";
		String email =app.userEmail("abc@gmail.com");
		Pattern pattern=Pattern.compile(regex);
		Matcher match =pattern.matcher(email);
		System.out.println("IS it match::"+match.matches());
		System.out.println(email);
		int pwd=app.userPassword(4646456);
		System.out.println(pwd);
		app.login();
	}

}
