/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowNoItemEligibleBinding
implements BC3 {
    public final ImageView imvLocation;
    public final AjioTextView lblFindStore;
    private final ConstraintLayout rootView;

    private RowNoItemEligibleBinding(ConstraintLayout constraintLayout, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.imvLocation = imageView;
        this.lblFindStore = ajioTextView;
    }

    public static RowNoItemEligibleBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.imv_location;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.lbl_find_store, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            RowNoItemEligibleBinding rowNoItemEligibleBinding = new RowNoItemEligibleBinding((ConstraintLayout)((Object)object), imageView, ajioTextView);
            return rowNoItemEligibleBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowNoItemEligibleBinding inflate(LayoutInflater layoutInflater) {
        return RowNoItemEligibleBinding.inflate(layoutInflater, null, false);
    }

    public static RowNoItemEligibleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_no_item_eligible;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowNoItemEligibleBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

