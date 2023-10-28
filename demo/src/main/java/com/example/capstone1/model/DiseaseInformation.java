package com.example.capstone1.model;

import javax.persistence.*;

@Entity
public class DiseaseInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String signal1;
    private String symptom;
    private String reason;
    private String prevent;
    private String image;

    public DiseaseInformation() {
    }

    public DiseaseInformation(Integer id, String name, String signal1, String symptom, String reason, String prevent, String image) {
        this.id = id;
        this.name = name;
        this.signal1 = signal1;
        this.symptom = symptom;
        this.reason = reason;
        this.prevent = prevent;
        this.image = image;
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

    public String getSignal1() {
        return signal1;
    }

    public void setSignal1(String signal1) {
        this.signal1 = signal1;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPrevent() {
        return prevent;
    }

    public void setPrevent(String prevent) {
        this.prevent = prevent;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}