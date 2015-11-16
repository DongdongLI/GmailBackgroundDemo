package com.example.lidon.gmailbackgrounddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.creativityapps.gmailbackgroundlibrary.BackgroundMail;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BackgroundMail backgroundMail=new BackgroundMail(MainActivity.this);
        backgroundMail.setGmailUserName("");
        backgroundMail.setGmailPassword("");
        backgroundMail.setMailTo("");
        backgroundMail.setFormBody("this is the body");
        backgroundMail.setFormSubject("this is the subject");
        backgroundMail.send();

    }

}
