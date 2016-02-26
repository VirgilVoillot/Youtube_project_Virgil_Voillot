package com.example.lloydd.virgil_youtubeproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.lloydd.virgil_youtubeproject.module.Youtube_json;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText searchBar;
    private Button getButton;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getButton = (Button) findViewById(R.id.button);
        text = (EditText) findViewById(R.id.editText);
        searchBar = (EditText) findViewById(R.id.editText);
        //KEY API : AIzaSyCB7KxxoSjF5Yha6G5fhOLX0nTLRYgc4J0

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keyword = searchBar.getText().toString();
                String stringURL = "https://www.googleapis.com/youtube/v3/search?part=snippet&q="+keyword+"&key=AIzaSyAbgHolOwZ6IOOPoVRA_DkK43L97hZgwEc";
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);

                StringRequest stringRequest = new StringRequest(Request.Method.GET, stringURL,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                //text.setText(response);
                                Intent second_activity = new Intent(MainActivity.this,Main2Activity.class);
                                second_activity.putExtra("json",response);
                                startActivity(second_activity);
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                    }
                });
                queue.add(stringRequest);
            }
        });
    }
}
