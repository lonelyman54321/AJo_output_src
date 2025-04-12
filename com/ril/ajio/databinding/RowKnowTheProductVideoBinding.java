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

public final class RowKnowTheProductVideoBinding
implements BC3 {
    public final ImageView imgPause;
    public final ImageView imgPlay;
    public final ImageView imgReplay;
    public final ImageView imgThumbnail;
    public final ConstraintLayout layoutVideoKyp;
    public final PlayerView playerView;
    public final ProgressBar progress;
    private final ConstraintLayout rootView;

    private RowKnowTheProductVideoBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, PlayerView playerView, ProgressBar progressBar) {
        this.rootView = constraintLayout;
        this.imgPause = imageView;
        this.imgPlay = imageView2;
        this.imgReplay = imageView3;
        this.imgThumbnail = imageView4;
        this.layoutVideoKyp = constraintLayout2;
        this.playerView = playerView;
        this.progress = progressBar;
    }

    public static RowKnowTheProductVideoBinding bind(View object) {
        View view;
        int n3 = R$id.imgPause;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.imgPlay;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.imgReplay;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.imgThumbnail;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        n3 = R$id.playerView;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (PlayerView)view;
                        if (object3 != null) {
                            n3 = R$id.progress;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (ProgressBar)view;
                            if (view6 != null) {
                                object = new RowKnowTheProductVideoBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (ImageView)view3, (ImageView)view4, (ImageView)view5, (ConstraintLayout)((Object)object2), (PlayerView)((Object)object3), (ProgressBar)view6);
                                return object;
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

    public static RowKnowTheProductVideoBinding inflate(LayoutInflater layoutInflater) {
        return RowKnowTheProductVideoBinding.inflate(layoutInflater, null, false);
    }

    public static RowKnowTheProductVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_know_the_product_video;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowKnowTheProductVideoBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

