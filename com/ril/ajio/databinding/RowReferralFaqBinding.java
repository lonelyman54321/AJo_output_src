/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  android.widget.ToggleButton
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowReferralFaqBinding
implements BC3 {
    public final TextView rAns;
    public final ToggleButton rQues;
    private final ConstraintLayout rootView;

    private RowReferralFaqBinding(ConstraintLayout constraintLayout, TextView textView, ToggleButton toggleButton) {
        this.rootView = constraintLayout;
        this.rAns = textView;
        this.rQues = toggleButton;
    }

    public static RowReferralFaqBinding bind(View object) {
        ToggleButton toggleButton;
        int n3 = R$id.r_ans;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null && (toggleButton = (ToggleButton)dd2_2.a(n3 = R$id.r_ques, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            RowReferralFaqBinding rowReferralFaqBinding = new RowReferralFaqBinding((ConstraintLayout)((Object)object), textView, toggleButton);
            return rowReferralFaqBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowReferralFaqBinding inflate(LayoutInflater layoutInflater) {
        return RowReferralFaqBinding.inflate(layoutInflater, null, false);
    }

    public static RowReferralFaqBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_referral_faq;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReferralFaqBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

