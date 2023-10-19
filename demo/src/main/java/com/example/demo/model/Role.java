package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Column(columnDefinition = ("varchar(255)"))
    private String name;
    private Boolean isDelete;

    @OneToMany(mappedBy = "role",fetch = FetchType.EAGER)
    @JsonBackReference
    private Set<AccountRole> accountRoleList;

    public Role() {
    }

    public Role(Integer id, @NotNull String name, Boolean isDelete) {
        this.id = id;
        this.name = name;
        this.isDelete = isDelete;
    }

    public Role(Integer id, String name, Boolean isDelete, Set<AccountRole> accountRoleList) {
        this.id = id;
        this.name = name;
        this.isDelete = isDelete;
        this.accountRoleList = accountRoleList;
    }

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

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Set<AccountRole> getAccountRoleList() {
        return accountRoleList;
    }

    public void setAccountRoleList(Set<AccountRole> accountRoleList) {
        this.accountRoleList = accountRoleList;
    }
}
