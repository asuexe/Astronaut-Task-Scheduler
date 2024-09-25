package com.plant;
class PlantFactory {
	   public static Object createPlant(String type) {
	      if (type.equalsIgnoreCase("Rose")) {
	         return new Rose();
	      } else if (type.equalsIgnoreCase("Oak")) {
	         return new Oak();
	      }
	      return null;
	   }
	}
