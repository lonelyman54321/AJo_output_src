/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PesdkInternalWalletGiftRedemptionLuxeLayoutBinding
implements BC3 {
    public final AppCompatImageView cbWalletGiftIcon;
    public final View disableLayer;
    public final ConstraintLayout internalWalletLayout;
    private final ConstraintLayout rootView;
    public final TextView tvAdd;
    public final TextView tvWalletInfo;
    public final TextView tvWalletName;

    private PesdkInternalWalletGiftRedemptionLuxeLayoutBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.cbWalletGiftIcon = appCompatImageView;
        this.disableLayer = view;
        this.internalWalletLayout = constraintLayout2;
        this.tvAdd = textView;
        this.tvWalletInfo = textView2;
        this.tvWalletName = textView3;
    }

    public static PesdkInternalWalletGiftRedemptionLuxeLayoutBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.cbWalletGiftIcon;
        Object object2 = view2 = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view2;
        if (object2 != null && (view = dd2_2.a(n3 = R$id.disableLayer, object)) != null) {
            Object object3 = object;
            object3 = (ConstraintLayout)((Object)object);
            n3 = R$id.tvAdd;
            View view3 = view2 = dd2_2.a(n3, object);
            view3 = (TextView)view2;
            if (view3 != null) {
                n3 = R$id.tvWalletInfo;
                View view4 = view2 = dd2_2.a(n3, object);
                view4 = (TextView)view2;
                if (view4 != null) {
                    n3 = R$id.tvWalletName;
                    View view5 = view2 = dd2_2.a(n3, object);
                    view5 = (TextView)view2;
                    if (view5 != null) {
                        object = new PesdkInternalWalletGiftRedemptionLuxeLayoutBinding((ConstraintLayout)((Object)object3), (AppCompatImageView)((Object)object2), view, (ConstraintLayout)((Object)object3), (TextView)view3, (TextView)view4, (TextView)view5);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkInternalWalletGiftRedemptionLuxeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PesdkInternalWalletGiftRedemptionLuxeLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkInternalWalletGiftRedemptionLuxeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_internal_wallet_gift_redemption_luxe_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkInternalWalletGiftRedemptionLuxeLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

