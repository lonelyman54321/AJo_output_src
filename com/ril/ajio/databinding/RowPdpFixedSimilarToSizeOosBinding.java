/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowPdpFixedSimilarToSizeOosBinding
implements BC3 {
    private final LinearLayout rootView;
    public final LinearLayout rowPdpFixedSizeLayout;
    public final AjioTextView rowPdpFixedSizeTv;
    public final ImageView similarToIv;
    public final ImageView strikeIv;

    private RowPdpFixedSimilarToSizeOosBinding(LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView, ImageView imageView, ImageView imageView2) {
        this.rootView = linearLayout;
        this.rowPdpFixedSizeLayout = linearLayout2;
        this.rowPdpFixedSizeTv = ajioTextView;
        this.similarToIv = imageView;
        this.strikeIv = imageView2;
    }

    public static RowPdpFixedSimilarToSizeOosBinding bind(View object) {
        View view;
        View view2 = object;
        view2 = (LinearLayout)object;
        int n3 = R$id.row_pdp_fixed_size_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.similar_to_iv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.strike_iv;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    Object object3 = object;
                    view = view2;
                    object = new RowPdpFixedSimilarToSizeOosBinding((LinearLayout)view2, (LinearLayout)view2, (AjioTextView)object2, (ImageView)view3, (ImageView)view4);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowPdpFixedSimilarToSizeOosBinding inflate(LayoutInflater layoutInflater) {
        return RowPdpFixedSimilarToSizeOosBinding.inflate(layoutInflater, null, false);
    }

    public static RowPdpFixedSimilarToSizeOosBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_pdp_fixed_similar_to_size_oos;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPdpFixedSimilarToSizeOosBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

