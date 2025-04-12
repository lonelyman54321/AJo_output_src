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

public final class FragmentHomeParentBinding
implements BC3 {
    public final FrameLayout homeContent;
    private final FrameLayout rootView;

    private FragmentHomeParentBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.homeContent = frameLayout2;
    }

    public static FragmentHomeParentBinding bind(View object) {
        int n3 = R$id.home_content;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null) {
            object = (FrameLayout)object;
            FragmentHomeParentBinding fragmentHomeParentBinding = new FragmentHomeParentBinding((FrameLayout)object, frameLayout);
            return fragmentHomeParentBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentHomeParentBinding inflate(LayoutInflater layoutInflater) {
        return FragmentHomeParentBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentHomeParentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_home_parent;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentHomeParentBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

