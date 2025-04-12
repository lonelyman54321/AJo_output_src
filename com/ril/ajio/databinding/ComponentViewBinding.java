/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ComponentViewBinding
implements BC3 {
    public final ImageView componentViewImvHero;
    public final FrameLayout componentViewLayoutClick;
    public final RecyclerView componentViewRv;
    private final RelativeLayout rootView;

    private ComponentViewBinding(RelativeLayout relativeLayout, ImageView imageView, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.rootView = relativeLayout;
        this.componentViewImvHero = imageView;
        this.componentViewLayoutClick = frameLayout;
        this.componentViewRv = recyclerView;
    }

    public static ComponentViewBinding bind(View object) {
        RecyclerView recyclerView;
        FrameLayout frameLayout;
        int n3 = R$id.component_view_imv_hero;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.component_view_layout_click, object)) != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.component_view_rv, object)) != null) {
            object = (RelativeLayout)object;
            ComponentViewBinding componentViewBinding = new ComponentViewBinding((RelativeLayout)object, imageView, frameLayout, recyclerView);
            return componentViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ComponentViewBinding inflate(LayoutInflater layoutInflater) {
        return ComponentViewBinding.inflate(layoutInflater, null, false);
    }

    public static ComponentViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.component_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ComponentViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

