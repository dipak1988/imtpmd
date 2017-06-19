package com.solutions.guidedrecovery.ecapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Button propedeuse_knop,hoofdfase_knop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();




    }

    public void OnClickButtonListener(){

        propedeuse_knop = (Button)findViewById(R.id.propedeuse);
        propedeuse_knop.setOnClickListener(
                new View.OnClickListener(){
                     @Override
                    public void  onClick(View v){
                         Intent i = new Intent(v.getContext(),PropedeuseActivity.class);

                         startActivity(i);
                     }
                }
        );

    }

}
