package service.impl;

import domain.enums.ContactL;
import mapping.dto.ContactDto;
import service.ContactService;

import java.util.List;

public class ContactServiceImpl implements ContactService {

    /**public List<ContactDto> ListAll() {
        return contacts.stream()
                    //.filter(ct -> ct.equals(ContactL.FAMILY)).toList();
        }**/
    
    @Override
    public List<ContactDto> listAllContact() {
        return null;
    }
}
