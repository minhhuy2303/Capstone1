package com.example.capstone1.service.impl.account;

import com.example.capstone1.model.Account;
import com.example.capstone1.model.AccountRole;
import com.example.capstone1.model.Role;
import com.example.capstone1.repository.account.IAccountRepository;
import com.example.capstone1.repository.account.IAcountRoleRepository;
import com.example.capstone1.repository.account.IRoleRepository;
import com.example.capstone1.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountRepository iAccountRepository;

    @Autowired
    private IAcountRoleRepository acountRoleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private IRoleRepository roleRepository;
    @Override
    public Optional<Account> findByUserName(String username) {
        return iAccountRepository.findById(username);
    }

    @Override
    public AccountRole save(Account account) {
        Role role = roleRepository.findById(2).get();
        AccountRole accountRole = new AccountRole();
        accountRole.setAccount(account);
        accountRole.setRole(role);
        account.setPassword(getEncoderPassword(account.getPassword()));
        iAccountRepository.save(account);
        return acountRoleRepository.save(accountRole);
    }


    public String getEncoderPassword(String password){
        return passwordEncoder.encode(password);
    }
}
