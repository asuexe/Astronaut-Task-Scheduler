package CDP2;

public class BookDetails implements Book {
	private String Name;
	public BookDetails(String Name) {
		this.Name=Name;
	}
	public void getInfo() {
		System.out.println("\nName of the Book is: "+Name);
	}
}
