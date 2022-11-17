import java.util.*;


public class Lab202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the number of minute : ");
		int minute = scan.nextInt();
		int year = (minute/1440/365);
		int day = (minute/1440%365);
		System.out.print(minute+" minute is approximately " + year +" years and "+ day +" days " );
		
		

	}

}
