
package com.dizimo.spring.ajax.dao;

import com.dizimo.spring.ajax.entity.Contact;
import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ContacDao implements IContactDao<Contact>{
    
    
    @Autowired
    private SessionFactory factory;

    @Override
    public void save(Contact contact) {
        factory.getCurrentSession().save(contact);
    }

    @Override
    public List<Contact> findAll() {
        return factory.getCurrentSession().createCriteria(Contact.class).list();
        }

    @Override

    public Contact findByName(String firstName, String lastName) {
        return (Contact) factory.getCurrentSession().createCriteria(Contact.class)
                .add(Restrictions.eq("firstName", firstName).ignoreCase())
                .add(Restrictions.eq("lastName", lastName).ignoreCase())
                .uniqueResult();
    }

    @Override
    public List<Contact> findByForstName(String firstName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
