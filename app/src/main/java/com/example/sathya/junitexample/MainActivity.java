package com.example.sathya.junitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sathya.junitexample.model.DaoMaster;
import com.example.sathya.junitexample.model.DaoSession;
import com.example.sathya.junitexample.model.User;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user=((DemoApp)getApplication()).getDaoSession().getUserDao().load(1L);
        if(user!=null){
            ((TextView)findViewById(R.id.txtView)).setText(user.getName());
        }

    }
}
