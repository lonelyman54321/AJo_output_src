/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowPaymentOptionsBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final ImageView rowPaymentOptionImvNext;
    public final TextView rowPaymentOptionTvOffer;
    public final TextView rowPaymentOptionTvTitle;

    private RowPaymentOptionsBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.rowPaymentOptionImvNext = imageView;
        this.rowPaymentOptionTvOffer = textView;
        this.rowPaymentOptionTvTitle = textView2;
    }

    public static RowPaymentOptionsBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.row_payment_option_imv_next;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.row_payment_option_tv_offer, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.row_payment_option_tv_title, object)) != null) {
            object = (RelativeLayout)object;
            RowPaymentOptionsBinding rowPaymentOptionsBinding = new RowPaymentOptionsBinding((RelativeLayout)object, imageView, textView2, textView);
            return rowPaymentOptionsBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowPaymentOptionsBinding inflate(LayoutInflater layoutInflater) {
        return RowPaymentOptionsBinding.inflate(layoutInflater, null, false);
    }

    public static RowPaymentOptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_payment_options;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPaymentOptionsBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

