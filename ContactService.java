package contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class ContactService {
		public final HashMap<String, Contact> contactList = new HashMap<String, Contact>();
	
	public void addContact(String uniqueId, String firstName, String lastName, String phoneNumber, String address) {
			if (contactList.containsKey(uniqueId)) {
				throw new IllegalArgumentException("That ID already exists.");
			}
		
		Contact contactNew = new Contact (uniqueId, firstName, lastName, phoneNumber, address);
		contactList.put(uniqueId, contactNew);
	}
	
	public void removeContact(String contactId) {
			if (contactList.containsKey(contactId)) {
				contactList.remove(contactId);
			}
	}
	
	public void updateContact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
			if (contactList.containsKey(contactId)) {
				contactList.get(contactId).setFirstName(firstName);
				contactList.get(contactId).setLastName(lastName);
				contactList.get(contactId).setPhoneNumber(phoneNumber);
				contactList.get(contactId).setAddress(address);
			}
	}
	
}
