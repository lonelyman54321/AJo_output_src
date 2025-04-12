/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxePdpBottomLinkUrlRowBinding
implements BC3 {
    public final ImageView linkArrow;
    public final AjioTextView linkTextTv;
    private final ConstraintLayout rootView;

    private LuxePdpBottomLinkUrlRowBinding(ConstraintLayout constraintLayout, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.linkArrow = imageView;
        this.linkTextTv = ajioTextView;
    }

    public static LuxePdpBottomLinkUrlRowBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.link_arrow;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.link_text_tv, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            LuxePdpBottomLinkUrlRowBinding luxePdpBottomLinkUrlRowBinding = new LuxePdpBottomLinkUrlRowBinding((ConstraintLayout)((Object)object), imageView, ajioTextView);
            return luxePdpBottomLinkUrlRowBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxePdpBottomLinkUrlRowBinding inflate(LayoutInflater layoutInflater) {
        return LuxePdpBottomLinkUrlRowBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePdpBottomLinkUrlRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_pdp_bottom_link_url_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePdpBottomLinkUrlRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

