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

import java.util.ArrayList;

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
        ArrayList<String> calculation = new ArrayList<>();
        switch(view.getId()){
            case R.id.button0:
                operation.setText(operation.getText() + "0");
                break;
            case R.id.button1:
                operation.setText(operation.getText() + "1");
                break;
            case R.id.button2:
                operation.setText(operation.getText() + "2");
                break;
            case R.id.button3:
                operation.setText(operation.getText() + "3");
                break;
            case R.id.button4:
                operation.setText(operation.getText() + "4");
                break;
            case R.id.button5:
                operation.setText(operation.getText() + "5");
                break;
            case R.id.button6:
                operation.setText(operation.getText() + "6");
                break;
            case R.id.button7:
                operation.setText(operation.getText() + "7");
                break;
            case R.id.button8:
                operation.setText(operation.getText() + "8");
                break;
            case R.id.button9:
                operation.setText(operation.getText() + "9");
                break;
            case R.id.buttonAdd:
                calculation.add("add");
                operation.setText(operation.getText() + "+");
                break;
            case R.id.buttonMinus:
                calculation.add("minus");
                operation.setText(operation.getText() + "-");
                break;
            case R.id.buttonMultiply:
                calculation.add("multiply");
                operation.setText(operation.getText() + "*");
                break;
            case R.id.buttonDivide:
                calculation.add("divide");
                operation.setText(operation.getText() + "/");
                break;
            case R.id.buttonEqual:
                result.setText("1");
                String input = String.valueOf(operation.getText());
                result.setText("3");
                String[] input_split = input.split("[\\+\\*/-]");
                result.setText("2");
                double resultat=0;
                for(int i=0; i<input_split.length-1; i++)
                {
                        if (calculation.get(i) == "add") {
                            if(i==0) {
                                resultat = Double.parseDouble(input_split[i])+ Double.parseDouble(input_split[i + 1]);
                            }
                            else{
                                resultat+=Double.parseDouble(input_split[i+1]);
                            }
                        }
                        if (calculation.get(i) == "minus") {
                            if(i==0) {
                                resultat = Double.parseDouble(input_split[i]) - Double.parseDouble(input_split[i + 1]);
                            }
                            else{
                                resultat-=Double.parseDouble(input_split[i+1]);
                            }
                        }
                        if (calculation.get(i) == "multiply") {
                            if(i==0) {
                                resultat = Double.parseDouble(input_split[i]) * Double.parseDouble(input_split[i + 1]);
                            }
                            else{
                                resultat*=Double.parseDouble(input_split[i+1]);
                            }
                        }
                        if (calculation.get(i) == "divide") {
                            if(i==0) {
                                resultat = Double.parseDouble(input_split[i]) / Double.parseDouble(input_split[i + 1]);
                            }
                            else{
                                resultat/=Double.parseDouble(input_split[i+1]);
                            }
                        }
                }
                operation.setText(operation.getText() + "=");
                String res = String.valueOf(resultat);
                result.setText(res);
                break;
        }


    }
}

