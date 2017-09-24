package com.cg.EnquiryDTO;

public class EnquiryDetails 
{
private String fname;
private String lname;
private String contact;
private String domain;
private String location;

public EnquiryDetails() {
	
}
public EnquiryDetails(String fname, String lname, String contact, String domain, String location) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.contact = contact;
	this.domain = domain;
	this.location = location;
}
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
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
