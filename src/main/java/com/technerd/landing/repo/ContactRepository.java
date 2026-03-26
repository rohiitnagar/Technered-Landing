package com.technerd.landing.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.technerd.landing.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}