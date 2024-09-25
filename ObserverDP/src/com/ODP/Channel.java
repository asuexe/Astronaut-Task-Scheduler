package com.ODP;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	public String title;
	private List<Subscriber> l = new ArrayList<Subscriber>();

	@Override
	public void subscribe(Subscriber sub) {
		l.add(sub);
		
	}

	@Override
	public void unsubscribe(Observer sub) {
		l.remove(sub);
		
	}

	@Override
	public void notifysubscriber() {
		for(Observer sub:l) {
			sub.update();;
		}
		
	}

	@Override
	public void upload(String title) {
		this.title=title;
		notifysubscriber();
	}
	
}
