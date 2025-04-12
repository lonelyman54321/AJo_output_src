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

public final class VideoBaseLayoutBinding
implements BC3 {
    public final ImageView imgMuteUnmute;
    public final ImageView imgPause;
    public final ImageView imgPlay;
    public final ImageView imgReplay;
    public final ImageView imgThumbnail;
    public final AppCompatImageView ivDiscoverBrand;
    public final PlayerView playerView;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final ConstraintLayout videoConstraintView;
    public final View view16;

    private VideoBaseLayoutBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, AppCompatImageView appCompatImageView, PlayerView playerView, ProgressBar progressBar, ConstraintLayout constraintLayout2, View view) {
        this.rootView = constraintLayout;
        this.imgMuteUnmute = imageView;
        this.imgPause = imageView2;
        this.imgPlay = imageView3;
        this.imgReplay = imageView4;
        this.imgThumbnail = imageView5;
        this.ivDiscoverBrand = appCompatImageView;
        this.playerView = playerView;
        this.progress = progressBar;
        this.videoConstraintView = constraintLayout2;
        this.view16 = view;
    }

    public static VideoBaseLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.imgMuteUnmute;
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
                            n3 = R$id.iv_discover_brand;
                            Object object2 = view = dd2_2.a(n3, object);
                            object2 = (AppCompatImageView)view;
                            if (object2 != null) {
                                n3 = R$id.playerView;
                                Object object3 = view = dd2_2.a(n3, object);
                                object3 = (PlayerView)view;
                                if (object3 != null) {
                                    n3 = R$id.progress;
                                    View view7 = view = dd2_2.a(n3, object);
                                    view7 = (ProgressBar)view;
                                    if (view7 != null) {
                                        View view8;
                                        n3 = R$id.video_constraint_view;
                                        Object object4 = view = dd2_2.a(n3, object);
                                        object4 = (ConstraintLayout)view;
                                        if (object4 != null && (view8 = dd2_2.a(n3 = R$id.view16, object)) != null) {
                                            Object object5 = object;
                                            object5 = (ConstraintLayout)((Object)object);
                                            VideoBaseLayoutBinding videoBaseLayoutBinding = new VideoBaseLayoutBinding((ConstraintLayout)((Object)object5), (ImageView)view2, (ImageView)view3, (ImageView)view4, (ImageView)view5, (ImageView)view6, (AppCompatImageView)((Object)object2), (PlayerView)((Object)object3), (ProgressBar)view7, (ConstraintLayout)((Object)object4), view8);
                                            return videoBaseLayoutBinding;
                                        }
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

    public static VideoBaseLayoutBinding inflate(LayoutInflater layoutInflater) {
        return VideoBaseLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static VideoBaseLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.video_base_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return VideoBaseLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

