/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentPDPVideoPlayerFullScreenBinding
implements BC3 {
    public final ImageView imgClose;
    public final ImageView imgPause;
    public final ImageView imgPlay;
    public final ImageView imgReplay;
    public final ImageView imgThumbnail;
    public final ImageView imgVolume;
    public final PlayerView playerView;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;

    private FragmentPDPVideoPlayerFullScreenBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, PlayerView playerView, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.imgClose = imageView;
        this.imgPause = imageView2;
        this.imgPlay = imageView3;
        this.imgReplay = imageView4;
        this.imgThumbnail = imageView5;
        this.imgVolume = imageView6;
        this.playerView = playerView;
        this.progress = progressBar;
    }

    public static FragmentPDPVideoPlayerFullScreenBinding bind(View object) {
        View view;
        int n3 = R$id.imgClose;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.imgPause;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.imgPlay;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.imgReplay;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        n3 = R$id.imgThumbnail;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (ImageView)view;
                        if (view6 != null) {
                            n3 = R$id.imgVolume;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (ImageView)view;
                            if (view7 != null) {
                                n3 = R$id.playerView;
                                Object object2 = view = dd2_2.a(n3, object);
                                object2 = (PlayerView)view;
                                if (object2 != null) {
                                    n3 = R$id.progress;
                                    View view8 = view = dd2_2.a(n3, object);
                                    view8 = (ProgressBar)view;
                                    if (view8 != null) {
                                        Object object3 = object;
                                        object3 = (ConstraintLayout)((Object)object);
                                        FragmentPDPVideoPlayerFullScreenBinding fragmentPDPVideoPlayerFullScreenBinding = new FragmentPDPVideoPlayerFullScreenBinding((ConstraintLayout)((Object)object3), (ImageView)view2, (ImageView)view3, (ImageView)view4, (ImageView)view5, (ImageView)view6, (ImageView)view7, (PlayerView)((Object)object2), (ProgressBar)view8);
                                        return fragmentPDPVideoPlayerFullScreenBinding;
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

    public static FragmentPDPVideoPlayerFullScreenBinding inflate(LayoutInflater layoutInflater) {
        return FragmentPDPVideoPlayerFullScreenBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentPDPVideoPlayerFullScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_p_d_p_video_player_full_screen;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentPDPVideoPlayerFullScreenBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

