import java.util.*;

public class Lab401 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();

		if (fullName.contains(" ")) {
			int index = fullName.indexOf(" ");
			String firstName = fullName.substring(0, index).toUpperCase();
			String lastName = fullName.substring(index);
			System.out.print("First Name: " + firstName + "\nLast Name: " + lastName);

		} else {
			System.out.print("Incorrect Name");
		}

	}

}
