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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CustomerOpinionItemBinding
implements BC3 {
    public final AjioTextView expTitle;
    public final RecyclerView experienceRv;
    private final LinearLayout rootView;

    private CustomerOpinionItemBinding(LinearLayout linearLayout, AjioTextView ajioTextView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.expTitle = ajioTextView;
        this.experienceRv = recyclerView;
    }

    public static CustomerOpinionItemBinding bind(View object) {
        RecyclerView recyclerView;
        int n3 = R$id.exp_title;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.experience_rv, object)) != null) {
            object = (LinearLayout)object;
            CustomerOpinionItemBinding customerOpinionItemBinding = new CustomerOpinionItemBinding((LinearLayout)object, ajioTextView, recyclerView);
            return customerOpinionItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CustomerOpinionItemBinding inflate(LayoutInflater layoutInflater) {
        return CustomerOpinionItemBinding.inflate(layoutInflater, null, false);
    }

    public static CustomerOpinionItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.customer_opinion_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CustomerOpinionItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

