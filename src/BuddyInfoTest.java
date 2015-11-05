import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BuddyInfoTest {
	private BuddyInfo buddy, testBuddy;
	@Before
	public void setUp(){
		buddy = new BuddyInfo();
		buddy.setName("John");
		buddy.setAge(19);
		testBuddy = new BuddyInfo(buddy);
	}

	@Test
	public void testCopyConstructor() {
		assertEquals ("Name of the test buddy should be John.", "John", testBuddy.getName());
	}
	
	@Test
	public void testGreeting(){
		assertEquals ("John should be greeted.", "Welcome John", buddy.getGreeting());
	}
	
	@Test
	public void testIfAge19(){
		assertEquals ("John's age should be 19.", 19, buddy.getAge());
	}
	
	@Test
	public void testIfOver18(){
		assertEquals ("Should be true for John.", true, buddy.isOver18());
	}
}
