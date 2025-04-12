/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutBackToTopBinding
implements BC3 {
    public final TextView lbttTvBack2top;
    private final ConstraintLayout rootView;

    private LayoutBackToTopBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.lbttTvBack2top = textView;
    }

    public static LayoutBackToTopBinding bind(View object) {
        int n3 = R$id.lbttTvBack2top;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutBackToTopBinding layoutBackToTopBinding = new LayoutBackToTopBinding((ConstraintLayout)((Object)object), textView);
            return layoutBackToTopBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutBackToTopBinding inflate(LayoutInflater layoutInflater) {
        return LayoutBackToTopBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutBackToTopBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_back_to_top;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutBackToTopBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

