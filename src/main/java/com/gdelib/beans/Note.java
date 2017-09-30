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
public class Note {
    
    @Id
    long idNote; 

    public Note() {
    }

    public long getIdNote() {
        return idNote;
    }

    public void setIdNote(long idNote) {
        this.idNote = idNote;
    }

    @Override
    public String toString() {
        return "Note{" + "idNote=" + idNote + '}';
    }
    
    
    
}
