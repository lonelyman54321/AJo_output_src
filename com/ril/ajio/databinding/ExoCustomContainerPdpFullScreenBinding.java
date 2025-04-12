/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.DefaultTimeBar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ExoCustomContainerPdpFullScreenBinding
implements BC3 {
    public final DefaultTimeBar exoProgress;
    private final ConstraintLayout rootView;
    public final TextView txtDuration;

    private ExoCustomContainerPdpFullScreenBinding(ConstraintLayout constraintLayout, DefaultTimeBar defaultTimeBar, TextView textView) {
        this.rootView = constraintLayout;
        this.exoProgress = defaultTimeBar;
        this.txtDuration = textView;
    }

    public static ExoCustomContainerPdpFullScreenBinding bind(View object) {
        TextView textView;
        int n3 = R$id.exo_progress;
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar)dd2_2.a(n3, object);
        if (defaultTimeBar != null && (textView = (TextView)dd2_2.a(n3 = R$id.txtDuration, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ExoCustomContainerPdpFullScreenBinding exoCustomContainerPdpFullScreenBinding = new ExoCustomContainerPdpFullScreenBinding((ConstraintLayout)((Object)object), defaultTimeBar, textView);
            return exoCustomContainerPdpFullScreenBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ExoCustomContainerPdpFullScreenBinding inflate(LayoutInflater layoutInflater) {
        return ExoCustomContainerPdpFullScreenBinding.inflate(layoutInflater, null, false);
    }

    public static ExoCustomContainerPdpFullScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exo_custom_container_pdp_full_screen;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExoCustomContainerPdpFullScreenBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

