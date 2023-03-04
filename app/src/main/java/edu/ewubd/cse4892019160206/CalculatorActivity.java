package edu.ewubd.cse4892019160206;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private TextView tvEquation;
    private Button btn9, btn8, btn7,btn6, btn5, btn4,btn3, btn2, btn1, btn0, btnDiv, btnAdd, btnMul, btnMin, btnEqual, btnDot, btnDel;
    private String operator ="";
    private int n=0;
    private int m=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        tvEquation = findViewById(R.id.tvEquation);
        btn9= findViewById(R.id.btn9);
        btn8= findViewById(R.id.btn8);
        btn7= findViewById(R.id.btn7);
        btn6= findViewById(R.id.btn6);
        btn5= findViewById(R.id.btn5);
        btn4= findViewById(R.id.btn4);
        btn3= findViewById(R.id.btn3);
        btn2= findViewById(R.id.btn2);
        btn1= findViewById(R.id.btn1);
        btn0= findViewById(R.id.btn0);
        btnDiv= findViewById(R.id.btnDiv);
        btnAdd= findViewById(R.id.btnAdd);
        btnMin= findViewById(R.id.btnMin);
        btnMul= findViewById(R.id.btnMul);
        btnEqual= findViewById(R.id.btnEqual);
        btnDot= findViewById(R.id.btnDot);
        btnDel= findViewById(R.id.btnDel);



        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text= "";
                }
                tvEquation.setText(text+9);

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text= "";
                }
                tvEquation.setText(text+8);

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text= "";
                }
                tvEquation.setText(text+7);

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text= "";
                }
                tvEquation.setText(text+6);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text= "";
                }
                tvEquation.setText(text+5);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text= "";
                }
                tvEquation.setText(text+4);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text= "";
                }
                tvEquation.setText(text+3);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text= "";
                }
                tvEquation.setText(text+2);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text= "";
                }
                tvEquation.setText(text+1);

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null){
                    text= "";
                }
                tvEquation.setText(text+0);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "/";
                String text = tvEquation.getText().toString();
                if(text==null){
                    return;
                }
                n=Integer.parseInt(text);
                tvEquation.setText("");

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "*";
                String text = tvEquation.getText().toString();
                if (text == null) {
                    return;
                }
                n=Integer.parseInt(text);
                tvEquation.setText("");
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "-";
                String text = tvEquation.getText().toString();
                if (text == null) {
                    return;
                }
                n=Integer.parseInt(text);
                tvEquation.setText("");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "+";
                String text = tvEquation.getText().toString();
                if (text == null) {
                    return;
                }
                n=Integer.parseInt(text);
                tvEquation.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    return;
                }
                m=Integer.parseInt(text);
                int res = 0;
                switch (operator) {
                    case "+":
                        res = n + m;
                        break;
                    case "-":
                        res = n - m;
                        break;
                    case "*":
                        res = n * m;
                        break;
                    case "/":
                        if (m == 0) {
                            tvEquation.setText("Cannot divide by zero");
                            return;
                        } else {
                            res = n / m;
                        }
                        break;
                }
                tvEquation.setText(String.valueOf(res));
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvEquation.getText().toString();
                if(text==null || text.isEmpty()){
                    return;
                }
                tvEquation.setText(text.substring(0, text.length() - 1));
            }
        });
    }
}