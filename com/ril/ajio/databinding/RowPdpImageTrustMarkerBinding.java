/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowPdpImageTrustMarkerBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final View separator1;
    public final View separator2;
    public final ImageView trustImage1;
    public final ImageView trustImage2;
    public final ImageView trustImage3;
    public final ConstraintLayout trustImageParent;

    private RowPdpImageTrustMarkerBinding(ConstraintLayout constraintLayout, View view, View view2, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.separator1 = view;
        this.separator2 = view2;
        this.trustImage1 = imageView;
        this.trustImage2 = imageView2;
        this.trustImage3 = imageView3;
        this.trustImageParent = constraintLayout2;
    }

    public static RowPdpImageTrustMarkerBinding bind(View object) {
        View view;
        int n3 = R$id.separator_1;
        View view2 = dd2_2.a(n3, object);
        if (view2 != null && (view = dd2_2.a(n3 = R$id.separator_2, object)) != null) {
            View view3;
            n3 = R$id.trust_image_1;
            View view4 = view3 = dd2_2.a(n3, object);
            view4 = (ImageView)view3;
            if (view4 != null) {
                n3 = R$id.trust_image_2;
                View view5 = view3 = dd2_2.a(n3, object);
                view5 = (ImageView)view3;
                if (view5 != null) {
                    n3 = R$id.trust_image_3;
                    View view6 = view3 = dd2_2.a(n3, object);
                    view6 = (ImageView)view3;
                    if (view6 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        view3 = object;
                        object = new RowPdpImageTrustMarkerBinding((ConstraintLayout)((Object)object2), view2, view, (ImageView)view4, (ImageView)view5, (ImageView)view6, (ConstraintLayout)((Object)object2));
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowPdpImageTrustMarkerBinding inflate(LayoutInflater layoutInflater) {
        return RowPdpImageTrustMarkerBinding.inflate(layoutInflater, null, false);
    }

    public static RowPdpImageTrustMarkerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_pdp_image_trust_marker;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPdpImageTrustMarkerBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

