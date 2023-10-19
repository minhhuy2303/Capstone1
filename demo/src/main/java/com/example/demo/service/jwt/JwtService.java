package com.example.demo.service.jwt;

import com.example.demo.model.Account;
import com.example.demo.model.JwtRequest;
import com.example.demo.model.JwtResponse;
import com.example.demo.repository.account.IAccountRepository;
import com.example.demo.service.account.IAccountService;
import com.example.demo.util.JwtUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class JwtService implements UserDetailsService {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private IAccountRepository iAccountRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    public JwtResponse createJwtToken(JwtRequest jwtRequest) throws Exception{
        String userName = jwtRequest.getUserName();
        String userPassword =  jwtRequest.getUserPassword();
        authenticate(userName,userPassword);
        final UserDetails userDetails = loadUserByUsername(userName);
        String newGenerateToken = jwtUtil.generateToken(userDetails);
       Account account =  iAccountRepository.findById(userName).get();
       return new JwtResponse(account,newGenerateToken);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
          Account account = iAccountRepository.findById(username).orElse(null);
        if(account!=null){
            System.out.println("aaa"+new User(account.getUsername(),account.getPassword(),
                    getAuthorities(account)));

            return new User(account.getUsername(),account.getPassword(),
                    getAuthorities(account));

        }else {
            throw  new UsernameNotFoundException("Username is not valid");
        }
    }
//
//    private  List<GrantedAuthority> getAuthorities(Account account){
//        List<GrantedAuthority> authorities = account.getAccountRoleList().stream()
//                .map(role -> new SimpleGrantedAuthority(role.getRole().getName()))
//                .collect(Collectors.toList());
//        System.out.println("Role:"+authorities);
//        return  authorities;
//    }
    private  Set<GrantedAuthority> getAuthorities(Account account){
        Set<GrantedAuthority> authorities = new HashSet<>();
        account.getAccountRoleList().forEach(role->{
            authorities.add(new SimpleGrantedAuthority(role.getRole().getName()));
        });
        System.out.println("Role:"+authorities);
        return  authorities;
    }

    private void authenticate(String userName,String userPassword) throws Exception{
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName,userPassword));
        }catch (DisabledException e){
            throw  new Exception("Use is disable");

        }catch (BadCredentialsException e){
            throw  new Exception("Bad credentials from user");
        }

    }
}
