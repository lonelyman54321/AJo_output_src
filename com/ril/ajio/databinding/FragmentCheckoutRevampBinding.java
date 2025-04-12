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
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.databinding.CheckoutShimmerBinding;

public final class FragmentCheckoutRevampBinding
implements BC3 {
    public final CheckoutShimmerBinding checkoutLayoutShimmer;
    public final AjioProgressView checkoutProgressBar;
    public final RecyclerView fragmentCheckoutRv;
    private final RelativeLayout rootView;

    private FragmentCheckoutRevampBinding(RelativeLayout relativeLayout, CheckoutShimmerBinding checkoutShimmerBinding, AjioProgressView ajioProgressView, RecyclerView recyclerView) {
        this.rootView = relativeLayout;
        this.checkoutLayoutShimmer = checkoutShimmerBinding;
        this.checkoutProgressBar = ajioProgressView;
        this.fragmentCheckoutRv = recyclerView;
    }

    public static FragmentCheckoutRevampBinding bind(View object) {
        Object object2;
        int n3 = R$id.checkout_layout_shimmer;
        Object object3 = dd2_2.a(n3, object);
        if (object3 != null) {
            RecyclerView recyclerView;
            object2 = CheckoutShimmerBinding.bind(object3);
            int n4 = R$id.checkout_progress_bar;
            AjioProgressView ajioProgressView = (AjioProgressView)dd2_2.a(n4, object);
            if (ajioProgressView != null && (recyclerView = (RecyclerView)dd2_2.a(n4 = R$id.fragment_checkout_rv, object)) != null) {
                object = (RelativeLayout)object;
                object3 = new FragmentCheckoutRevampBinding((RelativeLayout)object, (CheckoutShimmerBinding)object2, ajioProgressView, recyclerView);
                return object3;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static FragmentCheckoutRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCheckoutRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCheckoutRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_checkout_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCheckoutRevampBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

