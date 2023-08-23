package Repository;

import mapping.dto.ContactDto;

import java.util.List;

public interface ContactRepository {

    List<ContactDto> ListAllContacts();
}
