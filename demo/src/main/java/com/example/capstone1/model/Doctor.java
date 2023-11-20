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
    private String houseAddress;
    private String workAddress;
    private String phoneNumber;
    private String strengths;
    private String email;
    private String avatar;
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

    public Doctor(Integer id, String name, Date date, Integer gender, String houseAddress,
                  String workAddress, String phoneNumber, String strengths, String email, String avatar,
                  String image, Specialist specialist, Account account) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.houseAddress = houseAddress;
        this.workAddress = workAddress;
        this.phoneNumber = phoneNumber;
        this.strengths = strengths;
        this.email = email;
        this.avatar = avatar;
        this.image = image;
        this.specialist = specialist;
        this.account = account;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
}
