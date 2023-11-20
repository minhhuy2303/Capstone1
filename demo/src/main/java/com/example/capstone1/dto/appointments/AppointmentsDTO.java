package com.example.capstone1.dto.appointments;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AppointmentsDTO {
    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private Date date;
    private String time;
    private Integer isEnable;
    private String username;

    public AppointmentsDTO() {
    }

    public AppointmentsDTO(Date date, String time, Integer isEnable, String username) {
        this.date = date;
        this.time = time;
        this.isEnable = isEnable;
        this.username = username;
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

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
