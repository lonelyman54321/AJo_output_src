/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.Space
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Space;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.home.landingpage.widgets.view.InnerLandingViewPager;

public final class ViewNewAjioStoryBinding
implements BC3 {
    public final ProgressBar newAjioStoryProgressOne;
    public final ProgressBar newAjioStoryProgressThree;
    public final ProgressBar newAjioStoryProgressTwo;
    public final Space newAjioStorySpaceOne;
    public final Space newAjioStorySpaceTwo;
    public final InnerLandingViewPager newAjioStoryViewpager;
    private final RelativeLayout rootView;
    public final AjioTextView swipeUpLabel;
    public final LinearLayout swipeUpLayout;

    private ViewNewAjioStoryBinding(RelativeLayout relativeLayout, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, Space space, Space space2, InnerLandingViewPager innerLandingViewPager, AjioTextView ajioTextView, LinearLayout linearLayout) {
        this.rootView = relativeLayout;
        this.newAjioStoryProgressOne = progressBar;
        this.newAjioStoryProgressThree = progressBar2;
        this.newAjioStoryProgressTwo = progressBar3;
        this.newAjioStorySpaceOne = space;
        this.newAjioStorySpaceTwo = space2;
        this.newAjioStoryViewpager = innerLandingViewPager;
        this.swipeUpLabel = ajioTextView;
        this.swipeUpLayout = linearLayout;
    }

    public static ViewNewAjioStoryBinding bind(View object) {
        View view;
        int n3 = R$id.new_ajio_story_progress_one;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ProgressBar)view;
        if (view2 != null) {
            n3 = R$id.new_ajio_story_progress_three;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ProgressBar)view;
            if (view3 != null) {
                n3 = R$id.new_ajio_story_progress_two;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ProgressBar)view;
                if (view4 != null) {
                    n3 = R$id.new_ajio_story_space_one;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (Space)view;
                    if (view5 != null) {
                        n3 = R$id.new_ajio_story_space_two;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (Space)view;
                        if (view6 != null) {
                            n3 = R$id.new_ajio_story_viewpager;
                            Object object2 = view = dd2_2.a(n3, object);
                            object2 = (InnerLandingViewPager)view;
                            if (object2 != null) {
                                n3 = R$id.swipe_up_label;
                                Object object3 = view = dd2_2.a(n3, object);
                                object3 = (AjioTextView)view;
                                if (object3 != null) {
                                    n3 = R$id.swipe_up_layout;
                                    View view7 = view = dd2_2.a(n3, object);
                                    view7 = (LinearLayout)view;
                                    if (view7 != null) {
                                        Object object4 = object;
                                        object4 = (RelativeLayout)object;
                                        ViewNewAjioStoryBinding viewNewAjioStoryBinding = new ViewNewAjioStoryBinding((RelativeLayout)object4, (ProgressBar)view2, (ProgressBar)view3, (ProgressBar)view4, (Space)view5, (Space)view6, (InnerLandingViewPager)((Object)object2), (AjioTextView)object3, (LinearLayout)view7);
                                        return viewNewAjioStoryBinding;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ViewNewAjioStoryBinding inflate(LayoutInflater layoutInflater) {
        return ViewNewAjioStoryBinding.inflate(layoutInflater, null, false);
    }

    public static ViewNewAjioStoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_new_ajio_story;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewNewAjioStoryBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

