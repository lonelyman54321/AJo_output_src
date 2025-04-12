/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ImageDecoder
 *  android.graphics.ImageDecoder$Source
 *  android.graphics.drawable.Drawable
 */
package com.jio.jioads.native;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;

public final class b {
    public static /* bridge */ /* synthetic */ Drawable a(ImageDecoder.Source source) {
        return ImageDecoder.decodeDrawable((ImageDecoder.Source)source);
    }
}

