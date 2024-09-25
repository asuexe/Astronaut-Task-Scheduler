package com.MDP;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> l = new ArrayList<Memento>();
	public void addd(Memento state) {
		l.add(state);
	}
	public Memento gett(int index) {
		return l.get(index);
	}

}
