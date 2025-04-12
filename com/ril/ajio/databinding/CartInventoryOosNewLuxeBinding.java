/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CartInventoryOosNewLuxeBinding
implements BC3 {
    public final TextView cartBagStockItems;
    public final ConstraintLayout cartProductParent;
    public final LinearLayout idOOSHeaderView;
    public final ImageView lowStockImg;
    public final TextView oosHeaderTv;
    public final RecyclerView oosRv;
    public final TextView removeAllBtn;
    private final ConstraintLayout rootView;

    private CartInventoryOosNewLuxeBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ImageView imageView, TextView textView2, RecyclerView recyclerView, TextView textView3) {
        this.rootView = constraintLayout;
        this.cartBagStockItems = textView;
        this.cartProductParent = constraintLayout2;
        this.idOOSHeaderView = linearLayout;
        this.lowStockImg = imageView;
        this.oosHeaderTv = textView2;
        this.oosRv = recyclerView;
        this.removeAllBtn = textView3;
    }

    public static CartInventoryOosNewLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.cart_bag_stock_items;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.cartProductParent;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (ConstraintLayout)view;
            if (object2 != null) {
                n3 = R$id.idOOSHeaderView;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.lowStockImg;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (ImageView)view;
                    if (view4 != null) {
                        n3 = R$id.oosHeaderTv;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null) {
                            n3 = R$id.oosRv;
                            Object object3 = view = dd2_2.a(n3, object);
                            object3 = (RecyclerView)view;
                            if (object3 != null) {
                                n3 = R$id.removeAllBtn;
                                View view6 = view = dd2_2.a(n3, object);
                                view6 = (TextView)view;
                                if (view6 != null) {
                                    Object object4 = object;
                                    object4 = (ConstraintLayout)((Object)object);
                                    CartInventoryOosNewLuxeBinding cartInventoryOosNewLuxeBinding = new CartInventoryOosNewLuxeBinding((ConstraintLayout)((Object)object4), (TextView)view2, (ConstraintLayout)((Object)object2), (LinearLayout)view3, (ImageView)view4, (TextView)view5, (RecyclerView)object3, (TextView)view6);
                                    return cartInventoryOosNewLuxeBinding;
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartInventoryOosNewLuxeBinding inflate(LayoutInflater layoutInflater) {
        return CartInventoryOosNewLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static CartInventoryOosNewLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_inventory_oos_new_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartInventoryOosNewLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

