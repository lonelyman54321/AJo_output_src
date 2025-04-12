/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.clevertap.android.sdk.inapp;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.R$layout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.a$a;
import com.clevertap.android.sdk.inapp.e$a;

public class e
extends CTInAppBaseFullFragment {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        int n3 = R$layout.inapp_cover_image;
        layoutInflater = layoutInflater.inflate(n3, object, false);
        int n4 = R$id.inapp_cover_image_frame_layout;
        object = (FrameLayout)layoutInflater.findViewById(n4);
        n3 = Color.parseColor((String)this.e.c);
        object.setBackgroundColor(n3);
        n3 = R$id.cover_image_relative_layout;
        object2 = (RelativeLayout)object.findViewById(n3);
        int n7 = R$id.cover_image;
        object2 = (ImageView)object2.findViewById(n7);
        Object object3 = this.e;
        int n8 = this.d;
        object3 = ((CTInAppNotification)object3).c(n8);
        if (object3 != null) {
            ol0_1 ol0_12 = this.i;
            object3 = ((CTInAppNotificationMedia)object3).d;
            if ((object3 = ol0_12.b((String)object3)) != null) {
                object2.setImageBitmap((Bitmap)object3);
                object3 = 0;
                object2.setTag(object3);
                object3 = new a$a(this);
                object2.setOnClickListener((View.OnClickListener)object3);
            }
        }
        object = (CloseImageView)object.findViewById(199272);
        object2 = new e$a(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object2 = this.e;
        n3 = (int)(object2.n ? 1 : 0);
        if (n3 == 0) {
            n3 = 8;
            object.setVisibility(n3);
        } else {
            object.setVisibility(0);
        }
        return layoutInflater;
    }
}

