/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.LoudnessCodecController
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.Surface
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$a;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.media3.exoplayer.mediacodec.d$d;
import java.nio.ByteBuffer;
import java.util.HashSet;

public final class h
implements d {
    public final MediaCodec a;
    public final RC1 b;

    public h(MediaCodec mediaCodec, RC1 object) {
        LoudnessCodecController loudnessCodecController;
        this.a = mediaCodec;
        this.b = object;
        int n3 = gz3.a;
        int n4 = 35;
        if (n3 >= n4 && object != null && ((loudnessCodecController = ((RC1)object).c) == null || (n3 = (int)(MC1.a(loudnessCodecController, mediaCodec) ? 1 : 0)) != 0)) {
            object = ((RC1)object).a;
            boolean bl2 = ((HashSet)object).add(mediaCodec);
            ct3.f(bl2);
        }
    }

    public final void a(int n3, Fe0 fe0, long l2, int n4) {
        MediaCodec.CryptoInfo cryptoInfo = fe0.i;
        this.a.queueSecureInputBuffer(n3, 0, cryptoInfo, l2, n4);
    }

    public final void b(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    public final void c(int n3, int n4, int n7, long l2) {
        this.a.queueInputBuffer(n3, 0, n4, l2, n7);
    }

    public final void d(d$d d$d, Handler handler) {
        lh3 lh32 = new lh3(this, d$d);
        Uu0.b(this.a, lh32, handler);
    }

    public final MediaFormat e() {
        return this.a.getOutputFormat();
    }

    public final void f() {
        this.a.detachOutputSurface();
    }

    public final void flush() {
        this.a.flush();
    }

    public final ByteBuffer g(int n3) {
        return this.a.getInputBuffer(n3);
    }

    public final void h(Surface surface) {
        Jq.a(this.a, surface);
    }

    public final void i(int n3) {
        this.a.releaseOutputBuffer(n3, false);
    }

    public final void j(int n3, long l2) {
        this.a.releaseOutputBuffer(n3, l2);
    }

    public final int k() {
        return this.a.dequeueInputBuffer(0L);
    }

    public final int l(MediaCodec.BufferInfo bufferInfo) {
        int n3;
        long l2;
        MediaCodec mediaCodec;
        int n4;
        while ((n4 = (mediaCodec = this.a).dequeueOutputBuffer(bufferInfo, l2 = 0L)) == (n3 = -3)) {
        }
        return n4;
    }

    public final ByteBuffer m(int n3) {
        return this.a.getOutputBuffer(n3);
    }

    public final /* synthetic */ boolean n(MediaCodecRenderer$a mediaCodecRenderer$a) {
        return false;
    }

    public final void release() {
        Throwable throwable2;
        int n3;
        int n4;
        MediaCodec mediaCodec;
        RC1 rC1;
        block6: {
            int n7;
            block5: {
                rC1 = this.b;
                mediaCodec = this.a;
                n4 = 35;
                try {
                    n7 = gz3.a;
                    n3 = 30;
                    if (n7 < n3 || n7 >= (n3 = 33)) break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                mediaCodec.stop();
            }
            if (n7 >= n4 && rC1 != null) {
                rC1.a(mediaCodec);
            }
            mediaCodec.release();
            return;
        }
        n3 = gz3.a;
        if (n3 >= n4 && rC1 != null) {
            rC1.a(mediaCodec);
        }
        mediaCodec.release();
        throw throwable2;
    }

    public final void setVideoScalingMode(int n3) {
        this.a.setVideoScalingMode(n3);
    }
}

