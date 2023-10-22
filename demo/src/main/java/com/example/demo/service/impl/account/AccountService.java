package com.example.demo.service.impl.account;

import com.example.demo.model.Account;
import com.example.demo.model.AccountRole;
import com.example.demo.model.Role;
import com.example.demo.repository.account.IAccountRepository;
import com.example.demo.repository.account.IAcountRoleRepository;
import com.example.demo.repository.account.IRoleRepository;
import com.example.demo.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

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
