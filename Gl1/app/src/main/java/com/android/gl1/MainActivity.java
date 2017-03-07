package com.android.gl1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 *  TODO:
 *      * Make the ListView's selectable.
 *      * Dynamically populate the MainActivity/SolutionAcitivy.
 *      * Add NavigationDrawer to the left.
 */

public class MainActivity extends AppCompatActivity {

    ListView mSymptoms;
    ArrayAdapter<String> mSymptomAdapter;
    ArrayList<String> mSymptomList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mSymptomList = new ArrayList<>();
        mSymptomList.add("Malaria");

        mSymptomAdapter = new ArrayAdapter<String>(this, R.layout.symptom_list_item, mSymptomList);

        mSymptoms = (ListView)findViewById(R.id.listViewSymptoms);
        mSymptoms.setAdapter(mSymptomAdapter);

    }

    protected void goToSolutionPage(View view) {
        Intent solutionIntent = new Intent(MainActivity.this, SolutionsActivity.class);
        MainActivity.this.startActivity(solutionIntent);
    }
}
