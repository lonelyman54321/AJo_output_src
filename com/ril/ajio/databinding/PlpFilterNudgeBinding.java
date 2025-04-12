/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpFilterNudgeBinding
implements BC3 {
    public final Button nudgeButtonClick;
    private final FrameLayout rootView;

    private PlpFilterNudgeBinding(FrameLayout frameLayout, Button button) {
        this.rootView = frameLayout;
        this.nudgeButtonClick = button;
    }

    public static PlpFilterNudgeBinding bind(View object) {
        int n3 = R$id.nudge_button_click;
        Button button = (Button)dd2_2.a(n3, object);
        if (button != null) {
            object = (FrameLayout)object;
            PlpFilterNudgeBinding plpFilterNudgeBinding = new PlpFilterNudgeBinding((FrameLayout)object, button);
            return plpFilterNudgeBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpFilterNudgeBinding inflate(LayoutInflater layoutInflater) {
        return PlpFilterNudgeBinding.inflate(layoutInflater, null, false);
    }

    public static PlpFilterNudgeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_filter_nudge;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpFilterNudgeBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

