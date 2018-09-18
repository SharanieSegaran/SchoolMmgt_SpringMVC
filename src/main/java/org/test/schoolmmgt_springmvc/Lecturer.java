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
@NamedQuery(name="Lecturer.findAll", query="SELECT s FROM Lecturer s")
public class Lecturer implements Serializable {
    private static final long serialVersionUID = 1L;
    
        @Id
        private int lid;
        private String lname;
        private String ic;
        private String lgender;
        private int lcontact;
        private String lemail;
        private String lsubject;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getLgender() {
        return lgender;
    }

    public void setLgender(String lgender) {
        this.lgender = lgender;
    }

    public int getLcontact() {
        return lcontact;
    }

    public void setLcontact(int lcontact) {
        this.lcontact = lcontact;
    }

    public String getLemail() {
        return lemail;
    }

    public void setLemail(String lemail) {
        this.lemail = lemail;
    }

    public String getLsubject() {
        return lsubject;
    }

    public void setLsubject(String lsubject) {
        this.lsubject = lsubject;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
         

@Override
    public String toString() {
        return "LECTURER ID: " + lid + ", LECTURER NAME: " + lname + ", LECTURER IC NO: " + ic + "LECTURER GENDER: " + lgender + ", LECTURER CONTACT: " + lcontact + ", LECTURER EMAIL: " + lemail + ", SUBJECTS: " + lsubject;
    }
	 
	
private List<String> subjects = new ArrayList<String>();
            
    
}
