package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonText = findViewById(R.id.showTextButton);
        EditText textToEnter = findViewById(R.id.textToShow);
        TextView enteredText = findViewById(R.id.textEntered);
        TextView clickedText = findViewById(R.id.showClick);
        final Integer[] clickCount = {1};

        buttonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickedText.setText("Click count: " + clickCount[0]);
                if (textToEnter.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Text is empty!", Toast.LENGTH_SHORT).show();
                } else {
                    enteredText.setText(textToEnter.getText().toString());
                }
                clickCount[0] += 1;
            }
        });

    }
}