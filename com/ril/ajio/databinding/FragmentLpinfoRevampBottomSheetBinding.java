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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentLpinfoRevampBottomSheetBinding
implements BC3 {
    public final ImageView imvClose;
    private final LinearLayout rootView;
    public final AjioTextView tvLpDescription;

    private FragmentLpinfoRevampBottomSheetBinding(LinearLayout linearLayout, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.imvClose = imageView;
        this.tvLpDescription = ajioTextView;
    }

    public static FragmentLpinfoRevampBottomSheetBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.imv_close;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_lp_description, object)) != null) {
            object = (LinearLayout)object;
            FragmentLpinfoRevampBottomSheetBinding fragmentLpinfoRevampBottomSheetBinding = new FragmentLpinfoRevampBottomSheetBinding((LinearLayout)object, imageView, ajioTextView);
            return fragmentLpinfoRevampBottomSheetBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentLpinfoRevampBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLpinfoRevampBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLpinfoRevampBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_lpinfo_revamp_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLpinfoRevampBottomSheetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

