/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ExoplayerViewBinding
implements BC3 {
    public final ImageView imgPlay;
    public final ImageView imgThumbnail;
    public final ImageView imgVolume;
    public final ImageView imgZoom;
    public final PlayerView playerView;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final TextView timeTextView;

    private ExoplayerViewBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, PlayerView playerView, ProgressBar progressBar, TextView textView) {
        this.rootView = constraintLayout;
        this.imgPlay = imageView;
        this.imgThumbnail = imageView2;
        this.imgVolume = imageView3;
        this.imgZoom = imageView4;
        this.playerView = playerView;
        this.progress = progressBar;
        this.timeTextView = textView;
    }

    public static ExoplayerViewBinding bind(View object) {
        View view;
        int n3 = R$id.imgPlay;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.imgThumbnail;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.imgVolume;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.imgZoom;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        n3 = R$id.playerView;
                        Object object2 = view = dd2_2.a(n3, object);
                        object2 = (PlayerView)view;
                        if (object2 != null) {
                            n3 = R$id.progress;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (ProgressBar)view;
                            if (view6 != null) {
                                n3 = R$id.timeTextView;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (TextView)view;
                                if (view7 != null) {
                                    Object object3 = object;
                                    object3 = (ConstraintLayout)((Object)object);
                                    ExoplayerViewBinding exoplayerViewBinding = new ExoplayerViewBinding((ConstraintLayout)((Object)object3), (ImageView)view2, (ImageView)view3, (ImageView)view4, (ImageView)view5, (PlayerView)((Object)object2), (ProgressBar)view6, (TextView)view7);
                                    return exoplayerViewBinding;
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

    public static ExoplayerViewBinding inflate(LayoutInflater layoutInflater) {
        return ExoplayerViewBinding.inflate(layoutInflater, null, false);
    }

    public static ExoplayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exoplayer_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExoplayerViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

