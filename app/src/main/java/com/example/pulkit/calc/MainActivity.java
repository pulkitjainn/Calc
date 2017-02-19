package com.example.pulkit.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.pulkit.calc.R.id.bce;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener {
    Button bce,b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bm, bd, bs, be;
    EditText e1, e2;
    TextView er;

    int a = 0, b = 0, c = 0;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1 = (EditText) findViewById(R.id.e1);
        e1.setText("");
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        ba = (Button) findViewById(R.id.ba);
        bs = (Button) findViewById(R.id.bs);
        bm = (Button) findViewById(R.id.bm);
        bd = (Button) findViewById(R.id.bd);
        be = (Button) findViewById(R.id.be);
        bce = (Button) findViewById(R.id.bce);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        ba.setOnClickListener(this);
        bs.setOnClickListener(this);
        bd.setOnClickListener(this);
        bm.setOnClickListener(this);
        be.setOnClickListener(this);

        bce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
               e1.setText("");
            }
        });
    }



    @Override
    public void onClick(View v)
    {
        if(!((Button) v).getText().equals("="))
         e1.setText(e1.getText().toString() + ((Button) v).getText());
        if (v.getId() == R.id.ba || v.getId() == R.id.bs || v.getId() == R.id.bm || v.getId() == R.id.bd)
        {
            i=v.getId();
            e1.setText("");
        }
        else if(v.getId() == R.id.be)
        {
            b=Integer.parseInt(e1.getText().toString());
            e1.setText("");
        }
        else {
            if (i == 0)
            {
                a = Integer.parseInt(e1.getText().toString());
            }
        }
        {
            if (v.getId() == R.id.be )
                 {
                     e1.setText("");
                    switch (i)
                    {
                        case R.id.ba:
                            c = a + b;
                            break;
                        case R.id.bs:
                            c = a - b;
                            break;
                        case R.id.bm:
                            c = a * b;
                            break;
                        case R.id.bd:
                            if(b==0)
                            {
                                Toast t= Toast.makeText(this,"INVALID", Toast.LENGTH_SHORT);//Displays a message
                                t.show();
                            }
                            else
                            {
                                c = a / b;
                            }
                            break;
                    }
                 e1.setText(String.valueOf(c));
                 i=0;
                 a=c;
            }
        }
    }

}



