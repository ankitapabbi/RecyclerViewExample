package com.codeoptimizer.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView ContactrecyclerView;
ArrayList<Contacts> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContactrecyclerView = (RecyclerView)findViewById(R.id.RecyclerViewID);
        arrayList.add(new Contacts("Sidharth",R.drawable.camelicon,"6475632209"));
        arrayList.add(new Contacts("Rahul",R.drawable.dogicon,"4753628930"));
        arrayList.add(new Contacts("Sidharth",R.drawable.elephanticon,"6438927289"));
        arrayList.add(new Contacts("Sidharth",R.drawable.owlicon,"6483927822"));
        arrayList.add(new Contacts("Sidharth",R.drawable.zebraicon,"6768632209"));

        AdapterClass adapter = new AdapterClass(MainActivity.this,arrayList);
        ContactrecyclerView.setHasFixedSize(true);
        ContactrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        ContactrecyclerView.setAdapter(adapter);

    }

}
