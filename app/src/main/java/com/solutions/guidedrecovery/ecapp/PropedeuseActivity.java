package com.solutions.guidedrecovery.ecapp;

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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;
import android.widget.Toast;

import static com.solutions.guidedrecovery.ecapp.R.id.checkBox;

/**
 * Created by Daan on 18-6-2017.
 */

public class PropedeuseActivity extends AppCompatActivity {

    private TextView periode;
    Button propedeuse, hoofdfase;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propedeuse);
        periode = (TextView) findViewById(R.id.periode_veld);
        CheckBox box1;
        CheckBox box2;
        CheckBox box3;
        CheckBox box4;
        CheckBox box5;
        CheckBox box6;
        box1 = (CheckBox) findViewById(R.id.checkBox);
        box2 = (CheckBox) findViewById(R.id.checkBox2);
        box3 = (CheckBox) findViewById(R.id.checkBox3);
        box4 = (CheckBox) findViewById(R.id.checkBox4);
        box5 = (CheckBox) findViewById(R.id.checkBox5);
        box6 = (CheckBox) findViewById(R.id.checkBox6);

        for (int i =0; i< 4; i++)
        {
            periode.setText(("Periode: " + (i+1)));

            if (i ==0)
            {
                String [] periode_1 = ["test","ereasf"];

                box1.setText("test");
            }

        }


//        // get the listview
//        expListView = (ExpandableListView) findViewById(R.id.lvExp);
//
//        // preparing list data
//        prepareListData();
//
//        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
//
//        // setting list adapter
//        expListView.setAdapter(listAdapter);
//    }
//
//    /*
//     * Preparing the list data
//     */
//    private void prepareListData() {
//        listDataHeader = new ArrayList<String>();
//        listDataChild = new HashMap<String, List<String>>();
//
//        // Adding child data
//        listDataHeader.add("Periode_1");
//        listDataHeader.add("Periode_2");
//        listDataHeader.add("Periode_3");
//        listDataHeader.add("Periode_4");
//
//        // Adding child data
//        List<String> Periode_1 = new ArrayList<String>();
//
//        Periode_1.add("ihbo");
//        Periode_1.add("iopr1");
//        Periode_1.add("iprov");
//        Periode_1.add("iipmedt");
//        Periode_1.add("iwdr");
//        Periode_1.add("ipomedt");
//
//        List<String> Periode_2 = new ArrayList<String>();
//
//        Periode_2.add("irdb");
//        Periode_2.add("iibui");
//        Periode_2.add("ipodm");
//        Periode_2.add("iibpm");
//        Periode_2.add("iipbdam");
//        Periode_2.add("iopr2");
//
//        List<String> Periode_3 = new ArrayList<String>();
//
//        Periode_3.add("imuml");
//        Periode_3.add("ipose");
//        Periode_3.add("icommp");
//        Periode_3.add("islp");
//        Periode_3.add("iipsen");
//
//        List<String> Periode_4 = new ArrayList<String>();
//
//        Periode_4.add("iipfit");
//        Periode_4.add("ipofit");
//        Periode_4.add("ifit");
//        Periode_4.add("iarch");
//        Periode_4.add("inet");
//
//        listDataChild.put(listDataHeader.get(0), Periode_1); // Header, Child data
//        listDataChild.put(listDataHeader.get(1), Periode_2);
//        listDataChild.put(listDataHeader.get(2), Periode_3);
//        listDataChild.put(listDataHeader.get(3), Periode_4);
//
//
   }
}
