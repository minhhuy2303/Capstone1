package com.example.capstone1.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class VideoCall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private Date date;
    private Boolean callStatus;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "id_patients")
    private Patients patients;

    public VideoCall() {
    }

    public VideoCall(Integer id, Date date, Boolean callStatus, Doctor doctor, Patients patients) {
        this.id = id;
        this.date = date;
        this.callStatus = callStatus;
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

    public Boolean getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(Boolean callStatus) {
        this.callStatus = callStatus;
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
