/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public final class HomeRotatingImageLayoutBinding
implements BC3 {
    public final NewAjioStoryViewPager componentRotatingImageViewpager;
    public final LinearLayout progressBarView;
    private final RelativeLayout rootView;
    public final RelativeLayout rotatingParent;

    private HomeRotatingImageLayoutBinding(RelativeLayout relativeLayout, NewAjioStoryViewPager newAjioStoryViewPager, LinearLayout linearLayout, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.componentRotatingImageViewpager = newAjioStoryViewPager;
        this.progressBarView = linearLayout;
        this.rotatingParent = relativeLayout2;
    }

    public static HomeRotatingImageLayoutBinding bind(View object) {
        LinearLayout linearLayout;
        int n3 = R$id.component_rotating_image_viewpager;
        NewAjioStoryViewPager newAjioStoryViewPager = (NewAjioStoryViewPager)dd2_2.a(n3, object);
        if (newAjioStoryViewPager != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.progress_bar_view, object)) != null) {
            object = (RelativeLayout)object;
            HomeRotatingImageLayoutBinding homeRotatingImageLayoutBinding = new HomeRotatingImageLayoutBinding((RelativeLayout)object, newAjioStoryViewPager, linearLayout, (RelativeLayout)object);
            return homeRotatingImageLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static HomeRotatingImageLayoutBinding inflate(LayoutInflater layoutInflater) {
        return HomeRotatingImageLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static HomeRotatingImageLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.home_rotating_image_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomeRotatingImageLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

