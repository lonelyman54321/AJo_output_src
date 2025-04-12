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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;

public final class NewPdpDressToolBannerBinding
implements BC3 {
    public final ConstraintLayout clMainDressToolBanner;
    public final AjioRoundedCornerImageView imageView;
    private final ConstraintLayout rootView;
    public final View viewLine;

    private NewPdpDressToolBannerBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioRoundedCornerImageView ajioRoundedCornerImageView, View view) {
        this.rootView = constraintLayout;
        this.clMainDressToolBanner = constraintLayout2;
        this.imageView = ajioRoundedCornerImageView;
        this.viewLine = view;
    }

    public static NewPdpDressToolBannerBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.imageView;
        AjioRoundedCornerImageView ajioRoundedCornerImageView = (AjioRoundedCornerImageView)dd2_2.a(n3, object);
        if (ajioRoundedCornerImageView != null && (view = dd2_2.a(n3 = R$id.view_line, object)) != null) {
            object = new NewPdpDressToolBannerBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), ajioRoundedCornerImageView, view);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static NewPdpDressToolBannerBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpDressToolBannerBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpDressToolBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_dress_tool_banner;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpDressToolBannerBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

