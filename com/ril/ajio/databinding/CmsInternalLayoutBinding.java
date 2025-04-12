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

public final class CmsInternalLayoutBinding
implements BC3 {
    public final ConstraintLayout cmsSubContainer;
    public final ImageView imgFullScreen;
    public final ImageView imgPlay;
    public final ImageView imgThumbnail;
    public final ImageView imgVolume;
    public final ConstraintLayout layoutVideoView;
    public final ProgressBar progress;
    public final ConstraintLayout rlPreviewItem;
    private final ConstraintLayout rootView;
    public final TextView txtDuration;
    public final PlayerView videoView;

    private CmsInternalLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout3, ProgressBar progressBar, ConstraintLayout constraintLayout4, TextView textView, PlayerView playerView) {
        this.rootView = constraintLayout;
        this.cmsSubContainer = constraintLayout2;
        this.imgFullScreen = imageView;
        this.imgPlay = imageView2;
        this.imgThumbnail = imageView3;
        this.imgVolume = imageView4;
        this.layoutVideoView = constraintLayout3;
        this.progress = progressBar;
        this.rlPreviewItem = constraintLayout4;
        this.txtDuration = textView;
        this.videoView = playerView;
    }

    public static CmsInternalLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.cmsSubContainer;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view;
        if (object2 != null) {
            n3 = R$id.imgFullScreen;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.imgPlay;
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
                            n3 = R$id.layoutVideoView;
                            Object object3 = view = dd2_2.a(n3, object);
                            object3 = (ConstraintLayout)view;
                            if (object3 != null) {
                                n3 = R$id.progress;
                                View view6 = view = dd2_2.a(n3, object);
                                view6 = (ProgressBar)view;
                                if (view6 != null) {
                                    Object object4 = object;
                                    object4 = (ConstraintLayout)((Object)object);
                                    n3 = R$id.txtDuration;
                                    View view7 = view = dd2_2.a(n3, object);
                                    view7 = (TextView)view;
                                    if (view7 != null) {
                                        n3 = R$id.video_view;
                                        Object object5 = view = dd2_2.a(n3, object);
                                        object5 = (PlayerView)view;
                                        if (object5 != null) {
                                            object = new CmsInternalLayoutBinding((ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object2), (ImageView)view2, (ImageView)view3, (ImageView)view4, (ImageView)view5, (ConstraintLayout)((Object)object3), (ProgressBar)view6, (ConstraintLayout)((Object)object4), (TextView)view7, (PlayerView)((Object)object5));
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CmsInternalLayoutBinding inflate(LayoutInflater layoutInflater) {
        return CmsInternalLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static CmsInternalLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cms_internal_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CmsInternalLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

