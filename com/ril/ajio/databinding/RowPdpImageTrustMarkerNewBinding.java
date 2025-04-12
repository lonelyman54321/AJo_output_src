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
import androidx.databinding.ViewDataBinding;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public abstract class RowPdpImageTrustMarkerNewBinding
extends ViewDataBinding {
    public final ConstraintLayout constraintView1;
    public final ConstraintLayout constraintView2;
    public final ConstraintLayout constraintView3;
    public final AjioTextView trustContent1;
    public final AjioTextView trustContent2;
    public final AjioTextView trustContent3;
    public final AjioImageView trustImage1;
    public final AjioImageView trustImage2;
    public final AjioImageView trustImage3;
    public final LinearLayout trustImageParent;
    public final View viewLine;

    public RowPdpImageTrustMarkerNewBinding(Object object, View view, int n3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioImageView ajioImageView, AjioImageView ajioImageView2, AjioImageView ajioImageView3, LinearLayout linearLayout, View view2) {
        super(object, view, n3);
        this.constraintView1 = constraintLayout;
        this.constraintView2 = constraintLayout2;
        this.constraintView3 = constraintLayout3;
        this.trustContent1 = ajioTextView;
        this.trustContent2 = ajioTextView2;
        this.trustContent3 = ajioTextView3;
        this.trustImage1 = ajioImageView;
        this.trustImage2 = ajioImageView2;
        this.trustImage3 = ajioImageView3;
        this.trustImageParent = linearLayout;
        this.viewLine = view2;
    }

    public static RowPdpImageTrustMarkerNewBinding bind(View view) {
        return RowPdpImageTrustMarkerNewBinding.bind(view, null);
    }

    public static RowPdpImageTrustMarkerNewBinding bind(View view, Object object) {
        int n3 = R$layout.row_pdp_image_trust_marker_new;
        return (RowPdpImageTrustMarkerNewBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static RowPdpImageTrustMarkerNewBinding inflate(LayoutInflater layoutInflater) {
        return RowPdpImageTrustMarkerNewBinding.inflate(layoutInflater, null);
    }

    public static RowPdpImageTrustMarkerNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return RowPdpImageTrustMarkerNewBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static RowPdpImageTrustMarkerNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.row_pdp_image_trust_marker_new;
        return (RowPdpImageTrustMarkerNewBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static RowPdpImageTrustMarkerNewBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.row_pdp_image_trust_marker_new;
        return (RowPdpImageTrustMarkerNewBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

