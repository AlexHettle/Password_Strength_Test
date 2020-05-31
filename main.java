import java.util.Scanner;
public class main {
	public static double test_strength(String password) {
		double score=0;
		String lower="abcdefghijklmnopqrstuvwxyz";
		String upper=lower.toUpperCase();
		String numbers="1234567890";
		String symbols=" !@#$%^&*()-_=+`~,<.>/?':;{[}]|\'"+'"';
		for(int i=0;i<password.length();i++) {
			score+=2;
			if(lower.indexOf(password.charAt(i))!=-1) {score+=2;}
			if(upper.indexOf(password.charAt(i))!=-1) {score+=2;}
			if(numbers.indexOf(password.charAt(i))!=-1) {score+=5;}
			if(symbols.indexOf(password.charAt(i))!=-1) {score+=7;}
		}
		return (score/200);
	}
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
