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

public final class VisualFilterItemRowViewBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView visualFilterRowItemText;

    private VisualFilterItemRowViewBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.visualFilterRowItemText = ajioTextView;
    }

    public static VisualFilterItemRowViewBinding bind(View object) {
        int n3 = R$id.visual_filter_row_item_text;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            VisualFilterItemRowViewBinding visualFilterItemRowViewBinding = new VisualFilterItemRowViewBinding((LinearLayout)object, ajioTextView);
            return visualFilterItemRowViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static VisualFilterItemRowViewBinding inflate(LayoutInflater layoutInflater) {
        return VisualFilterItemRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static VisualFilterItemRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.visual_filter_item_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return VisualFilterItemRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

