package com.example.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onClick();
    }
    EditText principle,roi,year;
    Button b1;
    TextView si,amt;

    public void onClick()
    {
        principle=(EditText) findViewById(R.id.principle);
        roi=(EditText) findViewById((R.id.ROI));
        year=(EditText) findViewById((R.id.yearbox));

        b1=(Button) findViewById((R.id.button));

        si=(TextView) findViewById((R.id.si));
        amt=(TextView) findViewById((R.id.amount));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p=Integer.parseInt(principle.getText().toString());
                int r=Integer.parseInt(roi.getText().toString());
                int t=Integer.parseInt((year.getText().toString()));

                int s=(p*r*t)/100;
                int amount=s+p;
                si.setText(String.valueOf(s));
                amt.setText(String.valueOf((amount)));
            }
        });




    }

}
