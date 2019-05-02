package org.umssdiplo.automationv01.core.input;

public class Employee {
    private String firstName;
    private String lastName;
    private String ci;
    private String gender;


    public Employee() {
        firstName = "Marco";
        lastName = "Herrera";
        ci = "1234567";
        gender = "MALE";
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

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
