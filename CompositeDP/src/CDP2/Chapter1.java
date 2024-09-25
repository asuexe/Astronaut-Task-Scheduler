package CDP2;

public class Chapter1 implements Book {
	private int Page_No;
	private String Chapter_Name;
	private String Overview;
	
	public Chapter1(String Chapter_Name,int Page_No,String Overview) {
		this.Page_No=Page_No;
		this.Chapter_Name=Chapter_Name;
		this.Overview=Overview;	
	}
	@Override
	public void getInfo() {
		System.out.println("\nChapter_Name is: "+Chapter_Name+"\nPage_No is:"+Page_No+
				"\nOverview Of this chapter is as below:\n"+Overview);	
	}

}
