package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.Contact;

import java.util.ArrayList;
import java.util.Objects;

public class ContactRepositoryImpl implements   ContactRepository{

    ArrayList<Contact> contacts = new ArrayList<>();
    @Override
    public Contact save(Contact contact) {
        contact.setId(contacts.size()+1);
        contacts.add(contact);
        return contact;
    }

    @Override
    public Contact findById(int id) {
        return contacts.get(id - 1);
    }

    @Override
    public boolean numberOfDeletedContact(int D) {
        if (Objects.equals(contacts, true)){

        }
        return true;
    }

    @Override
    public Contact deleteContact(String Number) {
        return null;
    }

    @Override
    public int count() {
        return contacts.size();
    }

    @Override
    public Contact findByFirstName(String firstName) {
        for (Contact contact: contacts){
            if (Objects.equals(firstName, contact.getFirstName())){
                return contact;
            }
        }
        throw new NullPointerException("contact not found");
    }
}
