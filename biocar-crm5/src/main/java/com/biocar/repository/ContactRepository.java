package com.biocar.repository;

import com.biocar.domain.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer> {
    /**
     * 根据公司id查询联系人
     * @param companiesId
     * @return
     */
    List<Contact> findContactsByCompaniesId(Integer companiesId);
}
