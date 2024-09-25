package CDP2;
import java.util.*;
public class BookLibrary implements Book{
	ArrayList<Book> z = new ArrayList<Book>();
	@Override
	public void getInfo(){
		for(Book B:z) {
			B.getInfo();
		}	
	}
	public void addPart(Book B) {
		z.add(B);
	}
	public void removePart(Book B) {
		z.remove(B);
	}	
}
