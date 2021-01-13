package com.qa.main;

public class Car extends Vehicle {
	
	String type = "Car";
	boolean canMove = true;
	int wheals = 4;
	String color;
	String seats;
	String id;
	
	public void hasFourWheals() {
		
		System.out.println(wheals);
		
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", canMove=" + canMove + ", wheals=" + wheals + ", color=" + color + ", seats="
				+ seats + ", id=" + id + "]";
	}

	public String getType() {
		return type;
	}
	
	public boolean isCanMove() {
		return canMove;
	}

	public void setCanMove(boolean canMove) {
		this.canMove = canMove;
	}

	public int getWheals() {
		return wheals;
	}

	public void setWheals(int wheals) {
		this.wheals = wheals;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
