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
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeNewRowSimilarToTitleBinding
implements BC3 {
    private final AjioTextView rootView;
    public final AjioTextView similarToTitle;

    private LuxeNewRowSimilarToTitleBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.similarToTitle = ajioTextView2;
    }

    public static LuxeNewRowSimilarToTitleBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            LuxeNewRowSimilarToTitleBinding luxeNewRowSimilarToTitleBinding = new LuxeNewRowSimilarToTitleBinding((AjioTextView)object, (AjioTextView)object);
            return luxeNewRowSimilarToTitleBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LuxeNewRowSimilarToTitleBinding inflate(LayoutInflater layoutInflater) {
        return LuxeNewRowSimilarToTitleBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeNewRowSimilarToTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_new_row_similar_to_title;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeNewRowSimilarToTitleBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

