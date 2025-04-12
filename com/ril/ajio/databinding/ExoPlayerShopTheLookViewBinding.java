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

public final class ExoPlayerShopTheLookViewBinding
implements BC3 {
    public final ImageView imgPlay;
    public final ImageView imgReplay;
    public final ImageView imgThumbnail;
    public final PlayerView playerView;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;

    private ExoPlayerShopTheLookViewBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, PlayerView playerView, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.imgPlay = imageView;
        this.imgReplay = imageView2;
        this.imgThumbnail = imageView3;
        this.playerView = playerView;
        this.progress = progressBar;
    }

    public static ExoPlayerShopTheLookViewBinding bind(View object) {
        View view;
        int n3 = R$id.imgPlay;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.imgReplay;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.imgThumbnail;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.playerView;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (PlayerView)view;
                    if (object2 != null) {
                        n3 = R$id.progress;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (ProgressBar)view;
                        if (view5 != null) {
                            Object object3 = object;
                            object3 = (ConstraintLayout)((Object)object);
                            ExoPlayerShopTheLookViewBinding exoPlayerShopTheLookViewBinding = new ExoPlayerShopTheLookViewBinding((ConstraintLayout)((Object)object3), (ImageView)view2, (ImageView)view3, (ImageView)view4, (PlayerView)((Object)object2), (ProgressBar)view5);
                            return exoPlayerShopTheLookViewBinding;
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

    public static ExoPlayerShopTheLookViewBinding inflate(LayoutInflater layoutInflater) {
        return ExoPlayerShopTheLookViewBinding.inflate(layoutInflater, null, false);
    }

    public static ExoPlayerShopTheLookViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exo_player_shop_the_look_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExoPlayerShopTheLookViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

