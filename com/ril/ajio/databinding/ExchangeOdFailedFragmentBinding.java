/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ExchangeOdFailedFragmentBinding
implements BC3 {
    public final ImageView imvDialogClose;
    private final LinearLayout rootView;
    public final RecyclerView rvRefundItem;
    public final AjioTextView tvClose;
    public final AjioTextView tvExDesription;

    private ExchangeOdFailedFragmentBinding(LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.imvDialogClose = imageView;
        this.rvRefundItem = recyclerView;
        this.tvClose = ajioTextView;
        this.tvExDesription = ajioTextView2;
    }

    public static ExchangeOdFailedFragmentBinding bind(View object) {
        View view;
        int n3 = R$id.imv_dialog_close;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.rvRefundItem;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (RecyclerView)view;
            if (object2 != null) {
                n3 = R$id.tvClose;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.tvExDesription;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (LinearLayout)object;
                        ExchangeOdFailedFragmentBinding exchangeOdFailedFragmentBinding = new ExchangeOdFailedFragmentBinding((LinearLayout)object5, (ImageView)view2, (RecyclerView)object2, (AjioTextView)object3, (AjioTextView)object4);
                        return exchangeOdFailedFragmentBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ExchangeOdFailedFragmentBinding inflate(LayoutInflater layoutInflater) {
        return ExchangeOdFailedFragmentBinding.inflate(layoutInflater, null, false);
    }

    public static ExchangeOdFailedFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exchange_od_failed_fragment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExchangeOdFailedFragmentBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

