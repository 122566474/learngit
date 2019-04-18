package com.biocar.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "biocar_companies")
public class Companies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String code;
    private String address;
    private Date createtime;
    //公司和联系人是一对多的映射关系
    @OneToMany(mappedBy = "companies",fetch = FetchType.EAGER)
    private List<Contact> contacts;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
