package com.example.armstrongnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num;
    TextView res;
    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = findViewById(R.id.num);
        res = findViewById(R.id.res);
        add = findViewById(R.id.btn);
        add.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int n = Integer.parseInt(num.getText().toString());
                                       int sum = 0, tamp, r;
                                       tamp = n;
                                       while (n>0) {
                                           r = n % 10;
                                           sum = sum + (r * r * r);
                                           n = n / 10;
                                       }
                                       if (sum==tamp) {
                                           res.setText("Armstrong : " + tamp);
                                       } else {
                                           res.setText("Not Armtsrong : " + tamp);
                                       }

                                   }
                               }
        );
    }
}