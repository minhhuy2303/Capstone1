package com.example.demo.service.account;

import com.example.demo.model.Account;
import com.example.demo.model.AccountRole;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IAccountService {
    Optional<Account> findByUserName(String username);
    AccountRole save(Account account);
}
