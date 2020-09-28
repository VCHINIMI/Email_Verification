import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerificationUC4 {
	public void Validate(String Email) {
		String regex ="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]{2,})?$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Email);
		if(matcher.matches()) {
			System.out.println("Valid Email");
		}
		else {
			System.out.println("InValid Email");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the pincode");
		Scanner scanner = new Scanner(System.in);
		String Email = scanner.nextLine();
		scanner.close();
		EmailVerificationUC4 p = new EmailVerificationUC4();
		p.Validate(Email);
	}

}