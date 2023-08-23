package Repository.Impl;

import Repository.ContactRepository;
import domain.models.Contact;
import mapping.dto.ContactDto;
import mapping.mappers.ContactMapper;

import java.util.Arrays;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository{

    private List<Contact> contacts;

    public ContactRepositoryImpl() {
        ContactRepository reContact = new ContactRepositoryImpl();
        contacts = ContactMapper.mapFrom(reContact.ListAllContacts());

        List<Contact> clients = Arrays.asList(new Contact("Li", "Avenida sur 25 ", 32222222L),
                new Contact("Juan", "Centro mayor 38", 4321256L));
    }

    @Override
    public List<ContactDto> ListAllContacts() {
        return ContactMapper.mapFromDto(contacts);
    }
}
