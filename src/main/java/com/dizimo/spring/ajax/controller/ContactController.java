
package com.dizimo.spring.ajax.controller;

import com.dizimo.spring.ajax.dao.IContactDao;
import com.dizimo.spring.ajax.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("contact")
public class ContactController {
    
    @Autowired
    private IContactDao dao;
    
    @RequestMapping("/home")
    public ModelAndView home(ModelMap model){
    model.put("contacts", dao.findAll());
    return new ModelAndView("contact", model);
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Contact saveContact(Contact contact){
    dao.save(contact);
    return contact;
    }

}
