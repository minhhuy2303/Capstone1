package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String title1;
    private String descriptionTitle1;
    private String image1;
    private String title2;
    private String descriptionTitle2;
    private String image2;
    private String title3;
    private String descriptionTitle3;
    private String image3;
    private String title4;
    private String descriptionTitle4;
    private String image4;
    private String title5;
    private String descriptionTitle5;
    private String image5;
    private String title6;
    private String descriptionTitle6;
    private String image6;
    private String image;

    @ManyToOne
    @JoinColumn(name = "id_topic")
    private Topic topic;

    public Posts() {
    }

    public Posts(Integer id, String name, String description, String title1, String descriptionTitle1, String image1, String title2, String descriptionTitle2, String image2, String title3, String descriptionTitle3, String image3, String title4, String descriptionTitle4, String image4, String title5, String descriptionTitle5, String image5, String title6, String descriptionTitle6, String image6, String image, Topic topic) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.title1 = title1;
        this.descriptionTitle1 = descriptionTitle1;
        this.image1 = image1;
        this.title2 = title2;
        this.descriptionTitle2 = descriptionTitle2;
        this.image2 = image2;
        this.title3 = title3;
        this.descriptionTitle3 = descriptionTitle3;
        this.image3 = image3;
        this.title4 = title4;
        this.descriptionTitle4 = descriptionTitle4;
        this.image4 = image4;
        this.title5 = title5;
        this.descriptionTitle5 = descriptionTitle5;
        this.image5 = image5;
        this.title6 = title6;
        this.descriptionTitle6 = descriptionTitle6;
        this.image6 = image6;
        this.image = image;
        this.topic = topic;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getDescriptionTitle1() {
        return descriptionTitle1;
    }

    public void setDescriptionTitle1(String descriptionTitle1) {
        this.descriptionTitle1 = descriptionTitle1;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getDescriptionTitle2() {
        return descriptionTitle2;
    }

    public void setDescriptionTitle2(String descriptionTitle2) {
        this.descriptionTitle2 = descriptionTitle2;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getDescriptionTitle3() {
        return descriptionTitle3;
    }

    public void setDescriptionTitle3(String descriptionTitle3) {
        this.descriptionTitle3 = descriptionTitle3;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getTitle4() {
        return title4;
    }

    public void setTitle4(String title4) {
        this.title4 = title4;
    }

    public String getDescriptionTitle4() {
        return descriptionTitle4;
    }

    public void setDescriptionTitle4(String descriptionTitle4) {
        this.descriptionTitle4 = descriptionTitle4;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getTitle5() {
        return title5;
    }

    public void setTitle5(String title5) {
        this.title5 = title5;
    }

    public String getDescriptionTitle5() {
        return descriptionTitle5;
    }

    public void setDescriptionTitle5(String descriptionTitle5) {
        this.descriptionTitle5 = descriptionTitle5;
    }

    public String getImage5() {
        return image5;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }

    public String getTitle6() {
        return title6;
    }

    public void setTitle6(String title6) {
        this.title6 = title6;
    }

    public String getDescriptionTitle6() {
        return descriptionTitle6;
    }

    public void setDescriptionTitle6(String descriptionTitle6) {
        this.descriptionTitle6 = descriptionTitle6;
    }

    public String getImage6() {
        return image6;
    }

    public void setImage6(String image6) {
        this.image6 = image6;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
