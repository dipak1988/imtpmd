package com.solutions.guidedrecovery.ecapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.solutions.guidedrecovery.ecapp.R.id.EC_score;
import static com.solutions.guidedrecovery.ecapp.R.id.list_item;


/**
 * Created by Daan on 18-6-2017.
 */

public class PropedeuseActivity extends AppCompatActivity {

    ArrayList<Vak> products = new ArrayList<Vak>();
    ListAdapter boxAdapter;

    CheckBox box;
    int EC = 0;
    private TextView periode;
    private Boolean button_check;
    private TextView EC_veld;
    private Button volgende;
    private int volgende_periode = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propedeuse);


        boxAdapter = new ListAdapter(this, products);

        ListView lvMain = (ListView) findViewById(R.id.lvMain);
        lvMain.setAdapter(boxAdapter);

        final List<String> Periode_1 = new ArrayList<String>();

        Periode_1.add("ihbo");
        Periode_1.add("iopr1");
        Periode_1.add("iprov");
        Periode_1.add("iipmedt");
        Periode_1.add("iwdr");
        Periode_1.add("ipomedt");

        final List<String> Periode_2 = new ArrayList<String>();

        Periode_2.add("irdb");
        Periode_2.add("iibui");
        Periode_2.add("ipodm");
        Periode_2.add("iibpm");
        Periode_2.add("iipbdam");
        Periode_2.add("iopr2");

        final List<String> Periode_3 = new ArrayList<String>();

        Periode_3.add("imuml");
        Periode_3.add("ipose");
        Periode_3.add("icommp");
        Periode_3.add("islp");
        Periode_3.add("iipsen");

        final List<String> Periode_4 = new ArrayList<String>();

        Periode_4.add("iipfit");
        Periode_4.add("ipofit");
        Periode_4.add("ifit");
        Periode_4.add("iarch");
        Periode_4.add("inet");


        periode = (TextView) findViewById(R.id.periode_veld);
        EC_veld = (TextView) findViewById(R.id.EC_score);
        volgende = (Button) findViewById(R.id.Next_periode);

        final LinearLayout prop_layout = (LinearLayout) findViewById(R.id.checkbox_layout);



        List<CheckBox> list_1 = periodes(Periode_1, prop_layout);


        volgende.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                volgende_periode++;

                if (volgende_periode == 2) {
                    List<CheckBox> list_2 = periodes(Periode_2, prop_layout);
                    getEC(list_2);
                } else if (volgende_periode == 3) {
                    List<CheckBox> list_3 = periodes(Periode_3, prop_layout);
                    getEC(list_3);
                } else if (volgende_periode == 4) {
                    List<CheckBox> list_4 = periodes(Periode_4, prop_layout);
                    getEC(list_4);
                } else if (volgende_periode == 5) {
                    Intent i = new Intent(PropedeuseActivity.this, EindActivity.class);
                    i.putExtra("EC's ", EC);
                    startActivity(i);
                }


            }
        });


    }


    public List<CheckBox> periodes(List<String> Periode, LinearLayout prop_layout) {


        List<CheckBox> list = new LinkedList<>();
        prop_layout.removeAllViews();
        periode.setText(("Periode: " + volgende_periode));

        for (int k = 0; k < Periode.size(); k++) {

            box = new CheckBox(this);
            box.setId(k);
            box.setText(Periode.get(k));
            list.add(box);
            prop_layout.addView(box);
            box.setOnClickListener((getEC(list)));

            EC_veld.setText((EC + "/ 90"));


        }


        return list;

    }

    View.OnClickListener getEC(final List<CheckBox> list) {
        return new View.OnClickListener() {
            public void onClick(View v) {

                for (CheckBox cb : list) {

                    if (cb.isChecked()) {
                        cb.getId();
                    }
                }

                for (CheckBox cb : list) {
                    String vak = cb.getText().toString();


                    if (vak.equals("iipfit") || vak.equals("iipsen") || vak.equals("iipbdam") || vak.equals("iipmedt")) {

                        if (cb.isChecked()) {

                            EC += 10;
                            EC_veld.setText((EC + "/ 90"));
                        }
                    } else if (vak.equals("iopr1") || vak.equals("iopr2")) {

                        if (cb.isChecked()) {
                            EC += 4;
                            EC_veld.setText((EC + "/ 90"));
                        }

                    } else if (vak.equals("ipodm") || vak.equals("ipomedt") || vak.equals("ipose") || vak.equals("ipofit")) {

                        if (cb.isChecked()) {
                            EC += 2;
                            EC_veld.setText((EC + "/ 90"));
                        }

                    } else if (vak.equals("islp")) {

                        if (cb.isChecked()) {
                            EC += 1;
                            EC_veld.setText((EC + "/ 90"));
                        }

                    } else if (vak.equals("iarch") || vak.equals("iibpm") || vak.equals("ihbo") || vak.equals("iwdr") ||
                            vak.equals("irdb") || vak.equals("iibui") || vak.equals("inet") || vak.equals("imuml") ||
                            vak.equals("ifit") || vak.equals("iprov") || vak.equals("icommp")) {

                        if (cb.isChecked()) {
                            Log.d("vak", vak);
                            EC += 3;
                            EC_veld.setText((EC + "/ 90"));
                        }
                    }
                }

            }
        };
    }
}






