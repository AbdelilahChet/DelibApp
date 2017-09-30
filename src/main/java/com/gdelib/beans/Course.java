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
public class Course {

    @Id
    long id ; 
    
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Course() {
    }

    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", courseName=" + courseName + '}';
    }
    
    
    
}
