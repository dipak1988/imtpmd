package com.solutions.guidedrecovery.ecapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.solutions.guidedrecovery.ecapp.R;
import com.solutions.guidedrecovery.ecapp.models.Vak;

import java.util.ArrayList;


/**
 * Created by Dipak on 21-6-2017.
 */

public class CourseAdapter extends ArrayAdapter<Vak> {


    public CourseAdapter(Context context, ArrayList<Vak> vakken){
        super(context, 0, vakken);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Get the data item for this position
        Vak vakken = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        // Lookup view for data population
        TextView tvModule = (TextView) convertView.findViewById(R.id.module);
        TextView tvModuleCode = (TextView) convertView.findViewById(R.id.moduleCode);
        TextView tvCijfer = (TextView) convertView.findViewById(R.id.cijfer);
        TextView tvEc = (TextView) convertView.findViewById(R.id.ec);


        // Populate the data into the template view using the data object
        tvModule.setText(vakken.getModuleNaam());
        tvModuleCode.setText(vakken.getModuleCode());
        tvCijfer.setText(Double.toString(vakken.getCijfer()));
        tvEc.setText(Integer.toString(vakken.getEc()));


        // Return the completed view to render on screen
        return convertView;
    }



}

