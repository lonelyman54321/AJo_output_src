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
import com.ril.ajio.customviews.widgets.AjioButton;

public final class ReEnterBankAccountDetailsLayoutBinding
implements BC3 {
    public final AjioButton reEnterBankAccountDetailsBtn;
    private final LinearLayout rootView;

    private ReEnterBankAccountDetailsLayoutBinding(LinearLayout linearLayout, AjioButton ajioButton) {
        this.rootView = linearLayout;
        this.reEnterBankAccountDetailsBtn = ajioButton;
    }

    public static ReEnterBankAccountDetailsLayoutBinding bind(View object) {
        int n3 = R$id.re_enter_bank_account_details_btn;
        AjioButton ajioButton = (AjioButton)dd2_2.a(n3, object);
        if (ajioButton != null) {
            object = (LinearLayout)object;
            ReEnterBankAccountDetailsLayoutBinding reEnterBankAccountDetailsLayoutBinding = new ReEnterBankAccountDetailsLayoutBinding((LinearLayout)object, ajioButton);
            return reEnterBankAccountDetailsLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ReEnterBankAccountDetailsLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ReEnterBankAccountDetailsLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ReEnterBankAccountDetailsLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.re_enter_bank_account_details_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReEnterBankAccountDetailsLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

