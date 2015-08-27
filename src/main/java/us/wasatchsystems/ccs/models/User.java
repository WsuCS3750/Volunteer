package us.wasatchsystems.ccs.models;


import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by Jake on 7/12/2015.
 *
 *
 *
 * Used when a user signs up for the volunteer service.
 */


public class User {

    private final DateFormat iso8601Format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");

    private String firstName;
    private String lastName;
    private String dob;
    private String username;
    private String password;
    private String confirmPassword;
    private String adminStatus = "n";




    public User() {
    }

    public User(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }


    public User(String firstName, String lastName, String dob, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.username = username;
        this.password = password;
    }

    public User(String firstName, String lastName, String dob, String username, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


    public User(String firstName, String lastName, String dob, String username, String password, String confirmPassword, boolean adminStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        if(adminStatus) {
            this.adminStatus = "y";
        }
        else {
            this.adminStatus = "n";
        }
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




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public boolean isAdminStatus() {
        if(this.adminStatus.contains("y")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setAdminStatus(boolean adminStatus) {
        if(adminStatus) {
            this.adminStatus = "y";
        }
        else {
            this.adminStatus = "n";
        }
    }

    public String getAdminStatus() {
        return this.adminStatus;
    }


    //    @Override
//    public String toString() {
//        return "User{" +
//                "dob='" + dob + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", firstName='" + firstName + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "User{" +
                "confirmPassword='" + confirmPassword + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", dob='" + dob + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
