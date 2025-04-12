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
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentPreviewItemBinding
implements BC3 {
    public final ImageView imgFullScreen;
    public final ImageView imgPlay;
    public final ImageView imgReplay;
    public final ImageView imgThumbnail;
    public final ImageView imgVolume;
    public final ConstraintLayout layoutImageView;
    public final ConstraintLayout layoutVideoView;
    public final ProgressBar progress;
    public final ConstraintLayout rlPreviewItem;
    private final ConstraintLayout rootView;
    public final FrameLayout timerContainer;
    public final TextView txtDuration;
    public final PlayerView videoView;
    public final View view16;

    private FragmentPreviewItemBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ProgressBar progressBar, ConstraintLayout constraintLayout4, FrameLayout frameLayout, TextView textView, PlayerView playerView, View view) {
        this.rootView = constraintLayout;
        this.imgFullScreen = imageView;
        this.imgPlay = imageView2;
        this.imgReplay = imageView3;
        this.imgThumbnail = imageView4;
        this.imgVolume = imageView5;
        this.layoutImageView = constraintLayout2;
        this.layoutVideoView = constraintLayout3;
        this.progress = progressBar;
        this.rlPreviewItem = constraintLayout4;
        this.timerContainer = frameLayout;
        this.txtDuration = textView;
        this.videoView = playerView;
        this.view16 = view;
    }

    public static FragmentPreviewItemBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.imgFullScreen;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.imgPlay;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (ImageView)view2;
            if (view4 != null) {
                n3 = R$id.imgReplay;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (ImageView)view2;
                if (view5 != null) {
                    n3 = R$id.imgThumbnail;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (ImageView)view2;
                    if (view6 != null) {
                        n3 = R$id.imgVolume;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (ImageView)view2;
                        if (view7 != null) {
                            n3 = R$id.layoutImageView;
                            Object object2 = view2 = dd2_2.a(n3, view);
                            object2 = (ConstraintLayout)view2;
                            if (object2 != null) {
                                n3 = R$id.layoutVideoView;
                                Object object3 = view2 = dd2_2.a(n3, view);
                                object3 = (ConstraintLayout)view2;
                                if (object3 != null) {
                                    n3 = R$id.progress;
                                    View view8 = view2 = dd2_2.a(n3, view);
                                    view8 = (ProgressBar)view2;
                                    if (view8 != null) {
                                        Object object4 = view;
                                        object4 = (ConstraintLayout)view;
                                        n3 = R$id.timerContainer;
                                        View view9 = view2 = dd2_2.a(n3, view);
                                        view9 = (FrameLayout)view2;
                                        if (view9 != null) {
                                            n3 = R$id.txtDuration;
                                            View view10 = view2 = dd2_2.a(n3, view);
                                            view10 = (TextView)view2;
                                            if (view10 != null) {
                                                View view11;
                                                n3 = R$id.video_view;
                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                object5 = (PlayerView)view2;
                                                if (object5 != null && (view11 = dd2_2.a(n3 = R$id.view16, view)) != null) {
                                                    object = new FragmentPreviewItemBinding((ConstraintLayout)((Object)object4), (ImageView)view3, (ImageView)view4, (ImageView)view5, (ImageView)view6, (ImageView)view7, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (ProgressBar)view8, (ConstraintLayout)((Object)object4), (FrameLayout)view9, (TextView)view10, (PlayerView)((Object)object5), view11);
                                                    return object;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentPreviewItemBinding inflate(LayoutInflater layoutInflater) {
        return FragmentPreviewItemBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentPreviewItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_preview_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentPreviewItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

