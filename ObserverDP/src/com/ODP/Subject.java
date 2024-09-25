package com.ODP;

public interface Subject {
	void subscribe(Subscriber sub);
	
	void unsubscribe(Observer sub);
	
	void notifysubscriber();
	
	void upload(String title);

}
