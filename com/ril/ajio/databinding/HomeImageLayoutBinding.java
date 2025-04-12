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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class HomeImageLayoutBinding
implements BC3 {
    public final ConstraintLayout homeImageContainer;
    private final ConstraintLayout rootView;
    public final FrameLayout timerContainer;

    private HomeImageLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.homeImageContainer = constraintLayout2;
        this.timerContainer = frameLayout;
    }

    public static HomeImageLayoutBinding bind(View object) {
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.timerContainer;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null) {
            object = new HomeImageLayoutBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), frameLayout);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static HomeImageLayoutBinding inflate(LayoutInflater layoutInflater) {
        return HomeImageLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static HomeImageLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.home_image_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomeImageLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

