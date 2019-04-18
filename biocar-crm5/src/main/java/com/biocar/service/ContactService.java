package com.biocar.service;

import com.biocar.domain.Contact;

import java.util.List;

public interface ContactService {
    /**
     * 根据公司id查询联系人
     * @param companiesId
     * @return
     */
    public List<Contact> findAllByCompaniesId(Integer companiesId);
}
