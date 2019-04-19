package com.biocar.service.impl;

import com.biocar.domain.Companies;
import com.biocar.repository.CompaniesRepository;
import com.biocar.service.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;

@Service
public class CompaniesServiceImpl implements CompaniesService {
    @Autowired
    private CompaniesRepository companiesRepository;
    @Override
    public Page<Companies> getCompaniesPages(Integer page, Integer pageSize, String name) {
        Pageable pageable = new PageRequest(page,pageSize);
        if(StringUtils.isEmpty(name)){
            name = "%";
        }
        Page<Companies> pages = companiesRepository.findCompaniesByNameLike("%" + name + "%", pageable);
        return pages;
    }

    @Override
    public void saveCompanies(Companies companies) {
        companiesRepository.save(companies);
    }
}
