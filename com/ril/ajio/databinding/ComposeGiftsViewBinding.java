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
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ComposeGiftsViewBinding
implements BC3 {
    public final ComposeView composeGiftsView;
    public final ConstraintLayout freebies;
    private final ConstraintLayout rootView;

    private ComposeGiftsViewBinding(ConstraintLayout constraintLayout, ComposeView composeView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.composeGiftsView = composeView;
        this.freebies = constraintLayout2;
    }

    public static ComposeGiftsViewBinding bind(View object) {
        int n3 = R$id.composeGiftsView;
        ComposeView composeView = (ComposeView)dd2_2.a(n3, object);
        if (composeView != null) {
            object = (ConstraintLayout)((Object)object);
            ComposeGiftsViewBinding composeGiftsViewBinding = new ComposeGiftsViewBinding((ConstraintLayout)((Object)object), composeView, (ConstraintLayout)((Object)object));
            return composeGiftsViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ComposeGiftsViewBinding inflate(LayoutInflater layoutInflater) {
        return ComposeGiftsViewBinding.inflate(layoutInflater, null, false);
    }

    public static ComposeGiftsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.compose_gifts_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ComposeGiftsViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

