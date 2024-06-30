package Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getId())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        contacts.put(contact.getId(), contact);
    }
  
    public Contact getContact(String id) {
      return contacts.get(id);
    }

    public void deleteContact(String id) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        contacts.remove(id);
    }

    public void updateContact(String id, String firstName, String lastName, String cellNumber, String address) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        Contact contact = contacts.get(id);
        if (firstName != null && firstName.length() <= 10) {
            contact.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First Name Error");
        }
        if (lastName != null && lastName.length() <= 10) {
            contact.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last Name Error");
        }
        if (cellNumber != null && cellNumber.length() == 10) {
            contact.cellNumber = cellNumber;
        } else {
            throw new IllegalArgumentException("Cell Number Error");
        }
        if (address != null && address.length() <= 30) {
            contact.address = address;
        } else {
            throw new IllegalArgumentException("Address Error");
        }
    }
}
