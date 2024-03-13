import java.util.Scanner;

public class CapitalLetters {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a letter");
		char let=scan.next().charAt(0);
		Capital.capital(let);
	}
    
}
