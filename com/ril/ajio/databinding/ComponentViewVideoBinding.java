/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ComponentViewVideoBinding
implements BC3 {
    public final ImageButton componentViewBtnPlay;
    public final ImageView componentViewImvVideo;
    public final RelativeLayout mainParent;
    private final RelativeLayout rootView;

    private ComponentViewVideoBinding(RelativeLayout relativeLayout, ImageButton imageButton, ImageView imageView, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.componentViewBtnPlay = imageButton;
        this.componentViewImvVideo = imageView;
        this.mainParent = relativeLayout2;
    }

    public static ComponentViewVideoBinding bind(View object) {
        ImageView imageView;
        int n3 = R$id.component_view_btn_play;
        ImageButton imageButton = (ImageButton)dd2_2.a(n3, object);
        if (imageButton != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.component_view_imv_video, object)) != null) {
            object = (RelativeLayout)object;
            ComponentViewVideoBinding componentViewVideoBinding = new ComponentViewVideoBinding((RelativeLayout)object, imageButton, imageView, (RelativeLayout)object);
            return componentViewVideoBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ComponentViewVideoBinding inflate(LayoutInflater layoutInflater) {
        return ComponentViewVideoBinding.inflate(layoutInflater, null, false);
    }

    public static ComponentViewVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.component_view_video;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ComponentViewVideoBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

