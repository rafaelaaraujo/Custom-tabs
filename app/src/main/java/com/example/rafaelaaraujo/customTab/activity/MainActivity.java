package com.example.rafaelaaraujo.customTab.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.rafaelaaraujo.customTab.model.Bill;
import com.example.rafaelaaraujo.customTabAndroid.R;
import com.example.rafaelaaraujo.customTab.adapter.PageAdapterFragment;
import com.example.rafaelaaraujo.customTab.communication.service.BillService;

import java.util.ArrayList;

/**
 * Created by rafaela.araujo on 13/06/2016.
 */
public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    private ViewPager viewPager;
    private ArrayList<Bill> listbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getListBill();
        setContentView(R.layout.main);
    }

    private void configurePagerView() {
        PageAdapterFragment adapter = new PageAdapterFragment(getSupportFragmentManager(), MainActivity.this, listbill);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorHeight(0);

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setCustomView(adapter.getTabView(i));
        }

        tabLayout.setOnTabSelectedListener(this);
        changeTabLayout(true, tabLayout.getTabAt(0));
    }

    private void changeTabLayout(boolean select, TabLayout.Tab tab) {
        View v = tab.getCustomView();
        if (v != null) {
            v.findViewById(R.id.triangle).setVisibility(select ? View.VISIBLE : View.GONE);
            ((TextView) v.findViewById(R.id.title_tab)).setTextSize(select ? 17 : 14);
        }
    }

    private void getListBill() {
        final ProgressDialog pd = showProgressDialog();
        BillService.getBill(this, new Response.Listener<ArrayList<Bill>>() {
            @Override
            public void onResponse(ArrayList<Bill> response) {
                pd.dismiss();
                listbill = response;
                configurePagerView();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                pd.dismiss();
            }
        });
    }

    @NonNull
    private ProgressDialog showProgressDialog() {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setMessage(getString(R.string.buscando_dados));
        pd.show();
        pd.setCancelable(false);
        return pd;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        changeTabLayout(true, tab);
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        changeTabLayout(false, tab);
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }
}
