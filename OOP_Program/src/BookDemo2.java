import javax.swing.JOptionPane;

public class BookDemo2 {

	public static void main(String[] args) {
		String name,email,bName;
		int page,check;
		name = JOptionPane.showInputDialog("Input author name:");
		email = JOptionPane.showInputDialog("Input author email:");
		bName = JOptionPane.showInputDialog("Input book title:");
		page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		check = JOptionPane.showConfirmDialog(null, "is the page correct?",
													"Confirm",
													JOptionPane.YES_NO_OPTION);
		Book1 book = new Book1(bName,new Author1(name,email),page);
		while(check == 1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
			check = JOptionPane.showConfirmDialog(null, "is the page correct?",
														"Confirm",
														JOptionPane.YES_NO_OPTION);
			
		
		}
		JOptionPane.showMessageDialog(null, "Book Title : "+book.getTitle()+
											"\nAuthor name : "+book.getAuthor().getName()+
											" ("+ book.getPage()+" page)"+
											"\nAuthor e-mail : "+book.getAuthor().getEmail());
	}

}
