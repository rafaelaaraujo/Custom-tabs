package com.example.rafaelaaraujo.customTabAndroid.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.rafaelaaraujo.customTabAndroid.R;
import com.example.rafaelaaraujo.customTabAndroid.communication.response.BillResponse;
import com.example.rafaelaaraujo.customTabAndroid.enuns.StateBillEnum;
import com.example.rafaelaaraujo.customTabAndroid.fragment.PageFragment;
import com.example.rafaelaaraujo.customTabAndroid.model.Bill;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Created by rafaela.araujo on 13/06/2016.
 */
public class FragmentePageAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private Context context;
    private ArrayList<BillResponse> billList;
    private View v;

    public FragmentePageAdapter(FragmentManager fm, Context context, ArrayList<BillResponse> billList) {
        super(fm);
        this.context = context;
        this.billList = billList;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1, billList.get(position).getBill());
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "";
    }

    public View getTabView(int position) {
        StateBillEnum stateBillEnum = StateBillEnum.getFromOpt(billList.get(position).getBill().getState());
        v = LayoutInflater.from(context).inflate(R.layout.custom_tab, null);
        if (stateBillEnum != null) {
            switch (stateBillEnum) {
                case OPEN:
                    changeColorTextAndTriangle(position, R.drawable.triangle_open, R.color.bill_open);
                    break;

                case CLOSED:
                    changeColorTextAndTriangle(position, R.drawable.triangle_closed, R.color.bill_closed);
                    break;

                case OVERDUE:
                    changeColorTextAndTriangle(position, R.drawable.triangle_overdue, R.color.bill_overdue);
                    break;

                case FUTURE:
                    changeColorTextAndTriangle(position, R.drawable.triangle_future,  R.color.bill_future);
                    break;
            }
        }
        return v;
    }

    public String getMonthString(int position) {
        String shortMonth = "";
        String rule = "MMM";
        Bill b = billList.get(position).getBill();

        if (b.getSummary() != null && b.getSummary().getDue_date() != null) {
            DateTime dateTime = new DateTime(b.getSummary().getDue_date());
            if (dateTime.getYear() != new DateTime().getYear()) {
                rule = "MMM YY";
            }
            shortMonth = dateTime.toString(rule).toUpperCase();
        }
        return shortMonth;
    }

    private void changeColorTextAndTriangle(int position,int drawableTriangle, int textColor){
        TextView tv = (TextView) v.findViewById(R.id.title_tab);
        v.findViewById(R.id.triangle).setBackground(ContextCompat.getDrawable(context, drawableTriangle));
        tv.setTextColor(ContextCompat.getColor(context, textColor));
        tv.setText(getMonthString(position));
    }
}
