package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private Date date;
    private String time;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "id_patients")
    private Patients patients;

    public Appointments() {
    }

    public Appointments(Integer id, Date date, String time, Doctor doctor, Patients patients) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.doctor = doctor;
        this.patients = patients;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

}
