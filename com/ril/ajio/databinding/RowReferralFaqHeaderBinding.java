/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ril.ajio.R$layout;

public final class RowReferralFaqHeaderBinding
implements BC3 {
    private final TextView rootView;

    private RowReferralFaqHeaderBinding(TextView textView) {
        this.rootView = textView;
    }

    public static RowReferralFaqHeaderBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            RowReferralFaqHeaderBinding rowReferralFaqHeaderBinding = new RowReferralFaqHeaderBinding((TextView)object);
            return rowReferralFaqHeaderBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowReferralFaqHeaderBinding inflate(LayoutInflater layoutInflater) {
        return RowReferralFaqHeaderBinding.inflate(layoutInflater, null, false);
    }

    public static RowReferralFaqHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_referral_faq_header;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReferralFaqHeaderBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

