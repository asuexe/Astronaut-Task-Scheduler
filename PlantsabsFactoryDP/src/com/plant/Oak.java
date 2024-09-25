package com.plant;

class Oak implements Tree {
	   @Override
	   public void grow() {
	      System.out.println("Oak is growing");
	   }
	   @Override
	   public void produceFruit() {
	      System.out.println("Oak is producing acorns");
	   }
	   @Override
	   public void shedLeaves() {
	      System.out.println("Oak is shedding leaves");
	   }
	}
