package com.biocar.repository;

import com.biocar.BiocarCrm5ApplicationTests;
import com.biocar.domain.Companies;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class CompaniesRepositoryTest extends BiocarCrm5ApplicationTests {
    @Autowired
    private CompaniesRepository companiesRepository;
    @Test
    public void getpages(){
        Pageable pageable = new PageRequest(0,2);
        Page<Companies> page = companiesRepository.findCompaniesByNameLike("%", pageable);
        System.out.println(page.getContent());
    }

    @Test
    public void getById(){
        Companies companies = companiesRepository.findCompaniesById(6);
        System.out.println(companies);
    }
}
