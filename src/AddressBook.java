import java.util.ArrayList;
import java.util.List;


public class AddressBook {
	
	private List<BuddyInfo> buddies;
	
	public AddressBook(){
		buddies = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddy){
		buddies.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy){
		buddies.remove(buddy);
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
		AddressBook ab = new AddressBook();
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Haris");
		ab.addBuddy(buddy);
		ab.removeBuddy(buddy);
	}
}
