package com.kutaysutcu.simplecalculatorjava;

import static java.lang.Integer.parseInt;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText number1Txt;
    EditText number2Txt;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Txt = findViewById(R.id.number1Txt);
        number2Txt = findViewById(R.id.number2Txt);
        resultTxt = findViewById(R.id.resultTxt);
    }

    public void calculations(String operation)
    {
        if(number1Txt.getText().toString().matches("") || number2Txt.getText().toString().matches(""))
        {
            resultTxt.setText("Enter a number");
        }
        else
        {
            double number1 = parseInt(number1Txt.getText().toString());
            double number2 = parseInt(number2Txt.getText().toString());
            double result;

            switch (operation) {
                case "sum": {
                    result = number1 + number2;
                    resultTxt.setText("Result: " + result);
                    break;
                }
                case "deduct": {
                    result = number1 - number2;
                    resultTxt.setText("Result: " + result);
                    break;
                }
                case "multiply": {
                    result = number1 * number2;
                    resultTxt.setText("Result: " + result);
                    break;
                }
                case "divide": {
                    result = number1 / number2;
                    resultTxt.setText("Result: " + result);
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    public void sum(View view)
    {
        calculations("sum");
    }

    public void deduct(View view)
    {
        calculations("deduct");
    }

    public void multiply(View view)
    {
        calculations("multiply");
    }

    public void divide(View view)
    {
        calculations("divide");
    }
}