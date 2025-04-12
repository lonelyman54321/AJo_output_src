/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.media.MediaMetadataRetriever
 */
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;

public final class EB3 {
    public static /* bridge */ /* synthetic */ Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long l2, int n3, int n4, int n7) {
        return mediaMetadataRetriever.getScaledFrameAtTime(l2, n3, n4, n7);
    }
}

