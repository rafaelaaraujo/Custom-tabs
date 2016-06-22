package com.example.rafaelaaraujo.customTabsAndroid.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.rafaelaaraujo.customTabsAndroid.R;
import com.example.rafaelaaraujo.customTabsAndroid.adapter.FragmentePageAdapter;
import com.example.rafaelaaraujo.customTabsAndroid.communication.response.BillResponse;
import com.example.rafaelaaraujo.customTabsAndroid.communication.service.BillService;

import java.util.ArrayList;

/**
 * Created by rafaela.araujo on 13/06/2016.
 */
public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private ArrayList<BillResponse> listbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getListBill();
        setContentView(R.layout.main);
    }

    private void configurePagerView() {
        FragmentePageAdapter adapter = new FragmentePageAdapter(getSupportFragmentManager(), MainActivity.this, listbill);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorHeight(0);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setCustomView(adapter.getTabView(i));
        }

        tabLayout.setOnTabSelectedListener(tabSelectedListner);
        changeTabLayout(true, tabLayout.getTabAt(0));
    }

    private TabLayout.OnTabSelectedListener tabSelectedListner = new TabLayout.OnTabSelectedListener() {
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
    };

    private void changeTabLayout(boolean select, TabLayout.Tab tab) {
        View v = tab.getCustomView();
        if (v != null) {
            TextView tv = (TextView) v.findViewById(R.id.title_tab);

            if (select) {
                v.findViewById(R.id.triangle).setVisibility(View.VISIBLE);
                if (tv != null)
                    tv.setTextSize(17);

            } else {
                v.findViewById(R.id.triangle).setVisibility(View.GONE);
                if (tv != null)
                    tv.setTextSize(13);
            }
        }
    }

    private void getListBill() {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setMessage(getString(R.string.buscando_dados));
        pd.show();
        pd.setCancelable(false);
        BillService.getBill(this, new Response.Listener<ArrayList<BillResponse>>() {
            @Override
            public void onResponse(ArrayList<BillResponse> response) {
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
}
