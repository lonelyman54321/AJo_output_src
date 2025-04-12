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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public final class ItemCmsBannerConfirmBinding
implements BC3 {
    public final NewAjioStoryViewPager componentRotatingImageViewpager;
    public final LinearLayout progressBarView;
    private final ConstraintLayout rootView;

    private ItemCmsBannerConfirmBinding(ConstraintLayout constraintLayout, NewAjioStoryViewPager newAjioStoryViewPager, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.componentRotatingImageViewpager = newAjioStoryViewPager;
        this.progressBarView = linearLayout;
    }

    public static ItemCmsBannerConfirmBinding bind(View object) {
        LinearLayout linearLayout;
        int n3 = R$id.component_rotating_image_viewpager;
        NewAjioStoryViewPager newAjioStoryViewPager = (NewAjioStoryViewPager)dd2_2.a(n3, object);
        if (newAjioStoryViewPager != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.progress_bar_view, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ItemCmsBannerConfirmBinding itemCmsBannerConfirmBinding = new ItemCmsBannerConfirmBinding((ConstraintLayout)((Object)object), newAjioStoryViewPager, linearLayout);
            return itemCmsBannerConfirmBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCmsBannerConfirmBinding inflate(LayoutInflater layoutInflater) {
        return ItemCmsBannerConfirmBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCmsBannerConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cms_banner_confirm;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCmsBannerConfirmBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

