package com.example.rkarthikraj.fibonacci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FiboActivity extends AppCompatActivity {

    TextView FN;
    EditText getInput;
    List<Integer> list = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibo);
    }

    public void onClickFib(View view)
    {
        FN=(TextView)findViewById(R.id.FibOutput);
        getInput=(EditText)findViewById(R.id.inputText);
        int num1;
        num1=Integer.parseInt(getInput.getText().toString());
        fibo(num1);
        FN.setText("");
        FN.setText(list.toString());
    }
    public void fibo(int num1)
        {
            list.clear();
            int n1=0, n2=1,temp,i;
            for( i=0; i<num1; ++i)
            {
                list.add(new Integer(n1));
                temp=n1+n2;
                n1=n2;
                n2=temp;
            }
        }
}


