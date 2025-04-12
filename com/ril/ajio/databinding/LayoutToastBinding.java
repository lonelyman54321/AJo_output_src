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

public final class LayoutToastBinding
implements BC3 {
    public final TextView ltTvInfo;
    private final ConstraintLayout rootView;

    private LayoutToastBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.ltTvInfo = textView;
    }

    public static LayoutToastBinding bind(View object) {
        int n3 = R$id.ltTvInfo;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutToastBinding layoutToastBinding = new LayoutToastBinding((ConstraintLayout)((Object)object), textView);
            return layoutToastBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutToastBinding inflate(LayoutInflater layoutInflater) {
        return LayoutToastBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutToastBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_toast;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutToastBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

