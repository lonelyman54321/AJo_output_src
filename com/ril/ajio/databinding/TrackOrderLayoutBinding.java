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
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class TrackOrderLayoutBinding
implements BC3 {
    public final LinearLayout bottomTitleWrapper;
    public final RelativeLayout dotsWrapper;
    public final ProgressBar progressbar;
    public final RelativeLayout progressbarLayout;
    private final LinearLayout rootView;
    public final LinearLayout topTitleWrapper;

    private TrackOrderLayoutBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, ProgressBar progressBar, RelativeLayout relativeLayout2, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.bottomTitleWrapper = linearLayout2;
        this.dotsWrapper = relativeLayout;
        this.progressbar = progressBar;
        this.progressbarLayout = relativeLayout2;
        this.topTitleWrapper = linearLayout3;
    }

    public static TrackOrderLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.bottomTitleWrapper;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.dotsWrapper;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n3 = R$id.progressbar;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ProgressBar)view;
                if (view4 != null) {
                    n3 = R$id.progressbar_layout;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (RelativeLayout)view;
                    if (view5 != null) {
                        n3 = R$id.topTitleWrapper;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (LinearLayout)view;
                        if (view6 != null) {
                            Object object2 = object;
                            object2 = (LinearLayout)object;
                            TrackOrderLayoutBinding trackOrderLayoutBinding = new TrackOrderLayoutBinding((LinearLayout)object2, (LinearLayout)view2, (RelativeLayout)view3, (ProgressBar)view4, (RelativeLayout)view5, (LinearLayout)view6);
                            return trackOrderLayoutBinding;
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

    public static TrackOrderLayoutBinding inflate(LayoutInflater layoutInflater) {
        return TrackOrderLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static TrackOrderLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.track_order_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TrackOrderLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

