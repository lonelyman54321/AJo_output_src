/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CartInventoryOosRefreshBinding
implements BC3 {
    public final ImageView lowStockImg;
    public final TextView oosHeaderTv;
    public final TextView oosInfoTv;
    public final RecyclerView oosRv;
    private final ConstraintLayout rootView;

    private CartInventoryOosRefreshBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.lowStockImg = imageView;
        this.oosHeaderTv = textView;
        this.oosInfoTv = textView2;
        this.oosRv = recyclerView;
    }

    public static CartInventoryOosRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.lowStockImg;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.oosHeaderTv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.oosInfoTv;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.oosRv;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (RecyclerView)view;
                    if (object2 != null) {
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        CartInventoryOosRefreshBinding cartInventoryOosRefreshBinding = new CartInventoryOosRefreshBinding((ConstraintLayout)((Object)object3), (ImageView)view2, (TextView)view3, (TextView)view4, (RecyclerView)object2);
                        return cartInventoryOosRefreshBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartInventoryOosRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CartInventoryOosRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CartInventoryOosRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_inventory_oos_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartInventoryOosRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

