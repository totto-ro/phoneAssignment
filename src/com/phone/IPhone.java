package com.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return this.getRingTone();
    }
    @Override
    public String unlock() {
    	return "Unlocked with password";
    }
    @Override
    public void displayInfo() {
    	 System.out.println( "Iphone version: " + this.getVersionNumber() + ". " + "Movil company: "+ this.getCarrier() + ". " +"Batter percentage: " + this.getBatteryPercentage() + "." );            
    }            
}