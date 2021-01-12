package com.example.qs_1_B;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button button;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv1);
        button = (Button) findViewById(R.id.b1);
        et = (EditText) findViewById(R.id.et1);
    }
    public void onClickBtn (View view){
        String name = et.getText().toString();
        tv.setText("hello " + name);
    }

}