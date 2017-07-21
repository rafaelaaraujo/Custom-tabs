package com.example.rafaelaaraujo.customTabAndroid.databinding;
import com.example.rafaelaaraujo.customTabAndroid.R;
import com.example.rafaelaaraujo.customTabAndroid.BR;
import android.view.View;
public class PageFragmentBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txt_accumulative, 10);
        sViewsWithIds.put(R.id.txt_values, 11);
        sViewsWithIds.put(R.id.line_itens_list, 12);
    }
    // views
    public final android.widget.Button btnGenerateBilet;
    public final android.widget.TextView dueDate;
    public final android.support.v7.widget.RecyclerView lineItensList;
    public final android.widget.LinearLayout linearTopo;
    public final android.widget.LinearLayout linearTotalAcumulative;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.TextView mboundView2;
    public final android.widget.TextView txtAccumulative;
    public final android.widget.TextView txtClosed;
    public final android.widget.TextView txtFromTo;
    public final android.widget.TextView txtFuture;
    public final android.widget.TextView txtTotalAccumulative;
    public final android.widget.TextView txtValues;
    // variables
    private com.example.rafaelaaraujo.customTabAndroid.model.Bill mBill;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PageFragmentBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds);
        this.btnGenerateBilet = (android.widget.Button) bindings[8];
        this.btnGenerateBilet.setTag(null);
        this.dueDate = (android.widget.TextView) bindings[3];
        this.dueDate.setTag(null);
        this.lineItensList = (android.support.v7.widget.RecyclerView) bindings[12];
        this.linearTopo = (android.widget.LinearLayout) bindings[1];
        this.linearTopo.setTag(null);
        this.linearTotalAcumulative = (android.widget.LinearLayout) bindings[6];
        this.linearTotalAcumulative.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.txtAccumulative = (android.widget.TextView) bindings[10];
        this.txtClosed = (android.widget.TextView) bindings[4];
        this.txtClosed.setTag(null);
        this.txtFromTo = (android.widget.TextView) bindings[9];
        this.txtFromTo.setTag(null);
        this.txtFuture = (android.widget.TextView) bindings[5];
        this.txtFuture.setTag(null);
        this.txtTotalAccumulative = (android.widget.TextView) bindings[7];
        this.txtTotalAccumulative.setTag(null);
        this.txtValues = (android.widget.TextView) bindings[11];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.bill :
                setBill((com.example.rafaelaaraujo.customTabAndroid.model.Bill) variable);
                return true;
        }
        return false;
    }

    public void setBill(com.example.rafaelaaraujo.customTabAndroid.model.Bill bill) {
        this.mBill = bill;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bill);
        super.requestRebind();
    }
    public com.example.rafaelaaraujo.customTabAndroid.model.Bill getBill() {
        return mBill;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String utilsFomatteDateddMM = null;
        android.graphics.drawable.Drawable billGetStateBillEqua = null;
        boolean billGetSummaryBillGe = false;
        java.lang.String androidStringFromToD = null;
        java.lang.String billGetSummaryBillGe1 = null;
        com.example.rafaelaaraujo.customTabAndroid.model.Summary billGetSummaryBill = null;
        int billGetSummaryBillGe2 = 0;
        java.lang.String billGetSummaryBillGe3 = null;
        int BillGetSummaryBillGe1 = 0;
        boolean BillGetSummaryBillGe2 = false;
        boolean logicalNotBillGetSta = false;
        boolean LogicalNotBillGetSta1 = false;
        boolean billGetStateBillEqua1 = false;
        boolean billGetStateBillEqua2 = false;
        java.lang.String billGetSummaryBillGe4 = null;
        java.lang.String androidStringDateClo = null;
        boolean logicalNotBillGetSta1 = false;
        com.example.rafaelaaraujo.customTabAndroid.model.Bill bill = mBill;
        java.lang.String UtilsFomatteDateddMM1 = null;
        java.lang.String utilsFormatToMonetar = null;
        boolean billGetStateBillEqua3 = false;
        boolean billGetStateBillEqua4 = false;
        int LogicalNotBillGetSta2 = 0;
        java.lang.String billGetStateBill = null;
        int BillGetStateBillEqua1 = 0;
        int BillGetStateBillEqua2 = 0;
        java.lang.String androidStringDueDate = null;
        java.lang.String UtilsFomatteDateddMM2 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (bill != null) {
                    // read bill.getSummary()
                    billGetSummaryBill = bill.getSummary();
                    // read bill.getState()
                    billGetStateBill = bill.getState();
                }


                if (billGetSummaryBill != null) {
                    // read bill.getSummary().getOpen_date()
                    billGetSummaryBillGe1 = billGetSummaryBill.getOpen_date();
                    // read bill.getSummary().getTotal_cumulative()
                    billGetSummaryBillGe2 = billGetSummaryBill.getTotal_cumulative();
                    // read bill.getSummary().getClose_date()
                    billGetSummaryBillGe3 = billGetSummaryBill.getClose_date();
                    // read bill.getSummary().getDue_date()
                    billGetSummaryBillGe4 = billGetSummaryBill.getDue_date();
                }
                if (billGetStateBill != null) {
                    // read bill.getState().equals("open")
                    billGetStateBillEqua1 = billGetStateBill.equals("open");
                    // read bill.getState().equals("closed")
                    billGetStateBillEqua2 = billGetStateBill.equals("closed");
                    // read bill.getState().equals("future")
                    billGetStateBillEqua4 = billGetStateBill.equals("future");
                }
                if((dirtyFlags & 0x3L) != 0) {
                    if (billGetStateBillEqua1) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x2000L;
                    } else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x1000L;
                    }}
                if((dirtyFlags & 0x3L) != 0) {
                    if (billGetStateBillEqua4) {
                        dirtyFlags |= 0x800L;
                    } else {
                        dirtyFlags |= 0x400L;
                    }}


                // read Utils.fomatteDateddMMM(bill.getSummary().getOpen_date())
                UtilsFomatteDateddMM2 = com.example.rafaelaaraujo.customTabAndroid.util.Utils.fomatteDateddMMM(billGetSummaryBillGe1);
                // read bill.getSummary().getTotal_cumulative() > 0
                BillGetSummaryBillGe2 = (billGetSummaryBillGe2) > (0);
                // read Utils.formatToMonetary(bill.getSummary().getTotal_cumulative(), true)
                utilsFormatToMonetar = com.example.rafaelaaraujo.customTabAndroid.util.Utils.formatToMonetary(billGetSummaryBillGe2, true);
                // read Utils.fomatteDateddMMM(bill.getSummary().getClose_date())
                utilsFomatteDateddMM = com.example.rafaelaaraujo.customTabAndroid.util.Utils.fomatteDateddMMM(billGetSummaryBillGe3);
                // read Utils.fomatteDateddMMM(bill.getSummary().getDue_date())
                UtilsFomatteDateddMM1 = com.example.rafaelaaraujo.customTabAndroid.util.Utils.fomatteDateddMMM(billGetSummaryBillGe4);
                // read bill.getState().equals("open") ? @android:drawable/selector_button_generate_billet_blue : @android:drawable/selector_button_generate_billet_red
                billGetStateBillEqua = (billGetStateBillEqua1) ? (android.databinding.DynamicUtil.getDrawableFromResource(btnGenerateBilet, R.drawable.selector_button_generate_billet_blue)) : (android.databinding.DynamicUtil.getDrawableFromResource(btnGenerateBilet, R.drawable.selector_button_generate_billet_red));
                // read bill.getState().equals("open") ? View.VISIBLE : View.GONE
                BillGetStateBillEqua2 = (billGetStateBillEqua1) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
                // read !bill.getState().equals("future")
                logicalNotBillGetSta = !billGetStateBillEqua4;
                // read bill.getState().equals("future") ? View.VISIBLE : View.GONE
                BillGetStateBillEqua1 = (billGetStateBillEqua4) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
                if((dirtyFlags & 0x3L) != 0) {
                    if (logicalNotBillGetSta) {
                        dirtyFlags |= 0x80L;
                    } else {
                        dirtyFlags |= 0x40L;
                    }}


                // read (bill.getSummary().getTotal_cumulative() > 0) & (bill.getState().equals("closed"))
                billGetSummaryBillGe = (BillGetSummaryBillGe2) & (billGetStateBillEqua2);
                // read @android:string/from_to_date
                androidStringFromToD = txtFromTo.getResources().getString(R.string.from_to_date, UtilsFomatteDateddMM2, utilsFomatteDateddMM);
                // read @android:string/date_closed
                androidStringDateClo = txtClosed.getResources().getString(R.string.date_closed, utilsFomatteDateddMM);
                // read @android:string/due_date
                androidStringDueDate = dueDate.getResources().getString(R.string.due_date, UtilsFomatteDateddMM1);
                if((dirtyFlags & 0x3L) != 0) {
                    if (billGetSummaryBillGe) {
                        dirtyFlags |= 0x20L;
                    } else {
                        dirtyFlags |= 0x10L;
                    }}


                // read (bill.getSummary().getTotal_cumulative() > 0) & (bill.getState().equals("closed")) ? View.VISIBLE : View.GONE
                BillGetSummaryBillGe1 = (billGetSummaryBillGe) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (billGetStateBill != null) {
                    // read bill.getState().equals("overdue")
                    billGetStateBillEqua3 = billGetStateBill.equals("overdue");
                }


                // read !bill.getState().equals("overdue")
                logicalNotBillGetSta1 = !billGetStateBillEqua3;
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read !bill.getState().equals("future") ? !bill.getState().equals("overdue") : false
                LogicalNotBillGetSta1 = (logicalNotBillGetSta) ? (logicalNotBillGetSta1) : (false);
                if((dirtyFlags & 0x3L) != 0) {
                    if (LogicalNotBillGetSta1) {
                        dirtyFlags |= 0x200L;
                    } else {
                        dirtyFlags |= 0x100L;
                    }}


                // read !bill.getState().equals("future") ? !bill.getState().equals("overdue") : false ? View.VISIBLE : View.GONE
                LogicalNotBillGetSta2 = (LogicalNotBillGetSta1) ? (android.view.View.VISIBLE) : (android.view.View.GONE);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.ViewBindingAdapter.setBackground(this.btnGenerateBilet, billGetStateBillEqua);
            com.example.rafaelaaraujo.customTabAndroid.fragment.PageFragment.setTextStyle(this.btnGenerateBilet, billGetStateBill);
            this.btnGenerateBilet.setVisibility(LogicalNotBillGetSta2);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.dueDate, androidStringDueDate);
            com.example.rafaelaaraujo.customTabAndroid.fragment.PageFragment.changeLayout(this.linearTopo, billGetStateBill);
            this.linearTotalAcumulative.setVisibility(BillGetSummaryBillGe1);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, utilsFormatToMonetar);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.txtClosed, androidStringDateClo);
            this.txtClosed.setVisibility(BillGetStateBillEqua2);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.txtFromTo, androidStringFromToD);
            this.txtFuture.setVisibility(BillGetStateBillEqua1);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.txtTotalAccumulative, utilsFormatToMonetar);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.txtFuture, txtFuture.getResources().getString(R.string.date_future));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static PageFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static PageFragmentBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<PageFragmentBinding>inflate(inflater, com.example.rafaelaaraujo.customTabAndroid.R.layout.page_fragment, root, attachToRoot, bindingComponent);
    }
    public static PageFragmentBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static PageFragmentBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.rafaelaaraujo.customTabAndroid.R.layout.page_fragment, null, false), bindingComponent);
    }
    public static PageFragmentBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static PageFragmentBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/page_fragment_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new PageFragmentBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): bill
        flag 1 (0x2L): null
        flag 2 (0x3L): bill.getState().equals("open") ? @android:drawable/selector_button_generate_billet_blue : @android:drawable/selector_button_generate_billet_red
        flag 3 (0x4L): bill.getState().equals("open") ? @android:drawable/selector_button_generate_billet_blue : @android:drawable/selector_button_generate_billet_red
        flag 4 (0x5L): (bill.getSummary().getTotal_cumulative() > 0) & (bill.getState().equals("closed")) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): (bill.getSummary().getTotal_cumulative() > 0) & (bill.getState().equals("closed")) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): !bill.getState().equals("future") ? !bill.getState().equals("overdue") : false
        flag 7 (0x8L): !bill.getState().equals("future") ? !bill.getState().equals("overdue") : false
        flag 8 (0x9L): !bill.getState().equals("future") ? !bill.getState().equals("overdue") : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): !bill.getState().equals("future") ? !bill.getState().equals("overdue") : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): bill.getState().equals("future") ? View.VISIBLE : View.GONE
        flag 11 (0xcL): bill.getState().equals("future") ? View.VISIBLE : View.GONE
        flag 12 (0xdL): bill.getState().equals("open") ? View.VISIBLE : View.GONE
        flag 13 (0xeL): bill.getState().equals("open") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}