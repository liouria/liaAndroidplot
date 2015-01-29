package com.lia.passingdatabetweenactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 
public class ActivityOne extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        
        Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new OnClickListener() {
 
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
 
                Intent intent = new Intent(ActivityOne.this, ActivityTwo.class);
                Bundle b = new Bundle();
                //
                Employee e = new Employee(1, "shawn");
                b.putParcelable("parse", e);
                intent.putExtras(b);
                //
                startActivity(intent);
            }
        });
    }
}
