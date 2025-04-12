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

public final class CustomToastLayoutBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final TextView textView3;
    public final ConstraintLayout toastContainer;

    private CustomToastLayoutBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.textView3 = textView;
        this.toastContainer = constraintLayout2;
    }

    public static CustomToastLayoutBinding bind(View object) {
        int n3 = R$id.textView3;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (ConstraintLayout)((Object)object);
            CustomToastLayoutBinding customToastLayoutBinding = new CustomToastLayoutBinding((ConstraintLayout)((Object)object), textView, (ConstraintLayout)((Object)object));
            return customToastLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CustomToastLayoutBinding inflate(LayoutInflater layoutInflater) {
        return CustomToastLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static CustomToastLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.custom_toast_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CustomToastLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

