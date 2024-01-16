package anggytriputra.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import anggytriputra.restful.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, String>{
    
}
