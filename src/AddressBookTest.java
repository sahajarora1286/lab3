import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AddressBookTest {
	private AddressBook addressBook;
	
	@Before
	public void setUp() {
		addressBook = new AddressBook();
	}

	@Test
	public void testEmptyAddressBook() {
		assertEquals ("The size of the address book should be 0.", 0, addressBook.size());
	}
	
	@Test
	public void testAddressBookWithOneBuddy(){
		addressBook.addBuddy(new BuddyInfo());
		assertEquals ("The size of the address book should be 1.", 1, addressBook.size());
	}
	
	@Test
	public void testAddressBookWithTwoBuddies(){
		addressBook.addBuddy(new BuddyInfo());
		addressBook.addBuddy(new BuddyInfo());
		assertEquals ("The size of the address book should be 2.", 2, addressBook.size());
	}
	
	@Test
	public void testClearMethod(){
		addressBook.addBuddy(new BuddyInfo());
		addressBook.addBuddy(new BuddyInfo());
		assertEquals("The size of the address book should be 2.", 2, addressBook.size());
		addressBook.clear();
		assertEquals("The size of the address book should now be 0.", 0, addressBook.size());
	}

}
