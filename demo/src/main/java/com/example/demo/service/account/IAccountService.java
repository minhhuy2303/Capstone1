package com.example.demo.service.account;

import com.example.demo.model.Account;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IAccountService {
    Optional<Account> findByUserName(String username);
    void save(Account account);
}
