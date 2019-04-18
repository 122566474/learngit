package com.biocar.repository;

import com.biocar.domain.Companies;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompaniesRepository extends JpaRepository<Companies,Integer> {
    /**
     * 根据公司名称模糊查询后分页
     * @param name
     * @param pageable
     * @return
     */
     Page<Companies> findCompaniesByNameLike(String name, Pageable pageable);

     Companies findCompaniesById(Integer id);


}
