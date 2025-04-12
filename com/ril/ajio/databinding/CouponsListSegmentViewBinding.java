/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CouponsListSegmentViewBinding
implements BC3 {
    public final RecyclerView couponsRv;
    private final RelativeLayout rootView;

    private CouponsListSegmentViewBinding(RelativeLayout relativeLayout, RecyclerView recyclerView) {
        this.rootView = relativeLayout;
        this.couponsRv = recyclerView;
    }

    public static CouponsListSegmentViewBinding bind(View object) {
        int n3 = R$id.coupons_rv;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null) {
            object = (RelativeLayout)object;
            CouponsListSegmentViewBinding couponsListSegmentViewBinding = new CouponsListSegmentViewBinding((RelativeLayout)object, recyclerView);
            return couponsListSegmentViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CouponsListSegmentViewBinding inflate(LayoutInflater layoutInflater) {
        return CouponsListSegmentViewBinding.inflate(layoutInflater, null, false);
    }

    public static CouponsListSegmentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupons_list_segment_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponsListSegmentViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

