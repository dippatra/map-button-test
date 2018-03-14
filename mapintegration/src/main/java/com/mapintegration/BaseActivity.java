package com.mapintegration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        try{
            Button next,pre;
            next=(Button)findViewById(R.id.next);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(BaseActivity.this,NextActivity.class);
                    startActivity(intent);
                }
            });
            pre=(Button)findViewById(R.id.pre);
            pre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(BaseActivity.this,PreviousActivity.class);
                    startActivity(intent);
                }
            });

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
