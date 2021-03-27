package com.koushik.spring;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Reservation {
	protected String firstName;
	protected String lastName;
	protected String onBoard;
	protected String destination;
	protected String seatPosition;
	protected String[] gender;
	
	// We do not want to a single user select more then 10 seats
	@Min(value=1, message="Please select at least 1 seat")
	@Max(value=10, message="Not more than 10 seats are allowed")
	protected int numberOfSeat;
	
	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public String[] getGender() {
		return gender;
	}

	public void setGender(String[] gender) {
		this.gender = gender;
	}

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
