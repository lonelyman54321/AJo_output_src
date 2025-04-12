/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class SubRowComponentImvBinding
implements BC3 {
    private final FrameLayout rootView;
    public final ImageView subRowImvComponent;
    public final FrameLayout subRowLayoutClick;
    public final FrameLayout subRowLayoutFrame;

    private SubRowComponentImvBinding(FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.rootView = frameLayout;
        this.subRowImvComponent = imageView;
        this.subRowLayoutClick = frameLayout2;
        this.subRowLayoutFrame = frameLayout3;
    }

    public static SubRowComponentImvBinding bind(View object) {
        FrameLayout frameLayout;
        int n3 = R$id.sub_row_imv_component;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.sub_row_layout_click, object)) != null) {
            object = (FrameLayout)object;
            SubRowComponentImvBinding subRowComponentImvBinding = new SubRowComponentImvBinding((FrameLayout)object, imageView, frameLayout, (FrameLayout)object);
            return subRowComponentImvBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SubRowComponentImvBinding inflate(LayoutInflater layoutInflater) {
        return SubRowComponentImvBinding.inflate(layoutInflater, null, false);
    }

    public static SubRowComponentImvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.sub_row_component_imv;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SubRowComponentImvBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

