/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CustomDodLayoutBinding
implements BC3 {
    public final AjioTextView dealEndTime;
    public final ConstraintLayout dealLayout;
    public final AjioTextView dealPrice;
    private final ConstraintLayout rootView;

    private CustomDodLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.dealEndTime = ajioTextView;
        this.dealLayout = constraintLayout2;
        this.dealPrice = ajioTextView2;
    }

    public static CustomDodLayoutBinding bind(View object) {
        Object object2;
        int n3 = R$id.deal_end_time;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            int n4 = R$id.deal_price;
            AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n4, object);
            if (ajioTextView2 != null) {
                object = new CustomDodLayoutBinding((ConstraintLayout)((Object)object2), ajioTextView, (ConstraintLayout)((Object)object2), ajioTextView2);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static CustomDodLayoutBinding inflate(LayoutInflater layoutInflater) {
        return CustomDodLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static CustomDodLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.custom_dod_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CustomDodLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

