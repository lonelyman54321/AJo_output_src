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

public final class OrderSummaryComposeLayoutBinding
implements BC3 {
    public final FrameLayout content;
    public final ComposeView orderSummaryCompose;
    private final ConstraintLayout rootView;

    private OrderSummaryComposeLayoutBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ComposeView composeView) {
        this.rootView = constraintLayout;
        this.content = frameLayout;
        this.orderSummaryCompose = composeView;
    }

    public static OrderSummaryComposeLayoutBinding bind(View object) {
        ComposeView composeView;
        int n3 = R$id.content;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null && (composeView = (ComposeView)dd2_2.a(n3 = R$id.order_summary_compose, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            OrderSummaryComposeLayoutBinding orderSummaryComposeLayoutBinding = new OrderSummaryComposeLayoutBinding((ConstraintLayout)((Object)object), frameLayout, composeView);
            return orderSummaryComposeLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OrderSummaryComposeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return OrderSummaryComposeLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static OrderSummaryComposeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_summary_compose_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderSummaryComposeLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

