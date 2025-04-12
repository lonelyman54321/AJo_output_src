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
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;

public final class ActivityAjioVideoPlayerBinding
implements BC3 {
    public final AjioButton btnVideo;
    public final ConstraintLayout clGifOrImage;
    public final ImageView imgClose;
    public final ImageView imgGifOrImage;
    public final ImageView imgReplay;
    public final ImageView imgThumbnail;
    public final ImageView imgVolume;
    public final View overlayItem;
    public final View overlayItemBottom;
    public final PlayerView playerView;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;
    public final SeekBar seekBar;
    public final View topGradientView;
    public final TextView txtDuration;
    public final View view18;

    private ActivityAjioVideoPlayerBinding(ConstraintLayout constraintLayout, AjioButton ajioButton, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, View view, View view2, PlayerView playerView, ProgressBar progressBar, SeekBar seekBar, View view3, TextView textView, View view4) {
        this.rootView = constraintLayout;
        this.btnVideo = ajioButton;
        this.clGifOrImage = constraintLayout2;
        this.imgClose = imageView;
        this.imgGifOrImage = imageView2;
        this.imgReplay = imageView3;
        this.imgThumbnail = imageView4;
        this.imgVolume = imageView5;
        this.overlayItem = view;
        this.overlayItemBottom = view2;
        this.playerView = playerView;
        this.progress = progressBar;
        this.seekBar = seekBar;
        this.topGradientView = view3;
        this.txtDuration = textView;
        this.view18 = view4;
    }

    public static ActivityAjioVideoPlayerBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.btnVideo;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioButton)view2;
        if (object2 != null) {
            n3 = R$id.clGifOrImage;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (ConstraintLayout)view2;
            if (object3 != null) {
                n3 = R$id.imgClose;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (ImageView)view2;
                if (view3 != null) {
                    n3 = R$id.imgGifOrImage;
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
                                View view7;
                                View view8;
                                n3 = R$id.imgVolume;
                                View view9 = view2 = dd2_2.a(n3, view);
                                view9 = (ImageView)view2;
                                if (view9 != null && (view8 = dd2_2.a(n3 = R$id.overlayItem, view)) != null && (view7 = dd2_2.a(n3 = R$id.overlayItemBottom, view)) != null) {
                                    n3 = R$id.playerView;
                                    Object object4 = view2 = dd2_2.a(n3, view);
                                    object4 = (PlayerView)view2;
                                    if (object4 != null) {
                                        n3 = R$id.progress;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (ProgressBar)view2;
                                        if (view10 != null) {
                                            View view11;
                                            n3 = R$id.seekBar;
                                            View view12 = view2 = dd2_2.a(n3, view);
                                            view12 = (SeekBar)view2;
                                            if (view12 != null && (view11 = dd2_2.a(n3 = R$id.topGradientView, view)) != null) {
                                                View view13;
                                                n3 = R$id.txtDuration;
                                                View view14 = view2 = dd2_2.a(n3, view);
                                                view14 = (TextView)view2;
                                                if (view14 != null && (view13 = dd2_2.a(n3 = R$id.view18, view)) != null) {
                                                    Object object5 = view;
                                                    object5 = (ConstraintLayout)view;
                                                    ActivityAjioVideoPlayerBinding activityAjioVideoPlayerBinding = new ActivityAjioVideoPlayerBinding((ConstraintLayout)((Object)object5), (AjioButton)object2, (ConstraintLayout)((Object)object3), (ImageView)view3, (ImageView)view4, (ImageView)view5, (ImageView)view6, (ImageView)view9, view8, view7, (PlayerView)((Object)object4), (ProgressBar)view10, (SeekBar)view12, view11, (TextView)view14, view13);
                                                    return activityAjioVideoPlayerBinding;
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

    public static ActivityAjioVideoPlayerBinding inflate(LayoutInflater layoutInflater) {
        return ActivityAjioVideoPlayerBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityAjioVideoPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_ajio_video_player;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityAjioVideoPlayerBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

