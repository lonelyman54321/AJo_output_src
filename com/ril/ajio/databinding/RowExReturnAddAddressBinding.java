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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowExReturnAddAddressBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView tvAddNewAddress;

    private RowExReturnAddAddressBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.tvAddNewAddress = ajioTextView;
    }

    public static RowExReturnAddAddressBinding bind(View object) {
        int n3 = R$id.tv_add_new_address;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            RowExReturnAddAddressBinding rowExReturnAddAddressBinding = new RowExReturnAddAddressBinding((LinearLayout)object, ajioTextView);
            return rowExReturnAddAddressBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowExReturnAddAddressBinding inflate(LayoutInflater layoutInflater) {
        return RowExReturnAddAddressBinding.inflate(layoutInflater, null, false);
    }

    public static RowExReturnAddAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_ex_return_add_address;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowExReturnAddAddressBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

