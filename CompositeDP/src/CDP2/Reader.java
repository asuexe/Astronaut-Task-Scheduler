package CDP2;

public class Reader {
	public static void main(String[] Names) {
		BookDetails B =
				new BookDetails("It ends with us");
		Chapter1 C1 = new Chapter1("Naked Truths",1,"Story Starts with a girl Named Lily Bloom whose dad has been recently passed out./nShe moved to Bosten for a break from life.\nWhile Sprending time at rooftop at night 2:00 AM She met a guy named ryle and the conversetion starts...");
		Chapter1_part1 C1P1 = new Chapter1_part1("Naked Truths",1,"Story Starts with a girl Named Lily Bloom whose dad has been recently passed out./nShe moved to Bosten for a break from life.\nWhile Sprending time at rooftop at night 2:00 AM She met a guy named ryle and the conversetion starts...","Ryle & Lily");
		Chapter1_part2 C1P2 = new Chapter1_part2("Naked Truths",1,"Story Starts with a girl Named Lily Bloom whose dad has been recently passed out./nShe moved to Bosten for a break from life.\nWhile Sprending time at rooftop at night 2:00 AM She met a guy named ryle and the conversetion starts...","Atlas,Lily & ryle");
		Chapter2 C2 = new Chapter2("Dear Ellen..",17,"She has passion of gardening since she enters teenage,.\nEverytime She is free she sits to watch ellen's show which is much famous at a time.\nShe writes her everyday like a summery of the show and her own life.");
		Chapter2_part1 C2P1 = new Chapter2_part1("Dear Ellen..",17,"She has passion of gardening since she enters teenage,.\nEverytime She is free she sits to watch ellen's show which is much famous at a time.\nShe writes her everyday like a summery of the show and her own life.","Atlas & Lily");
		Chapter2_part1 C2P2 = new Chapter2_part1("Dear Ellen..",17,"She has passion of gardening since she enters teenage,.\nEverytime She is free she sits to watch ellen's show which is much famous at a time.\nShe writes her everyday like a summery of the show and her own life.","Ryle ,Alyissa ,Atlas & Lily");
		BookLibrary BL = new BookLibrary();
		BL.addPart(B);
		BookLibrary BL1 = new BookLibrary();
		BL1.addPart(C1);
		BL1.addPart(C2);
		BookLibrary BL1P1 = new BookLibrary();
		BL1P1.addPart(C1P1);
		BL1P1.addPart(C1P2);
		BookLibrary BL1P2 = new BookLibrary();
		BL1P2.addPart(C2P1);
		BL1P2.addPart(C2P2);
		BookLibrary BookName = new BookLibrary();
		BookName.addPart(B);
		//B.getInfo();
		BookLibrary Chapter_Details = new BookLibrary();
		Chapter_Details.addPart(BL1);
		//Chapter_Details.getInfo();
		BookLibrary Part1_details = new BookLibrary();
		Part1_details.addPart(BL1P1);
		//Part1_details.getInfo();
		BookLibrary Part2_details = new BookLibrary();
		Part2_details.addPart(BL1P2);
		BookLibrary Parts = new BookLibrary();
		Parts.addPart(Part1_details);
		Parts.addPart(Part2_details);
		//Parts.getInfo();
		BookLibrary BC1 = new BookLibrary();
		BC1.addPart(Parts);
		BC1.addPart(BL1);
		BookLibrary BCMain = new BookLibrary();
		BCMain.addPart(BC1);
		BCMain.addPart(BL);
		BCMain.getInfo();
	}
}
