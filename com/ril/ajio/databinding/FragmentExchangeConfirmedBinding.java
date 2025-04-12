/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.LayoutAddressCardViewBinding;

public final class FragmentExchangeConfirmedBinding
implements BC3 {
    public final LayoutAddressCardViewBinding exchangeConfirmLayoutAddress;
    public final LinearLayout exchangeConfirmLayoutExcDynamic;
    public final LinearLayout exchangeConfirmLayoutExchange;
    public final LinearLayout exchangeConfirmLayoutRetDynamic;
    public final LinearLayout exchangeConfirmLayoutReturn;
    private final LinearLayout rootView;

    private FragmentExchangeConfirmedBinding(LinearLayout linearLayout, LayoutAddressCardViewBinding layoutAddressCardViewBinding, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.rootView = linearLayout;
        this.exchangeConfirmLayoutAddress = layoutAddressCardViewBinding;
        this.exchangeConfirmLayoutExcDynamic = linearLayout2;
        this.exchangeConfirmLayoutExchange = linearLayout3;
        this.exchangeConfirmLayoutRetDynamic = linearLayout4;
        this.exchangeConfirmLayoutReturn = linearLayout5;
    }

    public static FragmentExchangeConfirmedBinding bind(View object) {
        int n3 = R$id.exchange_confirm_layout_address;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            LayoutAddressCardViewBinding layoutAddressCardViewBinding = LayoutAddressCardViewBinding.bind(view);
            n3 = R$id.exchange_confirm_layout_exc_dynamic;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                n3 = R$id.exchange_confirm_layout_exchange;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.exchange_confirm_layout_ret_dynamic;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (LinearLayout)view;
                    if (view4 != null) {
                        n3 = R$id.exchange_confirm_layout_return;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (LinearLayout)view;
                        if (view5 != null) {
                            Object object2 = object;
                            object2 = (LinearLayout)object;
                            FragmentExchangeConfirmedBinding fragmentExchangeConfirmedBinding = new FragmentExchangeConfirmedBinding((LinearLayout)object2, layoutAddressCardViewBinding, (LinearLayout)view2, (LinearLayout)view3, (LinearLayout)view4, (LinearLayout)view5);
                            return fragmentExchangeConfirmedBinding;
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

    public static FragmentExchangeConfirmedBinding inflate(LayoutInflater layoutInflater) {
        return FragmentExchangeConfirmedBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentExchangeConfirmedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_exchange_confirmed;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentExchangeConfirmedBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

