package com.example.rafaelaaraujo.customTabAndroid.communication.service;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.rafaelaaraujo.customTabAndroid.communication.response.BillResponse;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by rafaela.araujo on 14/06/2016.
 */
public class BillService {

    public static void getBill(Context context, final Response.Listener<ArrayList<BillResponse>> sucess, Response.ErrorListener error) {
        RequestQueue queue = Volley.newRequestQueue(context);
        String url = "https://s3-sa-east-1.amazonaws.com/mobile-challenge/bill/bill_new.json";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray jsonObj = new JSONArray(response);
                    ArrayList<BillResponse> listbill = new ArrayList<BillResponse>();
                    if (response != null) {
                        for (int i=0;i<jsonObj.length();i++){
                            listbill.add(new Gson().fromJson(jsonObj.get(i).toString(), BillResponse.class));
                        }
                    }

                    sucess.onResponse(listbill);
                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }, error);
        queue.add(stringRequest);
    }

}
