package com.solutions.guidedrecovery.ecapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.solutions.guidedrecovery.ecapp.R.id.EC_score;


/**
 * Created by Daan on 18-6-2017.
 */

public class PropedeuseActivity extends AppCompatActivity {

    CheckBox box;
    int EC = 0;
    private TextView periode;
    private Boolean button_check;
    private TextView EC_veld;
    private Button volgende;
    private int volgende_periode = 0;
    private CheckBox box1;
    private CheckBox box2;
    private CheckBox box3;
    private CheckBox box4;
    private CheckBox box5;
    private CheckBox box6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propedeuse);
        periode = (TextView) findViewById(R.id.periode_veld);
        EC_veld = (TextView) findViewById(R.id.EC_score);

        volgende = (Button) findViewById(R.id.Next_periode);
        final LinearLayout prop_layout = (LinearLayout) findViewById(R.id.checkbox_layout);

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

        volgende.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Log.d("check","jjjjjjjjj");
                volgende_periode++;

                if (volgende_periode == 1) {
                    periodes(Periode_2,prop_layout);
                }
                else if(volgende_periode == 2) {
                    periodes(Periode_3,prop_layout);
                }
                else if(volgende_periode == 3) {
                    periodes(Periode_4,prop_layout);
                }


                Log.d("dwad", String.format("value = %d",volgende_periode));
            }
        });





                periode.setText(("Periode: " + 1));

                for (int k = 0; k < Periode_1.size(); k++) {
                    box = new CheckBox(this);
                    box.setId(k);
                    box.setText(Periode_1.get(k));
                    box.setOnClickListener((getEC(box, box.isSelected())));
                    prop_layout.addView(box);
                    EC_veld.setText((EC_score + "/ 90"));
                    Log.d("check","3333333");

                }

            }












public void periodes (List<String> Periode,LinearLayout prop_layout){


    if (volgende_periode == 1) {
            prop_layout.removeAllViews();
            periode.setText(("Periode: " + 2));

            for (int k = 0; k < Periode.size(); k++) {
        box = new CheckBox(this);
        box.setId(k);
        box.setText(Periode.get(k));
        box.setOnClickListener((getEC(box, box.isSelected())));
        prop_layout.addView(box);
        EC_veld.setText((EC_score + "/ 90"));
        Log.d("check","4444444444");

        }
        }

    if (volgende_periode == 2) {
        prop_layout.removeAllViews();

        periode.setText(("Periode: " + 3));

        for (int k = 0; k < Periode.size(); k++) {
            box = new CheckBox(this);
            box.setId(k);
            box.setText(Periode.get(k));
            box.setOnClickListener((getEC(box, box.isSelected())));
            prop_layout.addView(box);
            EC_veld.setText((EC_score + "/ 90"));
            Log.d("check","555555555");

        }

    }

    if (volgende_periode == 3) {
        prop_layout.removeAllViews();
        periode.setText(("Periode: " + 4));

        for (int k = 0; k < Periode.size(); k++) {
            box = new CheckBox(this);
            box.setId(k);
            box.setText(Periode.get(k));
            box.setOnClickListener((getEC(box, box.isSelected())));
            prop_layout.addView(box);
            EC_veld.setText((EC_score + "/ 90"));

        }

    }


}





    View.OnClickListener getEC (final Button button, final Boolean check  ){
        return new View.OnClickListener(){
            public void onClick(View v){
                if(button.getText().equals("iipfit") || button.getText().equals("iipsen") ||  button.getText().equals("iipbdam") || button.getText().equals("iipmedt") ){
                    if (check == true){

                        EC += 10;
                    }
                    else
                        EC -= 10;
                }
               else if (button.getText().equals("iopr1") || button.getText().equals("iopr2")){
                    if (check == true){

                        EC += 4;
                    }
                    else
                        EC -= 4;

                }
                else if (button.getText().equals("ipodm") || button.getText().equals("ipomedt") || button.getText().equals("ipose") || button.getText().equals("ipofit")){
                    if (check == true){

                        EC += 2;
                    }
                    else
                        EC -= 2;

                }
                else  if (button.getText().equals("islp") ){

                    if (check == true){

                        EC += 1;
                    }
                    else
                        EC -= 1;

                }
                else
                    if (check == true){

                        EC += 3;
                }
                    else
                        EC -= 3;

            }

        };

    }
}
