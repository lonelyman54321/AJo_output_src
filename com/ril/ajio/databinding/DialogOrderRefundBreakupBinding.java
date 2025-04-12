/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogOrderRefundBreakupBinding
implements BC3 {
    public final ImageView refundBreakupCancelIv;
    public final FrameLayout refundBreakupCancelLayout;
    private final LinearLayout rootView;

    private DialogOrderRefundBreakupBinding(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.refundBreakupCancelIv = imageView;
        this.refundBreakupCancelLayout = frameLayout;
    }

    public static DialogOrderRefundBreakupBinding bind(View object) {
        FrameLayout frameLayout;
        int n3 = R$id.refund_breakup_cancel_iv;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.refund_breakup_cancel_layout, object)) != null) {
            object = (LinearLayout)object;
            DialogOrderRefundBreakupBinding dialogOrderRefundBreakupBinding = new DialogOrderRefundBreakupBinding((LinearLayout)object, imageView, frameLayout);
            return dialogOrderRefundBreakupBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static DialogOrderRefundBreakupBinding inflate(LayoutInflater layoutInflater) {
        return DialogOrderRefundBreakupBinding.inflate(layoutInflater, null, false);
    }

    public static DialogOrderRefundBreakupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_order_refund_breakup;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogOrderRefundBreakupBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

