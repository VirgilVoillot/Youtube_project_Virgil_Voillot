package com.example.lloydd.virgil_youtubeproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.lloydd.virgil_youtubeproject.module.ItemAdapter;
import com.example.lloydd.virgil_youtubeproject.module.Items;
import com.example.lloydd.virgil_youtubeproject.module.Youtube_json;
import com.google.gson.Gson;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extra = getIntent().getExtras();
        String json = extra.getString("json");

        Gson gson = new Gson();
        Youtube_json course = gson.fromJson(json, Youtube_json.class);

        //populate the View
        if (course != null) {
            listView = (ListView) findViewById(R.id.listView);
            final List<Items>items = course.getItems();
            final ItemAdapter itemsAdapter = new ItemAdapter(this, items);
            listView.setAdapter(itemsAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent third_activity = new Intent(Main2Activity.this,Main3Activity.class);
                    third_activity.putExtra("url","https://www.youtube.com/watch?v="+items.get(position).getId().getVideoId());
                    startActivity(third_activity);
                }
            });
        }
    }

}
