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
	
	public List<BuddyInfo> getBuddies(){
		return buddies;
	}
	
	public int size(){
		return buddies.size();
	}
	
	public void clear(){
		buddies.clear();
	}
	
	public String display(){
		String t = "";
		for (BuddyInfo buddy: buddies){
			t+= buddy.toString();
		}
		return t + "\n";
	}
	
}
