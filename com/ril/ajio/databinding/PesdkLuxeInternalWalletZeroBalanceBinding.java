/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.CheckBox
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PesdkLuxeInternalWalletZeroBalanceBinding
implements BC3 {
    public final CheckBox cbWallet;
    public final View disableLayer;
    private final ConstraintLayout rootView;
    public final TextView tvDetails;
    public final TextView tvNewTag;
    public final TextView tvWalletAmountInfo;
    public final TextView tvWalletGiftCardAmount;
    public final TextView tvWalletName;

    private PesdkLuxeInternalWalletZeroBalanceBinding(ConstraintLayout constraintLayout, CheckBox checkBox, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.cbWallet = checkBox;
        this.disableLayer = view;
        this.tvDetails = textView;
        this.tvNewTag = textView2;
        this.tvWalletAmountInfo = textView3;
        this.tvWalletGiftCardAmount = textView4;
        this.tvWalletName = textView5;
    }

    public static PesdkLuxeInternalWalletZeroBalanceBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.cbWallet;
        View view3 = view2 = dd2_2.a(n3, object);
        view3 = (CheckBox)view2;
        if (view3 != null && (view = dd2_2.a(n3 = R$id.disableLayer, object)) != null) {
            n3 = R$id.tvDetails;
            View view4 = view2 = dd2_2.a(n3, object);
            view4 = (TextView)view2;
            if (view4 != null) {
                n3 = R$id.tvNewTag;
                View view5 = view2 = dd2_2.a(n3, object);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.tvWalletAmountInfo;
                    View view6 = view2 = dd2_2.a(n3, object);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.tvWalletGiftCardAmount;
                        View view7 = view2 = dd2_2.a(n3, object);
                        view7 = (TextView)view2;
                        if (view7 != null) {
                            n3 = R$id.tvWalletName;
                            View view8 = view2 = dd2_2.a(n3, object);
                            view8 = (TextView)view2;
                            if (view8 != null) {
                                Object object2 = object;
                                object2 = (ConstraintLayout)((Object)object);
                                PesdkLuxeInternalWalletZeroBalanceBinding pesdkLuxeInternalWalletZeroBalanceBinding = new PesdkLuxeInternalWalletZeroBalanceBinding((ConstraintLayout)((Object)object2), (CheckBox)view3, view, (TextView)view4, (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8);
                                return pesdkLuxeInternalWalletZeroBalanceBinding;
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

    public static PesdkLuxeInternalWalletZeroBalanceBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxeInternalWalletZeroBalanceBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxeInternalWalletZeroBalanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_luxe_internal_wallet_zero_balance;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxeInternalWalletZeroBalanceBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

