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
import com.ril.ajio.R$layout;

public final class MyAccountFragMainLayoutBinding
implements BC3 {
    private final FrameLayout rootView;

    private MyAccountFragMainLayoutBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static MyAccountFragMainLayoutBinding bind(View object) {
        if (object != null) {
            object = (FrameLayout)object;
            MyAccountFragMainLayoutBinding myAccountFragMainLayoutBinding = new MyAccountFragMainLayoutBinding((FrameLayout)object);
            return myAccountFragMainLayoutBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static MyAccountFragMainLayoutBinding inflate(LayoutInflater layoutInflater) {
        return MyAccountFragMainLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static MyAccountFragMainLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.my_account_frag_main_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return MyAccountFragMainLayoutBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

