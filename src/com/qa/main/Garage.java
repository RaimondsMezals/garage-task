package com.qa.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garage {
	
	public List<Vehicle> carsStored = new ArrayList<>();

	public List<Vehicle> getCarsStored() {
		return carsStored;
	}

	public void setCarsStored(Vehicle input) {
		//this.carsStored = carsStored;
		carsStored.add(input);
	}
	
	
	public void printGarageContents() {
		
		System.out.println(carsStored);
		
	}
	
	public void billForVehicle() {
		
		int bill = 0;
		
		for(Vehicle b : carsStored) {
			
			if(b.getType() == "Car") {
				
				bill = 3000;
				
			}else if(b.getType() == "Motorbike") {
				
				bill = 1000;
				
			}else{
				
				bill = 0;
				
			}
			
			System.out.println("The bill for your vehicle " + b + " is " + bill + "£ ");
			
		}
		
	}
	
	public void emptyGarage() {
		
		carsStored.clear();
		
	}
	
	public void removeVehicleByType(String input) {
	
	for (Iterator<Vehicle> itr = carsStored.iterator(); itr.hasNext();)
	  {
		 Vehicle v = itr.next();
		  if(v.getType().equals(input)) {
	              itr.remove();
	         }
	
	  }
		
	
	}
	
	public void removeVehicleById(String input) {
		
		for (Iterator<Vehicle> itr = carsStored.iterator(); itr.hasNext();)
		  {
			 Vehicle v = itr.next();
			 
			  if(v.getId() != null && v.getId().contains(input)) {
		              itr.remove();
		         }
		
		  }
			
		
		}

}

/*
for(Iterator<Vehicle> itr = carsStored.iterator(); itr.hasNext();){            
    Vehicle transport = itr.next();
	for(Vehicle b : carsStored) {
		
		if(b.getType() == input) {

			itr.remove();

			
		}else if(b.getType() == input) {
			

				
			itr.remove();

			
		}else{
			

			itr.remove();

			
			}
		}
	}
		
}	*/
