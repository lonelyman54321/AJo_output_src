/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowReferralWidgetBinding
implements BC3 {
    private final FrameLayout rootView;
    public final CardView rwParent;

    private RowReferralWidgetBinding(FrameLayout frameLayout, CardView cardView) {
        this.rootView = frameLayout;
        this.rwParent = cardView;
    }

    public static RowReferralWidgetBinding bind(View object) {
        int n3 = R$id.rw_parent;
        CardView cardView = (CardView)dd2_2.a(n3, object);
        if (cardView != null) {
            object = (FrameLayout)object;
            RowReferralWidgetBinding rowReferralWidgetBinding = new RowReferralWidgetBinding((FrameLayout)object, cardView);
            return rowReferralWidgetBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowReferralWidgetBinding inflate(LayoutInflater layoutInflater) {
        return RowReferralWidgetBinding.inflate(layoutInflater, null, false);
    }

    public static RowReferralWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_referral_widget;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReferralWidgetBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

