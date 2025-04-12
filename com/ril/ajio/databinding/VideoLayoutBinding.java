/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.SeekBar
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class VideoLayoutBinding
implements BC3 {
    public final ImageView imgPlay;
    public final ImageView imgPlayPause;
    public final ImageView imgThumbnail;
    public final ImageView imgVolume;
    public final ImageView imgZoomOut;
    public final PlayerView playerView;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final SeekBar seekBar;

    private VideoLayoutBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, PlayerView playerView, ProgressBar progressBar, SeekBar seekBar) {
        this.rootView = constraintLayout;
        this.imgPlay = imageView;
        this.imgPlayPause = imageView2;
        this.imgThumbnail = imageView3;
        this.imgVolume = imageView4;
        this.imgZoomOut = imageView5;
        this.playerView = playerView;
        this.progress = progressBar;
        this.seekBar = seekBar;
    }

    public static VideoLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.imgPlay;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.imgPlayPause;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.imgThumbnail;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.imgVolume;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        n3 = R$id.imgZoomOut;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (ImageView)view;
                        if (view6 != null) {
                            n3 = R$id.playerView;
                            Object object2 = view = dd2_2.a(n3, object);
                            object2 = (PlayerView)view;
                            if (object2 != null) {
                                n3 = R$id.progress;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (ProgressBar)view;
                                if (view7 != null) {
                                    n3 = R$id.seekBar;
                                    View view8 = view = dd2_2.a(n3, object);
                                    view8 = (SeekBar)view;
                                    if (view8 != null) {
                                        Object object3 = object;
                                        object3 = (ConstraintLayout)((Object)object);
                                        VideoLayoutBinding videoLayoutBinding = new VideoLayoutBinding((ConstraintLayout)((Object)object3), (ImageView)view2, (ImageView)view3, (ImageView)view4, (ImageView)view5, (ImageView)view6, (PlayerView)((Object)object2), (ProgressBar)view7, (SeekBar)view8);
                                        return videoLayoutBinding;
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

    public static VideoLayoutBinding inflate(LayoutInflater layoutInflater) {
        return VideoLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static VideoLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.video_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return VideoLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

