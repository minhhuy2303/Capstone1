package com.example.capstone1.repository.appointments;

import com.example.capstone1.model.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentsRepository extends JpaRepository<Appointments,Integer> {
}
