package Contact;
public class Contact {

	public  String id;
	public String firstName;
	public String lastName;
	public String cellNumber;
	public String address;
	

	public Contact(String id, String firstName, String lastName, String cellNumber, String address) {
		if(id == null || id.length()> 10) {
			throw new IllegalArgumentException("ID Error");
		}
		if(firstName == null || firstName.length()> 10) {
			throw new IllegalArgumentException("First Name Error");
		}
		if(lastName == null || lastName.length()> 10) {
			throw new IllegalArgumentException("Last Name Error");
		}
		if(cellNumber == null || cellNumber.length() != 10) {
			throw new IllegalArgumentException("Cell Number Error");
		}
		if(address == null ||address.length()> 30) {
			throw new IllegalArgumentException("Address Error");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cellNumber = cellNumber;
		this.address = address;
		
	}
	public String getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFullName() {
		return firstName + " " + lastName;
	}
	public String getCellNumber() {
		return cellNumber;
	}
	public String getAddress() {
		return address;
	}
	
}
