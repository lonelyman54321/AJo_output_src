/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public final class OlpHomeCarouselLayoutBinding
implements BC3 {
    public final NewAjioStoryViewPager componentRotatingImageViewpager;
    public final TextView olpWidgetTitle;
    public final LinearLayout progressBarView;
    private final RelativeLayout rootView;
    public final RelativeLayout rotatingParent;

    private OlpHomeCarouselLayoutBinding(RelativeLayout relativeLayout, NewAjioStoryViewPager newAjioStoryViewPager, TextView textView, LinearLayout linearLayout, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.componentRotatingImageViewpager = newAjioStoryViewPager;
        this.olpWidgetTitle = textView;
        this.progressBarView = linearLayout;
        this.rotatingParent = relativeLayout2;
    }

    public static OlpHomeCarouselLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.component_rotating_image_viewpager;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (NewAjioStoryViewPager)view;
        if (object2 != null) {
            n3 = R$id.olp_widget_title;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (TextView)view;
            if (view2 != null) {
                n3 = R$id.progress_bar_view;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    Object object3 = object;
                    object3 = (RelativeLayout)object;
                    object = new OlpHomeCarouselLayoutBinding((RelativeLayout)object3, (NewAjioStoryViewPager)((Object)object2), (TextView)view2, (LinearLayout)view3, (RelativeLayout)object3);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OlpHomeCarouselLayoutBinding inflate(LayoutInflater layoutInflater) {
        return OlpHomeCarouselLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static OlpHomeCarouselLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.olp_home_carousel_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OlpHomeCarouselLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

