package com.plant;
class Rose implements Flower {
	   @Override
	   public void grow() {
	      System.out.println("Rose is growing");
	   }
	   @Override
	   public void blossom() {
	      System.out.println("Rose is blooming");
	   }
	   @Override
	   public void wilt() {
	      System.out.println("Rose is wilting");
	   }
	}
