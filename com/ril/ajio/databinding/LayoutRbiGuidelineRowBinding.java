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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutRbiGuidelineRowBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvGuidelineHeading;

    private LayoutRbiGuidelineRowBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.tvGuidelineHeading = appCompatTextView;
    }

    public static LayoutRbiGuidelineRowBinding bind(View object) {
        int n3 = R$id.tv_guideline_heading;
        AppCompatTextView appCompatTextView = (AppCompatTextView)dd2_2.a(n3, object);
        if (appCompatTextView != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutRbiGuidelineRowBinding layoutRbiGuidelineRowBinding = new LayoutRbiGuidelineRowBinding((ConstraintLayout)((Object)object), appCompatTextView);
            return layoutRbiGuidelineRowBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutRbiGuidelineRowBinding inflate(LayoutInflater layoutInflater) {
        return LayoutRbiGuidelineRowBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutRbiGuidelineRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_rbi_guideline_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutRbiGuidelineRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

