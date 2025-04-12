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
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowOrderRevampTitleBinding
implements BC3 {
    private final AjioTextView rootView;
    public final AjioTextView rowOrderTitleTv;

    private RowOrderRevampTitleBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.rowOrderTitleTv = ajioTextView2;
    }

    public static RowOrderRevampTitleBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            RowOrderRevampTitleBinding rowOrderRevampTitleBinding = new RowOrderRevampTitleBinding((AjioTextView)object, (AjioTextView)object);
            return rowOrderRevampTitleBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowOrderRevampTitleBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderRevampTitleBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderRevampTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_order_revamp_title;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderRevampTitleBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

