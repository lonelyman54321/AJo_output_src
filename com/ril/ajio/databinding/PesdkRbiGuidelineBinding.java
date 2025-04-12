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

public final class PesdkRbiGuidelineBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvRbiGuidelineSubtitle;
    public final AppCompatTextView tvRbiGuidelineTitle;

    private PesdkRbiGuidelineBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.tvRbiGuidelineSubtitle = appCompatTextView;
        this.tvRbiGuidelineTitle = appCompatTextView2;
    }

    public static PesdkRbiGuidelineBinding bind(View object) {
        AppCompatTextView appCompatTextView;
        int n3 = R$id.tv_rbi_guideline_subtitle;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView)dd2_2.a(n3, object);
        if (appCompatTextView2 != null && (appCompatTextView = (AppCompatTextView)dd2_2.a(n3 = R$id.tv_rbi_guideline_title, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            PesdkRbiGuidelineBinding pesdkRbiGuidelineBinding = new PesdkRbiGuidelineBinding((ConstraintLayout)((Object)object), appCompatTextView2, appCompatTextView);
            return pesdkRbiGuidelineBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkRbiGuidelineBinding inflate(LayoutInflater layoutInflater) {
        return PesdkRbiGuidelineBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkRbiGuidelineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_rbi_guideline;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkRbiGuidelineBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

