package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView welcoming = findViewById(R.id.welcoming);
        EditText inputHeight = findViewById(R.id.inputHeight);
        EditText inputWeight = findViewById(R.id.inputWeight);
        Button Calculate = findViewById(R.id.Calculate);
        TextView Result = findViewById(R.id.Result);
        ImageView image = findViewById(R.id.image);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Height = Double.parseDouble(inputHeight.getText().toString());
                double Weight = Double.parseDouble(inputWeight.getText().toString());

                double BMI = Weight/((Height/100)*(Height/100));

                if(BMI>25){
                    Result.setText("You are Overweight!");
                    image.setImageResource(R.drawable.overweight);

                } else if (BMI<18) {
                    Result.setText("You are Underweight!");
                    image.setImageResource(R.drawable.underweight);
                }
                else {
                    Result.setText("You are Healthy!");
                    image.setImageResource(R.drawable.fit);
                }
            }
        });

    }
}