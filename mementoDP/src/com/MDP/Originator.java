package com.MDP;

public class Originator {
	private String state;
	public void setState(String state) {
		this.state=state;
	}
	public String getState() {
		return state;
	}
	public Memento SaveStateToMemento() {
		return new Memento(state);
	}
	public void getstatefrommomento(Memento m) {
		state=m.getState();
	}

}
