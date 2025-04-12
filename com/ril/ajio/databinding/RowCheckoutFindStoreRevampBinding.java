/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowCheckoutFindStoreRevampBinding
implements BC3 {
    public final AjioTextView lblFindStore;
    public final AjioEditText pincodeEt;
    public final TextInputLayout pincodeTextInput;
    private final LinearLayout rootView;
    public final AjioTextView tvPincodeCheck;

    private RowCheckoutFindStoreRevampBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioEditText ajioEditText, TextInputLayout textInputLayout, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.lblFindStore = ajioTextView;
        this.pincodeEt = ajioEditText;
        this.pincodeTextInput = textInputLayout;
        this.tvPincodeCheck = ajioTextView2;
    }

    public static RowCheckoutFindStoreRevampBinding bind(View object) {
        View view;
        int n3 = R$id.lbl_find_store;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.pincode_et;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioEditText)view;
            if (object3 != null) {
                n3 = R$id.pincode_text_input;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (TextInputLayout)view;
                if (object4 != null) {
                    n3 = R$id.tv_pincode_check;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (LinearLayout)object;
                        RowCheckoutFindStoreRevampBinding rowCheckoutFindStoreRevampBinding = new RowCheckoutFindStoreRevampBinding((LinearLayout)object6, (AjioTextView)object2, (AjioEditText)object3, (TextInputLayout)((Object)object4), (AjioTextView)object5);
                        return rowCheckoutFindStoreRevampBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCheckoutFindStoreRevampBinding inflate(LayoutInflater layoutInflater) {
        return RowCheckoutFindStoreRevampBinding.inflate(layoutInflater, null, false);
    }

    public static RowCheckoutFindStoreRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_checkout_find_store_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCheckoutFindStoreRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

