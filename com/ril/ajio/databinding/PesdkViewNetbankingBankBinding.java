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
import com.ril.ajio.databinding.PaymentOutageViewBinding;

public final class PesdkViewNetbankingBankBinding
implements BC3 {
    public final PesdkLoyaltyCardInfoView layoutLoyaltyCardInfo;
    public final PaymentOutageViewBinding outageView;
    public final LinearLayout peCardDetailParent;
    public final AjioTextView proceedBtnTv;
    private final LinearLayout rootView;
    public final View space;
    public final ImageView viewNetbankingImv;
    public final AjioTextView viewNetbankingTvName;

    private PesdkViewNetbankingBankBinding(LinearLayout linearLayout, PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView, PaymentOutageViewBinding paymentOutageViewBinding, LinearLayout linearLayout2, AjioTextView ajioTextView, View view, ImageView imageView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.layoutLoyaltyCardInfo = pesdkLoyaltyCardInfoView;
        this.outageView = paymentOutageViewBinding;
        this.peCardDetailParent = linearLayout2;
        this.proceedBtnTv = ajioTextView;
        this.space = view;
        this.viewNetbankingImv = imageView;
        this.viewNetbankingTvName = ajioTextView2;
    }

    public static PesdkViewNetbankingBankBinding bind(View object) {
        View view;
        int n3 = R$id.layout_loyaltyCardInfo;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (PesdkLoyaltyCardInfoView)view;
        if (object2 != null && (view = dd2_2.a(n3 = R$id.outage_view, object)) != null) {
            View view2;
            PaymentOutageViewBinding paymentOutageViewBinding = PaymentOutageViewBinding.bind(view);
            Object object3 = object;
            object3 = (LinearLayout)object;
            n3 = R$id.proceed_btn_tv;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioTextView)view;
            if (object4 != null && (view2 = dd2_2.a(n3 = R$id.space, object)) != null) {
                n3 = R$id.view_netbanking_imv;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.view_netbanking_tv_name;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        object = new PesdkViewNetbankingBankBinding((LinearLayout)object3, (PesdkLoyaltyCardInfoView)((Object)object2), paymentOutageViewBinding, (LinearLayout)object3, (AjioTextView)object4, view2, (ImageView)view3, (AjioTextView)object5);
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

    public static PesdkViewNetbankingBankBinding inflate(LayoutInflater layoutInflater) {
        return PesdkViewNetbankingBankBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkViewNetbankingBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_view_netbanking_bank;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkViewNetbankingBankBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

