package com.biocar.domain;

import javax.persistence.*;

@Entity
@Table(name = "biocar_contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String telephone;
    private String email;
    private Integer gender;
    //多个联系人对应一个公司（一对多的映射关系）
    @ManyToOne
    @JoinColumn(name = "companies_id")
    private Companies companies;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Companies getCompanies() {
        return companies;
    }

    public void setCompanies(Companies companies) {
        this.companies = companies;
    }
}
