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

public final class RowPdpFixedSizeBinding
implements BC3 {
    private final LinearLayout rootView;
    public final LinearLayout rowPdpFixedSizeLayout;
    public final AjioTextView rowPdpFixedSizeTv;

    private RowPdpFixedSizeBinding(LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.rowPdpFixedSizeLayout = linearLayout2;
        this.rowPdpFixedSizeTv = ajioTextView;
    }

    public static RowPdpFixedSizeBinding bind(View object) {
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.row_pdp_fixed_size_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = new RowPdpFixedSizeBinding((LinearLayout)object2, (LinearLayout)object2, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RowPdpFixedSizeBinding inflate(LayoutInflater layoutInflater) {
        return RowPdpFixedSizeBinding.inflate(layoutInflater, null, false);
    }

    public static RowPdpFixedSizeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_pdp_fixed_size;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPdpFixedSizeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

