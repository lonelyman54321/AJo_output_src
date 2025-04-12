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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class VisualFilterShowMoreViewBinding
implements BC3 {
    public final AjioTextView plpVisualFilterMoreFilterTv;
    private final ConstraintLayout rootView;

    private VisualFilterShowMoreViewBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.plpVisualFilterMoreFilterTv = ajioTextView;
    }

    public static VisualFilterShowMoreViewBinding bind(View object) {
        int n3 = R$id.plp_visual_filter_more_filter_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (ConstraintLayout)((Object)object);
            VisualFilterShowMoreViewBinding visualFilterShowMoreViewBinding = new VisualFilterShowMoreViewBinding((ConstraintLayout)((Object)object), ajioTextView);
            return visualFilterShowMoreViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static VisualFilterShowMoreViewBinding inflate(LayoutInflater layoutInflater) {
        return VisualFilterShowMoreViewBinding.inflate(layoutInflater, null, false);
    }

    public static VisualFilterShowMoreViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.visual_filter_show_more_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return VisualFilterShowMoreViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

