package com.koushik.spring;

public class Reservation {
	protected String firstName;
	protected String lastName;
	protected String onBoard;
	protected String destination;
	protected String seatPosition;
	
	public String getOnBoard() {
		return onBoard;
	}

	public String getSeatPosition() {
		return seatPosition;
	}

	public void setSeatPosition(String seatPosition) {
		this.seatPosition = seatPosition;
	}

	public void setOnBoard(String onBoard) {
		this.onBoard = onBoard;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	Reservation(){
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
