package com.contact.contact_service.Service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{
    List<Contact> list=List.of(new Contact(1L,777l,"Amit","amit@gmail.com"),
            new Contact(2L,555l,"Amar","amar@gmail.com"),
            new Contact(3L,111l,"shubh","shubh@gmail.com"),
            new Contact(4L,777l,"Amita","amita@gmail.com"));
    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(e->e.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
