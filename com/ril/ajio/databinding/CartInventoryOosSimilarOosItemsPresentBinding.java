/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.SeekBar
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CartInventoryOosSimilarOosItemsPresentBinding
implements BC3 {
    public final AppCompatImageView lowStockImg;
    public final TextView oosCountTv;
    public final TextView oosHeaderTv;
    public final TextView oosInfoRefresh;
    public final ViewPager2 oosRv;
    public final SeekBar progressIndicator;
    private final RelativeLayout rootView;

    private CartInventoryOosSimilarOosItemsPresentBinding(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, ViewPager2 viewPager2, SeekBar seekBar) {
        this.rootView = relativeLayout;
        this.lowStockImg = appCompatImageView;
        this.oosCountTv = textView;
        this.oosHeaderTv = textView2;
        this.oosInfoRefresh = textView3;
        this.oosRv = viewPager2;
        this.progressIndicator = seekBar;
    }

    public static CartInventoryOosSimilarOosItemsPresentBinding bind(View object) {
        View view;
        int n3 = R$id.lowStockImg;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.oosCountTv;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (TextView)view;
            if (view2 != null) {
                n3 = R$id.oosHeaderTv;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.oosInfoRefresh;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.oosRv;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (ViewPager2)view;
                        if (object3 != null) {
                            n3 = R$id.progressIndicator;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (SeekBar)view;
                            if (view5 != null) {
                                Object object4 = object;
                                object4 = (RelativeLayout)object;
                                CartInventoryOosSimilarOosItemsPresentBinding cartInventoryOosSimilarOosItemsPresentBinding = new CartInventoryOosSimilarOosItemsPresentBinding((RelativeLayout)object4, (AppCompatImageView)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4, (ViewPager2)((Object)object3), (SeekBar)view5);
                                return cartInventoryOosSimilarOosItemsPresentBinding;
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

    public static CartInventoryOosSimilarOosItemsPresentBinding inflate(LayoutInflater layoutInflater) {
        return CartInventoryOosSimilarOosItemsPresentBinding.inflate(layoutInflater, null, false);
    }

    public static CartInventoryOosSimilarOosItemsPresentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_inventory_oos_similar_oos_items_present;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartInventoryOosSimilarOosItemsPresentBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

