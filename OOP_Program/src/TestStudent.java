import java.util.*;

public class TestStudent {
	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int student = scan.nextInt();
		System.out.println();
		Student[] std = new Student[student];// define Array Object
		for (int i = 0; i < std.length; i++) {
			System.out.println("INPUT INFORMATION OD STUDENT " + (i + 1));
			System.out.println("---------------------------------");
			std[i] = new Student();// declare array object ,call all of method Student()
			System.out.print("Input Student name  : ");
			std[i].setName(scan.next());
			System.out.print("Input Student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input score, again : ");
				std[i].setScore(scan.nextInt());
			} // end while()
			System.out.println();
		} // end for()
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50):");
		System.out.println("-----------------------------------");
		for (int i = 0; i < std.length; i++) {
			if (std[i].isPass()) {
				System.out.println(">> " + std[i].getName() + "(" + std[i].getScore() + ")");
			}
		}
		for (Student STD : std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + "(" + STD.getScore() + ")");
			}
		}
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int student = scan.nextInt();
		System.out.println();
		Student[] std = new Student[student];// define Array Object

		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();// declare array object ,call all of method Student()
			System.out.print("Input Student Name  : ");
			std[i].setName(scan.next());
			System.out.print("Input Student Score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input Student Score, again : ");
				std[i].setScore(scan.nextInt());
			} // end while()
			System.out.println("---------------------------------");
		} // end for()

		for (Student STD : std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + " get grade " + STD.findGrade(student));
			}
		} // end of for()

	}// end of main()

}
