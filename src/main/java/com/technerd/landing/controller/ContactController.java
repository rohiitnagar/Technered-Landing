package com.technerd.landing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.technerd.landing.entity.Contact;
import com.technerd.landing.service.ContactService;

@Controller
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping("/contact")
    public String submit(Contact contact) {
        service.save(contact);
        return "redirect:/?success";
    }
}

//Addwed
