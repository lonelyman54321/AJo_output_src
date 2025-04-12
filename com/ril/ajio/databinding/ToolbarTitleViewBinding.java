/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ToolbarTitleViewBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView toolbarTitleTv;
    public final LinearLayout toolbarTitleTvLayout;

    private ToolbarTitleViewBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.toolbarTitleTv = ajioTextView;
        this.toolbarTitleTvLayout = linearLayout2;
    }

    public static ToolbarTitleViewBinding bind(View object) {
        int n3 = R$id.toolbar_title_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            ToolbarTitleViewBinding toolbarTitleViewBinding = new ToolbarTitleViewBinding((LinearLayout)object, ajioTextView, (LinearLayout)object);
            return toolbarTitleViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ToolbarTitleViewBinding inflate(LayoutInflater layoutInflater) {
        return ToolbarTitleViewBinding.inflate(layoutInflater, null, false);
    }

    public static ToolbarTitleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.toolbar_title_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarTitleViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

