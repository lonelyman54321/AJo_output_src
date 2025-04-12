/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$CodecException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaCrypto
 *  android.media.MediaCryptoException
 *  android.media.MediaFormat
 *  android.media.metrics.LogSessionId
 *  android.os.Bundle
 *  android.os.Trace
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.Trace;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$a;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$b;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.exoplayer.mediacodec.d;
import androidx.media3.exoplayer.mediacodec.d$a;
import androidx.media3.exoplayer.mediacodec.d$b;
import androidx.media3.exoplayer.mediacodec.e;
import androidx.media3.exoplayer.mediacodec.g;
import androidx.media3.exoplayer.n$a;
import androidx.media3.exoplayer.source.j$b;
import com.google.common.primitives.UnsignedBytes;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

public abstract class MediaCodecRenderer
extends b {
    public static final byte[] S0;
    public final ArrayDeque A;
    public boolean A0;
    public final n72 B;
    public int B0;
    public androidx.media3.common.d C;
    public int C0;
    public androidx.media3.common.d D;
    public int D0;
    public DrmSession E;
    public boolean E0;
    public DrmSession F;
    public boolean F0;
    public n$a G;
    public boolean G0;
    public MediaCrypto H;
    public long H0;
    public final long I;
    public long I0;
    public float J;
    public boolean J0;
    public float K;
    public boolean K0;
    public d L;
    public boolean L0;
    public androidx.media3.common.d M;
    public boolean M0;
    public MediaFormat N;
    public ExoPlaybackException N0;
    public boolean O;
    public fj0 O0;
    public float P;
    public MediaCodecRenderer$b P0;
    public ArrayDeque Q;
    public long Q0;
    public MediaCodecRenderer$DecoderInitializationException R;
    public boolean R0;
    public e S;
    public int T;
    public boolean U;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean k0;
    public boolean p0;
    public long q0;
    public final d$b r;
    public long r0;
    public final g s;
    public int s0;
    public final boolean t;
    public int t0;
    public final float u;
    public ByteBuffer u0;
    public final DecoderInputBuffer v;
    public boolean v0;
    public final DecoderInputBuffer w;
    public boolean w0;
    public final DecoderInputBuffer x;
    public boolean x0;
    public final px y;
    public boolean y0;
    public final MediaCodec.BufferInfo z;
    public boolean z0;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[38];
        byte[] byArray3 = byArray;
        byArray2[0] = 0;
        byArray3[1] = 0;
        byArray2[2] = 1;
        byArray3[3] = 103;
        byArray2[4] = 66;
        byArray3[5] = -64;
        byArray2[6] = 11;
        byArray3[7] = -38;
        byArray2[8] = 37;
        byArray3[9] = -112;
        byArray2[10] = 0;
        byArray3[11] = 0;
        byArray2[12] = 1;
        byArray3[13] = 104;
        byArray2[14] = -50;
        byArray3[15] = 15;
        byArray2[16] = 19;
        byArray3[17] = 32;
        byArray2[18] = 0;
        byArray3[19] = 0;
        byArray2[20] = 1;
        byArray3[21] = 101;
        byArray2[22] = -120;
        byArray3[23] = -124;
        byArray2[24] = 13;
        byArray3[25] = -50;
        byArray2[26] = 113;
        byArray3[27] = 24;
        byArray2[28] = -96;
        byArray3[29] = 0;
        byArray2[30] = 47;
        byArray3[31] = -65;
        byArray2[32] = 28;
        byArray3[33] = 49;
        byArray2[34] = -61;
        byArray3[35] = 39;
        byArray2[36] = 93;
        byArray3[37] = 120;
        S0 = byArray;
    }

    public MediaCodecRenderer(int n3, d$b d$b, boolean bl2, float f5) {
        long l2;
        Object object;
        float f6;
        Sj0 sj0 = androidx.media3.exoplayer.mediacodec.g.l0;
        super(n3);
        this.r = d$b;
        this.s = sj0;
        this.t = bl2;
        this.u = f6;
        Object object2 = new DecoderInputBuffer(0);
        this.v = object2;
        object2 = new DecoderInputBuffer(0);
        this.w = object2;
        int n4 = 2;
        object2 = new DecoderInputBuffer(n4);
        this.x = object2;
        object2 = new DecoderInputBuffer(n4);
        ((px)object2).l = 32;
        this.y = object2;
        this.z = object = new MediaCodec.BufferInfo();
        this.J = f6 = 1.0f;
        this.K = f6;
        this.I = l2 = -9223372036854775807L;
        super();
        this.A = object;
        object = MediaCodecRenderer$b.e;
        this.P0 = object;
        ((DecoderInputBuffer)object2).i(0);
        object2 = ((DecoderInputBuffer)object2).d;
        object = ByteOrder.nativeOrder();
        ((ByteBuffer)object2).order((ByteOrder)object);
        object2 = new Object();
        object = AudioProcessor.a;
        ((n72)object2).a = object;
        ((n72)object2).c = 0;
        ((n72)object2).b = n4;
        this.B = object2;
        this.P = -1.0f;
        this.T = 0;
        this.B0 = 0;
        this.s0 = n3 = -1;
        this.t0 = n3;
        this.r0 = l2;
        this.H0 = l2;
        this.I0 = l2;
        this.Q0 = l2;
        this.q0 = l2;
        this.C0 = 0;
        this.D0 = 0;
        this.O0 = object2 = new Object();
    }

    public void A() {
        this.C = null;
        MediaCodecRenderer$b mediaCodecRenderer$b = MediaCodecRenderer$b.e;
        this.v0(mediaCodecRenderer$b);
        this.A.clear();
        this.R();
    }

    public final boolean A0(androidx.media3.common.d dArray) {
        int n3 = gz3.a;
        int n4 = 23;
        boolean bl2 = true;
        if (n3 < n4) {
            return bl2;
        }
        d d2 = this.L;
        if (d2 != null && (n3 = this.D0) != (n4 = 3) && (n3 = this.h) != 0) {
            float f5;
            float f6 = this.K;
            dArray.getClass();
            dArray = this.j;
            dArray.getClass();
            float f7 = this.V(f6, dArray);
            f6 = this.P;
            float f8 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
            if (f8 == false) {
                return bl2;
            }
            f8 = -1082130432;
            float f11 = -1.0f;
            float f12 = f7 - f11;
            Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object == false) {
                boolean bl3 = this.E0;
                if (bl3) {
                    this.C0 = bl2;
                    this.D0 = n4;
                } else {
                    this.q0();
                    this.b0();
                }
                return false;
            }
            n3 = (int)(f6 == f11 ? 0 : (f6 > f11 ? 1 : -1));
            if (n3 == 0 && (n3 = (int)((f5 = f7 - (f6 = this.u)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) <= 0) {
                return bl2;
            }
            d2 = new Bundle();
            d2.putFloat("operating-rate", f7);
            d d5 = this.L;
            d5.getClass();
            d5.b((Bundle)d2);
            this.P = f7;
        }
        return bl2;
    }

    public final void B0() {
        Object object = this.F;
        object.getClass();
        object = object.c();
        boolean bl2 = object instanceof uw0_0;
        if (bl2) {
            Object object2;
            try {
                object2 = this.H;
            }
            catch (MediaCryptoException mediaCryptoException) {
                object2 = this.C;
                throw this.z((Exception)((Object)mediaCryptoException), (androidx.media3.common.d)object2, false, 6006);
            }
            object2.getClass();
            object = (uw0_0)object;
            object = ((uw0_0)object).b;
            NL1.a(object2, (byte[])object);
        }
        object = this.F;
        this.u0((DrmSession)object);
        this.C0 = 0;
        this.D0 = 0;
    }

    public void C(long l2, boolean bl2) {
        int n3 = 0;
        Dn3 dn3 = null;
        this.J0 = false;
        this.K0 = false;
        this.M0 = false;
        boolean bl3 = this.x0;
        if (bl3) {
            ByteBuffer byteBuffer;
            this.y.g();
            this.x.g();
            this.y0 = false;
            n72 n722 = this.B;
            n722.getClass();
            n722.a = byteBuffer = AudioProcessor.a;
            n722.c = 0;
            n722.b = n3 = 2;
        } else {
            n3 = this.R();
            if (n3 != 0) {
                this.b0();
            }
        }
        dn3 = this.P0.d;
        n3 = dn3.h();
        if (n3 > 0) {
            n3 = 1;
            this.L0 = n3;
        }
        this.P0.d.b();
        this.A.clear();
    }

    public final void C0(long l2) {
        block6: {
            boolean bl2;
            MediaFormat mediaFormat;
            androidx.media3.common.d d2;
            block5: {
                block4: {
                    boolean bl3;
                    Dn3 dn3 = this.P0.d;
                    d2 = (androidx.media3.common.d)dn3.f(l2);
                    if (d2 == null && (bl3 = this.R0) && (mediaFormat = this.N) != null) {
                        d2 = (androidx.media3.common.d)this.P0.d.e();
                    }
                    if (d2 == null) break block4;
                    this.D = d2;
                    break block5;
                }
                bl2 = this.O;
                if (!bl2 || (d2 = this.D) == null) break block6;
            }
            d2 = this.D;
            d2.getClass();
            mediaFormat = this.N;
            this.h0(d2, mediaFormat);
            bl2 = false;
            d2 = null;
            this.O = false;
            this.R0 = false;
        }
    }

    public void H(androidx.media3.common.d[] dArray, long l2, long l3, j$b j$b) {
        MediaCodecRenderer mediaCodecRenderer = this;
        Object object = this.P0;
        long l4 = ((MediaCodecRenderer$b)object).c;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 == false) {
            long l12 = -9223372036854775807L;
            object = new MediaCodecRenderer$b(l12, l2, l3);
            this.v0((MediaCodecRenderer$b)object);
        } else {
            long l12;
            long l14;
            long l15;
            long l16;
            long l17;
            long l18;
            long l19;
            object = this.A;
            boolean n3 = ((ArrayDeque)object).isEmpty();
            if (n3 && ((l19 = (l18 = (l17 = this.H0) - l7) == 0L ? 0 : (l18 < 0L ? -1 : 1)) == false || (l16 = (l15 = (l14 = this.Q0) - l7) == 0L ? 0 : (l15 < 0L ? -1 : 1)) != false && (l12 = l14 == l17 ? 0 : (l14 < l17 ? -1 : 1)) >= 0)) {
                long l20 = -9223372036854775807L;
                object = new MediaCodecRenderer$b(l20, l2, l3);
                this.v0((MediaCodecRenderer$b)object);
                object = mediaCodecRenderer.P0;
                l4 = ((MediaCodecRenderer$b)object).c;
                object2 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                if (object2 != false) {
                    this.k0();
                }
            } else {
                l14 = mediaCodecRenderer.H0;
                MediaCodecRenderer$b mediaCodecRenderer$b = new MediaCodecRenderer$b(l14, l2, l3);
                ((ArrayDeque)object).add(mediaCodecRenderer$b);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean J(long l2, long l3) {
        int n3;
        long l4;
        Object object;
        Object object2;
        int n4;
        byte[] byArray;
        int n7;
        Object object3;
        int n8;
        long l7;
        long l8;
        int n10;
        Object object4;
        MediaCodecRenderer mediaCodecRenderer = this;
        boolean bl2 = this.K0;
        int n14 = 1;
        ct3.f(bl2 ^ n14);
        px px2 = this.y;
        bl2 = px2.l();
        int n15 = 4;
        if (bl2) {
            object4 = px2.d;
            n10 = this.t0;
            int n16 = px2.k;
            l8 = px2.f;
            long l12 = this.l;
            l7 = px2.j;
            n8 = this.a0(l12, l7);
            int n17 = px2.f(n15);
            object3 = this.D;
            object3.getClass();
            n7 = 0;
            byArray = null;
            n4 = 0;
            object2 = null;
            object = this;
            l4 = l2;
            long l14 = l8;
            l8 = l3;
            l7 = l14;
            n15 = n8;
            n3 = n17;
            bl2 = this.o0(l2, l3, null, (ByteBuffer)object4, n10, 0, n16, l14, n8 != 0, n17 != 0, (androidx.media3.common.d)object3);
            if (!bl2) return false;
            object = px2;
            l4 = px2.j;
            this.j0(l4);
            px2.g();
        } else {
            object = px2;
        }
        int n18 = 0;
        Object object5 = null;
        int n19 = mediaCodecRenderer.J0;
        if (n19 != 0) {
            mediaCodecRenderer.K0 = true;
            return false;
        }
        n19 = 1;
        int n20 = mediaCodecRenderer.y0;
        DecoderInputBuffer decoderInputBuffer = mediaCodecRenderer.x;
        if (n20 != 0) {
            n20 = ((px)object).k(decoderInputBuffer);
            ct3.f(n20 != 0);
            mediaCodecRenderer.y0 = false;
        }
        if ((n20 = mediaCodecRenderer.z0) != 0) {
            n20 = ((px)object).l();
            if (n20 != 0) {
                return n19 != 0;
            }
            this.M();
            mediaCodecRenderer.z0 = false;
            this.b0();
            n20 = mediaCodecRenderer.x0;
            if (n20 == 0) {
                return false;
            }
        }
        n20 = mediaCodecRenderer.J0 ^ n19;
        ct3.f(n20 != 0);
        HV0 hV0 = mediaCodecRenderer.c;
        hV0.a();
        decoderInputBuffer.g();
        while (true) {
            long l15;
            long l16;
            block42: {
                int n21;
                ByteBuffer byteBuffer;
                int n22;
                Object object6;
                int n24;
                block41: {
                    block36: {
                        block40: {
                            int n25;
                            boolean bl3;
                            int n26;
                            long l17;
                            Object object7;
                            int n27;
                            block39: {
                                block38: {
                                    block37: {
                                        decoderInputBuffer.g();
                                        n7 = mediaCodecRenderer.I(hV0, decoderInputBuffer, 0);
                                        n24 = -5;
                                        if (n7 == n24) break block36;
                                        n24 = -4;
                                        if (n7 == n24) break block37;
                                        n20 = -3;
                                        if (n7 != n20) {
                                            object = new IllegalStateException();
                                            throw object;
                                        }
                                        n20 = (int)(this.h() ? 1 : 0);
                                        if (n20 != 0) {
                                            mediaCodecRenderer.I0 = l8 = mediaCodecRenderer.H0;
                                        }
                                        break block38;
                                    }
                                    n7 = 4;
                                    n24 = (int)(decoderInputBuffer.f(n7) ? 1 : 0);
                                    if (n24 == 0) break block39;
                                    mediaCodecRenderer.J0 = n19;
                                    mediaCodecRenderer.I0 = l8 = mediaCodecRenderer.H0;
                                }
                                n18 = 1;
                                n4 = 0;
                                object2 = null;
                                break;
                            }
                            l16 = mediaCodecRenderer.H0;
                            long l18 = decoderInputBuffer.f;
                            mediaCodecRenderer.H0 = l16 = Math.max(l16, l18);
                            n24 = (int)(this.h() ? 1 : 0);
                            if (n24 != 0 || (n24 = (int)(((fE)(object4 = mediaCodecRenderer.w)).f(n10 = 0x20000000) ? 1 : 0)) != 0) {
                                mediaCodecRenderer.I0 = l16 = mediaCodecRenderer.H0;
                            }
                            n24 = (int)(mediaCodecRenderer.L0 ? 1 : 0);
                            n10 = 255;
                            n4 = 0;
                            object2 = null;
                            object6 = "audio/opus";
                            if (n24 != 0) {
                                object4 = mediaCodecRenderer.C;
                                object4.getClass();
                                mediaCodecRenderer.D = object4;
                                object4 = ((androidx.media3.common.d)object4).o;
                                n24 = (int)(Objects.equals(object4, object6) ? 1 : 0);
                                if (n24 != 0 && (n24 = (int)((object4 = mediaCodecRenderer.D.r).isEmpty() ? 1 : 0)) == 0) {
                                    object4 = (byte[])mediaCodecRenderer.D.r.get(0);
                                    n22 = (object4[11] & n10) << 8;
                                    n27 = 10;
                                    n24 = object4[n27] & n10 | n22;
                                    object3 = mediaCodecRenderer.D;
                                    object3.getClass();
                                    object3 = ((androidx.media3.common.d)object3).a();
                                    ((androidx.media3.common.d$a)object3).F = n24;
                                    mediaCodecRenderer.D = object4 = new androidx.media3.common.d((androidx.media3.common.d$a)object3);
                                }
                                object4 = mediaCodecRenderer.D;
                                mediaCodecRenderer.h0((androidx.media3.common.d)object4, null);
                                mediaCodecRenderer.L0 = false;
                            }
                            decoderInputBuffer.j();
                            object4 = mediaCodecRenderer.D;
                            if (object4 == null || (n24 = (int)(Objects.equals(object4 = ((androidx.media3.common.d)object4).o, object6) ? 1 : 0)) == 0) break block40;
                            n24 = (int)(decoderInputBuffer.f(0x10000000) ? 1 : 0);
                            if (n24 != 0) {
                                decoderInputBuffer.b = object4 = mediaCodecRenderer.D;
                                mediaCodecRenderer.Y(decoderInputBuffer);
                            }
                            long l19 = mediaCodecRenderer.l;
                            long l20 = decoderInputBuffer.f;
                            long l21 = (l19 -= l20) - (l20 = 80000L);
                            n24 = (int)(l21 == 0L ? 0 : (l21 < 0L ? -1 : 1));
                            if (n24 > 0) break block40;
                            object4 = mediaCodecRenderer.D;
                            object4.getClass();
                            object6 = mediaCodecRenderer.B;
                            object6.getClass();
                            decoderInputBuffer.d.getClass();
                            object3 = decoderInputBuffer.d;
                            n22 = ((Buffer)object3).limit();
                            ByteBuffer byteBuffer2 = decoderInputBuffer.d;
                            n27 = byteBuffer2.position();
                            if ((n22 -= n27) == 0) break block40;
                            n22 = ((n72)object6).b;
                            n27 = 2;
                            if (n22 == n27 && ((n22 = (object4 = ((androidx.media3.common.d)object4).r).size()) == n19 || (n22 = object4.size()) == (n15 = 3))) {
                                object2 = object4 = object4.get(0);
                                object2 = (byte[])object4;
                            }
                            object4 = decoderInputBuffer.d;
                            n22 = ((Buffer)object4).position();
                            n15 = ((Buffer)object4).limit();
                            n3 = n15 - n22;
                            n14 = (n3 + 255) / n10;
                            int n28 = n14 + 27 + n3;
                            n7 = ((n72)object6).b;
                            if (n7 == n27) {
                                n7 = object2 != null ? ((Object)object2).length + 28 : 47;
                                n8 = n7 + 44;
                                n10 = n28 = n8 + n28;
                            } else {
                                n10 = n28;
                                n7 = 0;
                                byArray = null;
                            }
                            byteBuffer = ((n72)object6).a;
                            n19 = byteBuffer.capacity();
                            if (n19 < n10) {
                                byteBuffer = ByteBuffer.allocate(n10);
                                object7 = ByteOrder.LITTLE_ENDIAN;
                                ((n72)object6).a = byteBuffer = byteBuffer.order((ByteOrder)object7);
                            } else {
                                byteBuffer = ((n72)object6).a;
                                byteBuffer.clear();
                            }
                            byteBuffer = ((n72)object6).a;
                            n10 = ((n72)object6).b;
                            n18 = 22;
                            if (n10 == n27) {
                                if (object2 != null) {
                                    l17 = 0L;
                                    n26 = 1;
                                    bl3 = true;
                                    n72.a(byteBuffer, l17, 0, n26, bl3);
                                    n10 = ((Object)object2).length;
                                    n21 = n15;
                                    l20 = n10;
                                    n10 = UnsignedBytes.checkedCast(l20);
                                    byteBuffer.put((byte)n10);
                                    byteBuffer.put((byte[])object2);
                                    object7 = byteBuffer.array();
                                    n27 = byteBuffer.arrayOffset();
                                    n15 = ((Object)object2).length + 28;
                                    n25 = n22;
                                    n22 = 0;
                                    object3 = null;
                                    n10 = gz3.j(n27, (byte[])object7, n15, 0);
                                    byteBuffer.putInt(n18, n10);
                                    n10 = ((Object)object2).length + 28;
                                    byteBuffer.position(n10);
                                } else {
                                    n25 = n22;
                                    n21 = n15;
                                    object7 = n72.d;
                                    byteBuffer.put((byte[])object7);
                                }
                                object7 = n72.e;
                                byteBuffer.put((byte[])object7);
                            } else {
                                n25 = n22;
                                n21 = n15;
                            }
                            n10 = 0;
                            object7 = null;
                            n4 = ((ByteBuffer)object4).get(0);
                            n10 = ((Buffer)object4).limit();
                            n22 = 1;
                            if (n10 > n22) {
                                n22 = n10 = (int)((ByteBuffer)object4).get(n22);
                            } else {
                                n22 = 0;
                                object3 = null;
                            }
                            long l22 = ea2.b((byte)n4, (byte)n22) * 48000L;
                            l7 = 1000000L;
                            n4 = (int)(l22 / l7);
                            ((n72)object6).c = n10 = ((n72)object6).c + n4;
                            l22 = n10;
                            n22 = ((n72)object6).b;
                            bl3 = false;
                            l17 = l22;
                            n26 = n14;
                            n72.a(byteBuffer, l22, n22, n14, false);
                            object3 = null;
                            break block41;
                        }
                        n4 = 0;
                        object2 = null;
                        break block42;
                    }
                    n18 = 1;
                    n4 = 0;
                    object2 = null;
                    mediaCodecRenderer.g0(hV0);
                    break;
                }
                for (n22 = 0; n22 < n14; ++n22) {
                    n10 = 255;
                    if (n3 >= n10) {
                        byteBuffer.put((byte)-1);
                        n3 = n4 = n3 + -255;
                        continue;
                    }
                    n4 = (byte)n3;
                    byteBuffer.put((byte)n4);
                    n3 = 0;
                    px2 = null;
                }
                n10 = n21;
                for (n22 = n25; n22 < n10; ++n22) {
                    n4 = ((ByteBuffer)object4).get(n22);
                    byteBuffer.put((byte)n4);
                }
                n10 = ((Buffer)object4).limit();
                ((ByteBuffer)object4).position(n10);
                byteBuffer.flip();
                n24 = ((n72)object6).b;
                n10 = 2;
                if (n24 == n10) {
                    object5 = byteBuffer.array();
                    n24 = byteBuffer.arrayOffset() + n7 + 44;
                    n10 = byteBuffer.limit();
                    n4 = byteBuffer.position();
                    n10 -= n4;
                    n4 = 0;
                    object2 = null;
                    n18 = gz3.j(n24, (byte[])object5, n10, 0);
                    byteBuffer.putInt(n7 += 66, n18);
                } else {
                    n4 = 0;
                    object2 = null;
                    byArray = byteBuffer.array();
                    n24 = byteBuffer.arrayOffset();
                    n10 = byteBuffer.limit();
                    n22 = byteBuffer.position();
                    n7 = gz3.j(n24, byArray, n10 -= n22, 0);
                    byteBuffer.putInt(n18, n7);
                }
                n18 = ((n72)object6).b;
                n7 = 1;
                ((n72)object6).b = n18 += n7;
                ((n72)object6).a = byteBuffer;
                decoderInputBuffer.g();
                n18 = ((n72)object6).a.remaining();
                decoderInputBuffer.i(n18);
                object5 = decoderInputBuffer.d;
                byteBuffer = ((n72)object6).a;
                ((ByteBuffer)object5).put(byteBuffer);
                decoderInputBuffer.j();
            }
            n18 = ((px)object).l();
            if (n18 != 0 && (n7 = (int)(mediaCodecRenderer.a0(l4 = mediaCodecRenderer.l, l15 = ((px)object).j) ? 1 : 0)) != (n18 = mediaCodecRenderer.a0(l4, l16 = decoderInputBuffer.f)) || (n18 = ((px)object).k(decoderInputBuffer)) == 0) {
                n18 = 1;
                mediaCodecRenderer.y0 = n18;
                break;
            }
            n18 = 0;
            object5 = null;
            n19 = 1;
        }
        n19 = ((px)object).l();
        if (n19 != 0) {
            ((DecoderInputBuffer)object).j();
        }
        if (bl2 = ((px)object).l()) return 1 != 0;
        bl2 = mediaCodecRenderer.J0;
        if (bl2) return 1 != 0;
        bl2 = mediaCodecRenderer.z0;
        if (bl2) return 1 != 0;
        return 0 != 0;
    }

    public abstract hj0 K(e var1, androidx.media3.common.d var2, androidx.media3.common.d var3);

    public MediaCodecDecoderException L(IllegalStateException illegalStateException, e e2) {
        MediaCodecDecoderException mediaCodecDecoderException = new MediaCodecDecoderException(illegalStateException, e2);
        return mediaCodecDecoderException;
    }

    public final void M() {
        ByteBuffer byteBuffer;
        this.z0 = false;
        this.y.g();
        this.x.g();
        this.y0 = false;
        this.x0 = false;
        n72 n722 = this.B;
        n722.getClass();
        n722.a = byteBuffer = AudioProcessor.a;
        n722.c = 0;
        n722.b = 2;
    }

    public final boolean N() {
        int n3 = this.E0;
        boolean bl2 = true;
        if (n3 != 0) {
            this.C0 = bl2;
            n3 = this.X;
            if (n3 != 0) {
                this.D0 = 3;
                return false;
            }
            this.D0 = n3 = 2;
        } else {
            this.B0();
        }
        return bl2;
    }

    public final boolean O(long l2, long l3) {
        boolean bl2;
        Object object;
        boolean bl3;
        int n3;
        MediaCodecRenderer mediaCodecRenderer;
        block39: {
            long l4;
            int n4;
            long l7;
            mediaCodecRenderer = this;
            d d2 = this.L;
            d2.getClass();
            n3 = this.t0;
            bl3 = false;
            int n7 = 1;
            if (n3 >= 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
            MediaCodec.BufferInfo bufferInfo = mediaCodecRenderer.z;
            if (n3 == 0) {
                long l8;
                long l12;
                n3 = (int)(mediaCodecRenderer.Y ? 1 : 0);
                if (n3 != 0 && (n3 = (int)(mediaCodecRenderer.F0 ? 1 : 0)) != 0) {
                    try {
                        n3 = d2.l(bufferInfo);
                    }
                    catch (IllegalStateException illegalStateException) {
                        this.n0();
                        n3 = (int)(mediaCodecRenderer.K0 ? 1 : 0);
                        if (n3 != 0) {
                            this.q0();
                        }
                        return false;
                    }
                } else {
                    n3 = d2.l(bufferInfo);
                }
                l7 = -9223372036854775807L;
                if (n3 < 0) {
                    long l14;
                    long l15;
                    int n8 = -2;
                    if (n3 == n8) {
                        int n10;
                        String string2;
                        mediaCodecRenderer.G0 = n7;
                        object = mediaCodecRenderer.L;
                        object.getClass();
                        object = object.e();
                        int n14 = mediaCodecRenderer.T;
                        if (n14 != 0 && (n14 = object.getInteger(string2 = "width")) == (n10 = 32) && (n14 = object.getInteger(string2 = "height")) == n10) {
                            mediaCodecRenderer.k0 = n7;
                        } else {
                            mediaCodecRenderer.N = object;
                            mediaCodecRenderer.O = n7;
                        }
                        return n7 != 0;
                    }
                    n3 = (int)(mediaCodecRenderer.p0 ? 1 : 0);
                    if (n3 != 0 && ((n3 = (int)(mediaCodecRenderer.J0 ? 1 : 0)) != 0 || (n3 = mediaCodecRenderer.C0) == (n8 = 2))) {
                        this.n0();
                    }
                    if ((n3 = (int)((l15 = (l14 = mediaCodecRenderer.q0) - l7) == 0L ? 0 : (l15 < 0L ? -1 : 1))) != 0) {
                        object = mediaCodecRenderer.g;
                        object.getClass();
                        long l16 = object.currentTimeMillis();
                        long l17 = (l14 += (long)100) - l16;
                        long l18 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                        if (l18 < 0) {
                            this.n0();
                        }
                    }
                    return false;
                }
                n4 = mediaCodecRenderer.k0;
                if (n4) {
                    mediaCodecRenderer.k0 = false;
                    d2.i(n3);
                    return n7 != 0;
                }
                n4 = bufferInfo.size;
                if (!n4 && (n4 = bufferInfo.flags & 4)) {
                    this.n0();
                    return false;
                }
                mediaCodecRenderer.t0 = n3;
                mediaCodecRenderer.u0 = object = d2.m(n3);
                if (object != null) {
                    n4 = bufferInfo.offset;
                    ((ByteBuffer)object).position(n4);
                    object = mediaCodecRenderer.u0;
                    n4 = bufferInfo.offset;
                    int n15 = bufferInfo.size;
                    ((ByteBuffer)object).limit(n4 += n15);
                }
                if ((n3 = (int)((l12 = (l4 = bufferInfo.presentationTimeUs) - (l8 = mediaCodecRenderer.l)) == 0L ? 0 : (l12 < 0L ? -1 : 1))) < 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object = null;
                }
                mediaCodecRenderer.v0 = n3;
                l8 = mediaCodecRenderer.I0;
                n3 = (int)(l8 == l7 ? 0 : (l8 < l7 ? -1 : 1));
                if (n3 != 0 && (n3 = (int)(l8 == l4 ? 0 : (l8 < l4 ? -1 : 1))) <= 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object = null;
                }
                mediaCodecRenderer.w0 = n3;
                mediaCodecRenderer.C0(l4);
            }
            if ((n3 = (int)(mediaCodecRenderer.Y ? 1 : 0)) != 0 && (n3 = (int)(mediaCodecRenderer.F0 ? 1 : 0)) != 0) {
                ByteBuffer byteBuffer;
                try {
                    byteBuffer = mediaCodecRenderer.u0;
                }
                catch (IllegalStateException illegalStateException) {}
                int n16 = mediaCodecRenderer.t0;
                int n17 = bufferInfo.flags;
                long l19 = bufferInfo.presentationTimeUs;
                boolean bl4 = mediaCodecRenderer.v0;
                n4 = (int)(mediaCodecRenderer.w0 ? 1 : 0);
                androidx.media3.common.d d5 = mediaCodecRenderer.D;
                d5.getClass();
                object = this;
                l7 = l2;
                l4 = l3;
                boolean bl5 = bl4;
                bl4 = true;
                boolean bl6 = bl5;
                bl2 = true;
                n7 = n4;
                try {
                    n3 = (int)(this.o0(l2, l3, d2, byteBuffer, n16, n17, (int)(bl4 ? 1 : 0), l19, bl5, n4 != 0, d5) ? 1 : 0);
                    mediaCodecRenderer = bufferInfo;
                    break block39;
                }
                catch (IllegalStateException illegalStateException) {}
                {
                }
                this.n0();
                n3 = (int)(mediaCodecRenderer.K0 ? 1 : 0);
                if (n3 != 0) {
                    this.q0();
                }
                return false;
            }
            bl2 = true;
            ByteBuffer byteBuffer = mediaCodecRenderer.u0;
            int n18 = mediaCodecRenderer.t0;
            int n19 = bufferInfo.flags;
            long l20 = bufferInfo.presentationTimeUs;
            boolean bl7 = mediaCodecRenderer.v0;
            n7 = mediaCodecRenderer.w0;
            androidx.media3.common.d d7 = mediaCodecRenderer.D;
            d7.getClass();
            int n20 = 1;
            object = this;
            l7 = l2;
            l4 = l3;
            int n21 = n20;
            mediaCodecRenderer = bufferInfo;
            n3 = (int)(this.o0(l2, l3, d2, byteBuffer, n18, n19, n20, l20, bl7, n7 != 0, d7) ? 1 : 0);
        }
        if (n3 != 0) {
            long l21 = ((MediaCodec.BufferInfo)mediaCodecRenderer).presentationTimeUs;
            MediaCodecRenderer mediaCodecRenderer2 = this;
            this.j0(l21);
            n3 = ((MediaCodec.BufferInfo)mediaCodecRenderer).flags & 4;
            bl3 = n3 != 0;
            if (!bl3 && (n3 = (int)(mediaCodecRenderer2.F0 ? 1 : 0)) != 0 && (n3 = (int)(mediaCodecRenderer2.w0 ? 1 : 0)) != 0) {
                object = mediaCodecRenderer2.g;
                object.getClass();
                mediaCodecRenderer2.q0 = l21 = object.currentTimeMillis();
            }
            mediaCodecRenderer2.t0 = -1;
            n3 = 0;
            object = null;
            mediaCodecRenderer2.u0 = null;
            if (!bl3) {
                return bl2;
            }
            this.n0();
        } else {
            MediaCodecRenderer mediaCodecRenderer3 = this;
        }
        return false;
    }

    public final boolean P() {
        int n3;
        int n4;
        Object object = this.L;
        if (object != null && (n4 = this.C0) != (n3 = 2) && !(n4 = (int)(this.J0 ? 1 : 0))) {
            long l2;
            Object object2;
            int n7;
            Object object3;
            int n8;
            Object object4;
            int n10;
            int n14;
            Object object5;
            DecoderInputBuffer decoderInputBuffer;
            block31: {
                n4 = this.s0;
                decoderInputBuffer = this.w;
                if (n4 < 0) {
                    n4 = object.k();
                    this.s0 = n4;
                    if (n4 < 0) {
                        return false;
                    }
                    object5 = object.g(n4);
                    decoderInputBuffer.d = object5;
                    decoderInputBuffer.g();
                }
                n4 = this.C0;
                n14 = 1;
                n10 = -1;
                if (n4 == n14) {
                    n4 = (int)(this.p0 ? 1 : 0);
                    if (!n4) {
                        this.F0 = n14;
                        n4 = this.s0;
                        int n15 = 4;
                        boolean bl2 = false;
                        Object var10_13 = null;
                        long l3 = 0L;
                        object.c(n4, 0, n15, l3);
                        this.s0 = n10;
                        decoderInputBuffer.d = null;
                    }
                    this.C0 = n3;
                    return false;
                }
                n4 = (int)(this.Z ? 1 : 0);
                if (n4) {
                    this.Z = false;
                    object5 = decoderInputBuffer.d;
                    object5.getClass();
                    byte[] byArray = S0;
                    ((ByteBuffer)object5).put(byArray);
                    n4 = this.s0;
                    object.c(n4, 38, 0, 0L);
                    this.s0 = n10;
                    decoderInputBuffer.d = null;
                    this.E0 = n14;
                    return n14 != 0;
                }
                n4 = this.B0;
                if (n4 == n14) {
                    n4 = 0;
                    object5 = null;
                    while (true) {
                        object4 = this.M;
                        object4.getClass();
                        object4 = ((androidx.media3.common.d)object4).r;
                        n8 = object4.size();
                        if (n4 >= n8) break;
                        object4 = (byte[])this.M.r.get(n4);
                        object3 = decoderInputBuffer.d;
                        object3.getClass();
                        ((ByteBuffer)object3).put((byte[])object4);
                        n4 += 1;
                    }
                    this.B0 = n3;
                }
                object5 = decoderInputBuffer.d;
                object5.getClass();
                n4 = ((Buffer)object5).position();
                object4 = this.c;
                ((HV0)object4).a();
                try {
                    n7 = this.I((HV0)object4, decoderInputBuffer, 0);
                    object2 = -3;
                    if (n7 != object2) break block31;
                }
                catch (DecoderInputBuffer$InsufficientCapacityException decoderInputBuffer$InsufficientCapacityException) {
                    this.d0(decoderInputBuffer$InsufficientCapacityException);
                    this.p0(0);
                    this.Q();
                    return n14 != 0;
                }
                boolean bl3 = this.h();
                if (bl3) {
                    long l4;
                    this.I0 = l4 = this.H0;
                }
                return false;
            }
            object2 = -5;
            if (n7 == object2) {
                int n16 = this.B0;
                if (n16 == n3) {
                    decoderInputBuffer.g();
                    this.B0 = n14;
                }
                this.g0((HV0)object4);
                return n14 != 0;
            }
            n8 = (int)(decoderInputBuffer.f(4) ? 1 : 0);
            if (n8 != 0) {
                long l7;
                this.I0 = l7 = this.H0;
                n4 = this.B0;
                if (n4 == n3) {
                    decoderInputBuffer.g();
                    this.B0 = n14;
                }
                this.J0 = n14;
                n4 = (int)(this.E0 ? 1 : 0);
                if (!n4) {
                    this.n0();
                    return false;
                }
                n4 = (int)(this.p0 ? 1 : 0);
                if (!n4) {
                    this.F0 = n14;
                    n4 = this.s0;
                    n7 = 4;
                    n8 = 0;
                    object4 = null;
                    long l8 = 0L;
                    object.c(n4, 0, n7, l8);
                    this.s0 = n10;
                    decoderInputBuffer.d = null;
                }
                return false;
            }
            n8 = (int)(this.E0 ? 1 : 0);
            if (n8 == 0 && (n8 = (int)(decoderInputBuffer.f(n14) ? 1 : 0)) == 0) {
                decoderInputBuffer.g();
                int n17 = this.B0;
                if (n17 == n3) {
                    this.B0 = n14;
                }
                return n14 != 0;
            }
            n8 = (int)(this.x0(decoderInputBuffer) ? 1 : 0);
            if (n8 != 0) {
                decoderInputBuffer.g();
                object = this.O0;
                n4 = ((fj0)object).d + n14;
                ((fj0)object).d = n4;
                return n14 != 0;
            }
            n8 = (int)(decoderInputBuffer.f(0x40000000) ? 1 : 0);
            if (n8 != 0) {
                object3 = decoderInputBuffer.c;
                if (!n4) {
                    object3.getClass();
                } else {
                    int[] nArray = ((Fe0)object3).d;
                    if (nArray == null) {
                        ((Fe0)object3).d = nArray = new int[n14];
                        MediaCodec.CryptoInfo cryptoInfo = ((Fe0)object3).i;
                        cryptoInfo.numBytesOfClearData = nArray;
                    }
                    object3 = ((Fe0)object3).d;
                    object2 = object3[0] + n4;
                    object3[0] = object2;
                }
            }
            long l12 = decoderInputBuffer.f;
            n4 = (int)(this.L0 ? 1 : 0);
            if (n4) {
                object5 = this.A;
                n7 = (int)(((ArrayDeque)object5).isEmpty() ? 1 : 0);
                if (!n7) {
                    object5 = ((MediaCodecRenderer$b)((ArrayDeque)object5).peekLast()).d;
                    object3 = this.C;
                    object3.getClass();
                    ((Dn3)object5).a(l12, object3);
                } else {
                    object5 = this.P0.d;
                    object3 = this.C;
                    object3.getClass();
                    ((Dn3)object5).a(l12, object3);
                }
                this.L0 = false;
            }
            this.H0 = l2 = Math.max(this.H0, l12);
            n4 = (int)(this.h() ? 1 : 0);
            if (n4 || (n4 = (int)(decoderInputBuffer.f(0x20000000) ? 1 : 0))) {
                this.I0 = l2 = this.H0;
            }
            decoderInputBuffer.j();
            n4 = (int)(decoderInputBuffer.f(0x10000000) ? 1 : 0);
            if (n4) {
                this.Y(decoderInputBuffer);
            }
            this.l0(decoderInputBuffer);
            n3 = this.T(decoderInputBuffer);
            if (n8 != 0) {
                n4 = this.s0;
                object4 = decoderInputBuffer.c;
                object.a(n4, (Fe0)object4, l12, n3);
            } else {
                n4 = this.s0;
                object4 = decoderInputBuffer.d;
                object4.getClass();
                n8 = ((Buffer)object4).limit();
                n7 = n3;
                object.c(n4, n8, n3, l12);
            }
            this.s0 = n10;
            decoderInputBuffer.d = null;
            this.E0 = n14;
            this.B0 = 0;
            object = this.O0;
            n4 = ((fj0)object).c + n14;
            ((fj0)object).c = n4;
            return n14 != 0;
        }
        return false;
    }

    public final void Q() {
        try {
            d d2 = this.L;
            ct3.h(d2);
            d2.flush();
            return;
        }
        finally {
            this.s0();
        }
    }

    public final boolean R() {
        d d2 = this.L;
        if (d2 == null) {
            return false;
        }
        int n3 = this.D0;
        int n4 = 3;
        boolean bl2 = true;
        if (!(n3 == n4 || (n4 = (int)(this.U ? 1 : 0)) != 0 && (n4 = (int)(this.G0 ? 1 : 0)) == 0 || (n4 = (int)(this.X ? 1 : 0)) != 0 && (n4 = (int)(this.F0 ? 1 : 0)) != 0)) {
            n4 = 2;
            if (n3 == n4) {
                n3 = gz3.a;
                n4 = 23;
                boolean bl3 = n3 >= n4;
                ct3.f(bl3);
                if (n3 >= n4) {
                    try {
                        this.B0();
                    }
                    catch (ExoPlaybackException exoPlaybackException) {
                        Cx.g("Failed to update the DRM session, releasing the codec instead.", exoPlaybackException);
                        this.q0();
                        return bl2;
                    }
                }
            }
            this.Q();
            return false;
        }
        this.q0();
        return bl2;
    }

    public final List S(boolean bl2) {
        Object object = this.C;
        object.getClass();
        Object object2 = this.s;
        ArrayList arrayList = this.W((g)object2, (androidx.media3.common.d)object, bl2);
        boolean bl3 = arrayList.isEmpty();
        if (bl3 && bl2) {
            CharSequence charSequence = null;
            arrayList = this.W((g)object2, (androidx.media3.common.d)object, false);
            bl2 = arrayList.isEmpty();
            if (!bl2) {
                object2 = "Drm session requires secure decoder for ";
                charSequence = new StringBuilder((String)object2);
                object = ((androidx.media3.common.d)object).o;
                charSequence.append((String)object);
                charSequence.append(", but no secure decoder available. Trying to proceed with ");
                charSequence.append(arrayList);
                object = ".";
                charSequence.append((String)object);
                charSequence = charSequence.toString();
                Cx.f((String)charSequence);
            }
        }
        return arrayList;
    }

    public int T(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    public boolean U() {
        return false;
    }

    public abstract float V(float var1, androidx.media3.common.d[] var2);

    public abstract ArrayList W(g var1, androidx.media3.common.d var2, boolean var3);

    public abstract d$a X(e var1, androidx.media3.common.d var2, MediaCrypto var3, float var4);

    public abstract void Y(DecoderInputBuffer var1);

    public final void Z(e object, MediaCrypto object2) {
        int n3;
        int n4;
        Object object3;
        String string2;
        String string3;
        boolean bl2;
        int n7;
        Object object4;
        Object object5;
        float f5;
        Object object6 = "createCodec:";
        androidx.media3.common.d d2 = this.C;
        d2.getClass();
        String string4 = ((e)object).a;
        int n74 = gz3.a;
        int n8 = -1082130432;
        float f6 = -1.0f;
        int n10 = 23;
        if (n74 < n10) {
            f5 = -1.0f;
        } else {
            f5 = this.K;
            androidx.media3.common.d[] dArray = this.j;
            dArray.getClass();
            f5 = this.V(f5, dArray);
        }
        float f7 = this.u;
        float f8 = f5 == f7 ? 0 : (f5 < f7 ? -1 : 1);
        if (f8 > 0) {
            f6 = f5;
        }
        this.m0(d2);
        VV vV = this.g;
        vV.getClass();
        long l2 = vV.elapsedRealtime();
        object2 = this.X((e)object, d2, (MediaCrypto)object2, f6);
        int n14 = 31;
        if (n74 >= n14) {
            object5 = this.f;
            object5.getClass();
            object5 = ((nu2)object5).b;
            object5.getClass();
            object5 = ((nu2$a)object5).a;
            Object object7 = sF0.a();
            boolean bl3 = Wk0.b((LogSessionId)object5, object7);
            if (!bl3) {
                object7 = "log-session-id";
                object5 = OL1.a((LogSessionId)object5);
                object4 = ((d$a)object2).b;
                object4.setString((String)object7, (String)object5);
            }
        }
        object5 = new StringBuilder((String)object6);
        ((StringBuilder)object5).append(string4);
        object6 = ((StringBuilder)object5).toString();
        Trace.beginSection((String)object6);
        object6 = this.r;
        this.L = object2 = object6.a((d$a)object2);
        object6 = new MediaCodecRenderer$a(this);
        object2.n((MediaCodecRenderer$a)object6);
        object2 = this.g;
        object2.getClass();
        long l3 = object2.elapsedRealtime();
        boolean n15 = ((e)object).d(d2);
        if (!n15) {
            object2 = androidx.media3.common.d.d(d2);
            object6 = Locale.US;
            object4 = "Format exceeds selected codec's capabilities [";
            object6 = new StringBuilder((String)object4);
            ((StringBuilder)object6).append((String)object2);
            ((StringBuilder)object6).append(", ");
            ((StringBuilder)object6).append(string4);
            ((StringBuilder)object6).append("]");
            object2 = ((StringBuilder)object6).toString();
            Cx.f((String)object2);
        }
        this.S = object;
        this.P = f6;
        this.M = d2;
        int n16 = 2;
        int n17 = 25;
        boolean bl3 = false;
        d2 = null;
        n8 = 1;
        f6 = Float.MIN_VALUE;
        if (n74 <= n17 && (n7 = (int)(((String)(object4 = "OMX.Exynos.avc.dec.secure")).equals(string4) ? 1 : 0)) != 0 && ((bl2 = ((String)(object4 = gz3.d)).startsWith(string3 = "SM-T585")) || (bl2 = ((String)object4).startsWith(string3 = "SM-A510")) || (bl2 = ((String)object4).startsWith(string3 = "SM-A520")) || (n7 = (int)(((String)object4).startsWith(string3 = "SM-J700") ? 1 : 0)) != 0)) {
            n7 = 2;
        } else {
            n7 = 24;
            if (n74 < n7 && ((n7 = (int)(((String)(object4 = "OMX.Nvidia.h264.decode")).equals(string4) ? 1 : 0)) != 0 || (n7 = (int)(((String)(object4 = "OMX.Nvidia.h264.decode.secure")).equals(string4) ? 1 : 0)) != 0) && ((bl2 = (string3 = "flounder").equals(object4 = gz3.b)) || (bl2 = (string3 = "flounder_lte").equals(object4)) || (bl2 = (string3 = "grouper").equals(object4)) || (n7 = (int)((string3 = "tilapia").equals(object4) ? 1 : 0)) != 0)) {
                n7 = 1;
            } else {
                n7 = 0;
                object4 = null;
            }
        }
        this.T = n7;
        n7 = 29;
        if (n74 == n7 && (bl2 = (string3 = "c2.android.aac.decoder").equals(string4))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        this.U = bl2;
        if (n74 <= n10 && (n10 = (int)((string2 = "OMX.google.vorbis.decoder").equals(string4) ? 1 : 0)) != 0) {
            n10 = 1;
        } else {
            n10 = 0;
            string2 = null;
        }
        this.X = n10;
        n10 = 21;
        if (n74 == n10 && (n10 = (int)((string2 = "OMX.google.aac.decoder").equals(string4) ? 1 : 0)) != 0) {
            n10 = 1;
        } else {
            n10 = 0;
            string2 = null;
        }
        this.Y = n10;
        string2 = ((e)object).a;
        if (n74 <= n17 && (n17 = (int)(((String)(object6 = "OMX.rk.video_decoder.avc")).equals(string2) ? 1 : 0)) != 0 || n74 <= n7 && ((n17 = (int)(((String)(object6 = "OMX.broadcom.video_decoder.tunnel")).equals(string2) ? 1 : 0)) != 0 || (n17 = (int)(((String)(object6 = "OMX.broadcom.video_decoder.tunnel.secure")).equals(string2) ? 1 : 0)) != 0 || (n17 = (int)(((String)(object6 = "OMX.bcm.vdec.avc.tunnel")).equals(string2) ? 1 : 0)) != 0 || (n17 = (int)(((String)(object6 = "OMX.bcm.vdec.avc.tunnel.secure")).equals(string2) ? 1 : 0)) != 0 || (n17 = (int)(((String)(object6 = "OMX.bcm.vdec.hevc.tunnel")).equals(string2) ? 1 : 0)) != 0 || (n17 = (int)(((String)(object6 = "OMX.bcm.vdec.hevc.tunnel.secure")).equals(string2) ? 1 : 0)) != 0) || (n17 = (int)(((String)(object6 = "Amazon")).equals(object3 = gz3.c) ? 1 : 0)) != 0 && (n17 = (int)(((String)(object6 = "AFTS")).equals(object3 = gz3.d) ? 1 : 0)) != 0 && (n4 = (int)(((e)object).f ? 1 : 0)) != 0 || (n4 = this.U()) != 0) {
            bl3 = true;
        }
        this.p0 = bl3;
        object = this.L;
        object.getClass();
        n4 = this.h;
        if (n4 == n16) {
            object = this.g;
            object.getClass();
            long l4 = object.elapsedRealtime();
            long l7 = 1000L;
            this.r0 = l4 += l7;
        }
        object = this.O0;
        ((fj0)object).a = n3 = ((fj0)object).a + n8;
        l2 = l3 - l2;
        object3 = this;
        this.e0(l3, string4, l2);
        return;
        finally {
            Trace.endSection();
        }
    }

    public final int a(androidx.media3.common.d d2) {
        g g3;
        try {
            g3 = this.s;
        }
        catch (MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException) {
            throw this.y(mediaCodecUtil$DecoderQueryException, d2);
        }
        g3 = (Sj0)g3;
        return this.z0((Sj0)g3, d2);
    }

    public final boolean a0(long l2, long l3) {
        long l4;
        String string2;
        Object object;
        Object object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        boolean bl2 = object2 < 0 && ((object = this.D) == null || (object2 = (Object)Objects.equals(object = ((androidx.media3.common.d)object).o, string2 = "audio/opus")) == false || (object2 = (l4 = (l2 -= l3) - (l3 = 80000L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b0() {
        Object object;
        int n3;
        Object object2;
        block20: {
            int n4;
            block22: {
                block17: {
                    int n7;
                    String string2;
                    int n8;
                    block18: {
                        Object object3;
                        block21: {
                            block19: {
                                object2 = this.L;
                                if (object2 != null) return;
                                n3 = this.x0;
                                if (n3 != 0) return;
                                object2 = this.C;
                                if (object2 == null) {
                                    return;
                                }
                                object = this.F;
                                n4 = 1;
                                if (object == null && (n8 = this.y0((androidx.media3.common.d)object2)) != 0) {
                                    n8 = 1;
                                } else {
                                    n8 = 0;
                                    object = null;
                                }
                                string2 = ((androidx.media3.common.d)object2).o;
                                if (n8 != 0) {
                                    this.M();
                                    object2 = "audio/mp4a-latm";
                                    n3 = ((String)object2).equals(string2);
                                    object = this.y;
                                    if (n3 == 0 && (n3 = (int)(((String)(object2 = "audio/mpeg")).equals(string2) ? 1 : 0)) == 0 && (n3 = (int)(((String)(object2 = "audio/opus")).equals(string2) ? 1 : 0)) == 0) {
                                        object.getClass();
                                        ((px)object).l = n4;
                                    } else {
                                        object.getClass();
                                        ((px)object).l = n3 = 32;
                                    }
                                    this.x0 = n4;
                                    return;
                                }
                                object = this.F;
                                this.u0((DrmSession)object);
                                object = this.E;
                                n7 = 4;
                                if (object == null) break block18;
                                object = this.H;
                                if (object == null) {
                                    n8 = 1;
                                } else {
                                    n8 = 0;
                                    object = null;
                                }
                                ct3.f(n8 != 0);
                                object = this.E;
                                object3 = object.c();
                                int n10 = uw0_0.c;
                                if (n10 == 0 || (n10 = object3 instanceof uw0_0) == 0) break block19;
                                n10 = object.getState();
                                if (n10 == n4) {
                                    object2 = object.getError();
                                    object2.getClass();
                                    object = this.C;
                                    n4 = ((DrmSession$DrmSessionException)object2).a;
                                    throw this.z((Exception)object2, (androidx.media3.common.d)object, false, n4);
                                }
                                if (n10 != n7) break block20;
                            }
                            if (object3 != null) break block21;
                            if ((object = object.getError()) == null) break block20;
                            break block18;
                        }
                        n8 = object3 instanceof uw0_0;
                        if (n8 != 0) {
                            object3 = (uw0_0)object3;
                            try {
                                UUID uUID = ((uw0_0)object3).a;
                                object3 = ((uw0_0)object3).b;
                                object = new MediaCrypto(uUID, (byte[])object3);
                                this.H = object;
                            }
                            catch (MediaCryptoException mediaCryptoException) {
                                object = this.C;
                                throw this.z((Exception)((Object)mediaCryptoException), (androidx.media3.common.d)object, false, 6006);
                            }
                        }
                    }
                    try {
                        int n14;
                        object = this.E;
                        if (object == null || (n8 = object.getState()) != (n14 = 3) && (n8 = (object = this.E).getState()) != n7) break block17;
                    }
                    catch (MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException) {
                        throw this.z(mediaCodecRenderer$DecoderInitializationException, (androidx.media3.common.d)object2, false, 4001);
                    }
                    object = this.E;
                    ct3.h(string2);
                    n8 = (int)(object.f(string2) ? 1 : 0);
                    if (n8 != 0) break block22;
                }
                n4 = 0;
            }
            object = this.H;
            this.c0((MediaCrypto)object, n4 != 0);
        }
        object2 = this.H;
        if (object2 == null) return;
        object = this.L;
        if (object != null) return;
        object2.release();
        n3 = 0;
        object2 = null;
        this.H = null;
    }

    public boolean c() {
        boolean bl2;
        block7: {
            block8: {
                Object object = this.C;
                bl2 = false;
                if (object == null) break block7;
                int n3 = this.h();
                if (n3 != 0) {
                    n3 = this.n;
                } else {
                    object = this.i;
                    object.getClass();
                    n3 = (int)(object.c() ? 1 : 0);
                }
                if (n3 != 0) break block8;
                n3 = this.t0;
                if (n3 >= 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object = null;
                }
                if (n3 != 0) break block8;
                long l2 = this.r0;
                long l3 = -9223372036854775807L;
                long l4 = l2 - l3;
                n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                if (n3 == 0) break block7;
                object = this.g;
                object.getClass();
                l2 = object.elapsedRealtime();
                l3 = this.r0;
                n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                if (n3 >= 0) break block7;
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void c0(MediaCrypto object, boolean bl2) {
        boolean bl3;
        Object object2;
        boolean bl4;
        boolean bl5;
        Object object3;
        Object object4;
        androidx.media3.common.d d2;
        block17: {
            d2 = this.C;
            d2.getClass();
            object4 = this.Q;
            if (object4 == null) {
                MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException22;
                block16: {
                    block15: {
                        block14: {
                            try {
                                object4 = this.S(bl2);
                                object3 = new ArrayDeque();
                                this.Q = object3;
                                bl5 = this.t;
                                if (!bl5) break block14;
                                ((ArrayDeque)object3).addAll(object4);
                                break block15;
                            }
                            catch (MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException22) {
                                break block16;
                            }
                        }
                        bl4 = object4.isEmpty();
                        if (!bl4) {
                            object3 = this.Q;
                            bl5 = false;
                            object2 = null;
                            object4 = object4.get(0);
                            object4 = (e)object4;
                            ((ArrayDeque)object3).add(object4);
                        }
                    }
                    this.R = null;
                    break block17;
                }
                object4 = new MediaCodecRenderer$DecoderInitializationException(d2, mediaCodecUtil$DecoderQueryException22, bl2, -49998);
                throw object4;
            }
        }
        if (bl3 = ((ArrayDeque)(object4 = this.Q)).isEmpty()) {
            object = new MediaCodecRenderer$DecoderInitializationException(d2, null, bl2, -49999);
            throw object;
        }
        object4 = this.Q;
        object4.getClass();
        while (true) {
            if ((object3 = this.L) != null) {
                this.Q = null;
                return;
            }
            Object object5 = object3 = ((ArrayDeque)object4).peekFirst();
            object5 = (e)object3;
            object5.getClass();
            bl4 = this.w0((e)object5);
            if (!bl4) {
                return;
            }
            try {
                this.Z((e)object5, (MediaCrypto)object);
                continue;
            }
            catch (Exception exception) {
                Object object6;
                object3 = new StringBuilder("Failed to initialize decoder: ");
                ((StringBuilder)object3).append(object5);
                Cx.g(((StringBuilder)object3).toString(), exception);
                ((ArrayDeque)object4).removeFirst();
                object2 = new StringBuilder("Decoder init failed: ");
                Object object7 = ((e)object5).a;
                ((StringBuilder)object2).append((String)object7);
                ((StringBuilder)object2).append(", ");
                ((StringBuilder)object2).append(d2);
                object7 = ((StringBuilder)object2).toString();
                bl5 = exception instanceof MediaCodec.CodecException;
                if (bl5) {
                    object2 = exception;
                    object6 = object2 = ((MediaCodec.CodecException)exception).getDiagnosticInfo();
                } else {
                    object6 = null;
                }
                Object object8 = d2.o;
                object2 = object3;
                object3 = new MediaCodecRenderer$DecoderInitializationException((String)object7, exception, (String)object8, bl2, (e)object5, (String)object6);
                this.d0((Exception)object3);
                object2 = this.R;
                if (object2 == null) {
                    this.R = object3;
                } else {
                    String string2 = ((Throwable)object2).getMessage();
                    object8 = ((Throwable)object2).getCause();
                    String string3 = ((MediaCodecRenderer$DecoderInitializationException)object2).a;
                    boolean bl6 = ((MediaCodecRenderer$DecoderInitializationException)object2).b;
                    object6 = ((MediaCodecRenderer$DecoderInitializationException)object2).c;
                    String string4 = ((MediaCodecRenderer$DecoderInitializationException)object2).d;
                    object7 = object3;
                    this.R = object3 = new MediaCodecRenderer$DecoderInitializationException(string2, (Throwable)object8, string3, bl6, (e)object6, string4);
                }
                bl4 = ((ArrayDeque)object4).isEmpty();
                if (bl4) throw this.R;
                continue;
            }
            break;
        }
    }

    public abstract void d0(Exception var1);

    public abstract void e0(long var1, String var3, long var4);

    public abstract void f0(String var1);

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(long var1_1, long var3_2) {
        block24: {
            block23: {
                block25: {
                    var5_3 = this.M0;
                    var6_4 = false;
                    if (var5_3 != 0) {
                        this.M0 = false;
                        this.n0();
                    }
                    if ((var7_5 = this.N0) != null) {
                        this.N0 = null;
                        throw var7_5;
                    }
                    var5_3 = 1;
                    try {
                        var8_6 = this.K0;
                        if (var8_6 != 0) {
                            this.r0();
                            return;
                        }
                    }
                    catch (IllegalStateException var9_7) {
                        break block23;
                    }
                    catch (MediaCodec.CryptoException var9_8) {
                        break block24;
                    }
                    var10_14 = this.C;
                    if (var10_14 == null) {
                        var8_6 = 2;
                        if ((var8_6 = (int)this.p0(var8_6)) == 0) {
                            return;
                        }
                    }
                    this.b0();
                    var8_6 = (int)this.x0;
                    if (var8_6 == 0) break block25;
                    var10_14 = "bypassRender";
                    Trace.beginSection((String)var10_14);
                    while ((var8_6 = (int)this.J(var1_1, var3_2)) != 0) {
                    }
                    Trace.endSection();
                    ** GOTO lbl90
                }
                var10_14 = this.L;
                if (var10_14 == null) ** GOTO lbl80
                var10_14 = this.g;
                var10_14.getClass();
                var11_15 = var10_14.elapsedRealtime();
                var13_16 = "drainAndFeed";
                Trace.beginSection((String)var13_16);
                do {
                    var14_17 /* !! */  = this.O(var1_1, var3_2);
                    var15_18 = -9223372036854775807L;
                    if (var14_17 /* !! */  == 0) break;
                    var17_19 = this.I;
                    cfr_temp_0 = var17_19 - var15_18;
                    var14_17 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var14_17 /* !! */  != 0) {
                        var13_16 = this.g;
                        var13_16.getClass();
                        var19_20 = var13_16.elapsedRealtime() - var11_15;
                        var14_17 /* !! */  = var19_20 == var17_19 ? 0 : (var19_20 < var17_19 ? -1 : 1);
                        if (var14_17 /* !! */  >= 0) {
                            var14_17 /* !! */  = 0;
                            var13_16 = null;
                            continue;
                        }
                    }
                    var14_17 /* !! */  = 1;
                } while (var14_17 /* !! */  != 0);
                while (var21_21 = this.P()) {
                    var1_1 = this.I;
                    cfr_temp_1 = var1_1 - var15_18;
                    var22_11 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var22_11 == 0) ** GOTO lbl-1000
                    var23_12 = this.g;
                    var23_12.getClass();
                    var3_2 = var23_12.elapsedRealtime() - var11_15;
                    var14_17 /* !! */  = (int)(var3_2 == var1_1 ? 0 : (var3_2 < var1_1 ? -1 : 1));
                    if (var14_17 /* !! */  >= 0) {
                        var21_21 = false;
                        var9_9 = null;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var21_21 = true;
                    }
                    if (var21_21) continue;
                }
                {
                    Trace.endSection();
                    ** GOTO lbl90
lbl80:
                    // 1 sources

                    var23_12 = this.O0;
                    var24_13 = var23_12.d;
                    var10_14 = this.i;
                    var10_14.getClass();
                    var25_23 = this.k;
                }
                {
                    var21_22 = var10_14.e(var1_1 -= var25_23);
                    var23_12.d = var24_13 += var21_22;
                    this.p0(var5_3);
lbl90:
                    // 3 sources

                    var9_9 = this.O0;
                    ** synchronized (var9_9)
lbl92:
                    // 1 sources

                    return;
                }
            }
            var27_24 = var9_7 instanceof MediaCodec.CodecException;
            if (var27_24 != 0 || (var24_13 = ((StackTraceElement[])(var23_12 = var9_7.getStackTrace())).length) > 0 && (var22_11 = (int)(var23_12 = var23_12[0].getClassName()).equals(var28_25 = "android.media.MediaCodec")) != 0) {
                this.d0(var9_7);
                if (var27_24 != 0) {
                    var29_26 = var9_7;
                    var29_26 = (MediaCodec.CodecException)var9_7;
                    var27_24 = var29_26.isRecoverable();
                    if (var27_24 != 0) {
                        var6_4 = true;
                    }
                }
                if (var6_4) {
                    this.q0();
                }
                var29_26 = this.S;
                var9_10 = this.L(var9_7, (e)var29_26);
                var27_24 = var9_10.a;
                var22_11 = 1101;
                var27_24 = var27_24 == var22_11 ? 4006 : 4003;
                var23_12 = this.C;
                throw this.z(var9_10, (androidx.media3.common.d)var23_12, var6_4, var27_24);
            }
            throw var9_7;
        }
        var29_27 = this.C;
        var22_11 = gz3.p(var9_8.getErrorCode());
        throw this.z((Exception)var9_8, var29_27, false, var22_11);
    }

    /*
     * Enabled aggressive block sorting
     */
    public hj0 g0(HV0 object) {
        int n3;
        androidx.media3.common.d d2;
        int n4;
        Object object2;
        Object object3;
        int n7;
        block20: {
            d d5;
            int n8;
            int n10;
            Object object4;
            block24: {
                Object object5;
                block25: {
                    int n14;
                    block21: {
                        block28: {
                            block26: {
                                block27: {
                                    int n15;
                                    block22: {
                                        int n16;
                                        block23: {
                                            int n17;
                                            Object object6;
                                            block19: {
                                                Class<?> clazz;
                                                Object object7;
                                                this.L0 = n7 = 1;
                                                object3 = ((HV0)object).b;
                                                object3.getClass();
                                                object6 = ((androidx.media3.common.d)object3).o;
                                                if (object6 == null) {
                                                    object = new IllegalArgumentException("Sample MIME type is null.");
                                                    throw this.z((Exception)object, (androidx.media3.common.d)object3, false, 4005);
                                                }
                                                n14 = object6.equals("video/av01");
                                                n17 = 0;
                                                object4 = null;
                                                if (n14 != 0 && (n14 = (object6 = ((androidx.media3.common.d)object3).r).isEmpty()) == 0) {
                                                    object3 = ((androidx.media3.common.d)object3).a();
                                                    ((androidx.media3.common.d$a)object3).q = null;
                                                    object2 = object6 = new androidx.media3.common.d((androidx.media3.common.d$a)object3);
                                                } else {
                                                    object2 = object3;
                                                }
                                                object = ((HV0)object).a;
                                                object3 = this.F;
                                                if (object3 != object) {
                                                    if (object != null) {
                                                        object.d(null);
                                                    }
                                                    if (object3 != null) {
                                                        object3.e(null);
                                                    }
                                                }
                                                this.F = object;
                                                this.C = object2;
                                                n4 = this.x0;
                                                if (n4 != 0) {
                                                    this.z0 = n7;
                                                    return null;
                                                }
                                                object = this.L;
                                                if (object == null) {
                                                    this.Q = null;
                                                    this.b0();
                                                    return null;
                                                }
                                                object3 = this.S;
                                                object3.getClass();
                                                d2 = this.M;
                                                d2.getClass();
                                                object6 = this.E;
                                                object4 = this.F;
                                                n3 = 3;
                                                n10 = 23;
                                                n16 = 2;
                                                if (object6 == object4) break block19;
                                                if (object4 == null || object6 == null || (object5 = object4.c()) == null || (object7 = object6.c()) == null || (n15 = (clazz = object5.getClass()).equals(object7 = object7.getClass())) == 0) break block20;
                                                n8 = object5 instanceof uw0_0;
                                                if (n8 == 0) break block19;
                                                object5 = object4.a();
                                                n8 = (int)(((UUID)object5).equals(object7 = object6.a()) ? 1 : 0);
                                                if (n8 == 0 || (n8 = gz3.a) < n10 || (n14 = ((UUID)(object5 = OF.e)).equals(object6 = object6.a())) != 0 || (n14 = ((UUID)object5).equals(object6 = object4.a())) != 0) break block20;
                                                n14 = ((e)object3).f;
                                                if (n14 != 0) break block19;
                                                n14 = object4.getState();
                                                if (n14 == n16) break block20;
                                                n14 = object4.getState();
                                                if (n14 != n3 && (n14 = object4.getState()) != (n8 = 4)) break block19;
                                                object6 = ((androidx.media3.common.d)object2).o;
                                                object6.getClass();
                                                n14 = (int)(object4.f((String)object6) ? 1 : 0);
                                                if (n14 != 0) break block20;
                                            }
                                            if ((object6 = this.F) != (object4 = this.E)) {
                                                n14 = 1;
                                            } else {
                                                n14 = 0;
                                                object6 = null;
                                            }
                                            if (n14 != 0 && (n17 = gz3.a) < n10) {
                                                n17 = 0;
                                                object4 = null;
                                            } else {
                                                n17 = 1;
                                            }
                                            ct3.f(n17 != 0);
                                            object4 = this.K((e)object3, d2, (androidx.media3.common.d)object2);
                                            n10 = ((hj0)object4).d;
                                            if (n10 == 0) break block21;
                                            n8 = 16;
                                            if (n10 == n7) break block22;
                                            if (n10 == n16) break block23;
                                            if (n10 != n3) {
                                                object = new IllegalStateException();
                                                throw object;
                                            }
                                            n7 = (int)(this.A0((androidx.media3.common.d)object2) ? 1 : 0);
                                            if (n7 == 0) break block24;
                                            this.M = object2;
                                            if (n14 == 0 || (n7 = (int)(this.N() ? 1 : 0)) != 0) break block25;
                                            break block26;
                                        }
                                        n15 = this.A0((androidx.media3.common.d)object2);
                                        if (n15 == 0) break block24;
                                        this.A0 = n7;
                                        this.B0 = n7;
                                        n8 = this.T;
                                        if (n8 != n16 && (n8 != n7 || (n8 = ((androidx.media3.common.d)object2).v) != (n15 = d2.v) || (n8 = ((androidx.media3.common.d)object2).w) != (n15 = d2.w))) {
                                            n7 = 0;
                                            d5 = null;
                                        }
                                        this.Z = n7;
                                        this.M = object2;
                                        if (n14 == 0 || (n7 = (int)(this.N() ? 1 : 0)) != 0) break block25;
                                        break block26;
                                    }
                                    n15 = this.A0((androidx.media3.common.d)object2);
                                    if (n15 == 0) break block24;
                                    this.M = object2;
                                    if (n14 == 0) break block27;
                                    n7 = (int)(this.N() ? 1 : 0);
                                    if (n7 != 0) break block25;
                                    break block26;
                                }
                                n14 = this.E0;
                                if (n14 == 0) break block25;
                                this.C0 = n7;
                                n14 = this.X;
                                if (n14 == 0) break block28;
                                this.D0 = n3;
                            }
                            n8 = 2;
                            break block24;
                        }
                        this.D0 = n7;
                        break block25;
                    }
                    n14 = this.E0;
                    if (n14 != 0) {
                        this.C0 = n7;
                        this.D0 = n3;
                    } else {
                        this.q0();
                        this.b0();
                    }
                }
                n8 = 0;
                object5 = null;
            }
            if (n10 == 0) return object4;
            d5 = this.L;
            if (d5 == object) {
                n4 = this.D0;
                if (n4 != n3) return object4;
            }
            String string2 = ((e)object3).a;
            return new hj0(string2, d2, (androidx.media3.common.d)object2, 0, n8);
        }
        if ((n4 = this.E0) != 0) {
            this.C0 = n7;
            this.D0 = n3;
        } else {
            this.q0();
            this.b0();
        }
        String string3 = ((e)object3).a;
        return new hj0(string3, d2, (androidx.media3.common.d)object2, 0, 128);
    }

    public abstract void h0(androidx.media3.common.d var1, MediaFormat var2);

    public void i0(long l2) {
    }

    public void j0(long l2) {
        Object object;
        boolean bl2;
        this.Q0 = l2;
        while (!(bl2 = ((ArrayDeque)(object = this.A)).isEmpty())) {
            MediaCodecRenderer$b mediaCodecRenderer$b = (MediaCodecRenderer$b)((ArrayDeque)object).peek();
            long l3 = mediaCodecRenderer$b.a;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 < 0) break;
            object = (MediaCodecRenderer$b)((ArrayDeque)object).poll();
            object.getClass();
            this.v0((MediaCodecRenderer$b)object);
            this.k0();
        }
    }

    public abstract void k0();

    public void l0(DecoderInputBuffer decoderInputBuffer) {
    }

    public void m0(androidx.media3.common.d d2) {
    }

    public final void n0() {
        int n3 = this.D0;
        int n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    this.K0 = n4;
                    this.r0();
                } else {
                    this.q0();
                    this.b0();
                }
            } else {
                this.Q();
                this.B0();
            }
        } else {
            this.Q();
        }
    }

    public abstract boolean o0(long var1, long var3, d var5, ByteBuffer var6, int var7, int var8, int var9, long var10, boolean var12, boolean var13, androidx.media3.common.d var14);

    public final boolean p0(int n3) {
        HV0 hV0 = this.c;
        hV0.a();
        DecoderInputBuffer decoderInputBuffer = this.v;
        decoderInputBuffer.g();
        int n4 = 4;
        n3 |= n4;
        n3 = this.I(hV0, decoderInputBuffer, n3);
        int n7 = -5;
        boolean bl2 = true;
        if (n3 == n7) {
            this.g0(hV0);
            return bl2;
        }
        int n8 = -4;
        if (n3 == n8 && (n3 = (int)(decoderInputBuffer.f(n4) ? 1 : 0)) != 0) {
            this.J0 = bl2;
            this.n0();
        }
        return false;
    }

    public final void q0() {
        Throwable throwable4;
        block17: {
            Throwable throwable22;
            block16: {
                MediaCrypto mediaCrypto;
                block18: {
                    Throwable throwable32;
                    block15: {
                        block14: {
                            Object object;
                            block13: {
                                try {
                                    object = this.L;
                                    if (object == null) break block13;
                                }
                                catch (Throwable throwable22) {}
                                object.release();
                                object = this.O0;
                                int n3 = ((fj0)object).b + 1;
                                ((fj0)object).b = n3;
                                object = this.S;
                                object.getClass();
                                object = ((e)object).a;
                                this.f0((String)object);
                                break block18;
                            }
                            this.L = null;
                            try {
                                object = this.H;
                                if (object == null) break block14;
                            }
                            catch (Throwable throwable32) {
                                break block15;
                            }
                            object.release();
                        }
                        this.H = null;
                        this.u0(null);
                        this.t0();
                        return;
                    }
                    this.H = null;
                    this.u0(null);
                    this.t0();
                    throw throwable32;
                }
                this.L = null;
                try {
                    mediaCrypto = this.H;
                    if (mediaCrypto == null) break block16;
                }
                catch (Throwable throwable4) {
                    break block17;
                }
                mediaCrypto.release();
            }
            this.H = null;
            this.u0(null);
            this.t0();
            throw throwable22;
        }
        this.H = null;
        this.u0(null);
        this.t0();
        throw throwable4;
    }

    public void r0() {
    }

    public void s0() {
        long l2;
        int n3;
        this.s0 = n3 = -1;
        this.w.d = null;
        this.t0 = n3;
        this.u0 = null;
        this.r0 = l2 = -9223372036854775807L;
        this.F0 = false;
        this.q0 = l2;
        this.E0 = false;
        this.Z = false;
        this.k0 = false;
        this.v0 = false;
        this.w0 = false;
        this.H0 = l2;
        this.I0 = l2;
        this.Q0 = l2;
        this.C0 = 0;
        this.D0 = 0;
        this.B0 = n3 = (int)(this.A0 ? 1 : 0);
    }

    public void t(float f5, float f6) {
        this.J = f5;
        this.K = f6;
        androidx.media3.common.d d2 = this.M;
        this.A0(d2);
    }

    public final void t0() {
        this.s0();
        this.N0 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.G0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.X = false;
        this.Y = false;
        this.p0 = false;
        this.A0 = false;
        this.B0 = 0;
    }

    public final int u() {
        return 8;
    }

    public final void u0(DrmSession drmSession) {
        DrmSession drmSession2 = this.E;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.d(null);
            }
            if (drmSession2 != null) {
                drmSession2.e(null);
            }
        }
        this.E = drmSession;
    }

    public final void v0(MediaCodecRenderer$b mediaCodecRenderer$b) {
        this.P0 = mediaCodecRenderer$b;
        long l2 = mediaCodecRenderer$b.c;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            object = 1;
            this.R0 = object;
            this.i0(l2);
        }
    }

    public boolean w0(e e2) {
        return true;
    }

    public boolean x0(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    public boolean y0(androidx.media3.common.d d2) {
        return false;
    }

    public abstract int z0(Sj0 var1, androidx.media3.common.d var2);
}

