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
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowAwCashInfoAccountPageBinding
implements BC3 {
    public final AjioTextView awAmount;
    public final AjioImageView awCashIv;
    public final AjioTextView awCashTv;
    private final ConstraintLayout rootView;

    private RowAwCashInfoAccountPageBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioImageView ajioImageView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.awAmount = ajioTextView;
        this.awCashIv = ajioImageView;
        this.awCashTv = ajioTextView2;
    }

    public static RowAwCashInfoAccountPageBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioImageView ajioImageView;
        int n3 = R$id.aw_amount;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioImageView = (AjioImageView)dd2_2.a(n3 = R$id.aw_cash_iv, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.aw_cash_tv, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            RowAwCashInfoAccountPageBinding rowAwCashInfoAccountPageBinding = new RowAwCashInfoAccountPageBinding((ConstraintLayout)((Object)object), ajioTextView2, ajioImageView, ajioTextView);
            return rowAwCashInfoAccountPageBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowAwCashInfoAccountPageBinding inflate(LayoutInflater layoutInflater) {
        return RowAwCashInfoAccountPageBinding.inflate(layoutInflater, null, false);
    }

    public static RowAwCashInfoAccountPageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_aw_cash_info_account_page;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowAwCashInfoAccountPageBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

