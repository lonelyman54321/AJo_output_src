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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PlpAutoCorrectRowViewBinding
implements BC3 {
    public final AjioTextView plpAutoCorrectRowTv;
    private final LinearLayout rootView;

    private PlpAutoCorrectRowViewBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.plpAutoCorrectRowTv = ajioTextView;
    }

    public static PlpAutoCorrectRowViewBinding bind(View object) {
        int n3 = R$id.plp_auto_correct_row_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            PlpAutoCorrectRowViewBinding plpAutoCorrectRowViewBinding = new PlpAutoCorrectRowViewBinding((LinearLayout)object, ajioTextView);
            return plpAutoCorrectRowViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpAutoCorrectRowViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpAutoCorrectRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpAutoCorrectRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_auto_correct_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpAutoCorrectRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

