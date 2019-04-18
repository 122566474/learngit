package com.biocar.controller;

import com.biocar.domain.Companies;
import com.biocar.service.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CompaniesController {
    @Autowired
    private CompaniesService companiesService;
    @RequestMapping(value = {"/page","/"})
    public String page(@RequestParam(name = "pageNow",required = false,defaultValue = "0")Integer pageNow,
                                @RequestParam(name = "pageSize",required = false,defaultValue = "2")Integer pageSize,
                                @RequestParam(name = "name",required = false,defaultValue = "")String name,
                                Map<String,Object> map){
        Page<Companies> pages = companiesService.getCompaniesPages(pageNow, pageSize, name);
        map.put("pages",pages);
        return "warehouses";
    }
}
