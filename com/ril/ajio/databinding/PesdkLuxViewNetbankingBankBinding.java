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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;

public final class PesdkLuxViewNetbankingBankBinding
implements BC3 {
    public final PesdkLoyaltyCardInfoView layoutLoyaltyCardInfo;
    public final LinearLayout peCardDetailParent;
    public final AjioTextView proceedBtnTv;
    private final LinearLayout rootView;
    public final View space;
    public final ImageView viewNetbankingImv;
    public final AjioTextView viewNetbankingTvName;

    private PesdkLuxViewNetbankingBankBinding(LinearLayout linearLayout, PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView, LinearLayout linearLayout2, AjioTextView ajioTextView, View view, ImageView imageView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.layoutLoyaltyCardInfo = pesdkLoyaltyCardInfoView;
        this.peCardDetailParent = linearLayout2;
        this.proceedBtnTv = ajioTextView;
        this.space = view;
        this.viewNetbankingImv = imageView;
        this.viewNetbankingTvName = ajioTextView2;
    }

    public static PesdkLuxViewNetbankingBankBinding bind(View object) {
        View view;
        int n3 = R$id.layout_loyaltyCardInfo;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (PesdkLoyaltyCardInfoView)view;
        if (object2 != null) {
            View view2;
            View view3 = object;
            view3 = (LinearLayout)object;
            n3 = R$id.proceed_btn_tv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null && (view2 = dd2_2.a(n3 = R$id.space, object)) != null) {
                n3 = R$id.view_netbanking_imv;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.view_netbanking_tv_name;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        object = new PesdkLuxViewNetbankingBankBinding((LinearLayout)view3, (PesdkLoyaltyCardInfoView)((Object)object2), (LinearLayout)view3, (AjioTextView)object3, view2, (ImageView)view4, (AjioTextView)object4);
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

    public static PesdkLuxViewNetbankingBankBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxViewNetbankingBankBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxViewNetbankingBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_view_netbanking_bank;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxViewNetbankingBankBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

