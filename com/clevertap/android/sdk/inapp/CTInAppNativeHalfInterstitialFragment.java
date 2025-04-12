/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
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
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.R$layout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment$1;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment$2;
import com.clevertap.android.sdk.inapp.CTInAppNativeHalfInterstitialFragment$a;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.b;
import java.util.ArrayList;

public class CTInAppNativeHalfInterstitialFragment
extends b {
    public RelativeLayout j;

    /*
     * Unable to fully structure code
     */
    public final View onCreateView(LayoutInflater var1_1, ViewGroup var2_2, Bundle var3_3) {
        var3_3 = new ArrayList();
        var4_4 = this.e;
        var5_5 = var4_4.t;
        var6_6 = 2;
        if (var5_5 != 0 && (var5_5 = this.Va()) != 0) ** GOTO lbl-1000
        var4_4 = this.e;
        var5_5 = var4_4.M;
        if (var5_5 != 0 && (var5_5 = mp0_0.h((Context)(var4_4 = var1_1.getContext()))) == var6_6) lbl-1000:
        // 2 sources

        {
            var5_5 = R$layout.tab_inapp_half_interstitial;
            var2_2 = var1_1.inflate(var5_5, var2_2, false);
        } else {
            var5_5 = R$layout.inapp_half_interstitial;
            var2_2 = var1_1.inflate(var5_5, var2_2, false);
        }
        var5_5 = R$id.inapp_half_interstitial_frame_layout;
        var4_4 = (FrameLayout)var2_2.findViewById(var5_5);
        var7_7 = 199272;
        var8_8 = (CloseImageView)var4_4.findViewById(var7_7);
        var9_9 = R$id.half_interstitial_relative_layout;
        var10_10 = (RelativeLayout)var4_4.findViewById(var9_9);
        this.j = var10_10;
        var11_11 = this.e.c;
        var12_12 = Color.parseColor((String)var11_11);
        var10_10.setBackgroundColor(var12_12);
        var9_9 = this.d;
        var12_12 = 1;
        if (var9_9 != var12_12) {
            if (var9_9 == var6_6) {
                var1_1 = this.j.getViewTreeObserver();
                var10_10 = new CTInAppNativeHalfInterstitialFragment$2(this, (FrameLayout)var4_4, var8_8);
                var1_1.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)var10_10);
            }
        } else {
            var10_10 = this.j.getViewTreeObserver();
            var13_13 = new CTInAppNativeHalfInterstitialFragment$1(this, (LayoutInflater)var1_1, var8_8);
            var10_10.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)var13_13);
        }
        var1_1 = this.e;
        var9_9 = this.d;
        var1_1 = var1_1.c(var9_9);
        if (var1_1 != null) {
            var10_10 = this.i;
            var1_1 = var1_1.d;
            if ((var1_1 = var10_10.b((String)var1_1)) != null) {
                var10_10 = this.j;
                var14_14 = R$id.backgroundImage;
                var10_10 = (ImageView)var10_10.findViewById(var14_14);
                var10_10.setImageBitmap((Bitmap)var1_1);
            }
        }
        var1_1 = this.j;
        var9_9 = R$id.half_interstitial_linear_layout;
        var1_1 = (LinearLayout)var1_1.findViewById(var9_9);
        var9_9 = R$id.half_interstitial_button1;
        var10_10 = (Button)var1_1.findViewById(var9_9);
        var3_3.add(var10_10);
        var14_14 = R$id.half_interstitial_button2;
        var1_1 = (Button)var1_1.findViewById(var14_14);
        var3_3.add(var1_1);
        var13_13 = this.j;
        var15_15 = R$id.half_interstitial_title;
        var13_13 = (TextView)var13_13.findViewById(var15_15);
        var16_16 = this.e.E;
        var13_13.setText((CharSequence)var16_16);
        var15_15 = Color.parseColor((String)this.e.F);
        var13_13.setTextColor(var15_15);
        var13_13 = this.j;
        var15_15 = R$id.half_interstitial_message;
        var13_13 = (TextView)var13_13.findViewById(var15_15);
        var16_16 = this.e.z;
        var13_13.setText((CharSequence)var16_16);
        var16_16 = this.e.A;
        var15_15 = Color.parseColor((String)var16_16);
        var13_13.setTextColor(var15_15);
        var13_13 = this.e.e;
        var15_15 = var13_13.size();
        var17_17 = 8;
        if (var15_15 == var12_12) {
            var18_18 = this.d;
            if (var18_18 == var6_6) {
                var10_10.setVisibility(var17_17);
            } else if (var18_18 == var12_12) {
                var18_18 = 4;
                var10_10.setVisibility(var18_18);
            }
            var3_3 = (CTInAppNotificationButton)var13_13.get(0);
            this.cb((Button)var1_1, (CTInAppNotificationButton)var3_3, 0);
        } else {
            var19_19 = var13_13.isEmpty();
            if (var19_19 == 0) {
                var1_1 = null;
                for (var19_19 = 0; var19_19 < (var9_9 = var13_13.size()); ++var19_19) {
                    if (var19_19 >= var6_6) continue;
                    var10_10 = (CTInAppNotificationButton)var13_13.get(var19_19);
                    var11_11 = (Button)var3_3.get(var19_19);
                    this.cb((Button)var11_11, (CTInAppNotificationButton)var10_10, var19_19);
                }
            }
        }
        var18_18 = -1157627904;
        var1_1 = new ColorDrawable(var18_18);
        var4_4.setBackground((Drawable)var1_1);
        var1_1 = new CTInAppNativeHalfInterstitialFragment$a(this);
        var8_8.setOnClickListener((View.OnClickListener)var1_1);
        var1_1 = this.e;
        var19_19 = (int)var1_1.n;
        if (var19_19 == 0) {
            var8_8.setVisibility(var17_17);
        } else {
            var8_8.setVisibility(0);
        }
        return var2_2;
    }
}

