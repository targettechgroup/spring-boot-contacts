package com.targettech.springboot.crud.controllers;

import javax.validation.Valid;

import com.targettech.springboot.crud.entities.Contact;
import com.targettech.springboot.crud.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GetMapping("/")
    public String showContacts(Model model) {
        model.addAttribute("contacts", contactRepository.findAll());
        return "index";
    }
    
    @GetMapping("/addContact")
    public String showAddContactForm(Contact contact) {
        return "add-contact";
    }
    
    @PostMapping("/addContact")
    public String addContact(@Valid Contact contact, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-contact";
        }
        
        contactRepository.save(contact);
        model.addAttribute("contacts", contactRepository.findAll());
        return "index";
    }
    
    @GetMapping("/updateContact/{id}")
    public String showUpdateContactForm(@PathVariable("id") long id, Model model) {
        Contact contact = contactRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid contact Id:" + id));
        model.addAttribute("contact", contact);
        return "update-contact";
    }
    
    @PostMapping("/updateContact/{id}")
    public String updateContact(@PathVariable("id") long id, @Valid Contact contact, BindingResult result, Model model) {
        if (result.hasErrors()) {
            contact.setId(id);
            return "update-contact";
        }
        
        contactRepository.save(contact);
        model.addAttribute("contacts", contactRepository.findAll());
        return "index";
    }
    
    @GetMapping("/deleteContact/{id}")
    public String deleteContact(@PathVariable("id") long id, Model model) {
        Contact contact = contactRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid contact Id:" + id));
        contactRepository.delete(contact);
        model.addAttribute("contacts", contactRepository.findAll());
        return "index";
    }
}
