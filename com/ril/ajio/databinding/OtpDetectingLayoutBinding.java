/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class OtpDetectingLayoutBinding
implements BC3 {
    public final ImageButton closeOtpScreen;
    public final AjioImageView icon;
    public final AjioTextView otpWait;
    public final RelativeLayout parent;
    private final RelativeLayout rootView;

    private OtpDetectingLayoutBinding(RelativeLayout relativeLayout, ImageButton imageButton, AjioImageView ajioImageView, AjioTextView ajioTextView, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.closeOtpScreen = imageButton;
        this.icon = ajioImageView;
        this.otpWait = ajioTextView;
        this.parent = relativeLayout2;
    }

    public static OtpDetectingLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.close_otp_screen;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n3 = R$id.icon;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioImageView)view;
            if (object2 != null) {
                n3 = R$id.otp_wait;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    Object object4 = object;
                    object4 = (RelativeLayout)object;
                    object = new OtpDetectingLayoutBinding((RelativeLayout)object4, (ImageButton)view2, (AjioImageView)((Object)object2), (AjioTextView)object3, (RelativeLayout)object4);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OtpDetectingLayoutBinding inflate(LayoutInflater layoutInflater) {
        return OtpDetectingLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static OtpDetectingLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.otp_detecting_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OtpDetectingLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

