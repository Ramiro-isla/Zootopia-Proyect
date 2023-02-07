package com.zootopiaproyect.zootopiaproyect.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Animals")

public class Animals {
    
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;




private String name;

public Animals(String name, String type, String family, String gender, Date ingressDate) {
    this.name = name;
    this.type = type;
    this.family = family;
    this.gender = gender;
    this.ingressDate = ingressDate;
}
private String type;
private String family;
private String gender;
private Date ingressDate;


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getType() {
    return type;
}
public void setType(String type) {
    this.type = type;
}
public String getFamily() {
    return family;
}
public void setFamily(String family) {
    this.family = family;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
public Date getIngressDate() {
    return ingressDate;
}
public void setIngressDate(Date ingressDate) {
    this.ingressDate = ingressDate;
}

}
