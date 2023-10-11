package com.example.conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    private EditText numero_1;
    private Button btnAdd;
    private TextView Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero_1=findViewById(R.id.num1);
        btnAdd=findViewById(R.id.btnAdd);
        Result =findViewById(R.id.Result);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1=Float.parseFloat(numero_1.getText().toString());
                float res=n1*3.28084F;
                Result.setText("El resultado: "+res+"ft");
               }
        });
    }
}