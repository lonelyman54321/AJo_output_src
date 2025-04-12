/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.FrameLayout
 *  android.widget.ImageView$ScaleType
 */
package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;

public class MediaView
extends FrameLayout {
    private MediaContent zza;
    private ImageView.ScaleType zzb;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public MediaView(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzb = scaleType;
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.zza = mediaContent;
    }
}

