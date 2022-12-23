import java.util.*;

public class CheckStorckProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int list = scan.nextInt();
		System.out.println();
		Product[] productlist = new Product[list];
		for (int i = 0; i < productlist.length; i++) {
			productlist[i] = new Product();
			System.out.print("Input product Id : ");
			productlist[i].setid(scan.next());
			System.out.print("Input product Unit : ");
			productlist[i].setUnit(scan.nextInt());
			System.out.println();
		}
		System.out.println("--------------------------------");
		System.out.println("List of product in 'LOW'status.");
		System.out.println("--------------------------------");
		for (Product PDL : productlist) {
			if (PDL.getUnit() < 5) {
				System.out.println(">> "+PDL.getid()+" has "+PDL.getUnit()+" units");
			}
		}
		System.out.println("--------------------------------");
		System.out.println("List of product in 'NORMAL'status.");
		System.out.println("--------------------------------");
		for (Product PDL : productlist) {
			if (PDL.getUnit() >= 5&&PDL.getUnit()<=50) {
				System.out.println(">> "+PDL.getid()+" has "+PDL.getUnit()+" units");
			}
		}
		System.out.println("--------------------------------");
		System.out.println("List of product in 'HIGH'status.");
		System.out.println("--------------------------------");
		for (Product PDL : productlist) {
			if (PDL.getUnit() > 50) {
				System.out.println(">> "+PDL.getid()+" has "+PDL.getUnit()+" units");
			}
		}

	}

}
