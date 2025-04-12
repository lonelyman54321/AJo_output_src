/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.image.ImageOutput$a;

public interface ImageOutput {
    public static final ImageOutput$a a;

    static {
        ImageOutput$a imageOutput$a;
        a = imageOutput$a = new Object();
    }

    public void a();

    public void onImageAvailable(long var1, Bitmap var3);
}

