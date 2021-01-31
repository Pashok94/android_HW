package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText userNameET;
    CheckBox isElder18;
    Switch gender;
    ToggleButton userBet;
    Button start;

    private String userName;
    private Boolean isValidAge;
    private String userGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameET = findViewById(R.id.editTextTextPersonName);
        isElder18 = findViewById(R.id.checkBox);
        gender = findViewById(R.id.switch1);
        userBet = findViewById(R.id.toggleButton);
        start = findViewById(R.id.button);
    }

    public void onClickStart(View v){
    }
}