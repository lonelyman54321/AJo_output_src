/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$OnFrameRenderedListener
 *  android.os.Handler
 */
import android.media.MediaCodec;
import android.os.Handler;

public final class Iq {
    public static /* bridge */ /* synthetic */ void a(MediaCodec mediaCodec, kq_0 kq_02, Handler handler) {
        mediaCodec.setOnFrameRenderedListener((MediaCodec.OnFrameRenderedListener)kq_02, handler);
    }
}

