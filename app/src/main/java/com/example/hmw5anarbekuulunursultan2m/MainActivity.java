package com.example.hmw5anarbekuulunursultan2m;

import androidx.appcompat.app.AppCompatActivity;


import androidx.core.content.ContextCompat;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edittext_1, edittext_2;
    private Button button_1;
    private TextView textview_1, textview_2, textview_3, textview_4
            ,textview_0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature (Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView (R.layout.activity_main);
        edittext_1 = (EditText) findViewById(R.id.edittext_1);
        edittext_2 = (EditText) findViewById(R.id.edittext_2);
        button_1 = (Button) findViewById(R.id.button_1);

        textview_1 = (TextView) findViewById(R.id.textview_1);
        textview_2 = (TextView) findViewById(R.id.textview_2);
        textview_3 = (TextView) findViewById(R.id.textview_3);
        textview_3 = (TextView) findViewById(R.id.textview_4);
        onclicklistener();
        edittext_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (edittext_1.getText().toString().isEmpty()) {
                    button_1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grun));
                } else {
                    button_1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.blue));
                }
            }
        });
        edittext_2.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable charSequence) {
                if (edittext_2.getText().toString().isEmpty()) {
                    button_1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grun));
                } else {
                    button_1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.blue));
                }
            }
        });
    }

    private void onclicklistener() {
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edittext_1.getText().toString().equals("admin") && edittext_2.getText().toString().equals("admin")){
                    button_1.setVisibility(View.GONE);
                    System.out.println("PRIVET MIR");
                    edittext_1.setVisibility(View.GONE);
                    System.out.println("PRIVET MIR");
                    edittext_2.setVisibility(View.GONE);
                    textview_2.setVisibility(View.GONE);
                    textview_3.setVisibility(View.GONE);
                    textview_4.setVisibility(View.GONE);

                    Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Неверная почта или пароль.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}