package com.bridgelabz.addressbookmain;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook Program");
		AddressBookService contact = new AddressBookService();
		contact.addContact();
		AddressBookService contact2 = new AddressBookService();
		contact2.addContact();
		contact.displayContacts();
		contact2.displayContacts();
		
	}
}
