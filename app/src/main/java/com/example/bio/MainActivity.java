package com.example.bio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button doneBtn;
    private EditText enterHobbies;
    private TextView hobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doneBtn = findViewById(R.id.doneButton);
        enterHobbies = findViewById(R.id.enterHobbies);
        hobbies = findViewById(R.id.hobbies);
    }

    public void addHobbies(View view) {
        hobbies.setText(String.format("Hobbies: %s", enterHobbies.getText().toString().trim()));
        hobbies.setVisibility(View.VISIBLE);

        //Hide Keyboard

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

    }
}