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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowOrderRefundDetailBinding
implements BC3 {
    public final TextView brandTV;
    public final CardView imageContainer;
    public final TextView infoTV;
    public final TextView priceTV;
    public final ImageView productIV;
    private final ConstraintLayout rootView;
    public final TextView sizeTV;

    private RowOrderRefundDetailBinding(ConstraintLayout constraintLayout, TextView textView, CardView cardView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4) {
        this.rootView = constraintLayout;
        this.brandTV = textView;
        this.imageContainer = cardView;
        this.infoTV = textView2;
        this.priceTV = textView3;
        this.productIV = imageView;
        this.sizeTV = textView4;
    }

    public static RowOrderRefundDetailBinding bind(View object) {
        View view;
        int n3 = R$id.brandTV;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.imageContainer;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (CardView)view;
            if (object2 != null) {
                n3 = R$id.infoTV;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.priceTV;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.productIV;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (ImageView)view;
                        if (view5 != null) {
                            n3 = R$id.sizeTV;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (TextView)view;
                            if (view6 != null) {
                                Object object3 = object;
                                object3 = (ConstraintLayout)((Object)object);
                                RowOrderRefundDetailBinding rowOrderRefundDetailBinding = new RowOrderRefundDetailBinding((ConstraintLayout)((Object)object3), (TextView)view2, (CardView)((Object)object2), (TextView)view3, (TextView)view4, (ImageView)view5, (TextView)view6);
                                return rowOrderRefundDetailBinding;
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

    public static RowOrderRefundDetailBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderRefundDetailBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderRefundDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_order_refund_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderRefundDetailBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

