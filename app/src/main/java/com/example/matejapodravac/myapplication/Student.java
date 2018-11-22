package com.example.matejapodravac.myapplication;

public class Student {
    public String sIme;
    public String sPrezime;

    public Student(String sIme, String sPrezime)
    {
        this.sIme = sIme;
        this.sPrezime = sPrezime;
    }

    public String getsIme() {
        return sIme;
    }

    public String getsPrezime() {
        return sPrezime;
    }
}
