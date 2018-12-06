package com.example.matejapodravac.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.matejapodravac.myapplication.fragment.PersonalInfoFragment;
import com.example.matejapodravac.myapplication.fragment.StudentInfoFragment;
import com.example.matejapodravac.myapplication.fragment.SummaryFragment;
import com.example.matejapodravac.myapplication.listeners.AcademicYearListener;
import com.example.matejapodravac.myapplication.listeners.BirthDateListener;
import com.example.matejapodravac.myapplication.listeners.LastNameListener;
import com.example.matejapodravac.myapplication.listeners.NameListener;
import com.example.matejapodravac.myapplication.listeners.PredavanjaListener;
import com.example.matejapodravac.myapplication.listeners.ProfesorListener;
import com.example.matejapodravac.myapplication.listeners.SubjectListener;
import com.example.matejapodravac.myapplication.listeners.SummaryInfoDataSource;
import com.example.matejapodravac.myapplication.listeners.VjezbeListener;
import com.example.matejapodravac.myapplication.models.Person;
import com.example.matejapodravac.myapplication.models.Subject;

import java.util.List;

public class FragmentAdapter extends FragmentPagerAdapter implements NameListener, LastNameListener, BirthDateListener, SubjectListener, ProfesorListener, AcademicYearListener, PredavanjaListener, VjezbeListener, SummaryInfoDataSource {
    private String name = "";
    private String lastName = "";
    private String birthDate = "";
    private String subject = "";
    private String profesor = "";
    private String akGodina = "";
    private String predavanja = "";
    private String vjezbe = "";

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = PersonalInfoFragment.newInstance();
                ((PersonalInfoFragment)fragment).nameListener = this;
                ((PersonalInfoFragment)fragment).lastNameListener = this;
                ((PersonalInfoFragment)fragment).birthDateListener = this;
                break;
            case 1:
                fragment = StudentInfoFragment.newInstance();
                ((StudentInfoFragment)fragment).subjectListener = this;
                ((StudentInfoFragment)fragment).profesorListener = this;
                ((StudentInfoFragment)fragment).academicYearListener = this;
                ((StudentInfoFragment)fragment).predavanjaListener = this;
                ((StudentInfoFragment)fragment).vjezbeListener = this;
                break;
            default:
                fragment = SummaryFragment.newInstance();
                ((SummaryFragment) fragment).dataSource = this;
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    @Override
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public Person getPerson() {
        return new Person(name, lastName, birthDate);
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public void setAkGodina(String akGodina) {
        this.akGodina = akGodina;
    }

    @Override
    public void setPredavanja(String predavanja) {
        this.predavanja = predavanja;
    }

    @Override
    public void setVjezbe(String vjezbe) {
        this.vjezbe = vjezbe;
    }

    @Override
    public Subject getSubject() {
        return new Subject(subject, profesor, akGodina, predavanja, vjezbe);
    }
}
