package com.jcentretest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mapintegration.BaseActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            TextView text=(TextView)findViewById(R.id.text);
            text.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this, BaseActivity.class);
                    startActivity(intent);
                }
            });

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
