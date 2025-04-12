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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ExoPlayerStoryDisplayBinding
implements BC3 {
    public final AppCompatImageView feedDisplayImage;
    public final ImageView imgPlay;
    public final ImageView imgReplay;
    private final ConstraintLayout rootView;
    public final ImageView storyDisplayImage;
    public final PlayerView storyDisplayVideo;
    public final ProgressBar storyDisplayVideoProgress;

    private ExoPlayerStoryDisplayBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, PlayerView playerView, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.feedDisplayImage = appCompatImageView;
        this.imgPlay = imageView;
        this.imgReplay = imageView2;
        this.storyDisplayImage = imageView3;
        this.storyDisplayVideo = playerView;
        this.storyDisplayVideoProgress = progressBar;
    }

    public static ExoPlayerStoryDisplayBinding bind(View object) {
        View view;
        int n3 = R$id.feedDisplayImage;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.imgPlay;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.imgReplay;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.storyDisplayImage;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (ImageView)view;
                    if (view4 != null) {
                        n3 = R$id.storyDisplayVideo;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (PlayerView)view;
                        if (object3 != null) {
                            n3 = R$id.storyDisplayVideoProgress;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (ProgressBar)view;
                            if (view5 != null) {
                                Object object4 = object;
                                object4 = (ConstraintLayout)((Object)object);
                                ExoPlayerStoryDisplayBinding exoPlayerStoryDisplayBinding = new ExoPlayerStoryDisplayBinding((ConstraintLayout)((Object)object4), (AppCompatImageView)((Object)object2), (ImageView)view2, (ImageView)view3, (ImageView)view4, (PlayerView)((Object)object3), (ProgressBar)view5);
                                return exoPlayerStoryDisplayBinding;
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

    public static ExoPlayerStoryDisplayBinding inflate(LayoutInflater layoutInflater) {
        return ExoPlayerStoryDisplayBinding.inflate(layoutInflater, null, false);
    }

    public static ExoPlayerStoryDisplayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exo_player_story_display;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExoPlayerStoryDisplayBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

