
package com.dizimo.spring.ajax.dao;

import com.dizimo.spring.ajax.entity.Contact;
import java.io.Serializable;
import java.util.List;

public interface IContactDao <T extends Serializable>{
    
    void save(Contact contact);
    
    List<Contact> findAll();
    
    Contact findByName(String firstName, String lastName);
    
    List<Contact> findByForstName(String firstName);
    
}
