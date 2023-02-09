import java.util.Scanner;

public class RectangleDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double width,length;
		System.out.print("Input Width  : ");
		width = scan.nextDouble();
		System.out.print("Input length : ");
		length = scan.nextDouble();
		
		Rectangle2 rec2 = new Rectangle2(width, length);
		System.out.println(rec2+"\nArea of Rectangle is "+rec2.getArea());

	}

}
