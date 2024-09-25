package com.MDP;

public class Exe {
	public static void main(String args[]) {
		Originator o = new Originator();
		CareTaker c = new CareTaker();
		o.setState("State 1");
		o.setState("state 2");
		c.addd(o.SaveStateToMemento());
		 o.setState("State 3");
	      c.addd(o.SaveStateToMemento());
	      
	      o.setState("State 4");
	      System.out.println("Current State: " + o.getState());
		System.out.println("current state"+o.getState());
		o.getstatefrommomento(c.gett(0));
		 System.out.println("First saved State: " + o.getState());
	      o.getstatefrommomento(c.gett(1));
	      System.out.println("Second saved State: " + o.getState());
		
	}

}	
