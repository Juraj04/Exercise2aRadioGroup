package com.example.janik.exercise2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSelectButton(View view) {
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        if(rb != null)
        Toast.makeText(this,rb.getText(),Toast.LENGTH_SHORT).show();
    }


}
