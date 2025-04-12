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
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class VideoViewBinding
implements BC3 {
    public final ConstraintLayout layoutVideo;
    public final LinearLayout progressBarView;
    private final ConstraintLayout rootView;
    public final ViewPager2 viewPager;

    private VideoViewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.layoutVideo = constraintLayout2;
        this.progressBarView = linearLayout;
        this.viewPager = viewPager2;
    }

    public static VideoViewBinding bind(View object) {
        ViewPager2 viewPager2;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.progress_bar_view;
        LinearLayout linearLayout = (LinearLayout)dd2_2.a(n3, object);
        if (linearLayout != null && (viewPager2 = (ViewPager2)dd2_2.a(n3 = R$id.viewPager, object)) != null) {
            object = new VideoViewBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), linearLayout, viewPager2);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static VideoViewBinding inflate(LayoutInflater layoutInflater) {
        return VideoViewBinding.inflate(layoutInflater, null, false);
    }

    public static VideoViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.video_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return VideoViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

