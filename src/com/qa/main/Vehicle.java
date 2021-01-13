package com.qa.main;

public class Vehicle {
	
	String type;
	boolean canMove = true;
	int wheals;
	String id;
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void isATransport() {
		
		System.out.println(canMove);
		
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", canMove=" + canMove + ", wheals=" + wheals + ", id=" + id + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
