
public class BuddyInfo {
	private String name, address;
	private String phone;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName("Haris");
		
		System.out.println("Hello " + buddy.getName());
	}
	
	@Override
	public String toString(){
		String s = "Name: " + name + "\n" + "Address: " + address + "\n" + "Phone: " + phone + "\n";
		return s;
	}
	
	@Override
	public boolean equals(Object other){
		if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof BuddyInfo))return false;
	    BuddyInfo b = (BuddyInfo)other;
		if (name.equals(b.getName())){
			if (address.equals(b.getAddress())){
				if (phone == b.getPhone()){
					return true;
				}
			}
		}
		return false;
	}

}
