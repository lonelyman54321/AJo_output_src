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

public final class TrackStepTextBinding
implements BC3 {
    private final AjioTextView rootView;
    public final AjioTextView trackStepTextTv;

    private TrackStepTextBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.trackStepTextTv = ajioTextView2;
    }

    public static TrackStepTextBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            TrackStepTextBinding trackStepTextBinding = new TrackStepTextBinding((AjioTextView)object, (AjioTextView)object);
            return trackStepTextBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static TrackStepTextBinding inflate(LayoutInflater layoutInflater) {
        return TrackStepTextBinding.inflate(layoutInflater, null, false);
    }

    public static TrackStepTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.track_step_text;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TrackStepTextBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

