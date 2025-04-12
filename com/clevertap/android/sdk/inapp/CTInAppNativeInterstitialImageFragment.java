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
import com.clevertap.android.sdk.inapp.CTInAppNativeInterstitialImageFragment$1;
import com.clevertap.android.sdk.inapp.CTInAppNativeInterstitialImageFragment$2;
import com.clevertap.android.sdk.inapp.CTInAppNativeInterstitialImageFragment$a;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.a$a;

public class CTInAppNativeInterstitialImageFragment
extends CTInAppBaseFullFragment {
    public RelativeLayout j;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        RelativeLayout relativeLayout;
        object2 = this.e;
        int n3 = object2.t;
        if (n3 != 0 && (n3 = (int)(this.Va() ? 1 : 0)) != 0) {
            n3 = R$layout.tab_inapp_interstitial_image;
            layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        } else {
            n3 = R$layout.inapp_interstitial_image;
            layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        }
        int n4 = R$id.inapp_interstitial_image_frame_layout;
        object = (FrameLayout)layoutInflater.findViewById(n4);
        object2 = new ColorDrawable(-1157627904);
        object.setBackground((Drawable)object2);
        n3 = 199272;
        object2 = (CloseImageView)object.findViewById(n3);
        int n7 = R$id.interstitial_image_relative_layout;
        this.j = relativeLayout = (RelativeLayout)object.findViewById(n7);
        Object object3 = this.e.c;
        int n8 = Color.parseColor((String)object3);
        relativeLayout.setBackgroundColor(n8);
        relativeLayout = this.j;
        n8 = R$id.interstitial_image;
        relativeLayout = (ImageView)relativeLayout.findViewById(n8);
        n8 = this.d;
        int n10 = 1;
        if (n8 != n10) {
            n10 = 2;
            if (n8 == n10) {
                object3 = this.j.getViewTreeObserver();
                CTInAppNativeInterstitialImageFragment$2 cTInAppNativeInterstitialImageFragment$2 = new CTInAppNativeInterstitialImageFragment$2(this, (FrameLayout)object, (CloseImageView)((Object)object2));
                object3.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)cTInAppNativeInterstitialImageFragment$2);
            }
        } else {
            object3 = this.j.getViewTreeObserver();
            CTInAppNativeInterstitialImageFragment$1 cTInAppNativeInterstitialImageFragment$1 = new CTInAppNativeInterstitialImageFragment$1(this, (FrameLayout)object, (CloseImageView)((Object)object2));
            object3.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)cTInAppNativeInterstitialImageFragment$1);
        }
        object = this.e;
        n8 = this.d;
        object = ((CTInAppNotification)object).c(n8);
        if (object != null) {
            object3 = this.i;
            object = ((CTInAppNotificationMedia)object).d;
            if ((object = ((ol0_1)object3).b((String)object)) != null) {
                relativeLayout.setImageBitmap((Bitmap)object);
                object = 0;
                relativeLayout.setTag(object);
                object = new a$a(this);
                relativeLayout.setOnClickListener((View.OnClickListener)object);
            }
        }
        object = new CTInAppNativeInterstitialImageFragment$a(this);
        object2.setOnClickListener((View.OnClickListener)object);
        object = this.e;
        n4 = (int)(((CTInAppNotification)object).n ? 1 : 0);
        if (n4 == 0) {
            n4 = 8;
            object2.setVisibility(n4);
        } else {
            object2.setVisibility(0);
        }
        return layoutInflater;
    }
}

