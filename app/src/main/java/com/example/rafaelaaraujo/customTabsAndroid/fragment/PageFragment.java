package com.example.rafaelaaraujo.customTabsAndroid.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rafaelaaraujo.customTabsAndroid.R;
import com.example.rafaelaaraujo.customTabsAndroid.adapter.BillItemsAdapter;
import com.example.rafaelaaraujo.customTabsAndroid.databinding.PageFragmentBinding;
import com.example.rafaelaaraujo.customTabsAndroid.enuns.StateBillEnum;
import com.example.rafaelaaraujo.customTabsAndroid.model.Bill;

/**
 * Created by rafaela.araujo on 13/06/2016.
 */
public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    public static final String BILL = "LIST_BILL";
    private StateBillEnum stateBillEnum;
    private View view;
    private Bill bill;

    public static PageFragment newInstance(int page, Bill bill) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        args.putSerializable(BILL, bill);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bill = (Bill) getArguments().getSerializable(BILL);
        stateBillEnum = StateBillEnum.getFromOpt(bill.getState());
    }

    private void changeLayout() {
        if (stateBillEnum != null) {
            switch (stateBillEnum) {
                case OPEN:
                    changeColorTop(R.color.bill_open);
                    break;

                case CLOSED:
                    changeColorTop(R.color.bill_closed);
                    break;

                case OVERDUE:
                    changeColorTop(R.color.bill_overdue);
                    break;

                case FUTURE:
                    changeColorTop(R.color.bill_future);
                    break;
            }
        }
        addLineItens();
    }

    private void addLineItens() {
        RecyclerView lista = (RecyclerView) view.findViewById(R.id.line_itens_list);
        lista.setLayoutManager(new LinearLayoutManager(getActivity()));
        BillItemsAdapter adapter = new BillItemsAdapter(getActivity(), bill.getLine_items());
        lista.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        PageFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.page_fragment, container, false);
        view = binding.getRoot();
        binding.setBill(bill);
        changeLayout();
        return view;
    }

    private void changeColorTop(int color) {
        view.findViewById(R.id.linear_topo).setBackgroundColor(ContextCompat.getColor(getContext(), color));
    }
}