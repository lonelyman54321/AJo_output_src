/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$Callback
 *  android.media.MediaCodec$CodecException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaFormat
 *  android.os.Handler
 *  android.os.HandlerThread
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$a;
import androidx.media3.exoplayer.mediacodec.d$c;
import java.util.ArrayDeque;

public final class b
extends MediaCodec.Callback {
    public final Object a;
    public final HandlerThread b;
    public Handler c;
    public final NU d;
    public final NU e;
    public final ArrayDeque f;
    public final ArrayDeque g;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public d$c o;

    public b(HandlerThread object) {
        Object object2;
        this.a = object2 = new Object();
        this.b = object;
        this.d = object;
        super();
        this.e = object;
        super();
        this.f = object;
        super();
        this.g = object;
    }

    public final void a() {
        int n3;
        NU nU;
        ArrayDeque arrayDeque = this.g;
        boolean bl2 = arrayDeque.isEmpty();
        if (!bl2) {
            nU = (MediaFormat)arrayDeque.getLast();
            this.i = nU;
        }
        nU = this.d;
        nU.c = n3 = nU.b;
        nU = this.e;
        nU.c = n3 = nU.b;
        this.f.clear();
        arrayDeque.clear();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(IllegalStateException illegalStateException) {
        Object object = this.a;
        synchronized (object) {
            this.n = illegalStateException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCryptoError(MediaCodec object, MediaCodec.CryptoException cryptoException) {
        object = this.a;
        synchronized (object) {
            this.k = cryptoException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onError(MediaCodec object, MediaCodec.CodecException codecException) {
        object = this.a;
        synchronized (object) {
            this.j = codecException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onInputBufferAvailable(MediaCodec object, int n3) {
        object = this.a;
        synchronized (object) {
            NU nU = this.d;
            nU.a(n3);
            Object object2 = this.o;
            if (object2 != null) {
                object2 = (MediaCodecRenderer$a)object2;
                object2 = ((MediaCodecRenderer$a)object2).a;
                object2 = ((MediaCodecRenderer)object2).G;
                if (object2 != null) {
                    object2.b();
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onOutputBufferAvailable(MediaCodec object, int n3, MediaCodec.BufferInfo bufferInfo) {
        object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                block5: {
                    try {
                        object2 = this.i;
                        if (object2 == null) break block5;
                        Object object3 = this.e;
                        int n4 = -2;
                        ((NU)object3).a(n4);
                        object3 = this.g;
                        ((ArrayDeque)object3).add(object2);
                        object2 = null;
                        this.i = null;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object2 = this.e;
                ((NU)object2).a(n3);
                Object object4 = this.f;
                ((ArrayDeque)object4).add(bufferInfo);
                object4 = this.o;
                if (object4 != null) {
                    object4 = (MediaCodecRenderer$a)object4;
                    object4 = ((MediaCodecRenderer$a)object4).a;
                    object4 = ((MediaCodecRenderer)object4).G;
                    if (object4 != null) {
                        object4.b();
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onOutputFormatChanged(MediaCodec object, MediaFormat mediaFormat) {
        object = this.a;
        synchronized (object) {
            Object object2 = this.e;
            int n3 = -2;
            ((NU)object2).a(n3);
            object2 = this.g;
            ((ArrayDeque)object2).add(mediaFormat);
            mediaFormat = null;
            this.i = null;
            return;
        }
    }
}

