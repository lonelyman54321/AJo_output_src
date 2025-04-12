/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class InappBottomWidgetViewBinding
implements BC3 {
    public final AppCompatTextView downloadButton;
    public final AppCompatImageView downloadIcon;
    public final AppCompatTextView downloadUpdate;
    private final ConstraintLayout rootView;

    private InappBottomWidgetViewBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.downloadButton = appCompatTextView;
        this.downloadIcon = appCompatImageView;
        this.downloadUpdate = appCompatTextView2;
    }

    public static InappBottomWidgetViewBinding bind(View object) {
        AppCompatTextView appCompatTextView;
        AppCompatImageView appCompatImageView;
        int n3 = R$id.download_button;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView)dd2_2.a(n3, object);
        if (appCompatTextView2 != null && (appCompatImageView = (AppCompatImageView)dd2_2.a(n3 = R$id.download_icon, object)) != null && (appCompatTextView = (AppCompatTextView)dd2_2.a(n3 = R$id.download_update, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            InappBottomWidgetViewBinding inappBottomWidgetViewBinding = new InappBottomWidgetViewBinding((ConstraintLayout)((Object)object), appCompatTextView2, appCompatImageView, appCompatTextView);
            return inappBottomWidgetViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static InappBottomWidgetViewBinding inflate(LayoutInflater layoutInflater) {
        return InappBottomWidgetViewBinding.inflate(layoutInflater, null, false);
    }

    public static InappBottomWidgetViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.inapp_bottom_widget_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return InappBottomWidgetViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

