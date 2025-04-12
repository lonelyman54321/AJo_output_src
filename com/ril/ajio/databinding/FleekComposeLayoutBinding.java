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
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FleekComposeLayoutBinding
implements BC3 {
    public final FrameLayout content;
    public final ComposeView fleekCompose;
    private final ConstraintLayout rootView;

    private FleekComposeLayoutBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ComposeView composeView) {
        this.rootView = constraintLayout;
        this.content = frameLayout;
        this.fleekCompose = composeView;
    }

    public static FleekComposeLayoutBinding bind(View object) {
        ComposeView composeView;
        int n3 = R$id.content;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null && (composeView = (ComposeView)dd2_2.a(n3 = R$id.fleek_compose, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            FleekComposeLayoutBinding fleekComposeLayoutBinding = new FleekComposeLayoutBinding((ConstraintLayout)((Object)object), frameLayout, composeView);
            return fleekComposeLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FleekComposeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return FleekComposeLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static FleekComposeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fleek_compose_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FleekComposeLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

