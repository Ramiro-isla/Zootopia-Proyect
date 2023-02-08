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
private Long id;
@Column (nullable = false, length = 50) 
 private String name;






public Animals(String name, String type, String family, String gender, int ingressDate) { //Necesitamos constructor bro?
    this.name = name;
    this.type = type;
    this.family = family;
    this.gender = gender;
    this.ingressDate = ingressDate;
}
private String type;
private String family;
private String gender;
private int ingressDate;


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
public int getIngressDate() {
    return ingressDate;
}
public void setIngressDate(int ingressDate) {
    this.ingressDate = ingressDate;
}

}