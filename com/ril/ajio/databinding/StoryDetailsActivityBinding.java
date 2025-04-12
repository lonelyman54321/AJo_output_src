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
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class StoryDetailsActivityBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ViewPager2 viewPager;

    private StoryDetailsActivityBinding(ConstraintLayout constraintLayout, ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.viewPager = viewPager2;
    }

    public static StoryDetailsActivityBinding bind(View object) {
        int n3 = R$id.viewPager;
        ViewPager2 viewPager2 = (ViewPager2)dd2_2.a(n3, object);
        if (viewPager2 != null) {
            object = (ConstraintLayout)((Object)object);
            StoryDetailsActivityBinding storyDetailsActivityBinding = new StoryDetailsActivityBinding((ConstraintLayout)((Object)object), viewPager2);
            return storyDetailsActivityBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static StoryDetailsActivityBinding inflate(LayoutInflater layoutInflater) {
        return StoryDetailsActivityBinding.inflate(layoutInflater, null, false);
    }

    public static StoryDetailsActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.story_details_activity;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return StoryDetailsActivityBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

