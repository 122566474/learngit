package com.biocar.service;

import com.biocar.domain.Companies;
import org.springframework.data.domain.Page;

public interface CompaniesService {
    /**
     * 根据姓名模糊查询后分页
     * @param page
     * @param pageSize
     * @param name
     * @return
     */
    Page<Companies> getCompaniesPages(Integer page,Integer pageSize,String name);

    /**
     * 新增
     * @param companies
     */
    void saveCompanies(Companies companies);
}
