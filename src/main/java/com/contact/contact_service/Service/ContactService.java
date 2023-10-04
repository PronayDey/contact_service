package com.contact.contact_service.Service;

import com.contact.contact_service.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactOfUser(Long userId);
}
