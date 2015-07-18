package us.wasatchsystems.ccs.models;

import java.util.Date;

/**
 * Created by Jake on 7/12/2015.
 *
 *
 */


public class Volunteer {

    private String firstName;
    private String lastName;
    private String dob;


    public Volunteer() {
    }

    public Volunteer(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }




}
