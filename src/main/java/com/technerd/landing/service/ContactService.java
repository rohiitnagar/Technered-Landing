package com.technerd.landing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technerd.landing.entity.Contact;
import com.technerd.landing.repo.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repo;

    public void save(Contact contact) {
        repo.save(contact);
    }
}