/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioVideoView;

public final class FensterVideoComponentBinding
implements BC3 {
    public final ProgressBar filterProgressbar;
    public final ImageView fvcIvClose;
    public final RelativeLayout mainParent;
    public final FrameLayout progressFrame;
    private final RelativeLayout rootView;
    public final RelativeLayout videoLayout;
    public final AjioVideoView videoView;

    private FensterVideoComponentBinding(RelativeLayout relativeLayout, ProgressBar progressBar, ImageView imageView, RelativeLayout relativeLayout2, FrameLayout frameLayout, RelativeLayout relativeLayout3, AjioVideoView ajioVideoView) {
        this.rootView = relativeLayout;
        this.filterProgressbar = progressBar;
        this.fvcIvClose = imageView;
        this.mainParent = relativeLayout2;
        this.progressFrame = frameLayout;
        this.videoLayout = relativeLayout3;
        this.videoView = ajioVideoView;
    }

    public static FensterVideoComponentBinding bind(View object) {
        View view;
        int n3 = R$id.filter_progressbar;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ProgressBar)view;
        if (view2 != null) {
            n3 = R$id.fvcIvClose;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                Object object2 = object;
                object2 = (RelativeLayout)object;
                n3 = R$id.progress_frame;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (FrameLayout)view;
                if (view4 != null) {
                    n3 = R$id.video_layout;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (RelativeLayout)view;
                    if (view5 != null) {
                        n3 = R$id.video_view;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioVideoView)view;
                        if (object3 != null) {
                            object = new FensterVideoComponentBinding((RelativeLayout)object2, (ProgressBar)view2, (ImageView)view3, (RelativeLayout)object2, (FrameLayout)view4, (RelativeLayout)view5, (AjioVideoView)((Object)object3));
                            return object;
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

    public static FensterVideoComponentBinding inflate(LayoutInflater layoutInflater) {
        return FensterVideoComponentBinding.inflate(layoutInflater, null, false);
    }

    public static FensterVideoComponentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fenster_video_component;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FensterVideoComponentBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

