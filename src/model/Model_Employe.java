/*
* File: Model_Employe.java
* Author: Szekeres András
* Copyright: 2023 Szekeres András
* Group: Szoft I/II
* Date: 2023-10-05
* Github: https://github.com/UVUVUV/
* Licenc: GNU GPL
*/


package model;

public class Model_Employe {

    private String name;
    private String city;
    private String streat;
    private String birth;
    private String salary;

    public Model_Employe(String name, String city, String streat, String birth, String salary) {
        this.name = name;
        this.city = city;
        this.streat = streat;
        this.birth = birth;
        this.salary = salary;
    }

    public Model_Employe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreat() {
        return streat;
    }

    public void setStreat(String streat) {
        this.streat = streat;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    


}
