/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzbip;

public interface MediaContent {
    public float getAspectRatio();

    public float getCurrentTime();

    public float getDuration();

    public Drawable getMainImage();

    public VideoController getVideoController();

    public boolean hasVideoContent();

    public void setMainImage(Drawable var1);

    public zzbip zza();

    public boolean zzb();
}

