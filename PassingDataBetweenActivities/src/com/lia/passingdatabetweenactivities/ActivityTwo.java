package com.lia.passingdatabetweenactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
 
public class ActivityTwo extends Activity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        //
        TextView textView = (TextView) findViewById(R.id.txt);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        Employee e = b.getParcelable("parse");
        //
        textView.setText(e.getId() + ":" + e.getName());
    }
 
}
