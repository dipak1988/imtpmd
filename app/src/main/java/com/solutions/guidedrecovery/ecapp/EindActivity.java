package com.solutions.guidedrecovery.ecapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


/**
 * Created by Daan on 19-6-2017.
 */

public class EindActivity extends AppCompatActivity {

    TextView EC_veld;

    protected void onCreate(Bundle savedInstanceState)
    {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_eind);


            EC_veld = (TextView) findViewById(R.id.EC_resultaat);
            Intent i = getIntent();
            int propedeuse_EC = i.getIntExtra("EC's ",0);

        EC_veld.setText(propedeuse_EC + "/ 90");


    }
}
