package com.example.rafaelaaraujo.customTabAndroid.databinding;
import com.example.rafaelaaraujo.customTabAndroid.R;
import com.example.rafaelaaraujo.customTabAndroid.BR;
import android.view.View;
public class CustomTabBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final android.widget.FrameLayout mboundView0;
    public final android.widget.TextView titleTab;
    public final android.view.View triangle;
    // variables
    private int mPosition;
    private java.lang.String mState;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CustomTabBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleTab = (android.widget.TextView) bindings[1];
        this.titleTab.setTag(null);
        this.triangle = (android.view.View) bindings[2];
        this.triangle.setTag(null);
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
            case BR.position :
                setPosition((int) variable);
                return true;
            case BR.state :
                setState((java.lang.String) variable);
                return true;
        }
        return false;
    }

    public void setPosition(int position) {
        this.mPosition = position;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public int getPosition() {
        return mPosition;
    }
    public void setState(java.lang.String state) {
        this.mState = state;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.state);
        super.requestRebind();
    }
    public java.lang.String getState() {
        return mState;
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
        int position = mPosition;
        java.lang.String state = mState;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.example.rafaelaaraujo.customTabAndroid.adapter.FragmentePageAdapter.changeMonthString(this.titleTab, position);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.example.rafaelaaraujo.customTabAndroid.adapter.FragmentePageAdapter.changeTextBackground(this.titleTab, state);
            com.example.rafaelaaraujo.customTabAndroid.adapter.FragmentePageAdapter.changeBackground(this.triangle, state);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static CustomTabBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static CustomTabBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<CustomTabBinding>inflate(inflater, com.example.rafaelaaraujo.customTabAndroid.R.layout.custom_tab, root, attachToRoot, bindingComponent);
    }
    public static CustomTabBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static CustomTabBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.rafaelaaraujo.customTabAndroid.R.layout.custom_tab, null, false), bindingComponent);
    }
    public static CustomTabBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static CustomTabBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/custom_tab_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new CustomTabBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): position
        flag 1 (0x2L): state
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}