/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class TrackStepDotBinding
implements BC3 {
    public final View dotView;
    public final View pulseView;
    private final RelativeLayout rootView;

    private TrackStepDotBinding(RelativeLayout relativeLayout, View view, View view2) {
        this.rootView = relativeLayout;
        this.dotView = view;
        this.pulseView = view2;
    }

    public static TrackStepDotBinding bind(View object) {
        View view;
        int n3 = R$id.dotView;
        View view2 = dd2_2.a(n3, object);
        if (view2 != null && (view = dd2_2.a(n3 = R$id.pulseView, object)) != null) {
            object = (RelativeLayout)object;
            TrackStepDotBinding trackStepDotBinding = new TrackStepDotBinding((RelativeLayout)object, view2, view);
            return trackStepDotBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static TrackStepDotBinding inflate(LayoutInflater layoutInflater) {
        return TrackStepDotBinding.inflate(layoutInflater, null, false);
    }

    public static TrackStepDotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.track_step_dot;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TrackStepDotBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

