/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.RelativeLayout
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.R$bool;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppBaseFullFragment$1;
import com.clevertap.android.sdk.inapp.a;
import java.lang.ref.WeakReference;

public abstract class CTInAppBaseFullFragment
extends a {
    public static void Ua(RelativeLayout relativeLayout, CloseImageView closeImageView) {
        Handler handler = new Handler();
        CTInAppBaseFullFragment$1 cTInAppBaseFullFragment$1 = new CTInAppBaseFullFragment$1(relativeLayout, closeImageView);
        handler.post((Runnable)cTInAppBaseFullFragment$1);
    }

    public static void Wa(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, CloseImageView closeImageView) {
        int n3;
        layoutParams.height = n3 = (int)((float)relativeLayout.getMeasuredWidth() * 1.3f);
        relativeLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        CTInAppBaseFullFragment.Ua(relativeLayout, closeImageView);
    }

    public void Oa() {
    }

    public final void Qa() {
        Object object = this.c;
        boolean bl2 = object instanceof InAppNotificationActivity;
        if (bl2) {
            WeakReference<Context> weakReference;
            object = (lf1_1)object;
            this.g = weakReference = new WeakReference<Context>((Context)object);
        }
    }

    public final boolean Va() {
        boolean bl2;
        boolean bl3;
        FragmentActivity fragmentActivity = this.getActivity();
        int n3 = 1;
        if (fragmentActivity != null && !(bl3 = fragmentActivity.isFinishing()) && !(bl2 = fragmentActivity.isDestroyed())) {
            n3 = 0;
        }
        if (n3 != 0) {
            return false;
        }
        try {
            fragmentActivity = this.getResources();
        }
        catch (Exception exception) {
            com.clevertap.android.sdk.b.c();
            return false;
        }
        n3 = R$bool.ctIsTablet;
        return fragmentActivity.getBoolean(n3);
    }

    public final void Xa(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, CloseImageView closeImageView) {
        int n3 = 140;
        int n4 = this.Sa(n3);
        int n7 = this.Sa(n3);
        int n8 = this.Sa(n3);
        n3 = this.Sa(n3);
        layoutParams.setMargins(n4, n7, n8, n3);
        n3 = relativeLayout.getMeasuredWidth();
        n4 = this.Sa(210);
        layoutParams.width = n3 -= n4;
        layoutParams.height = n3 = (int)((float)n3 * 1.3f);
        relativeLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        CTInAppBaseFullFragment.Ua(relativeLayout, closeImageView);
    }

    public final void Ya(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        int n3 = relativeLayout.getMeasuredWidth();
        int n4 = 200;
        int n7 = this.Sa(n4);
        float f5 = n3 - n7;
        n7 = 1071896330;
        float f6 = 1.78f;
        n3 = (int)(f5 *= f6);
        int n8 = frameLayout.getMeasuredHeight();
        int n10 = this.Sa(280);
        if (n3 > (n8 -= n10)) {
            layoutParams.height = n8;
            float f7 = (float)n8 / f6;
            layoutParams.width = n8 = (int)f7;
        } else {
            layoutParams.height = n3;
            n8 = relativeLayout.getMeasuredWidth();
            n3 = this.Sa(n4);
            layoutParams.width = n8 -= n3;
        }
        n8 = 140;
        n3 = this.Sa(n8);
        n4 = this.Sa(n8);
        n7 = this.Sa(n8);
        n8 = this.Sa(n8);
        layoutParams.setMargins(n3, n4, n7, n8);
        relativeLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        CTInAppBaseFullFragment.Ua(relativeLayout, closeImageView);
    }

    public final void Za(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        float f5 = relativeLayout.getMeasuredWidth();
        float f6 = 1.78f;
        int n3 = (int)(f5 *= f6);
        int n4 = frameLayout.getMeasuredHeight();
        int n7 = this.Sa(80);
        if (n3 > (n4 -= n7)) {
            layoutParams.height = n4;
            float f7 = (float)n4 / f6;
            layoutParams.width = n4 = (int)f7;
        } else {
            layoutParams.height = n3;
        }
        relativeLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        CTInAppBaseFullFragment.Ua(relativeLayout, closeImageView);
    }

    public final void ab(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        int n3 = relativeLayout.getMeasuredHeight();
        int n4 = 120;
        int n7 = this.Sa(n4);
        float f5 = n3 - n7;
        n7 = 1071896330;
        float f6 = 1.78f;
        n3 = (int)(f5 *= f6);
        int n8 = frameLayout.getMeasuredWidth();
        int n10 = this.Sa(280);
        if (n3 > (n8 -= n10)) {
            layoutParams.width = n8;
            float f7 = (float)n8 / f6;
            layoutParams.height = n8 = (int)f7;
        } else {
            layoutParams.width = n3;
            n8 = relativeLayout.getMeasuredHeight();
            n3 = this.Sa(n4);
            layoutParams.height = n8 -= n3;
        }
        n8 = 140;
        n3 = this.Sa(n8);
        n4 = 100;
        n7 = this.Sa(n4);
        n8 = this.Sa(n8);
        n4 = this.Sa(n4);
        layoutParams.setMargins(n3, n7, n8, n4);
        layoutParams.gravity = 17;
        relativeLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        CTInAppBaseFullFragment.Ua(relativeLayout, closeImageView);
    }

    public final void bb(RelativeLayout relativeLayout, FrameLayout.LayoutParams layoutParams, FrameLayout frameLayout, CloseImageView closeImageView) {
        float f5 = relativeLayout.getMeasuredHeight();
        float f6 = 1.78f;
        int n3 = (int)(f5 *= f6);
        int n4 = frameLayout.getMeasuredWidth();
        int n7 = this.Sa(80);
        if (n3 > (n4 -= n7)) {
            layoutParams.width = n4;
            float f7 = (float)n4 / f6;
            layoutParams.height = n4 = (int)f7;
        } else {
            layoutParams.width = n3;
        }
        layoutParams.gravity = 17;
        relativeLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        CTInAppBaseFullFragment.Ua(relativeLayout, closeImageView);
    }
}

