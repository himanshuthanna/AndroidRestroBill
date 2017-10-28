package com.example.lenovo.restrobill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText e1,e2,e3,e4;

    CheckBox c1,c2,c3,c4;
    Button btn;
    public static final String my_tag="My_Messages";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate();
        Log.d(my_tag,"oncrate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(my_tag,"onstart");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(my_tag,"onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(my_tag,"onResume");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(my_tag,"onStop");
    }
    public void calculate(){
        e1=(EditText)findViewById(R.id.Cprice);
        e2=(EditText)findViewById(R.id.Mprice);
        e3=(EditText)findViewById(R.id.Sprice);
        e4=(EditText)findViewById(R.id.Cokeprice);
        c1=(CheckBox)findViewById(R.id.chilli);
        c2=(CheckBox)findViewById(R.id.momos);
        c3=(CheckBox)findViewById(R.id.shake);
        c4=(CheckBox)findViewById(R.id.coke);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }
    public void onClick(View view)
    { String h1="  ";
        int total=0;
        if(c1.isChecked())
        {  int a1=Integer.parseInt(e1.getText().toString());
            int cal1=a1*40;
            total=total+cal1;
            h1+=a1+" "+"chilli"+" "+cal1+"\n";
        }
        if(c2.isChecked())
        {  int a2=Integer.parseInt(e2.getText().toString());
            int cal2=a2*40;
            total=total+cal2;
            h1+=a2+" "+"momos"+" "+cal2+"\n";
        }
        if(c3.isChecked())
        {  int a3=Integer.parseInt(e3.getText().toString());
            int cal3=a3*46;
            total=total+cal3;
            h1+=a3+" "+"shake"+" "+cal3+"\n";
        }
        if(c4.isChecked())
        {int a4=Integer.parseInt(e4.getText().toString());
            int cal4=a4*40;
            total=total+cal4;
            h1+=a4+" "+"momos"+" "+cal4+"\n";

        }
        h1+="total="+total;
        Toast.makeText(getApplicationContext(),h1,Toast.LENGTH_LONG).show();

    }
}
