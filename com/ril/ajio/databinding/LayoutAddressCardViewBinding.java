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

public final class LayoutAddressCardViewBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView rowOdTvDelivertype;
    public final AjioTextView tvAddress;
    public final AjioTextView tvName;
    public final AjioTextView tvPhone;

    private LayoutAddressCardViewBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = linearLayout;
        this.rowOdTvDelivertype = ajioTextView;
        this.tvAddress = ajioTextView2;
        this.tvName = ajioTextView3;
        this.tvPhone = ajioTextView4;
    }

    public static LayoutAddressCardViewBinding bind(View object) {
        View view;
        int n3 = R$id.row_od_tv_delivertype;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.tvAddress;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.tvName;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.tvPhone;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (LinearLayout)object;
                        LayoutAddressCardViewBinding layoutAddressCardViewBinding = new LayoutAddressCardViewBinding((LinearLayout)object6, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5);
                        return layoutAddressCardViewBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutAddressCardViewBinding inflate(LayoutInflater layoutInflater) {
        return LayoutAddressCardViewBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutAddressCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_address_card_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutAddressCardViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

