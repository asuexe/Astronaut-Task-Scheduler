package com.plant;

public class Execute {
	public static void main(String[] args) {
		Rose rose =  (Rose) PlantFactory.createPlant("Rose");
		Oak oak = (Oak) PlantFactory.createPlant("Oak");
		rose.grow();
		rose.blossom();
		rose.wilt();
		oak.grow();
		oak.produceFruit();
		oak.shedLeaves();
	}
}
