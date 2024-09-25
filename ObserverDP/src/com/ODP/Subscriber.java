package com.ODP;

public class Subscriber implements Observer {
	private String name;
	private Channel c = new Channel();
	
	public Subscriber(String name) {
		this.name=name;
	}
	
	public void update() {
		System.out.println("dear " + name+" Video uploaded. \n Video Name - "+ c.title);
	}

	@Override
	public void SUBChannel(Channel ch) {
		this.c=ch;
		
	}
}
