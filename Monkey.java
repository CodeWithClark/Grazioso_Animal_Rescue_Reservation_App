package grazioso;

//Jordan Clark
//Date: 10-15-22
//Course ID: IT-145
//Description: Week 7 Project 2: Monkey Class

public class Monkey extends RescueAnimal {
	// Instance variables
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;

	// Constructor
	public Monkey(String name, String species, String gender, String age, 
	String weight, String height, String tailLength, String bodyLength, 
	String acquisitionDate, String acquisitionCountry,String trainingStatus, 
	boolean reserved, String inServiceCountry) {
	setName(name);
	setSpecies(species);
	setGender(gender);
	setAge(age);
	setWeight(weight);
	setHeight(height);
	setTailLength(tailLength);
	setBodyLength(bodyLength);
	setAcquisitionDate(acquisitionDate);
	setAcquisitionLocation(acquisitionCountry);
	setTrainingStatus(trainingStatus);
	setReserved(reserved);
	setInServiceCountry(inServiceCountry);
	}
	
	//Accessor public 
	String getSpecies() {
	return species;
	}
	
	public String getTailLength() {
	return tailLength;
	}
	
	public String getBodyLength() {
	return bodyLength;
	}
	
	public String getHeight() {
	return height;
	}
	
	// Mutator Methods
	
	public void setSpecies(String monkeyType) {
	species = monkeyType;
	}
	
	public void setTailLength(String monkeyTail) {
	tailLength = monkeyTail;
	}
	
	public void setHeight(String monkeyHeight) {
	height = monkeyHeight;
	}
	
	public void setBodyLength(String monkeyBody) {
	bodyLength = monkeyBody;
	}
}