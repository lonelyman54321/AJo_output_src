/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpNewUserBannerBinding
implements BC3 {
    public final AppCompatImageView bannerIv;
    private final LinearLayout rootView;

    private PlpNewUserBannerBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView) {
        this.rootView = linearLayout;
        this.bannerIv = appCompatImageView;
    }

    public static PlpNewUserBannerBinding bind(View object) {
        int n3 = R$id.banner_iv;
        AppCompatImageView appCompatImageView = (AppCompatImageView)dd2_2.a(n3, object);
        if (appCompatImageView != null) {
            object = (LinearLayout)object;
            PlpNewUserBannerBinding plpNewUserBannerBinding = new PlpNewUserBannerBinding((LinearLayout)object, appCompatImageView);
            return plpNewUserBannerBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpNewUserBannerBinding inflate(LayoutInflater layoutInflater) {
        return PlpNewUserBannerBinding.inflate(layoutInflater, null, false);
    }

    public static PlpNewUserBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_new_user_banner;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpNewUserBannerBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

