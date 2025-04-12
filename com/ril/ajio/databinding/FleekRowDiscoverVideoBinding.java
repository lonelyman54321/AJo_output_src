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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FleekRowDiscoverVideoBinding
implements BC3 {
    public final CardView cardView;
    public final ConstraintLayout constraintProductView;
    public final ImageView imgPause;
    public final ImageView imgPlay;
    public final ImageView imgReplay;
    public final ImageView imgThumbnail;
    public final ImageView ivBag;
    public final AppCompatImageView ivDiscoverBrand;
    public final ConstraintLayout layoutDiscoverVideoKyp;
    public final PlayerView playerView;
    public final ProgressBar progress;
    public final ConstraintLayout rootConstaintView;
    private final ConstraintLayout rootView;
    public final TextView txtProductCount;
    public final ConstraintLayout videoDiscoverBrand;

    private FleekRowDiscoverVideoBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout3, PlayerView playerView, ProgressBar progressBar, ConstraintLayout constraintLayout4, TextView textView, ConstraintLayout constraintLayout5) {
        this.rootView = constraintLayout;
        this.cardView = cardView;
        this.constraintProductView = constraintLayout2;
        this.imgPause = imageView;
        this.imgPlay = imageView2;
        this.imgReplay = imageView3;
        this.imgThumbnail = imageView4;
        this.ivBag = imageView5;
        this.ivDiscoverBrand = appCompatImageView;
        this.layoutDiscoverVideoKyp = constraintLayout3;
        this.playerView = playerView;
        this.progress = progressBar;
        this.rootConstaintView = constraintLayout4;
        this.txtProductCount = textView;
        this.videoDiscoverBrand = constraintLayout5;
    }

    public static FleekRowDiscoverVideoBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.card_view;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (CardView)view2;
        if (object2 != null) {
            n3 = R$id.constraint_product_view;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (ConstraintLayout)view2;
            if (object3 != null) {
                n3 = R$id.imgPause;
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
                                n3 = R$id.iv_bag;
                                View view7 = view2 = dd2_2.a(n3, view);
                                view7 = (ImageView)view2;
                                if (view7 != null) {
                                    n3 = R$id.iv_discover_brand;
                                    Object object4 = view2 = dd2_2.a(n3, view);
                                    object4 = (AppCompatImageView)view2;
                                    if (object4 != null) {
                                        Object object5 = view;
                                        object5 = (ConstraintLayout)view;
                                        n3 = R$id.playerView;
                                        Object object6 = view2 = dd2_2.a(n3, view);
                                        object6 = (PlayerView)view2;
                                        if (object6 != null) {
                                            n3 = R$id.progress;
                                            View view8 = view2 = dd2_2.a(n3, view);
                                            view8 = (ProgressBar)view2;
                                            if (view8 != null) {
                                                n3 = R$id.root_constaint_view;
                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                object7 = (ConstraintLayout)view2;
                                                if (object7 != null) {
                                                    n3 = R$id.txt_product_count;
                                                    View view9 = view2 = dd2_2.a(n3, view);
                                                    view9 = (TextView)view2;
                                                    if (view9 != null) {
                                                        n3 = R$id.video_discover_brand;
                                                        Object object8 = view2 = dd2_2.a(n3, view);
                                                        object8 = (ConstraintLayout)view2;
                                                        if (object8 != null) {
                                                            object = new FleekRowDiscoverVideoBinding((ConstraintLayout)((Object)object5), (CardView)((Object)object2), (ConstraintLayout)((Object)object3), (ImageView)view3, (ImageView)view4, (ImageView)view5, (ImageView)view6, (ImageView)view7, (AppCompatImageView)((Object)object4), (ConstraintLayout)((Object)object5), (PlayerView)((Object)object6), (ProgressBar)view8, (ConstraintLayout)((Object)object7), (TextView)view9, (ConstraintLayout)((Object)object8));
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
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FleekRowDiscoverVideoBinding inflate(LayoutInflater layoutInflater) {
        return FleekRowDiscoverVideoBinding.inflate(layoutInflater, null, false);
    }

    public static FleekRowDiscoverVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fleek_row_discover_video;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FleekRowDiscoverVideoBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

