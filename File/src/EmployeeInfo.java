import java.util.Scanner;
import java.io.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		String choice;
		String department;
		System.out.print("Insert or Read data(from file)? : ");
		choice = console.next().toLowerCase();
		while(!choice.equals("insert")&&!choice.equals("read")) {
			System.out.print("Please text insert or Read data? : ");
			choice = console.next().toLowerCase();
		}
		//create object to call SaveandOpen class
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert"))
			file.insert(); //call insert() method from SaveandOpen Class
		else {
			System.out.print("\nEnter department: ");
			department = console.next();
			file.setDept(department);//send department to setDept() method form Employee Class
			file.read();//call read() method from SaveandOpen Class
		}
		
		
	}//main()

}
