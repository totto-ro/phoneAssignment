package com.phone;

public class PhoneTester {
    public static void main(String[] args) {
    	
        Galaxy s9 = new Galaxy("S9", 100, "Kolbi","RING RING");
        IPhone iPhoneTen = new IPhone("X", 60, "Claro", "Zzz zzz zzz");
        
        s9.displayInfo();
        iPhoneTen.displayInfo();
        
    }
}
