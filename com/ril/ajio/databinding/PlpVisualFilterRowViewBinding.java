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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PlpVisualFilterRowViewBinding
implements BC3 {
    public final RecyclerView plpVisualFilterRv;
    public final AjioTextView plpVisualHeadingTv;
    private final ConstraintLayout rootView;

    private PlpVisualFilterRowViewBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.plpVisualFilterRv = recyclerView;
        this.plpVisualHeadingTv = ajioTextView;
    }

    public static PlpVisualFilterRowViewBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.plp_visual_filter_rv;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.plp_visual_heading_tv, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            PlpVisualFilterRowViewBinding plpVisualFilterRowViewBinding = new PlpVisualFilterRowViewBinding((ConstraintLayout)((Object)object), recyclerView, ajioTextView);
            return plpVisualFilterRowViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpVisualFilterRowViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpVisualFilterRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpVisualFilterRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_visual_filter_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpVisualFilterRowViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

