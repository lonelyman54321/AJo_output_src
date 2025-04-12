/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ExperienceItemBinding
implements BC3 {
    public final AjioTextView experienceTv;
    public final ProgressBar progress;
    private final LinearLayout rootView;

    private ExperienceItemBinding(LinearLayout linearLayout, AjioTextView ajioTextView, ProgressBar progressBar) {
        this.rootView = linearLayout;
        this.experienceTv = ajioTextView;
        this.progress = progressBar;
    }

    public static ExperienceItemBinding bind(View object) {
        ProgressBar progressBar;
        int n3 = R$id.experience_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (progressBar = (ProgressBar)dd2_2.a(n3 = R$id.progress, object)) != null) {
            object = (LinearLayout)object;
            ExperienceItemBinding experienceItemBinding = new ExperienceItemBinding((LinearLayout)object, ajioTextView, progressBar);
            return experienceItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ExperienceItemBinding inflate(LayoutInflater layoutInflater) {
        return ExperienceItemBinding.inflate(layoutInflater, null, false);
    }

    public static ExperienceItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.experience_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExperienceItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

