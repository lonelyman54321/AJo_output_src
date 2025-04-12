/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.AdaptiveIconDrawable
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Icon
 */
package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

public final class IconCompat$b {
    public static Drawable a(BitmapDrawable bitmapDrawable) {
        AdaptiveIconDrawable adaptiveIconDrawable = new AdaptiveIconDrawable(null, (Drawable)bitmapDrawable);
        return adaptiveIconDrawable;
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap((Bitmap)bitmap);
    }
}

