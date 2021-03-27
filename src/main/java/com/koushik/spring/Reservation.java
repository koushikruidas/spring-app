package com.koushik.spring;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Reservation {
	protected String firstName;
	protected String lastName;
	protected String onBoard;
	protected String destination;
	protected String seatPosition;
	protected String[] gender;
	
	// We do not want to a single user select more then 10 seats
	@NotNull(message="is required")
	@Min(value=1, message="Please select at least 1 seat")
	@Max(value=10, message="Not more than 10 seats are allowed")
	protected Integer numberOfSeat; // changing from primitive data type to non-primitive (int -> Integer) 
									// we able to enforce NotNull validation 
	// if we add blank spaces then we will receive error called TypeMisMatch
	// but if we add initBinder method to the Reservation controller class then initBinder will 
	// trim the blank spaces to null and on that case we will not face the type mismatch error
	
	public Integer getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(Integer numberOfSeat) {
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
