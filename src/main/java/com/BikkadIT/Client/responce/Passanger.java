package com.BikkadIT.Client.responce;


public class Passanger {


	private String fname;
	private String lname;
	private String from;
	private String to;
	private String dateOfJourney;

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	@Override
	public String toString() {
		return "Passanger [fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to
				+ ", dateOfJourney=" + dateOfJourney + "]";
	}
	
	
	
	
}
