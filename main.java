import java.util.Scanner;
public class main {
	//goes through every character in the password
	//and gives points depending on the type of character
	//returns a percentage of strength
	public static double test_strength(String password) {
		double score=0;
		for(int i=0;i<password.length();i++) {
			if(Character.isUpperCase(password.charAt(i))) {score+=4;}
			else if(Character.isLowerCase(password.charAt(i))){score+=4;}
			else if(Character.isDigit(password.charAt(i))) {score+=7;}
			else{score+=9;}
		}
		return (score/200);
	}
	//takes in a password from user, calculates the strength,
	//and rates the strength
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter password:");
		String password=in.nextLine();
		double score=test_strength(password);
		System.out.println("Your password score is ");
		System.out.print(score*100);
		if(0<=score&&score<=.33) {
			System.out.println("%, this is a weak password.");
		}else if(.33<score&&score<=66) {
			System.out.print("%, this is a medium strength password.");
		}else {
			System.out.println("%, this is a strong password.");
		}
		System.out.print("Exiting Program...");
	}
}
