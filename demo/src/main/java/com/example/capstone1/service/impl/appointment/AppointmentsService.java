package com.example.capstone1.service.impl.appointment;

import com.example.capstone1.model.Appointments;
import com.example.capstone1.repository.appointments.IAppointmentsRepository;
import com.example.capstone1.service.appointments.IAppointmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentsService  implements IAppointmentsService {

    @Autowired
    private IAppointmentsRepository iAppointmentsRepository;
    @Override
    public void saveAppointments(Appointments appointments) {
        iAppointmentsRepository.save(appointments);
    }
}
