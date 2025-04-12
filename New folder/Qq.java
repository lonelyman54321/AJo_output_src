/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$Callback
 *  android.os.Handler
 */
import android.media.MediaCodec;
import android.os.Handler;

public final class Qq {
    public static /* bridge */ /* synthetic */ void a(MediaCodec mediaCodec, MediaCodec.Callback callback2, Handler handler) {
        mediaCodec.setCallback(callback2, handler);
    }
}

