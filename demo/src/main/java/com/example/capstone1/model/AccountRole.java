package com.example.capstone1.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class AccountRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "username")
    @NotNull
    private Account account;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @NotNull
    private Role role;

    private Boolean isDelete;

    public AccountRole() {
    }

    public AccountRole(Integer id, Account account, Role role, Boolean isDelete) {
        this.id = id;
        this.account = account;
        this.role = role;
        this.isDelete = isDelete;
    }

    public AccountRole(Account account, Role role, Boolean isDelete) {
        this.account = account;
        this.role = role;
        this.isDelete = isDelete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }
}
