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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;

public abstract class CartRemoveAllBottomSheetBinding
extends ViewDataBinding {
    public final TextView agDialogTitle;
    public final TextView cartMoveWishlistAll;
    public final TextView cartRemoveAll;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout dlprLayoutContent;
    public final RecyclerView oosRv;
    public final AjioLoaderView removeCartItemProgress;

    public CartRemoveAllBottomSheetBinding(Object object, View view, int n3, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, RecyclerView recyclerView, AjioLoaderView ajioLoaderView) {
        super(object, view, n3);
        this.agDialogTitle = textView;
        this.cartMoveWishlistAll = textView2;
        this.cartRemoveAll = textView3;
        this.closeDialog = appCompatImageView;
        this.dlprLayoutContent = constraintLayout;
        this.oosRv = recyclerView;
        this.removeCartItemProgress = ajioLoaderView;
    }

    public static CartRemoveAllBottomSheetBinding bind(View view) {
        return CartRemoveAllBottomSheetBinding.bind(view, null);
    }

    public static CartRemoveAllBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.cart_remove_all_bottom_sheet;
        return (CartRemoveAllBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static CartRemoveAllBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return CartRemoveAllBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static CartRemoveAllBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return CartRemoveAllBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static CartRemoveAllBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.cart_remove_all_bottom_sheet;
        return (CartRemoveAllBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static CartRemoveAllBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.cart_remove_all_bottom_sheet;
        return (CartRemoveAllBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

