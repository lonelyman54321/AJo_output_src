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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;

public final class ItemCcComplaintInfoAlertBinding
implements BC3 {
    public final ConstraintLayout ccInfoAlertLayout;
    public final AjioImageView ivInfoAlert;
    private final ConstraintLayout rootView;
    public final TextView tvInfoAlert;

    private ItemCcComplaintInfoAlertBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioImageView ajioImageView, TextView textView) {
        this.rootView = constraintLayout;
        this.ccInfoAlertLayout = constraintLayout2;
        this.ivInfoAlert = ajioImageView;
        this.tvInfoAlert = textView;
    }

    public static ItemCcComplaintInfoAlertBinding bind(View object) {
        TextView textView;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.iv_info_alert;
        AjioImageView ajioImageView = (AjioImageView)dd2_2.a(n3, object);
        if (ajioImageView != null && (textView = (TextView)dd2_2.a(n3 = R$id.tv_info_alert, object)) != null) {
            object = new ItemCcComplaintInfoAlertBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), ajioImageView, textView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static ItemCcComplaintInfoAlertBinding inflate(LayoutInflater layoutInflater) {
        return ItemCcComplaintInfoAlertBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCcComplaintInfoAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cc_complaint_info_alert;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCcComplaintInfoAlertBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

