package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText operation;
    EditText result;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button add;
    Button minus;
    Button multiply;
    Button divide;
    Button equal;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setUpViews();

    }

    public void setUpViews(){
        zero = (Button) findViewById(R.id.button0);
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button0);
        three = (Button) findViewById(R.id.button0);
        four = (Button) findViewById(R.id.button0);
        five = (Button) findViewById(R.id.button0);
        six = (Button) findViewById(R.id.button0);
        seven = (Button) findViewById(R.id.button0);
        eight = (Button) findViewById(R.id.button0);
        nine = (Button) findViewById(R.id.button0);
        add = (Button) findViewById(R.id.button0);
        minus = (Button) findViewById(R.id.button0);
        multiply = (Button) findViewById(R.id.button0);
        divide = (Button) findViewById(R.id.button0);
        clear = (Button) findViewById(R.id.button0);
        operation = (EditText) findViewById(R.id.operation);
        result = (EditText) findViewById(R.id.result);
    }

    public void myClickHandler(View view) {

        operation.setText("Click");

    }
}

