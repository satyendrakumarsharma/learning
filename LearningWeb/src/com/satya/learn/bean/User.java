/**
 * 
 */
package com.satya.learn.bean;

import java.util.Date;

/**
 * @author Satyendra
 *
 */
public class User {
	private String firstName;
	private String midName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
	private Date dateOfAnniversary;
	private Address currentAddress;
	private Contact contact;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMidName() {
		return midName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfAnniversary() {
		return dateOfAnniversary;
	}
	public void setDateOfAnniversary(Date dateOfAnniversary) {
		this.dateOfAnniversary = dateOfAnniversary;
	}
	public Address getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}
	public void setCurrentAddress(String flatNumber, String buildingName, String street, String areaName, String city, String state, String country, String pinCode) {
		Address newAddress = new Address();
		this.currentAddress = newAddress;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
}

class Address{
	private String flatNumber;
	private String buildingName;
	private String street;
	private String areaName;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	
	public Address(){
		this.setFlatNumber(flatNumber);
		this.setBuildingName(buildingName);
		this.setStreet(street);
		this.setAreaName(areaName);
		this.setCity(city);
		this.setState(state);
		this.setCountry(country);
		this.setPinCode(pinCode);
	}
	
	public String getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
}

class Contact{
	private String phoneNumber;
	private String mobileNumber;
	private String emailId;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
