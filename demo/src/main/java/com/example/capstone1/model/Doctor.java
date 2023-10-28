package com.example.capstone1.model;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private Date date;
    private Integer gender;
    private String address_1;
    private String address_2;
    private String phoneNumber;
    private String email;
    private String image;

    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;

    @OneToOne
    @JoinColumn(name = "username")
    @NotNull
    private Account account;

    public Doctor() {
    }

    public Doctor(Integer id, String name, Date date, Integer gender, String address_1, String address_2, String phoneNumber, String email, String image, Specialist specialist, Account account) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.address_1 = address_1;
        this.address_2 = address_2;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.image = image;
        this.specialist = specialist;
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
