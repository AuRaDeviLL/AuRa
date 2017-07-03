package com.hms.model;

public class AvailablityOfRoomsVO {
	int arrivalDate, departureDate;
	String bookingFor;
	
	public int getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(int arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public int getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(int departureDate) {
		this.departureDate = departureDate;
	}
	public String getBookingFor() {
		return bookingFor;
	}
	public void setBookingFor(String bookingFor) {
		this.bookingFor = bookingFor;
	}
}
