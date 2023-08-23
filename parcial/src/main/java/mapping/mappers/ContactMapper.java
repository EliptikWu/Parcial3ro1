package mapping.mappers;

import domain.models.Contact;
import mapping.dto.ContactDto;

import java.util.List;

public class ContactMapper {
    public static ContactDto mapFrom(Contact source){
        return new ContactDto(source.getName(),
                source.getDirection(),
                source.getTypeContactT());
    }

    public static Contact mapFrom(ContactDto source){
        return new Contact(source.name(),
                source.direction(),
                source.typeContactT());
    }

    public static List<Contact> mapFrom(List<ContactDto> source){
        return source.parallelStream()
                .map(ContactMapper::mapFrom)
                .toList();
    }
    public static List<ContactDto> mapFromDto(List<Contact> source){
        return source.parallelStream()
                .map(ContactMapper::mapFrom)
                .toList();
    }
}

