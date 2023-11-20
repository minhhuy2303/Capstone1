package com.example.capstone1.controller;

import com.example.capstone1.dto.appointments.AppointmentsDTO;
import com.example.capstone1.model.Appointments;
import com.example.capstone1.model.Doctor;
import com.example.capstone1.model.Time;
import com.example.capstone1.service.appointments.IAppointmentsService;
import com.example.capstone1.service.doctor.IDoctorService;
import com.example.capstone1.service.time.ITimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private IAppointmentsService iAppointmentsService;
    @Autowired
    private ITimeService timeService;
    @Autowired
    private IDoctorService iDoctorService;
    @GetMapping("/getAllTime")
    public List<Time> getAllTime(){
        return timeService.getAllTime();
    }

    @PostMapping("/addDoctor")
    public void addDoctor(@RequestBody Doctor doctor){
        iDoctorService.addDoctor(doctor);
    }

    @PostMapping("/updateSchedule")
    public void updateSchedule(@RequestBody AppointmentsDTO appointmentsDTO){
        Doctor doctor = iDoctorService.findDoctor(appointmentsDTO.getUsername());
        Appointments appointments = new Appointments();
        appointments.setDate(appointmentsDTO.getDate());
        appointments.setTime(appointmentsDTO.getTime());
        appointments.setDoctor(doctor);
        iAppointmentsService.saveAppointments(appointments);
    }
}
