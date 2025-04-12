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

public final class PesdkListRowPaymentWalletBinding
implements BC3 {
    public final ImageView imgWallet;
    public final PesdkLoyaltyCardInfoView layoutLoyaltyCardInfo;
    public final LinearLayout peCardDetailParent;
    public final PaymentOutageViewBinding pfContainer;
    public final AjioTextView proceedBtnTxt;
    private final LinearLayout rootView;
    public final View space;
    public final AjioTextView tvWallet;

    private PesdkListRowPaymentWalletBinding(LinearLayout linearLayout, ImageView imageView, PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView, LinearLayout linearLayout2, PaymentOutageViewBinding paymentOutageViewBinding, AjioTextView ajioTextView, View view, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.imgWallet = imageView;
        this.layoutLoyaltyCardInfo = pesdkLoyaltyCardInfoView;
        this.peCardDetailParent = linearLayout2;
        this.pfContainer = paymentOutageViewBinding;
        this.proceedBtnTxt = ajioTextView;
        this.space = view;
        this.tvWallet = ajioTextView2;
    }

    public static PesdkListRowPaymentWalletBinding bind(View object) {
        View view;
        int n3 = R$id.img_wallet;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.layout_loyaltyCardInfo;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (PesdkLoyaltyCardInfoView)view;
            if (object2 != null) {
                Object object3 = object;
                object3 = (LinearLayout)object;
                n3 = R$id.pf_container;
                view = dd2_2.a(n3, object);
                if (view != null) {
                    View view3;
                    PaymentOutageViewBinding paymentOutageViewBinding = PaymentOutageViewBinding.bind(view);
                    n3 = R$id.proceed_btn_txt;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null && (view3 = dd2_2.a(n3 = R$id.space, object)) != null) {
                        n3 = R$id.tv_wallet;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            object = new PesdkListRowPaymentWalletBinding((LinearLayout)object3, (ImageView)view2, (PesdkLoyaltyCardInfoView)((Object)object2), (LinearLayout)object3, paymentOutageViewBinding, (AjioTextView)object4, view3, (AjioTextView)object5);
                            return object;
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

    public static PesdkListRowPaymentWalletBinding inflate(LayoutInflater layoutInflater) {
        return PesdkListRowPaymentWalletBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkListRowPaymentWalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_list_row_payment_wallet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkListRowPaymentWalletBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

