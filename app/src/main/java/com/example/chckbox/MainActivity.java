package com.example.chckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;
    Button button;
    String ch1, ch2, ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        button = findViewById(R.id.button);

    // Your Data Convert to String Format

        ch1 = c1.getText().toString();
        ch2 = c2.getText().toString();
        ch3 = c3.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c1.isChecked() & c2.isChecked() & c3.isChecked()){
                    Toast.makeText(MainActivity.this, "all", Toast.LENGTH_SHORT).show();
                }
                else if (c1.isChecked()){
                    Toast.makeText(MainActivity.this, ch1, Toast.LENGTH_SHORT).show();
                } else if (c2.isChecked()){
                    Toast.makeText(MainActivity.this, ch2, Toast.LENGTH_SHORT).show();
                } else if (c3.isChecked()){
                    Toast.makeText(MainActivity.this, ch3, Toast.LENGTH_SHORT).show();
                }


            }
        });



    }
}