package com.example.rafaelaaraujo.customTabsAndroid.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rafaelaaraujo.customTabsAndroid.BR;
import com.example.rafaelaaraujo.customTabsAndroid.R;
import com.example.rafaelaaraujo.customTabsAndroid.model.LineItem;

import java.util.List;

/**
 * Created by rafaela.araujo on 20/06/2016.
 */
public class BillItemsAdapter extends RecyclerView.Adapter<BillItemsAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private List<LineItem> listItems;

    public BillItemsAdapter(Context context, List<LineItem> listItems) {
        this.listItems = listItems;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.list_bill_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public ViewHolder(View rowView) {
            super(rowView);
            binding = DataBindingUtil.bind(rowView);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position, List<Object> payloads) {
        holder.getBinding().setVariable(BR.lineItem, listItems.get(position));
        holder.getBinding().setVariable(BR.lastPosition, position == listItems.size() - 1);
        holder.getBinding().executePendingBindings();
    }
}
