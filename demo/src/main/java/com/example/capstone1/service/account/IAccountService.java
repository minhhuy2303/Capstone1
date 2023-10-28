package com.example.capstone1.service.account;

import com.example.capstone1.model.Account;
import com.example.capstone1.model.AccountRole;

import java.util.Optional;

public interface IAccountService {
    Optional<Account> findByUserName(String username);
    AccountRole save(Account account);
}
