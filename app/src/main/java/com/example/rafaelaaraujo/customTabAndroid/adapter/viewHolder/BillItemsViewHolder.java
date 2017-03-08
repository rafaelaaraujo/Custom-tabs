package com.example.rafaelaaraujo.customTabAndroid.adapter.viewHolder;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by rafaela.araujo
 * on 07/03/2017.
 */

public class BillItemsViewHolder extends RecyclerView.ViewHolder{
    private ViewDataBinding binding;

    public BillItemsViewHolder(View rowView) {
        super(rowView);
        binding = DataBindingUtil.bind(rowView);
    }

    public ViewDataBinding getBinding() {
        return binding;
    }

}
