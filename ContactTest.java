package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contacts.Contact;

class ContactTest {

	@Test
	void testContactClassIdIsNull() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("EZ1", "Enrique", "Zarate", "9999999999", "21527 E Homestead");
		new Contact("TF1", "Enrique", "Zarate", "9999999999", "21527 E Homestead");
		new Contact("MA1", "Enrique", "Zarate", "9999999999", "21527 E Homestead");
		new Contact("SF1", "Enrique", "Zarate", "9999999999", "21527 E Homestead");
		new Contact(null, "Enrique", "Zarate", "9999999999", "21527 E Homestead");
	});
}
	
	@Test
	void testContactClassContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("EZ1", "Enrique", "Zarate", "9999999999", "21527 E Homestead");
			new Contact("TF1", "Enrique", "Zarate", "9999999999", "21527 E Homestead");
			new Contact("MA1", "Enrique", "Zarate", "9999999999", "21527 E Homestead");
			new Contact("SF1", "Enrique", "Zarate", "9999999999", "21527 E Homestead");
			new Contact("12345678911", "Enrique", "Zarate", "9999999999", "21527 E Homestead");
		});
	}
	
	
	@Test
	void testContactClassFirstNameIsNull() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", "Enrique" , "Zarate", "9999999999", "21527 E Homestead");
		new Contact("123456789", "Marc" , "Zarate", "9999999999", "21527 E Homestead");
		new Contact("123456789", "Lauren" , "Zarate", "9999999999", "21527 E Homestead");
		new Contact("123456789", "James" , "Zarate", "9999999999", "21527 E Homestead");
		new Contact("123456789", null , "Zarate", "9999999999", "21527 E Homestead");
	});
}
	
	@Test
	void testContactClassContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Enrique" , "Zarate", "9999999999", "21527 E Homestead");
			new Contact("123456789", "Marc" , "Zarate", "9999999999", "21527 E Homestead");
			new Contact("123456789", "Lauren" , "Zarate", "9999999999", "21527 E Homestead");
			new Contact("123456789", "James" , "Zarate", "9999999999", "21527 E Homestead");
			new Contact("12345678911", "EnriqueZarate", "Zarate", "9999999999", "21527 E Homestead");
		});
	}
	
	@Test
	void testContactClassLastNameIsNull() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", "Enrique" , "Zarate", "9999999999", "21527 E Homestead");
		new Contact("123456789", "Marc" , "Zarate", "9999999999", "21527 E Homestead");
		new Contact("123456789", "Lauren" , "Zarate", "9999999999", "21527 E Homestead");
		new Contact("123456789", "James" , "Zarate", "9999999999", "21527 E Homestead");
		new Contact("123456789", "Enrique" , null , "9999999999", "21527 E Homestead");
	});
}
	
	@Test
	void testContactClassContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Enrique" , "Zarate", "9999999999", "21527 E Homestead");
			new Contact("123456789", "Marc" , "Avalos", "9999999999", "21527 E Homestead");
			new Contact("123456789", "Lauren" , "Dinauer", "9999999999", "21527 E Homestead");
			new Contact("123456789", "James" , "Patterson", "9999999999", "21527 E Homestead");
			new Contact("12345678911", "Enrique", "ZarateEnrique", "9999999999", "21527 E Homestead");
		});
	}
	
	@Test
	void testContactClassPhoneNumberIsNull() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", "Enrique" , "Zarate" , "1234567891" , "21527 E Homestead");
		new Contact("123456789", "Enrique" , "Zarate" , "9784513245" , "21527 E Homestead");
		new Contact("123456789", "Enrique" , "Zarate" , "5468796652" , "21527 E Homestead");
		new Contact("123456789", "Enrique" , "Zarate" , null , "21527 E Homestead");
	});
}
	
	@Test
	void testContactClassContactPhoneNumberToolong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Enrique" , "Zarate" , "1234567891" , "21527 E Homestead");
			new Contact("123456789", "Enrique" , "Zarate" , "9784513245" , "21527 E Homestead");
			new Contact("123456789", "Enrique" , "Zarate" , "5468796652" , "21527 E Homestead");
			new Contact("12345678911", "Enrique", "Zarate", "99999999999", "21527 E Homestead");
		});
	}

	@Test
	void testContactClassContactPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789", "Enrique" , "Zarate" , "1234567891" , "21527 E Homestead");
			new Contact("123456789", "Enrique" , "Zarate" , "9784513245" , "21527 E Homestead");
			new Contact("123456789", "Enrique" , "Zarate" , "5468796652" , "21527 E Homestead");
			new Contact("12345678911", "Enrique", "Zarate", "999999", "21527 E Homestead");
		});
	}
	
	@Test
	void testContactClassAddressIsNull() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", "Enrique" , "Zarate" , "1234567891" , "21527 E Homestead");
		new Contact("123456789", "Enrique" , "Zarate" , "9784513245" , "21527 E Homestead");
		new Contact("123456789", "Enrique" , "Zarate" , "5468796652" , "21527 E Homestead");
		new Contact("123456789", "Enrique" , "Zarate" , "9999999999" , null);
	});
}
	
	@Test
	void testContactClassAddressIsTooLong() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("123456789", "Enrique" , "Zarate" , "1234567891" , "21527 E Homestead");
		new Contact("123456789", "Enrique" , "Zarate" , "9784513245" , "21527 E Homestead");
		new Contact("123456789", "Enrique" , "Zarate" , "5468796652" , "21527 E Homestead");
		new Contact("123456789", "Enrique" , "Zarate" , "9999999999" , "21527 E Homestead Drive, Tucson Arizona 85142");
	});
}
}
