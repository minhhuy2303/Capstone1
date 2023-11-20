package com.example.capstone1.service.impl.doctor;

import com.example.capstone1.model.Doctor;
import com.example.capstone1.repository.doctor.IDoctorRepository;
import com.example.capstone1.service.doctor.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService  implements IDoctorService {
    @Autowired
    private IDoctorRepository iDoctorRepository;
    @Override
    public void addDoctor(Doctor doctor) {
        iDoctorRepository.save(doctor);
    }

    @Override
    public Doctor findDoctor(String username) {
        return iDoctorRepository.findDoctor(username);
    }
}
