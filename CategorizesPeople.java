import java.util.Scanner;

public class CategorizesPeople {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter your age");
    int age=scan.nextInt();
    PeopleAge.peoplecat(age);
	}
	
}
