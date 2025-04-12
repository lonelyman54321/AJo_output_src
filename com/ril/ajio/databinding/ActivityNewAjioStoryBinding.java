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
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public final class ActivityNewAjioStoryBinding
implements BC3 {
    public final NewAjioStoryViewPager activityAjioStoryViewpager;
    private final NewAjioStoryViewPager rootView;

    private ActivityNewAjioStoryBinding(NewAjioStoryViewPager newAjioStoryViewPager, NewAjioStoryViewPager newAjioStoryViewPager2) {
        this.rootView = newAjioStoryViewPager;
        this.activityAjioStoryViewpager = newAjioStoryViewPager2;
    }

    public static ActivityNewAjioStoryBinding bind(View object) {
        if (object != null) {
            object = (NewAjioStoryViewPager)((Object)object);
            ActivityNewAjioStoryBinding activityNewAjioStoryBinding = new ActivityNewAjioStoryBinding((NewAjioStoryViewPager)((Object)object), (NewAjioStoryViewPager)((Object)object));
            return activityNewAjioStoryBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ActivityNewAjioStoryBinding inflate(LayoutInflater layoutInflater) {
        return ActivityNewAjioStoryBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityNewAjioStoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_new_ajio_story;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityNewAjioStoryBinding.bind((View)layoutInflater);
    }

    public NewAjioStoryViewPager getRoot() {
        return this.rootView;
    }
}

