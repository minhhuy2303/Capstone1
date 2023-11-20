package com.example.capstone1.service.impl.user;

import com.example.capstone1.model.Patients;
import com.example.capstone1.repository.user.IUserRepository;
import com.example.capstone1.service.user.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserservice {
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public void addUser(Patients patients) {
        iUserRepository.save(patients);
    }
}
