/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.DefaultTimeBar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ExoCustomContainerPdpBinding
implements BC3 {
    public final DefaultTimeBar exoProgress;
    public final ImageView imgFullScreen;
    public final ImageView imgVolume;
    private final ConstraintLayout rootView;
    public final TextView txtDuration;
    public final View view16;

    private ExoCustomContainerPdpBinding(ConstraintLayout constraintLayout, DefaultTimeBar defaultTimeBar, ImageView imageView, ImageView imageView2, TextView textView, View view) {
        this.rootView = constraintLayout;
        this.exoProgress = defaultTimeBar;
        this.imgFullScreen = imageView;
        this.imgVolume = imageView2;
        this.txtDuration = textView;
        this.view16 = view;
    }

    public static ExoCustomContainerPdpBinding bind(View object) {
        View view;
        int n3 = R$id.exo_progress;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (DefaultTimeBar)view;
        if (view2 != null) {
            n3 = R$id.imgFullScreen;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.imgVolume;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    View view5;
                    n3 = R$id.txtDuration;
                    View view6 = view = dd2_2.a(n3, object);
                    view6 = (TextView)view;
                    if (view6 != null && (view5 = dd2_2.a(n3 = R$id.view16, object)) != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        ExoCustomContainerPdpBinding exoCustomContainerPdpBinding = new ExoCustomContainerPdpBinding((ConstraintLayout)((Object)object2), (DefaultTimeBar)view2, (ImageView)view3, (ImageView)view4, (TextView)view6, view5);
                        return exoCustomContainerPdpBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ExoCustomContainerPdpBinding inflate(LayoutInflater layoutInflater) {
        return ExoCustomContainerPdpBinding.inflate(layoutInflater, null, false);
    }

    public static ExoCustomContainerPdpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exo_custom_container_pdp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExoCustomContainerPdpBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

