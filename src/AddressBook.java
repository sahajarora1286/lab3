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
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Haris");		
		AddressBook ab = new AddressBook();
		ab.addBuddy(buddy);
		ab.removeBuddy(buddy);
		
		ab.addBuddy(buddy);
	}
}
