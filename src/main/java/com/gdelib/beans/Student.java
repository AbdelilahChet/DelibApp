/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdelib.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author abdel-ilah
 */
@Entity 
public class Student {

    @Id
    long idStudent; 
    
    String idInscription ; 
    String firstName; 
    String lastName; 
    String birthday; 

    public Student() {
    }

    public Student(String idInscription, String firstName, String lastName, String birthday) {
        this.idInscription = idInscription;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    
    public long getIdStudent() {
        return idStudent;
    }

    public String getIdInscription() {
        return idInscription;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setIdStudent(long idStudent) {
        this.idStudent = idStudent;
    }

    public void setIdInscription(String idInscription) {
        this.idInscription = idInscription;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" + "idStudent=" + idStudent + ", idInscription=" + idInscription + ", firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + '}';
    }
    
    
    
    
    
}
