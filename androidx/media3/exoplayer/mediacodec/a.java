/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.LoudnessCodecController
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Trace
 *  android.view.Surface
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$a;
import androidx.media3.exoplayer.mediacodec.b;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.media3.exoplayer.mediacodec.d$d;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.HashSet;

public final class a
implements d {
    public final MediaCodec a;
    public final b b;
    public final FL1 c;
    public final RC1 d;
    public boolean e;
    public int f;

    public a(MediaCodec object, HandlerThread handlerThread, FL1 fL1, RC1 rC1) {
        this.a = object;
        super(handlerThread);
        this.b = object;
        this.c = fL1;
        this.d = rC1;
        this.f = 0;
    }

    public static void o(a a2, MediaFormat object, Surface surface, MediaCrypto mediaCrypto, int n3) {
        boolean bl2;
        boolean bl22;
        Object object2 = a2.b;
        Handler handler = object2.c;
        int n4 = 1;
        if (handler == null) {
            bl22 = true;
        } else {
            bl22 = false;
            handler = null;
        }
        ct3.f(bl22);
        handler = object2.b;
        handler.start();
        handler = handler.getLooper();
        Handler handler2 = new Handler((Looper)handler);
        handler = a2.a;
        Qq.a((MediaCodec)handler, object2, handler2);
        object2.c = handler2;
        object2 = "configureCodec";
        Trace.beginSection((String)object2);
        handler.configure((MediaFormat)object, surface, mediaCrypto, n3);
        Trace.endSection();
        a2.c.start();
        object = "startCodec";
        Trace.beginSection((String)object);
        handler.start();
        Trace.endSection();
        int bl3 = gz3.a;
        int n7 = 35;
        if (bl3 >= n7 && (object = a2.d) != null && ((surface = ((RC1)object).c) == null || (bl2 = MC1.a((LoudnessCodecController)surface, (MediaCodec)handler)))) {
            object = ((RC1)object).a;
            boolean bl4 = ((HashSet)object).add(handler);
            ct3.f(bl4);
        }
        a2.f = n4;
    }

    public static String p(int n3, String string2) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        int n4 = 1;
        if (n3 == n4) {
            String string3 = "Audio";
            stringBuilder.append(string3);
        } else {
            n4 = 2;
            if (n3 == n4) {
                String string4 = "Video";
                stringBuilder.append(string4);
            } else {
                string2 = "Unknown(";
                stringBuilder.append(string2);
                stringBuilder.append(n3);
                String string5 = ")";
                stringBuilder.append(string5);
            }
        }
        return stringBuilder.toString();
    }

    public final void a(int n3, Fe0 fe0, long l2, int n4) {
        this.c.a(n3, fe0, l2, n4);
    }

    public final void b(Bundle bundle) {
        this.c.b(bundle);
    }

    public final void c(int n3, int n4, int n7, long l2) {
        this.c.c(n3, n4, n7, l2);
    }

    public final void d(d$d d$d, Handler handler) {
        kq_0 kq_02 = new kq_0(this, d$d);
        Iq.a(this.a, kq_02, handler);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final MediaFormat e() {
        Object object = this.b;
        Object object2 = object.a;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    object = object.h;
                    if (object != null) {
                        return object;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = new IllegalStateException();
                throw object;
            }
            throw throwable2;
        }
    }

    public final void f() {
        this.a.detachOutputSurface();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void flush() {
        this.c.flush();
        this.a.flush();
        b b2 = this.b;
        Object object = b2.a;
        synchronized (object) {
            long l2 = b2.l;
            long l3 = 1L;
            b2.l = l2 += l3;
            Handler handler = b2.c;
            Rq rq = new Rq(b2);
            handler.post((Runnable)rq);
        }
        this.a.start();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int k() {
        this.c.d();
        Object object = this.b;
        Object object2 = ((b)((Object)object)).a;
        synchronized (object2) {
            Throwable throwable2;
            block9: {
                int n3;
                boolean bl2;
                int n4;
                try {
                    IllegalStateException illegalStateException = ((b)((Object)object)).n;
                    n4 = 0;
                    if (illegalStateException != null) {
                        ((b)((Object)object)).n = null;
                        throw illegalStateException;
                    }
                    illegalStateException = ((b)((Object)object)).j;
                    if (illegalStateException != null) {
                        ((b)((Object)object)).j = null;
                        throw illegalStateException;
                    }
                    illegalStateException = ((b)((Object)object)).k;
                    if (illegalStateException != null) {
                        ((b)((Object)object)).k = null;
                        throw illegalStateException;
                    }
                    long l2 = ((b)((Object)object)).l;
                    long l3 = 0L;
                    bl2 = true;
                    Object object3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (object3 > 0) return -1;
                    n3 = ((b)((Object)object)).m;
                    if (n3 != 0) {
                        return -1;
                    }
                    n3 = 0;
                    illegalStateException = null;
                    n4 = -1;
                    if (n3 != 0) {
                        return n4;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                object = ((b)((Object)object)).d;
                n3 = ((NU)object).b;
                int n7 = ((NU)object).c;
                if (n3 != n7) {
                    bl2 = false;
                }
                if (!bl2) return ((NU)object).b();
                return n4;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int l(MediaCodec.BufferInfo object) {
        this.c.d();
        Object object2 = this.b;
        Object object3 = object2.a;
        synchronized (object3) {
            Throwable throwable2;
            block12: {
                int n3;
                int n4;
                Object object4;
                try {
                    object4 = object2.n;
                    n4 = 0;
                    if (object4 != null) {
                        object2.n = null;
                        throw object4;
                    }
                    object4 = object2.j;
                    if (object4 != null) {
                        object2.j = null;
                        throw object4;
                    }
                    object4 = object2.k;
                    if (object4 != null) {
                        object2.k = null;
                        throw object4;
                    }
                    long l2 = object2.l;
                    long l3 = 0L;
                    n3 = 1;
                    Object object5 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (object5 > 0) return -1;
                    boolean bl2 = object2.m;
                    if (bl2) {
                        return -1;
                    }
                    bl2 = false;
                    object4 = null;
                    n4 = -1;
                    if (bl2) {
                        return n4;
                    }
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                object4 = object2.e;
                int n7 = ((NU)object4).b;
                int n8 = ((NU)object4).c;
                if (n7 != n8) {
                    n3 = 0;
                }
                if (n3 != 0) {
                    return n4;
                }
                n4 = ((NU)object4).b();
                if (n4 >= 0) {
                    object4 = object2.h;
                    ct3.h(object4);
                    object2 = object2.f;
                    object2 = ((ArrayDeque)object2).remove();
                    object2 = (MediaCodec.BufferInfo)object2;
                    n8 = ((MediaCodec.BufferInfo)object2).offset;
                    n3 = ((MediaCodec.BufferInfo)object2).size;
                    long l4 = ((MediaCodec.BufferInfo)object2).presentationTimeUs;
                    int n10 = ((MediaCodec.BufferInfo)object2).flags;
                    object.set(n8, n3, l4, n10);
                } else {
                    int n14 = -2;
                    if (n4 != n14) return n4;
                    object = object2.g;
                    object = object.remove();
                    object = (MediaFormat)object;
                    object2.h = object;
                }
                return n4;
            }
            throw throwable2;
        }
    }

    public final ByteBuffer m(int n3) {
        return this.a.getOutputBuffer(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean n(MediaCodecRenderer$a mediaCodecRenderer$a) {
        b b2 = this.b;
        Object object = b2.a;
        synchronized (object) {
            b2.o = mediaCodecRenderer$a;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        RC1 rC1;
        Throwable throwable4;
        int n3;
        int n4;
        int n7;
        block18: {
            Object object;
            int n8;
            Throwable throwable22;
            block17: {
                int n10;
                block14: {
                    RC1 rC12;
                    Throwable throwable32;
                    block16: {
                        Object object2;
                        int n14;
                        block15: {
                            block13: {
                                HandlerThread handlerThread;
                                Object object3;
                                n10 = 33;
                                n7 = 30;
                                n4 = 35;
                                n3 = 1;
                                try {
                                    n14 = this.f;
                                    if (n14 != n3) break block13;
                                    object3 = this.c;
                                    object3.shutdown();
                                    object3 = this.b;
                                    Object object4 = ((b)((Object)object3)).a;
                                    synchronized (object4) {
                                        ((b)((Object)object3)).m = n3;
                                        handlerThread = ((b)((Object)object3)).b;
                                    }
                                }
                                catch (Throwable throwable22) {
                                    break block14;
                                }
                                {
                                    handlerThread.quit();
                                    ((b)((Object)object3)).a();
                                }
                            }
                            this.f = n14 = 2;
                            n14 = (int)(this.e ? 1 : 0);
                            if (n14 != 0) return;
                            try {
                                n14 = gz3.a;
                                if (n14 < n7 || n14 >= n10) break block15;
                                object2 = this.a;
                                object2.stop();
                            }
                            catch (Throwable throwable32) {
                                break block16;
                            }
                        }
                        if (n14 >= n4 && (object2 = this.d) != null) {
                            MediaCodec mediaCodec = this.a;
                            ((RC1)object2).a(mediaCodec);
                        }
                        object2 = this.a;
                        object2.release();
                        this.e = n3;
                        return;
                    }
                    n7 = gz3.a;
                    if (n7 >= n4 && (rC12 = this.d) != null) {
                        MediaCodec mediaCodec = this.a;
                        rC12.a(mediaCodec);
                    }
                    this.a.release();
                    this.e = n3;
                    throw throwable32;
                }
                n8 = this.e;
                if (n8 != 0) throw throwable22;
                try {
                    n8 = gz3.a;
                    if (n8 < n7 || n8 >= n10) break block17;
                    object = this.a;
                    object.stop();
                }
                catch (Throwable throwable4) {
                    break block18;
                }
            }
            if (n8 >= n4 && (object = this.d) != null) {
                MediaCodec mediaCodec = this.a;
                ((RC1)object).a(mediaCodec);
            }
            object = this.a;
            object.release();
            this.e = n3;
            throw throwable22;
        }
        n7 = gz3.a;
        if (n7 >= n4 && (rC1 = this.d) != null) {
            MediaCodec mediaCodec = this.a;
            rC1.a(mediaCodec);
        }
        this.a.release();
        this.e = n3;
        throw throwable4;
    }

    public final void setVideoScalingMode(int n3) {
        this.a.setVideoScalingMode(n3);
    }
}

