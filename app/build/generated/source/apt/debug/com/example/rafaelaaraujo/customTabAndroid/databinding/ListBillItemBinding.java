package com.example.rafaelaaraujo.customTabAndroid.databinding;
import com.example.rafaelaaraujo.customTabAndroid.R;
import com.example.rafaelaaraujo.customTabAndroid.BR;
import android.view.View;
public class ListBillItemBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout, 5);
        sViewsWithIds.put(R.id.viewBall, 6);
    }
    // views
    public final android.widget.TextView date;
    public final android.widget.LinearLayout linearLayout;
    private final android.widget.LinearLayout mboundView0;
    public final android.widget.TextView text;
    public final android.widget.TextView values;
    public final android.view.View viewBall;
    public final android.view.View viewLine;
    // variables
    private com.example.rafaelaaraujo.customTabAndroid.model.LineItem mLineItem;
    private boolean mLastPosition;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListBillItemBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.date = (android.widget.TextView) bindings[2];
        this.date.setTag(null);
        this.linearLayout = (android.widget.LinearLayout) bindings[5];
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.text = (android.widget.TextView) bindings[3];
        this.text.setTag(null);
        this.values = (android.widget.TextView) bindings[4];
        this.values.setTag(null);
        this.viewBall = (android.view.View) bindings[6];
        this.viewLine = (android.view.View) bindings[1];
        this.viewLine.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            case BR.lineItem :
                setLineItem((com.example.rafaelaaraujo.customTabAndroid.model.LineItem) variable);
                return true;
            case BR.lastPosition :
                setLastPosition((boolean) variable);
                return true;
        }
        return false;
    }

    public void setLineItem(com.example.rafaelaaraujo.customTabAndroid.model.LineItem lineItem) {
        this.mLineItem = lineItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.lineItem);
        super.requestRebind();
    }
    public com.example.rafaelaaraujo.customTabAndroid.model.LineItem getLineItem() {
        return mLineItem;
    }
    public void setLastPosition(boolean lastPosition) {
        this.mLastPosition = lastPosition;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.lastPosition);
        super.requestRebind();
    }
    public boolean getLastPosition() {
        return mLastPosition;
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
        int lineItemGetAmountLin = 0;
        boolean LineItemGetAmountLin1 = false;
        java.lang.String utilsFormatTitleList = null;
        com.example.rafaelaaraujo.customTabAndroid.model.LineItem lineItem = mLineItem;
        java.lang.String utilsFormatToMonetar = null;
        int lineItemGetAmountLin1 = 0;
        boolean lastPosition = mLastPosition;
        java.lang.String lineItemGetPostDateL = null;
        java.lang.String utilsFomatteDateddMM = null;
        int lastPositionGONEView = 0;
        int LineItemGetAmountLin2 = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                // read Utils.formatTitleListLineItem(lineItem)
                utilsFormatTitleList = com.example.rafaelaaraujo.customTabAndroid.util.Utils.formatTitleListLineItem(lineItem);
                if (lineItem != null) {
                    // read lineItem.getAmount()
                    lineItemGetAmountLin1 = lineItem.getAmount();
                    // read lineItem.getPost_date()
                    lineItemGetPostDateL = lineItem.getPost_date();
                }


                // read lineItem.getAmount() < 0
                LineItemGetAmountLin1 = (lineItemGetAmountLin1) < (0);
                // read Utils.formatToMonetary(lineItem.getAmount(), false)
                utilsFormatToMonetar = com.example.rafaelaaraujo.customTabAndroid.util.Utils.formatToMonetary(lineItemGetAmountLin1, false);
                // read Utils.fomatteDateddMMM(lineItem.getPost_date())
                utilsFomatteDateddMM = com.example.rafaelaaraujo.customTabAndroid.util.Utils.fomatteDateddMMM(lineItemGetPostDateL);
                if((dirtyFlags & 0x5L) != 0) {
                    if (LineItemGetAmountLin1) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x100L;
                    } else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x80L;
                    }}


                // read lineItem.getAmount() < 0 ? @android:color/bill_overdue : @android:color/item_bill_text
                lineItemGetAmountLin = (LineItemGetAmountLin1) ? (android.databinding.DynamicUtil.getColorFromResource(values, R.color.bill_overdue)) : (android.databinding.DynamicUtil.getColorFromResource(values, R.color.item_bill_text));
                // read lineItem.getAmount() < 0 ? @android:color/bill_overdue : @android:color/item_bill_text
                LineItemGetAmountLin2 = (LineItemGetAmountLin1) ? (android.databinding.DynamicUtil.getColorFromResource(text, R.color.bill_overdue)) : (android.databinding.DynamicUtil.getColorFromResource(text, R.color.item_bill_text));
        }
        if ((dirtyFlags & 0x6L) != 0) {

                if((dirtyFlags & 0x6L) != 0) {
                    if (lastPosition) {
                        dirtyFlags |= 0x40L;
                    } else {
                        dirtyFlags |= 0x20L;
                    }}


                // read lastPosition ? View.GONE : View.VISIBLE
                lastPositionGONEView = (lastPosition) ? (android.view.View.GONE) : (android.view.View.VISIBLE);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.date, utilsFomatteDateddMM);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.text, utilsFormatTitleList);
            this.text.setTextColor(LineItemGetAmountLin2);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.values, utilsFormatToMonetar);
            this.values.setTextColor(lineItemGetAmountLin);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.viewLine.setVisibility(lastPositionGONEView);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ListBillItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListBillItemBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ListBillItemBinding>inflate(inflater, com.example.rafaelaaraujo.customTabAndroid.R.layout.list_bill_item, root, attachToRoot, bindingComponent);
    }
    public static ListBillItemBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListBillItemBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.rafaelaaraujo.customTabAndroid.R.layout.list_bill_item, null, false), bindingComponent);
    }
    public static ListBillItemBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ListBillItemBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/list_bill_item_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ListBillItemBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): lineItem
        flag 1 (0x2L): lastPosition
        flag 2 (0x3L): null
        flag 3 (0x4L): lineItem.getAmount() < 0 ? @android:color/bill_overdue : @android:color/item_bill_text
        flag 4 (0x5L): lineItem.getAmount() < 0 ? @android:color/bill_overdue : @android:color/item_bill_text
        flag 5 (0x6L): lastPosition ? View.GONE : View.VISIBLE
        flag 6 (0x7L): lastPosition ? View.GONE : View.VISIBLE
        flag 7 (0x8L): lineItem.getAmount() < 0 ? @android:color/bill_overdue : @android:color/item_bill_text
        flag 8 (0x9L): lineItem.getAmount() < 0 ? @android:color/bill_overdue : @android:color/item_bill_text
    flag mapping end*/
    //end
}