package com.example.rafaelaaraujo.customTab.adapter;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.android.databinding.library.baseAdapters.BR;
import com.example.rafaelaaraujo.customTab.fragment.PageFragment;
import com.example.rafaelaaraujo.customTab.model.Bill;
import com.example.rafaelaaraujo.customTabAndroid.R;
import com.example.rafaelaaraujo.customTabAndroid.enuns.StateBillEnum;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Created by rafaela.araujo on 13/06/2016.
 */
public class PageAdapterFragment extends FragmentPagerAdapter {
    private Context context;
    private static ArrayList<Bill> billList;

    public PageAdapterFragment(FragmentManager fm, Context context, ArrayList<Bill> billList) {
        super(fm);
        this.context = context;
        PageAdapterFragment.billList = billList;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1, billList.get(position));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "";
    }

    public View getTabView(int position) {
        View v = LayoutInflater.from(context).inflate(R.layout.fragment_page_adapter, null);
        ViewDataBinding binding = DataBindingUtil.bind(v);
        binding.setVariable(BR.state, billList.get(position).getState());
        binding.setVariable(BR.position, position);
        return v;
    }

    @BindingAdapter("monthString")
    public static void changeMonthString(TextView tv, int position) {
        tv.setText(getMonthString(position));
    }

    private static String getMonthString(int position) {
        String shortMonth = "";
        String rule = "MMM";
        Bill b = billList.get(position);

        if (b.getSummary() != null && b.getSummary().getDue_date() != null) {
            DateTime dateTime = new DateTime(b.getSummary().getDue_date());
            if (dateTime.getYear() != new DateTime().getYear()) {
                rule = "MMM YY";
            }
            shortMonth = dateTime.toString(rule).toUpperCase();
        }
        return shortMonth;
    }

    @BindingAdapter("changeTextBackground")
    public static void changeTextBackground(TextView tv, String state) {
        StateBillEnum stateBillEnum = StateBillEnum.getFromOpt(state);
        if (stateBillEnum != null) {
            switch (stateBillEnum) {
                case OPEN:
                    tv.setTextColor(ContextCompat.getColor(tv.getContext(), R.color.bill_open));
                    break;

                case CLOSED:
                    tv.setTextColor(ContextCompat.getColor(tv.getContext(), R.color.bill_closed));
                    break;

                case OVERDUE:
                    tv.setTextColor(ContextCompat.getColor(tv.getContext(), R.color.bill_overdue));
                    break;

                case FUTURE:
                    tv.setTextColor(ContextCompat.getColor(tv.getContext(), R.color.bill_future));
                    break;
            }
        }
    }

    @BindingAdapter("changeBackground")
    public static void changeBackground(View v, String state) {
        StateBillEnum stateBillEnum = StateBillEnum.getFromOpt(state);
        if (stateBillEnum != null) {
            switch (stateBillEnum) {
                case OPEN:
                    v.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.triangle_open));
                    break;

                case CLOSED:
                    v.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.triangle_closed));
                    break;

                case OVERDUE:
                    v.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.triangle_overdue));
                    break;

                case FUTURE:
                    v.setBackground(ContextCompat.getDrawable(v.getContext(), R.drawable.triangle_future));
                    break;
            }
        }
    }
}
