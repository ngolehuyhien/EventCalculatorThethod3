package com.example.admin.eventcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAddButton(View view) {
        EditText edtResult = (EditText) findViewById(R.id.edt_result);
        EditText numberA = (EditText) findViewById(R.id.input_a);
        EditText numberB = (EditText) findViewById(R.id.input_b);

        if(!numberA.getText().toString().trim().equals("") && !numberB.getText().toString().trim().equals(""))  {

            int a = Integer.parseInt(numberA.getText().toString());
            int b = Integer.parseInt(numberB.getText().toString());
            int sum = a + b;
            edtResult.setText(String.valueOf(sum));
        }
        else
        {
            Toast.makeText(this, "Vui lòng nhập số vào!", Toast.LENGTH_SHORT).show();
        }
    }
}
