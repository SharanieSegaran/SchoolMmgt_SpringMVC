/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.schoolmmgt_springmvc;

/**
 *
 * @author ASUS
 */

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    
        @Id
        private int id;
        private String name;
        private String email;
        @DateTimeFormat(pattern="yyyy-MM-dd")
        private Date dateofbirth;
        private String gender;
        private int contact;
        private String intake;

        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }


@Override
    public String toString() {
        return "ID: " + id + ", NAME: " + name + ", EMAIL: " + email + "DATE OF BIRTH: " + dateofbirth + ", GENDER: " + gender + ", CONTACT: " + contact + ", INTAKE: " + intake;
    }
	 
	
private List<String> subjects = new ArrayList<String>();
            
    
}
