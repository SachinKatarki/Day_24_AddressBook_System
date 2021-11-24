package com.bridgelabz.stream;

import java.util.Comparator;

public class Sort {
	 static Comparator<Contacts> compareCity = new Comparator<Contacts>() {
	        public int compare(Contacts one, Contacts two) {
	            return one.getCity().compareTo(two.getCity());
	        }
	    };
	public static Comparator<Contacts> compareState= new Comparator<Contacts>() {
        public int compare(Contacts one, Contacts two) {
            return one.getState().compareTo(two.getState());
        }
    };
	public static Comparator<Contacts> compareFirstName = new Comparator<>() {
        public int compare(Contacts one, Contacts two) {
            return one.getFirstName().compareTo(two.getFirstName());
        }
    };
    static Comparator<Contacts> compareZip = new Comparator<>() {
        public int compare(Contacts one, Contacts two) {
            return one.getZip().compareTo(two.getZip());
        }
    };

}
