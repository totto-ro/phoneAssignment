package com.phone;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    //Constructor
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    
    //Getters
    public String getVersionNumber () {
    	return this.versionNumber;
    }
    
    public int getBatteryPercentage(){
        return this.batteryPercentage;
    }
    
    public String getCarrier () {
    	return this.carrier;
    }
    
    public String getRingTone () {
    	return this.ringTone;
    }
    
  //Setters
    
    public void setVersionNumber( String versionNumber ) {
		this.versionNumber = versionNumber;
	}
    
    public void setBatteryPercentage( int batteryPercentage ) {
		this.batteryPercentage = batteryPercentage;
	}
    
    public void setCarrier( String carrier ) {
		this.carrier = carrier;
	}
    
    public void setRingTone( String ringTone ) {
		this.ringTone = ringTone;
	}
    
    
}