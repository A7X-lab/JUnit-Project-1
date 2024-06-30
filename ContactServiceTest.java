package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Contact.Contact;
import Contact.ContactService;

class ContactServiceTest {

    @Test
    void addContactTest() {
        //Add Contact
        ContactService contactService = new ContactService();
        Contact contact = new Contact("5557778989", "Xatu", "Eros", "3235780948", "104 Gumo Rd NW");
        contactService.addContact(contact);
        assertTrue(contactService.getContact("5557778989") != null);
    }

    @Test
    void deleteContactTest() {
        //Delete Contact
        ContactService contactService = new ContactService();
        Contact contact = new Contact("5557778989", "Xatu", "Eros", "3235780948", "104 Gumo Rd NW");
        contactService.addContact(contact);
        contactService.deleteContact("5557778989");
        assertTrue(contactService.getContact("5557778989") == null);
    }

    @Test
    void updateContactTest() {
        //Update Contact
        ContactService contactService = new ContactService();
        Contact contact = new Contact("5557778989", "Xatu", "Eros", "3235780948", "104 Gumo Rd NW");
        contactService.addContact(contact);
        contactService.updateContact("5557778989", "Articuno", "Eros", "1234567890", "105 Gumo Rd NW");

        Contact updatedContact = contactService.getContact("5557778989");
        assertNotNull(updatedContact);
        assertTrue(updatedContact.getFullName().equals("Articuno Eros"));
        assertTrue(updatedContact.getCellNumber().equals("1234567890"));
        assertTrue(updatedContact.getAddress().equals("105 Gumo Rd NW"));
    }

    @Test
    void getContactNotNull() {
        //Contact Not Null
        ContactService contactService = new ContactService();
        Contact contact = new Contact("5557778989", "Xatu", "Eros", "3235780948", "104 Gumo Rd NW");
        contactService.addContact(contact);
    }
}
