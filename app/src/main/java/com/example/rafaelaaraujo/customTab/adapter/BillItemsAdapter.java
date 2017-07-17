package com.example.rafaelaaraujo.customTab.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.rafaelaaraujo.customTab.adapter.viewHolder.BillItemsViewHolder;
import com.example.rafaelaaraujo.customTabAndroid.BR;
import com.example.rafaelaaraujo.customTabAndroid.R;
import com.example.rafaelaaraujo.customTab.model.LineItem;

import java.util.List;

/**
 * Created by rafaela.araujo on 20/06/2016.
 */
public class BillItemsAdapter extends RecyclerView.Adapter<BillItemsViewHolder> {

    private final LayoutInflater inflater;
    private List<LineItem> listItems;

    public BillItemsAdapter(Context context, List<LineItem> listItems) {
        this.listItems = listItems;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public BillItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BillItemsViewHolder(inflater.inflate(R.layout.list_bill_item, parent, false));
    }

    @Override
    public void onBindViewHolder(BillItemsViewHolder holder, int position) {}

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
    
    @Override
    public void onBindViewHolder(BillItemsViewHolder holder, int position, List<Object> payloads) {
        holder.getBinding().setVariable(BR.lineItem, listItems.get(position));
        holder.getBinding().setVariable(BR.lastPosition, position == listItems.size() - 1);
        holder.getBinding().executePendingBindings();
    }
}
