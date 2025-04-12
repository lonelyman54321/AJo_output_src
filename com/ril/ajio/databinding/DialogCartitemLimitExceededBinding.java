/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCenterDrawableButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class DialogCartitemLimitExceededBinding
implements BC3 {
    public final AjioCenterDrawableButton cartItemMovetocloset;
    public final ImageView ivCartitemLimitexceeedClose;
    private final LinearLayout rootView;
    public final AjioTextView tvCartitemCannotaddLabel;

    private DialogCartitemLimitExceededBinding(LinearLayout linearLayout, AjioCenterDrawableButton ajioCenterDrawableButton, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.cartItemMovetocloset = ajioCenterDrawableButton;
        this.ivCartitemLimitexceeedClose = imageView;
        this.tvCartitemCannotaddLabel = ajioTextView;
    }

    public static DialogCartitemLimitExceededBinding bind(View object) {
        AjioTextView ajioTextView;
        ImageView imageView;
        int n3 = R$id.cart_item_movetocloset;
        AjioCenterDrawableButton ajioCenterDrawableButton = (AjioCenterDrawableButton)dd2_2.a(n3, object);
        if (ajioCenterDrawableButton != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.iv_cartitem_limitexceeed_close, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_cartitem_cannotadd_label, object)) != null) {
            object = (LinearLayout)object;
            DialogCartitemLimitExceededBinding dialogCartitemLimitExceededBinding = new DialogCartitemLimitExceededBinding((LinearLayout)object, ajioCenterDrawableButton, imageView, ajioTextView);
            return dialogCartitemLimitExceededBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static DialogCartitemLimitExceededBinding inflate(LayoutInflater layoutInflater) {
        return DialogCartitemLimitExceededBinding.inflate(layoutInflater, null, false);
    }

    public static DialogCartitemLimitExceededBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_cartitem_limit_exceeded;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogCartitemLimitExceededBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

