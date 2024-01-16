package anggytriputra.restful.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anggytriputra.restful.entity.Contact;
import anggytriputra.restful.entity.User;
import anggytriputra.restful.model.ContactResponse;
import anggytriputra.restful.model.CreateContactRequest;
import anggytriputra.restful.repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ValidationService validationService;

    // user ya siapa yang sedang login
    @Transactional
    public ContactResponse create(User user, CreateContactRequest request) {

        // validation dulu
        validationService.validate(request);

        Contact contact = new Contact();
        contact.setId(UUID.randomUUID().toString());
        contact.setFirstName(request.getFisrtName());
        contact.setLastName(request.getLastName());
        contact.setEmail(request.getEmail());
        contact.setPhone(request.getPhone());
        contact.setUser(user);

        contactRepository.save(contact);
        
        return ContactResponse.builder()
                .id(contact.getId())
                .fisrtName(contact.getFirstName())
                .lastName(contact.getLastName())
                .email(contact.getEmail())
                .phone(contact.getPhone())
                .build();
        
    }
}
