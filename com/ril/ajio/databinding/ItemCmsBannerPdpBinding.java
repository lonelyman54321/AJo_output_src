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

public final class ItemCmsBannerPdpBinding
implements BC3 {
    public final ConstraintLayout componentBanners;
    public final NewAjioStoryViewPager componentRotatingImageViewpager;
    public final LinearLayout progressBarView;
    private final ConstraintLayout rootView;
    public final View separator;

    private ItemCmsBannerPdpBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, NewAjioStoryViewPager newAjioStoryViewPager, LinearLayout linearLayout, View view) {
        this.rootView = constraintLayout;
        this.componentBanners = constraintLayout2;
        this.componentRotatingImageViewpager = newAjioStoryViewPager;
        this.progressBarView = linearLayout;
        this.separator = view;
    }

    public static ItemCmsBannerPdpBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.component_rotating_image_viewpager;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (NewAjioStoryViewPager)view;
        if (object3 != null) {
            View view2;
            n3 = R$id.progress_bar_view;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null && (view2 = dd2_2.a(n3 = R$id.separator, object)) != null) {
                Object object4 = object;
                view = object2;
                object = new ItemCmsBannerPdpBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (NewAjioStoryViewPager)((Object)object3), (LinearLayout)view3, view2);
                return object;
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCmsBannerPdpBinding inflate(LayoutInflater layoutInflater) {
        return ItemCmsBannerPdpBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCmsBannerPdpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cms_banner_pdp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCmsBannerPdpBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

