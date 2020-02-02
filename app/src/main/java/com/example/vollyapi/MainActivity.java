package com.example.vollyapi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.btnId);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prev();
            }
        });
    }


//    private void prev() {
//        String url= "http://www.json-generator.com/api/json/get/ceplgVVvvS?indent=2";
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
//            }
//        },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                     //display the error in toast in occurrs
//                        Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
////                       // Toast.makeText(getApplicationContext(),error.getMessage(), Toast.LENGTH_SHORT).show();
//                    }
//                });

//        //creating a request queue
//
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        requestQueue.add(stringRequest);


        private void prev() {
            StringRequest stringRequest = new StringRequest(Request.Method.GET, "http://www.json-generator.com/api/json/get/ceplgVVvvS?indent=2",
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();



                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
//displaying the error in toast if occurrs
                            Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });

//creating a request queue
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);

        }
    }