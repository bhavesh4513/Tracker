package com.example.regis.tracker;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class User extends ActionBarActivity {
    TextView vw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        vw = (TextView)findViewById(R.id.textView);
        Bundle b = getIntent().getExtras();
        if (b.getString("Username")!=null)

        {
            vw.setText(b.getString("Username"));

        }

    }

}
