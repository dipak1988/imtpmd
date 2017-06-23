package com.solutions.guidedrecovery.ecapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.solutions.guidedrecovery.ecapp.R;
import com.solutions.guidedrecovery.ecapp.adapters.CourseAdapter;
import com.solutions.guidedrecovery.ecapp.models.Vak;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView behaaldeEcs;
    CourseAdapter adapter;
    ArrayList<Vak> arrayOfCourses;
    ListView listView;
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Construct the data source
        arrayOfCourses = new ArrayList<Vak>();

        // Create the adapter to convert the array to views
        adapter = new CourseAdapter(this, arrayOfCourses);

        // Attach the adapter to a ListView
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        // Get all the info
        showInfo();



    }



    public void showInfo(){

        ArrayList<String> moduleCodes = new ArrayList<String>();
        ArrayList<String> moduleNamen = new ArrayList<String>();
        ArrayList<Double> cijfers = new ArrayList<Double>();
        ArrayList<Integer> ecs = new ArrayList<Integer>();

        moduleCodes.add("IPMEDT1");
        moduleNamen.add("Project Mediatechnologie intro");
        cijfers.add(6.5);
        ecs.add(6);

        moduleCodes.add("IPBIT1");
        moduleNamen.add("Project Business IT intro");
        cijfers.add(7.4);
        ecs.add(6);

        moduleCodes.add("IPSEN1");
        moduleNamen.add("Project Software Engineering intro");
        cijfers.add(5.7);
        ecs.add(6);

        moduleCodes.add("IPFIT1");
        moduleNamen.add("Project forensische ICT intro");
        cijfers.add(5.0);
        ecs.add(0);

        moduleCodes.add("IOPR1");
        moduleNamen.add("Object georienteerd programmeren 1");
        cijfers.add(4.5);
        ecs.add(0);

        moduleCodes.add("IOPR2");
        moduleNamen.add("Object georienteerd programmeren 2");
        cijfers.add(5.4);
        ecs.add(0);

        moduleCodes.add("IRDB");
        moduleNamen.add("Relationele databases");
        cijfers.add(5.8);
        ecs.add(3);

        moduleCodes.add("INET");
        moduleNamen.add("Internet beveiliging");
        cijfers.add(7.5);
        ecs.add(3);



        for(int i = 0; i < moduleCodes.size(); i++)
        {
            Vak vakken = new Vak(moduleCodes.get(i), moduleNamen.get(i), cijfers.get(i), ecs.get(i));
            adapter.add(vakken);
        }

        behaaldeEcs = (TextView) findViewById(R.id.textView5);

        for(int i = 0; i<ecs.size(); i++)
        {
            sum += Integer.valueOf(ecs.get(i));
            behaaldeEcs.setText(String.valueOf(sum));
        }

    }



}


