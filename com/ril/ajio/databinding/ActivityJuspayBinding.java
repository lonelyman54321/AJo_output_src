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
import com.ril.ajio.customviews.widgets.PEProgressView;

public final class ActivityJuspayBinding
implements BC3 {
    public final PEProgressView peWebviewProgressBar;
    private final ConstraintLayout rootView;

    private ActivityJuspayBinding(ConstraintLayout constraintLayout, PEProgressView pEProgressView) {
        this.rootView = constraintLayout;
        this.peWebviewProgressBar = pEProgressView;
    }

    public static ActivityJuspayBinding bind(View object) {
        int n3 = R$id.pe_webview_progress_bar;
        PEProgressView pEProgressView = (PEProgressView)dd2_2.a(n3, object);
        if (pEProgressView != null) {
            object = (ConstraintLayout)((Object)object);
            ActivityJuspayBinding activityJuspayBinding = new ActivityJuspayBinding((ConstraintLayout)((Object)object), pEProgressView);
            return activityJuspayBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityJuspayBinding inflate(LayoutInflater layoutInflater) {
        return ActivityJuspayBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityJuspayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_juspay;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityJuspayBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

