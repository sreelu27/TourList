package sree.com.tourlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{

    TourAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();

        animalNames.add("Tour 1");
        animalNames.add("Tour 2");
        animalNames.add("Tour 3");
        animalNames.add("Tour 4");
        animalNames.add("Tour 5");
        animalNames.add("Tour 6");
        animalNames.add("Tour 1");
        animalNames.add("Tour 2");
        animalNames.add("Tour 3");
        animalNames.add("Tour 4");
        animalNames.add("Tour 5");
        animalNames.add("Tour 6");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        TourAdapter adapter = new TourAdapter(this, animalNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
    }


}