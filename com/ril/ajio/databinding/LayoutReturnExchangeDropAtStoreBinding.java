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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutReturnExchangeDropAtStoreBinding
implements BC3 {
    public final AjioTextView freclTvRasInfo;
    public final AjioTextView freclTvRasKnowMore;
    public final LinearLayout layoutOrDas;
    private final LinearLayout rootView;
    public final AjioTextView tvDasTitle;

    private LayoutReturnExchangeDropAtStoreBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, LinearLayout linearLayout2, AjioTextView ajioTextView3) {
        this.rootView = linearLayout;
        this.freclTvRasInfo = ajioTextView;
        this.freclTvRasKnowMore = ajioTextView2;
        this.layoutOrDas = linearLayout2;
        this.tvDasTitle = ajioTextView3;
    }

    public static LayoutReturnExchangeDropAtStoreBinding bind(View object) {
        View view;
        int n3 = R$id.frecl_tv_ras_info;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.frecl_tv_ras_know_more;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.layout_or_das;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null) {
                    n3 = R$id.tv_das_title;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (LinearLayout)object;
                        LayoutReturnExchangeDropAtStoreBinding layoutReturnExchangeDropAtStoreBinding = new LayoutReturnExchangeDropAtStoreBinding((LinearLayout)object5, (AjioTextView)object2, (AjioTextView)object3, (LinearLayout)view2, (AjioTextView)object4);
                        return layoutReturnExchangeDropAtStoreBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutReturnExchangeDropAtStoreBinding inflate(LayoutInflater layoutInflater) {
        return LayoutReturnExchangeDropAtStoreBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutReturnExchangeDropAtStoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_return_exchange_drop_at_store;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutReturnExchangeDropAtStoreBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

