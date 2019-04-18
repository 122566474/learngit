package com.biocar.service.impl;

import com.biocar.domain.Contact;
import com.biocar.repository.ContactRepository;
import com.biocar.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Override
    public List<Contact> findAllByCompaniesId(Integer companiesId) {
        List<Contact> contacts = contactRepository.findContactsByCompaniesId(companiesId);
        return contacts;
    }
}
