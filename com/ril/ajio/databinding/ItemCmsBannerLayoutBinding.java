/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public final class ItemCmsBannerLayoutBinding
implements BC3 {
    public final NewAjioStoryViewPager componentRotatingImageViewpager;
    public final FrameLayout dynamicAddViewFrameLayout;
    public final LinearLayout progressBarView;
    private final RelativeLayout rootView;
    public final RelativeLayout rotatingParent;

    private ItemCmsBannerLayoutBinding(RelativeLayout relativeLayout, NewAjioStoryViewPager newAjioStoryViewPager, FrameLayout frameLayout, LinearLayout linearLayout, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.componentRotatingImageViewpager = newAjioStoryViewPager;
        this.dynamicAddViewFrameLayout = frameLayout;
        this.progressBarView = linearLayout;
        this.rotatingParent = relativeLayout2;
    }

    public static ItemCmsBannerLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.component_rotating_image_viewpager;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (NewAjioStoryViewPager)view;
        if (object2 != null) {
            n3 = R$id.dynamic_add_view_frame_layout;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (FrameLayout)view;
            if (view2 != null) {
                n3 = R$id.progress_bar_view;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    Object object3 = object;
                    object3 = (RelativeLayout)object;
                    object = new ItemCmsBannerLayoutBinding((RelativeLayout)object3, (NewAjioStoryViewPager)((Object)object2), (FrameLayout)view2, (LinearLayout)view3, (RelativeLayout)object3);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCmsBannerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ItemCmsBannerLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCmsBannerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cms_banner_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCmsBannerLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

