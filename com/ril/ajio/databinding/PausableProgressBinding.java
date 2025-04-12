/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PausableProgressBinding
implements BC3 {
    public final View backProgress;
    public final View frontProgress;
    public final View maxProgress;
    private final FrameLayout rootView;

    private PausableProgressBinding(FrameLayout frameLayout, View view, View view2, View view3) {
        this.rootView = frameLayout;
        this.backProgress = view;
        this.frontProgress = view2;
        this.maxProgress = view3;
    }

    public static PausableProgressBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.back_progress;
        View view3 = dd2_2.a(n3, object);
        if (view3 != null && (view2 = dd2_2.a(n3 = R$id.front_progress, object)) != null && (view = dd2_2.a(n3 = R$id.max_progress, object)) != null) {
            object = (FrameLayout)object;
            PausableProgressBinding pausableProgressBinding = new PausableProgressBinding((FrameLayout)object, view3, view2, view);
            return pausableProgressBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PausableProgressBinding inflate(LayoutInflater layoutInflater) {
        return PausableProgressBinding.inflate(layoutInflater, null, false);
    }

    public static PausableProgressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pausable_progress;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PausableProgressBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

