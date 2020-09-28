import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Email_VerificationUC5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("abc@yahoo.com");
		emails.add("abc-100@yahoo.com");
		emails.add("abc.100@yahoo.com");
		emails.add("abc111@abc.com"); 
		emails.add("abc-100@abc.net");
		emails.add("abc.100@abc.com.au");
		emails.add("abc@1.com");
		emails.add("abc@gmail.com.com");
		emails.add("abc+100@gmail.com");
		//Invalid emails
		emails.add("abc");
		emails.add("abc@.com");
		emails.add("abc123@gmail.a");
		emails.add("abc123@.com");
		emails.add("abc123@.com.com");
		emails.add(".abc@abc.com");
		emails.add("abc()*@gmail.com");
		emails.add("abc@%*.com");
		emails.add("abc..2002@gmail.com");
		emails.add("abc.@gmail.com");
		emails.add("abc@abc@gmail.com");
		emails.add("abc@gmail.com.1a");
		emails.add("abc@gmail.com.aa.au");
		
		 
		String regex ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]{2,})?(\\.[a-z]{2,})?$";
		 
		Pattern pattern = Pattern.compile(regex);
		Scanner sc = new Scanner(System.in);
		 
		for(String email : emails){
		    Matcher matcher = pattern.matcher(email);
		    System.out.println(email +" : "+ matcher.matches());
		}
		
	}

}
// *OUTPUT*
/*

abc@yahoo.com : true
abc-100@yahoo.com : true
abc.100@yahoo.com : true
abc111@abc.com : true
abc-100@abc.net : true
abc.100@abc.com.au : true
abc@1.com : true
abc@gmail.com.com : true
abc+100@gmail.com : true
abc : false
abc@.com : false
abc123@gmail.a : false
abc123@.com : false
abc123@.com.com : false
.abc@abc.com : false
abc()*@gmail.com : false
abc@%*.com : false
abc..2002@gmail.com : false
abc.@gmail.com : false
abc@abc@gmail.com : false
abc@gmail.com.1a : false
abc@gmail.com.aa.au : false


*/
