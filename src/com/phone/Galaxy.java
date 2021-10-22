package com.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return this.getRingTone();
    }
    @Override
    public String unlock() {
    	return "Unlocked with figerprint";
    }
    @Override
    public void displayInfo() {
        System.out.println( "Galaxy version: " + this.getVersionNumber() + ". " + "Movil company: "+ this.getCarrier() + ". " +"Batter percentage: " + this.getBatteryPercentage() + "." );            
    }
}
