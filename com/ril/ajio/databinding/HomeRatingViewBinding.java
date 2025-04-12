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
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$layout;

public final class HomeRatingViewBinding
implements BC3 {
    public final ViewPager2 ratingViewPager;
    private final ViewPager2 rootView;

    private HomeRatingViewBinding(ViewPager2 viewPager2, ViewPager2 viewPager22) {
        this.rootView = viewPager2;
        this.ratingViewPager = viewPager22;
    }

    public static HomeRatingViewBinding bind(View object) {
        if (object != null) {
            object = (ViewPager2)((Object)object);
            HomeRatingViewBinding homeRatingViewBinding = new HomeRatingViewBinding((ViewPager2)((Object)object), (ViewPager2)((Object)object));
            return homeRatingViewBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static HomeRatingViewBinding inflate(LayoutInflater layoutInflater) {
        return HomeRatingViewBinding.inflate(layoutInflater, null, false);
    }

    public static HomeRatingViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.home_rating_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomeRatingViewBinding.bind((View)layoutInflater);
    }

    public ViewPager2 getRoot() {
        return this.rootView;
    }
}

