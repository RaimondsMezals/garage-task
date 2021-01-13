package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Motorbike motorbike1 = new Motorbike();
		
		Car car2 = new Car();
		Motorbike motorbike2 = new Motorbike();
		
		Car car3 = new Car();
		Motorbike motorbike3 = new Motorbike();
		
		Car car4 = new Car();
		Motorbike motorbike4 = new Motorbike();
		
		Car car5 = new Car();
		Motorbike motorbike5 = new Motorbike();
		
		motorbike5.setId("11");
		
		//car1.isATransport();
		
		//car1.hasFourWheals();
		
		//motorbike1.isATransport();
		
		//motorbike1.hasTwoWheals();
		
		//System.out.println(motorbike1.wheals);
		
		Garage storage = new Garage();
		
		storage.setCarsStored(car1);
		storage.setCarsStored(motorbike1);
		
		storage.setCarsStored(car2);
		storage.setCarsStored(motorbike2);
		
		storage.setCarsStored(car3);
		storage.setCarsStored(motorbike3);
		
		storage.setCarsStored(car4);
		storage.setCarsStored(motorbike4);
		
		storage.setCarsStored(car5);
		storage.setCarsStored(motorbike5);
		
		storage.printGarageContents();
		
		storage.billForVehicle();
		
		storage.removeVehicleByType("Car");
		
		storage.removeVehicleById("11");
		
		storage.printGarageContents();
		
	}

}
