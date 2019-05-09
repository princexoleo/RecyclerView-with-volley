package com.leo.recyclerviewupdated;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
   private RecyclerView recyclerView;
   private RecyclerAdapter adapter;
   public static final String URL ="https://api.github.com/users";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //String eequest for vollery
        final StringRequest request = new StringRequest(URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //success request now ready to fetch data
                Log.d(TAG, "onResponse: "+response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //failed request

            }
        });

        RequestQueue queue = Volley.newRequestQueue(this);

        adapter = new RecyclerAdapter(PopulateData.dataToBePasess());
        recyclerView.setAdapter(adapter);

        int sidePadding = getResources().getDimensionPixelSize(R.dimen.sidePadding);
        int topPadding = getResources().getDimensionPixelSize(R.dimen.topPadding);
        recyclerView.addItemDecoration(new RecyclerDecoration(sidePadding, topPadding));
    }
}
