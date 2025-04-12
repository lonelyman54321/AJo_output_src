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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnRefundReasonSectionBinding
implements BC3 {
    public final LinearLayout mainTrackerLayout;
    public final AjioTextView reasonPoints;
    public final AjioTextView reasonTitle;
    private final CardView rootView;

    private ReturnRefundReasonSectionBinding(CardView cardView, LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = cardView;
        this.mainTrackerLayout = linearLayout;
        this.reasonPoints = ajioTextView;
        this.reasonTitle = ajioTextView2;
    }

    public static ReturnRefundReasonSectionBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.main_tracker_layout;
        LinearLayout linearLayout = (LinearLayout)dd2_2.a(n3, object);
        if (linearLayout != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.reason_points, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.reason_title, object)) != null) {
            object = (CardView)((Object)object);
            ReturnRefundReasonSectionBinding returnRefundReasonSectionBinding = new ReturnRefundReasonSectionBinding((CardView)((Object)object), linearLayout, ajioTextView2, ajioTextView);
            return returnRefundReasonSectionBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ReturnRefundReasonSectionBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundReasonSectionBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundReasonSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_reason_section;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundReasonSectionBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

