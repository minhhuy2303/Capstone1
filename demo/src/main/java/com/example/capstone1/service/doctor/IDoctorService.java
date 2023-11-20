package com.example.capstone1.service.doctor;


import com.example.capstone1.model.Doctor;

public interface IDoctorService {
    void addDoctor(Doctor doctor);
    Doctor findDoctor(String username);
}
