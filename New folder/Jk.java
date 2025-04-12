/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ImageDecoder
 *  android.graphics.ImageDecoder$OnHeaderDecodedListener
 *  android.graphics.ImageDecoder$Source
 *  android.graphics.drawable.Drawable
 */
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;

public final class Jk {
    public static /* bridge */ /* synthetic */ Drawable a(ImageDecoder.Source source, Fm0 fm0) {
        return ImageDecoder.decodeDrawable((ImageDecoder.Source)source, (ImageDecoder.OnHeaderDecodedListener)fm0);
    }
}

