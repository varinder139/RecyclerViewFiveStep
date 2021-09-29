package com.varinder.recyclerviewexampletcode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view_id);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "user one", "This is user one"));
        modelClassList.add(0, new ModelClass(R.drawable.ic_launcher_background, "user two", "This is user two"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "user three", "This is user three"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "user four", "This is user four"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "user five", "This is user five"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "user six", "This is user six"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "user seven", "This is user seven"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "user eight", "This is user eight"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "user nine", "This is user nine"));
        modelClassList.add(new ModelClass(R.drawable.ic_launcher_background, "user ten", "This is user ten"));


        Adaptor adaptor = new Adaptor(modelClassList);
        recyclerView.setAdapter(adaptor);
        adaptor.notifyDataSetChanged();

    }
}