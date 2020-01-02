package com.avborik28.petageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateButtonPressed(View buttonview) {
        EditText petBornTextField = findViewById(R.id.edtPetBorn);
        int petAge = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(petBornTextField.getText().toString());
        TextView petAgeTextView = findViewById(R.id.txtPetYearsOld);
        petAgeTextView.setText(petAge + "");

    }
}
