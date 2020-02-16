package com.samsung.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view = findViewById(R.id.list);

        MyAdapter adapter = new MyAdapter(getData());

        view.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);

        view.setHasFixedSize(true);
        view.setNestedScrollingEnabled(true);

        view.setLayoutManager(manager);

    }

    public ArrayList<String> getData() {
        ArrayList<String> data = new ArrayList<>();

        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");
        data.add("Pushok");
        data.add("Murzik");
        data.add("Barsik");

        return data;
    }
}
