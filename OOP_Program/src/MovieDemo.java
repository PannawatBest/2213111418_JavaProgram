
import java.util.*;

public class MovieDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Movie id   : ");
		String id = scan.nextLine();
		System.out.print("Input Movie Name : ");
		String name = scan.nextLine();
		System.out.println();
		System.out.print("Input director name   : ");
		String dName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String dEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		char dgender = scan.next().toLowerCase().charAt(0);
		while (dgender != 'm' && dgender != 'f') {
			System.out.print("Input director gender, again : ");
			dgender = scan.next().toLowerCase().charAt(0);
		}
		System.out.println();
		System.out.print("Input Movie theater no.  :");
		int theaterNo = scan.nextInt();
		while (theaterNo <= 1 || theaterNo >= 15) {
			System.out.print("Please input 1 - 15 only :");
			theaterNo = scan.nextInt();
		}
		System.out.println();
		Theater theater = new Theater(id, name, new Director(dName, dEmail, dgender), theaterNo);
		System.out.println(theater);

	}
}
