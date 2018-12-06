package com.example.matejapodravac.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.matejapodravac.myapplication.R;
import com.example.matejapodravac.myapplication.listeners.StudentInfoListener;

public class StudentInfoFragment extends Fragment {

    public static StudentInfoFragment newInstance() {

        Bundle args = new Bundle();

        StudentInfoFragment fragment = new StudentInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    EditText etSubject;
    EditText etProfesor;
    EditText etAkGodina;
    EditText etPredavanja;
    EditText etVjezbe;

    public StudentInfoListener studentInfoListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_info, container, false);
        etSubject = view.findViewById(R.id.etSubject);
        etSubject.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (studentInfoListener != null) {
                    studentInfoListener.setSubject(editable.toString());
                }
            }
        });
        etProfesor = view.findViewById(R.id.etProfesor);
        etProfesor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (studentInfoListener != null) {
                    studentInfoListener.setProfesor(editable.toString());
                }
            }
        });
        etAkGodina = view.findViewById(R.id.etAkGodina);
        etAkGodina.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (studentInfoListener != null) {
                    studentInfoListener.setAkGodina(editable.toString());
                }
            }
        });
        etPredavanja = view.findViewById(R.id.etPredavanja);
        etPredavanja.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (studentInfoListener != null) {
                    studentInfoListener.setPredavanja(editable.toString());
                }
            }
        });
        etVjezbe = view.findViewById(R.id.etVjezbe);
        etVjezbe.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (studentInfoListener != null) {
                    studentInfoListener.setVjezbe(editable.toString());
                }
            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        studentInfoListener = null;
    }
}
