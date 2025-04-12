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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.databinding.ReturnFeeStripBinding;

public final class NewExchangeControllerLayoutBinding
implements BC3 {
    public final AjioButton fragmentReturnBtnBack;
    public final AjioButton fragmentReturnBtnProceed;
    public final LinearLayout fragmentReturnBtnProceedLayout;
    public final ReturnFeeStripBinding returnFeeStrip;
    private final ConstraintLayout rootView;

    private NewExchangeControllerLayoutBinding(ConstraintLayout constraintLayout, AjioButton ajioButton, AjioButton ajioButton2, LinearLayout linearLayout, ReturnFeeStripBinding returnFeeStripBinding) {
        this.rootView = constraintLayout;
        this.fragmentReturnBtnBack = ajioButton;
        this.fragmentReturnBtnProceed = ajioButton2;
        this.fragmentReturnBtnProceedLayout = linearLayout;
        this.returnFeeStrip = returnFeeStripBinding;
    }

    public static NewExchangeControllerLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.fragment_return_btn_back;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioButton)view;
        if (object2 != null) {
            n3 = R$id.fragment_return_btn_proceed;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioButton)view;
            if (object3 != null) {
                n3 = R$id.fragment_return_btn_proceed_layout;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null && (view = dd2_2.a(n3 = R$id.return_fee_strip, object)) != null) {
                    ReturnFeeStripBinding returnFeeStripBinding = ReturnFeeStripBinding.bind(view);
                    Object object4 = object;
                    object4 = (ConstraintLayout)((Object)object);
                    NewExchangeControllerLayoutBinding newExchangeControllerLayoutBinding = new NewExchangeControllerLayoutBinding((ConstraintLayout)((Object)object4), (AjioButton)object2, (AjioButton)object3, (LinearLayout)view2, returnFeeStripBinding);
                    return newExchangeControllerLayoutBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewExchangeControllerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewExchangeControllerLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewExchangeControllerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_exchange_controller_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewExchangeControllerLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

