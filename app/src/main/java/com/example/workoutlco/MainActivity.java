package com.example.workoutlco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView mRecyclerView;
private RecyclerView.Adapter mAdapter;
private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<listItemCustomObj> listItem = new ArrayList<>();
        listItem.add(new listItemCustomObj("Pushup",R.drawable.pushup));
        listItem.add(new listItemCustomObj("DB Pushup",R.drawable.dbpushup));
        listItem.add(new listItemCustomObj("Bench Press",R.drawable.benchpress));
        listItem.add(new listItemCustomObj("Incline BP",R.drawable.inclinebenchpress));

        mRecyclerView  = findViewById(R.id.Recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new lcoAdapter(listItem);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

}