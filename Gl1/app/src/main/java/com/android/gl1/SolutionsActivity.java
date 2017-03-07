package com.android.gl1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by david on 3/1/17.
 */

public class SolutionsActivity extends AppCompatActivity {

    ListView mSolutions;
    ArrayAdapter<String> mSolutionsAdapter;
    ArrayList<String> mSolutionsList;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solutions);

        mSolutionsList = new ArrayList<>();
        mSolutionsList.add("None");

        mSolutionsAdapter = new ArrayAdapter<String>(this, R.layout.solution_list_item,
                mSolutionsList);

        mSolutions = (ListView)findViewById(R.id.listViewSolutions);
        mSolutions.setAdapter(mSolutionsAdapter);
    }
}
