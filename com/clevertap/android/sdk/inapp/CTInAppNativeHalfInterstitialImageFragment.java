/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.clevertap.android.sdk.inapp;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.R$layout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment$1;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment$2;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialImageFragment$a;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.a$a;

public class CTInAppNativeHalfInterstitialImageFragment
extends CTInAppBaseFullFragment {
    public RelativeLayout j;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        Object object3;
        object2 = this.e;
        int n3 = object2.t;
        if (n3 != 0 && (n3 = (int)(this.Va() ? 1 : 0)) != 0) {
            n3 = R$layout.tab_inapp_half_interstitial_image;
            layoutInflater = layoutInflater.inflate(n3, object, false);
        } else {
            n3 = R$layout.inapp_half_interstitial_image;
            layoutInflater = layoutInflater.inflate(n3, object, false);
        }
        int n4 = R$id.inapp_half_interstitial_image_frame_layout;
        object = (FrameLayout)layoutInflater.findViewById(n4);
        n3 = 199272;
        object2 = (CloseImageView)object.findViewById(n3);
        Object object4 = new ColorDrawable(-1157627904);
        object.setBackground((Drawable)object4);
        int n7 = R$id.half_interstitial_image_relative_layout;
        object = (RelativeLayout)object.findViewById(n7);
        this.j = object;
        object4 = this.e.c;
        n7 = Color.parseColor((String)object4);
        object.setBackgroundColor(n7);
        object = this.j;
        n7 = R$id.half_interstitial_image;
        object = (ImageView)object.findViewById(n7);
        n7 = this.d;
        int n8 = 1;
        if (n7 != n8) {
            n8 = 2;
            if (n7 == n8) {
                object4 = this.j.getViewTreeObserver();
                object3 = new CTInAppNativeHalfInterstitialImageFragment$2(this, (CloseImageView)((Object)object2));
                object4.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object3);
            }
        } else {
            object4 = this.j.getViewTreeObserver();
            object3 = new CTInAppNativeHalfInterstitialImageFragment$1(this, (CloseImageView)((Object)object2));
            object4.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object3);
        }
        object4 = this.e;
        n8 = this.d;
        object4 = ((CTInAppNotification)object4).c(n8);
        if (object4 != null) {
            object3 = this.i;
            object4 = ((CTInAppNotificationMedia)object4).d;
            if ((object4 = ((ol0_1)object3).b((String)object4)) != null) {
                object.setImageBitmap((Bitmap)object4);
                object4 = 0;
                object.setTag(object4);
                object4 = new a$a(this);
                object.setOnClickListener((View.OnClickListener)object4);
            }
        }
        object = new CTInAppNativeHalfInterstitialImageFragment$a(this);
        object2.setOnClickListener((View.OnClickListener)object);
        object = this.e;
        n4 = (int)(object.n ? 1 : 0);
        if (n4 == 0) {
            n4 = 8;
            object2.setVisibility(n4);
        } else {
            object2.setVisibility(0);
        }
        return layoutInflater;
    }
}

