/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class SocialloginErrorLayoutBinding
implements BC3 {
    public final TextView close;
    private final LinearLayout rootView;
    public final ImageView socialLoginFailedImage;
    public final AjioTextView socialLoginFailedMessage;

    private SocialloginErrorLayoutBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.close = textView;
        this.socialLoginFailedImage = imageView;
        this.socialLoginFailedMessage = ajioTextView;
    }

    public static SocialloginErrorLayoutBinding bind(View object) {
        AjioTextView ajioTextView;
        ImageView imageView;
        int n3 = R$id.close;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.social_login_failed_image, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.social_login_failed_message, object)) != null) {
            object = (LinearLayout)object;
            SocialloginErrorLayoutBinding socialloginErrorLayoutBinding = new SocialloginErrorLayoutBinding((LinearLayout)object, textView, imageView, ajioTextView);
            return socialloginErrorLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SocialloginErrorLayoutBinding inflate(LayoutInflater layoutInflater) {
        return SocialloginErrorLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static SocialloginErrorLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.sociallogin_error_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SocialloginErrorLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

