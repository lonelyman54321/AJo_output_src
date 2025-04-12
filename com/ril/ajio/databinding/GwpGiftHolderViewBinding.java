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

public final class GwpGiftHolderViewBinding
implements BC3 {
    public final AppCompatImageView ivGifts;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvGiftsName;
    public final AppCompatTextView tvGiftsQty;

    private GwpGiftHolderViewBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.ivGifts = appCompatImageView;
        this.tvGiftsName = appCompatTextView;
        this.tvGiftsQty = appCompatTextView2;
    }

    public static GwpGiftHolderViewBinding bind(View object) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        int n3 = R$id.ivGifts;
        AppCompatImageView appCompatImageView = (AppCompatImageView)dd2_2.a(n3, object);
        if (appCompatImageView != null && (appCompatTextView2 = (AppCompatTextView)dd2_2.a(n3 = R$id.tvGiftsName, object)) != null && (appCompatTextView = (AppCompatTextView)dd2_2.a(n3 = R$id.tvGiftsQty, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            GwpGiftHolderViewBinding gwpGiftHolderViewBinding = new GwpGiftHolderViewBinding((ConstraintLayout)((Object)object), appCompatImageView, appCompatTextView2, appCompatTextView);
            return gwpGiftHolderViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static GwpGiftHolderViewBinding inflate(LayoutInflater layoutInflater) {
        return GwpGiftHolderViewBinding.inflate(layoutInflater, null, false);
    }

    public static GwpGiftHolderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.gwp_gift_holder_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return GwpGiftHolderViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

