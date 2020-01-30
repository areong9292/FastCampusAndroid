package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int result = 0;

    boolean isPlus = false;
    boolean isMinus = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView button0 = findViewById(R.id.button0);
        TextView button1 = findViewById(R.id.button1);
        TextView button2 = findViewById(R.id.button2);
        TextView button3 = findViewById(R.id.button3);
        TextView button4 = findViewById(R.id.button4);
        TextView button5 = findViewById(R.id.button5);
        TextView button6 = findViewById(R.id.button6);
        TextView button7 = findViewById(R.id.button7);
        TextView button8 = findViewById(R.id.button8);
        TextView button9 = findViewById(R.id.button9);

        TextView buttonPlus = findViewById(R.id.buttonPlus);
        TextView buttonMinus = findViewById(R.id.buttonMinus);
        TextView buttonResult = findViewById(R.id.buttonResult);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                EditText editText = findViewById(R.id.editText);
                String nowCalc = "";
                switch(v.getId())
                {
                    case R.id.button0:
                        nowCalc = editText.getText().toString();
                        nowCalc += "0";
                        editText.setText(nowCalc);
                        break;
                    case R.id.button1:
                        nowCalc = editText.getText().toString();
                        nowCalc += "1";
                        editText.setText(nowCalc);
                        break;
                    case R.id.button2:
                        nowCalc = editText.getText().toString();
                        nowCalc += "2";
                        editText.setText(nowCalc);
                        break;
                    case R.id.button3:
                        nowCalc = editText.getText().toString();
                        nowCalc += "3";
                        editText.setText(nowCalc);
                        break;
                    case R.id.button4:
                        nowCalc = editText.getText().toString();
                        nowCalc += "4";
                        editText.setText(nowCalc);
                        break;
                    case R.id.button5:
                        nowCalc = editText.getText().toString();
                        nowCalc += "5";
                        editText.setText(nowCalc);
                        break;
                    case R.id.button6:
                        nowCalc = editText.getText().toString();
                        nowCalc += "6";
                        editText.setText(nowCalc);
                        break;
                    case R.id.button7:
                        nowCalc = editText.getText().toString();
                        nowCalc += "7";
                        editText.setText(nowCalc);
                        break;
                    case R.id.button8:
                        nowCalc = editText.getText().toString();
                        nowCalc += "8";
                        editText.setText(nowCalc);
                        break;
                    case R.id.button9:
                        nowCalc = editText.getText().toString();
                        nowCalc += "9";
                        editText.setText(nowCalc);
                        break;
                    case R.id.buttonPlus:
                        if(result != 0)
                            result += Integer.parseInt(editText.getText().toString());
                        else
                            result = Integer.parseInt(editText.getText().toString());

                        editText.setText("");
                        isPlus = true;
                        break;
                    case R.id.buttonMinus:
                        if(result != 0)
                            result -= Integer.parseInt(editText.getText().toString());
                        else
                            result = Integer.parseInt(editText.getText().toString());

                        editText.setText("");
                        isMinus = true;
                        break;
                    case R.id.buttonResult:

                        if(isPlus)
                        {
                            result += Integer.parseInt(editText.getText().toString());
                            isPlus = false;
                        }
                        else if(isMinus)
                        {
                            result -= Integer.parseInt(editText.getText().toString());
                            isMinus = false;
                        }

                        editText.setText(String.valueOf(result));
                        result = 0;
                        break;
                }
            }
        };

        button0.setOnClickListener(listener);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        buttonPlus.setOnClickListener(listener);
        buttonMinus.setOnClickListener(listener);
        buttonResult.setOnClickListener(listener);
    }
}
