
package android.databinding;
import com.example.rafaelaaraujo.customTabAndroid.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 18;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.example.rafaelaaraujo.customTabAndroid.R.layout.page_fragment:
                    return com.example.rafaelaaraujo.customTabAndroid.databinding.PageFragmentBinding.bind(view, bindingComponent);
                case com.example.rafaelaaraujo.customTabAndroid.R.layout.fragment_page_adapter:
                    return com.example.rafaelaaraujo.customTabAndroid.databinding.FragmentPageAdapterBinding.bind(view, bindingComponent);
                case com.example.rafaelaaraujo.customTabAndroid.R.layout.list_bill_item:
                    return com.example.rafaelaaraujo.customTabAndroid.databinding.ListBillItemBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -497889076: {
                if(tag.equals("layout/page_fragment_0")) {
                    return com.example.rafaelaaraujo.customTabAndroid.R.layout.page_fragment;
                }
                break;
            }
            case -1493022854: {
                if(tag.equals("layout/fragment_page_adapter_0")) {
                    return com.example.rafaelaaraujo.customTabAndroid.R.layout.fragment_page_adapter;
                }
                break;
            }
            case -546901152: {
                if(tag.equals("layout/list_bill_item_0")) {
                    return com.example.rafaelaaraujo.customTabAndroid.R.layout.list_bill_item;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"bill"
            ,"lastPosition"
            ,"lineItem"
            ,"position"
            ,"state"};
    }
}