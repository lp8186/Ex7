package com.example.ex007;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button clear, big, eq, small, btn;
    TextView counter, tof, num1, num2;
    int n1 = 0, n2 = 0, count1 = 0;
    int count2 = 0, count3, sum,check=0;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = (Button) findViewById(R.id.clear);
        big = (Button) findViewById(R.id.big);
        big.setText("<");
        eq = (Button) findViewById(R.id.eq);
        eq.setText("=");
        small = (Button) findViewById(R.id.small);
        small.setText(">");
        btn = (Button) findViewById(R.id.btn);
        counter = (TextView) findViewById(R.id.counter);
        tof = (TextView) findViewById(R.id.tof);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
    }

    public void press(View view) {
        check=1;
        Random rnd = new Random();
        count3 = 0;
        count1++;
        counter.setText(sum + "");
        tof.setText("True or False");
        n1 = rnd.nextInt(100) + 1;
        n2 = rnd.nextInt(100) + 1;
        num1.setText(n1 + "");
        num2.setText(n2 + "");
    }

    public void big(View view) {
        if (check == 1) {
            if (n1 < n2) {
                tof.setText("true");
            } else {
                tof.setText("false");
                if (count3 == 0) {
                    count2++;
                    count3 = 1;
                }
            }
            sum = ((count1 - count2) * 100) / count1;
        }
    }

    public void eq(View view) {
        if (check == 1) {
            if (n1 == n2) {
                tof.setText("true");
            } else {
                tof.setText("false");
                if (count3 == 0) {
                    count2++;
                    count3 = 1;
                }
            }
            sum = ((count1 - count2) * 100) / count1;
        }
    }

    public void small(View view) {
        if (check == 1) {
            if (n1 > n2) {
                tof.setText("true");
            } else {
                tof.setText("false");
                if (count3 == 0) {
                    count2++;
                    count3 = 1;
                }
            }
            sum = ((count1 - count2) * 100) / count1;
        }
    }
    public void clear(View view) {
        count1 = 0;
        count2 = 0;
        count3 = 0;
        check=0;
        sum= 100;
        tof.setText("True or False");
        counter.setText("new");
        num1.setText("First num");
        num2.setText("Second num");
    }
}
