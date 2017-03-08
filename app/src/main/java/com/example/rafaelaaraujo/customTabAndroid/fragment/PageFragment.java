package com.example.rafaelaaraujo.customTabAndroid.fragment;

        import android.databinding.BindingAdapter;
        import android.databinding.DataBindingUtil;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.content.ContextCompat;
        import android.support.v4.widget.TextViewCompat;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.LinearLayout;

        import com.example.rafaelaaraujo.customTabAndroid.R;
        import com.example.rafaelaaraujo.customTabAndroid.adapter.BillItemsAdapter;
        import com.example.rafaelaaraujo.customTabAndroid.databinding.PageFragmentBinding;
        import com.example.rafaelaaraujo.customTabAndroid.enuns.StateBillEnum;
        import com.example.rafaelaaraujo.customTabAndroid.model.Bill;

/**
 * Created by rafaela.araujo on 13/06/2016.
 */
public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    public static final String BILL = "LIST_BILL";
    private static StateBillEnum stateBillEnum;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        PageFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.page_fragment, container, false);
        view = binding.getRoot();
        binding.setBill(bill);
        addLineItens();
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bill = (Bill) getArguments().getSerializable(BILL);
    }

    @BindingAdapter({"changeBackground"})
    public static void changeLayout(LinearLayout ll, String state) {
        stateBillEnum = StateBillEnum.getFromOpt(state);
        if (stateBillEnum != null) {
            switch (stateBillEnum) {
                case OPEN:
                    ll.setBackgroundColor(ContextCompat.getColor(ll.getContext(), R.color.bill_open));
                    break;

                case CLOSED:
                    ll.setBackgroundColor(ContextCompat.getColor(ll.getContext(),R.color.bill_closed));
                    break;

                case OVERDUE:
                    ll.setBackgroundColor(ContextCompat.getColor(ll.getContext(),R.color.bill_overdue));
                    break;

                case FUTURE:
                    ll.setBackgroundColor(ContextCompat.getColor(ll.getContext(),R.color.bill_future));
                    break;
            }
        }
    }

    private  void addLineItens() {
        RecyclerView lista = (RecyclerView) view.findViewById(R.id.line_itens_list);
        lista.setLayoutManager(new LinearLayoutManager(getActivity()));
        BillItemsAdapter adapter = new BillItemsAdapter(getActivity(), bill.getLine_items());
        lista.setAdapter(adapter);
    }

    @BindingAdapter({"textBackground"})
    public static void setTextStyle(Button b, String status) {
        b.setTextAppearance(b.getContext(), status.equals("open") ? R.style.AppTheme_TextOpen : R.style.AppTheme_TextClose);
    }
}