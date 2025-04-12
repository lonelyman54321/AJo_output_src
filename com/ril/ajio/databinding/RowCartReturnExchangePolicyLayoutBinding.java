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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowCartReturnExchangePolicyLayoutBinding
implements BC3 {
    public final ConstraintLayout cartReturnExchangePolicyLayout;
    public final AjioTextView exRetTitle;
    public final LinearLayout retExLayout;
    public final AjioTextView retExPolicyTv;
    private final ConstraintLayout rootView;

    private RowCartReturnExchangePolicyLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, LinearLayout linearLayout, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.cartReturnExchangePolicyLayout = constraintLayout2;
        this.exRetTitle = ajioTextView;
        this.retExLayout = linearLayout;
        this.retExPolicyTv = ajioTextView2;
    }

    public static RowCartReturnExchangePolicyLayoutBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.ex_ret_title;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (AjioTextView)view;
        if (object3 != null) {
            n3 = R$id.ret_ex_layout;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                n3 = R$id.ret_ex_policy_tv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    Object object5 = object;
                    view = object2;
                    object = new RowCartReturnExchangePolicyLayoutBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (AjioTextView)object3, (LinearLayout)view2, (AjioTextView)object4);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCartReturnExchangePolicyLayoutBinding inflate(LayoutInflater layoutInflater) {
        return RowCartReturnExchangePolicyLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartReturnExchangePolicyLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_return_exchange_policy_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartReturnExchangePolicyLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

