package com.ODP;

public class Exe {
	public static void main(String[] args) {
		Channel a = new Channel();
		Subscriber s1 = new Subscriber("Vivek");
		Subscriber s2 = new Subscriber("Naishal");
		Subscriber s3 = new Subscriber("aditya");
		
		a.subscribe(s1);
		a.subscribe(s2);
		a.subscribe(s3);
		
		s1.SUBChannel(a);
		s2.SUBChannel(a);
		s3.SUBChannel(a);
		
		a.upload("video 1");
		
	}

}
