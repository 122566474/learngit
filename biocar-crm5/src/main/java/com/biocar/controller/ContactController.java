package com.biocar.controller;

import com.biocar.domain.Contact;
import com.biocar.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;
    @RequestMapping("/show")
    public String findContactsByCompaniesId(@RequestParam Integer id,
                                                   Map<String,Object> map){
        List<Contact> list = contactService.findAllByCompaniesId(id);
        map.put("list",list);
        return "show";
    }
}
