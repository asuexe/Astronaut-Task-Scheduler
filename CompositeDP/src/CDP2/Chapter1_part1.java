package CDP2;

public class Chapter1_part1 extends Chapter1 implements Book {
	private int Page_No;
	private String Chapter_Name;
	private String Overview;
	private String Main_Character;

	public Chapter1_part1(String Chapter_Name,int Page_No, String Overview,String Main_Character) {
		super(Chapter_Name, Page_No, Overview);
		this.Main_Character=Main_Character;
		this.Chapter_Name=Chapter_Name;
		this.Overview=Overview;
		this.Main_Character=Main_Character;
	}
	@Override
	public void getInfo() {
		//System.out.println("\nChapter_Name is: "+Chapter_Name+"\nPage_No is:"+Page_No+"\nOverview Of this chapter is as below\n"+Overview);	
		System.out.println("\nCharacters for this part are:"+Main_Character);
	}
}
