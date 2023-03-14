package com.example.viikko8;

import static java.sql.Types.NULL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText number1;
    private EditText number2;
    private TextView Output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.editTextNumber1);
        number2 = findViewById(R.id.editTextNumber2);

        Output = findViewById(R.id.textViewOutput);

    }

    public void Addition(View view) {
        if ((number1.getText().toString().length() == 0) || (number2.getText().toString().length() == 0)) {
            Toast.makeText(this, "Syötä molempiin kenttiin numero", Toast.LENGTH_LONG).show();
        }
        else {
            int result = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
            Output.setText(String.valueOf(result));
        }
    }

    public void Subtraction(View view) {
        if ((number1.getText().toString().length() == 0) || (number2.getText().toString().length() == 0)) {
            Toast.makeText(this, "Syötä molempiin kenttiin numero", Toast.LENGTH_LONG).show();
        }
        else {
            int result = Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());
            Output.setText(String.valueOf(result));
        }
    }

    public void Multiplication(View view) {
        if ((number1.getText().toString().length() == 0) || (number2.getText().toString().length() == 0)) {
            Toast.makeText(this, "Syötä molempiin kenttiin numero", Toast.LENGTH_LONG).show();
        }
        else {
            int result = Integer.parseInt(number1.getText().toString()) * Integer.parseInt(number2.getText().toString());
            Output.setText(String.valueOf(result));
        }
    }

    public void Division(View view) {
        if ((number1.getText().toString().length() == 0) || (number2.getText().toString().length() == 0)) {
            Toast.makeText(this, "Syötä molempiin kenttiin numero", Toast.LENGTH_LONG).show();
        }
        else {
            float result = (float) Integer.parseInt(number1.getText().toString()) / Integer.parseInt(number2.getText().toString());
            Output.setText(String.valueOf(result));
        }
    }

}
