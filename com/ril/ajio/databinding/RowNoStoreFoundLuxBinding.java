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

public final class RowNoStoreFoundLuxBinding
implements BC3 {
    public final AjioTextView dnsTvFindstore;
    private final LinearLayout rootView;

    private RowNoStoreFoundLuxBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.dnsTvFindstore = ajioTextView;
    }

    public static RowNoStoreFoundLuxBinding bind(View object) {
        int n3 = R$id.dns_tv_findstore;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            RowNoStoreFoundLuxBinding rowNoStoreFoundLuxBinding = new RowNoStoreFoundLuxBinding((LinearLayout)object, ajioTextView);
            return rowNoStoreFoundLuxBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowNoStoreFoundLuxBinding inflate(LayoutInflater layoutInflater) {
        return RowNoStoreFoundLuxBinding.inflate(layoutInflater, null, false);
    }

    public static RowNoStoreFoundLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_no_store_found_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowNoStoreFoundLuxBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

