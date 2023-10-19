package com.example.demo.service.impl.account;

import com.example.demo.model.Account;
import com.example.demo.repository.account.IAccountRepository;
import com.example.demo.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AccountService implements IAccountService {

    private IAccountRepository iAccountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public Optional<Account> findByUserName(String username) {
        return iAccountRepository.findById(username);
    }

    @Override
    public void save(Account account) {
        iAccountRepository.save(account);
    }


    public String getEncoderPassword(String password){
        return passwordEncoder.encode(password);
    }
}
