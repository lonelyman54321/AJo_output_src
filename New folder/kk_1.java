/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.b;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/*
 * Renamed from kK
 */
public final class kk_1
extends b {
    public final DecoderInputBuffer r;
    public final Xm2 s;
    public jk_0 t;
    public long u;

    public kk_1() {
        super(6);
        Object object = new DecoderInputBuffer(1);
        this.r = object;
        this.s = object = new Xm2();
    }

    public final void A() {
        jk_0 jk_02 = this.t;
        if (jk_02 != null) {
            jk_02.f();
        }
    }

    public final void C(long l2, boolean bl2) {
        this.u = l2 = Long.MIN_VALUE;
        jk_0 jk_02 = this.t;
        if (jk_02 != null) {
            jk_02.f();
        }
    }

    public final int a(d object) {
        object = ((d)object).o;
        int n3 = "application/x-camera-motion".equals(object);
        n3 = n3 != 0 ? tj2_0.a(4, 0, 0, 0) : tj2_0.a(0, 0, 0, 0);
        return n3;
    }

    public final boolean c() {
        return true;
    }

    public final void g(long l2, long l3) {
        long l4;
        long l7;
        long l8;
        int n3;
        int n4 = 1;
        while ((n3 = this.h()) == 0 && (n3 = (l8 = (l7 = this.u) - (l4 = 100000L + l2)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) < 0) {
            jk_0 jk_02;
            byte[] byArray;
            Object object = this.r;
            ((DecoderInputBuffer)object).g();
            Object object2 = this.c;
            ((HV0)object2).a();
            int n7 = 0;
            int n8 = this.I((HV0)object2, (DecoderInputBuffer)object, 0);
            int n10 = -4;
            float f5 = 0.0f / 0.0f;
            if (n8 != n10 || (n10 = (int)(((fE)object).f(n8 = 4) ? 1 : 0)) != 0) break;
            this.u = l4 = ((DecoderInputBuffer)object).f;
            long l12 = this.l;
            long l14 = l4 - l12;
            Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object3 < 0) {
                n10 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n10 = 0;
                f5 = 0.0f;
                byArray = null;
            }
            if ((jk_02 = this.t) == null || n10 != 0) continue;
            ((DecoderInputBuffer)object).j();
            object = ((DecoderInputBuffer)object).d;
            n10 = gz3.a;
            n10 = ((Buffer)object).remaining();
            int n14 = 16;
            if (n10 != n14) {
                n3 = 0;
                object = null;
            } else {
                byArray = ((ByteBuffer)object).array();
                n14 = ((Buffer)object).limit();
                Xm2 xm2 = this.s;
                xm2.G(n14, byArray);
                n3 = ((ByteBuffer)object).arrayOffset() + n8;
                xm2.I(n3);
                n3 = 3;
                object2 = new float[n3];
                while (n7 < n3) {
                    n10 = xm2.k();
                    f5 = Float.intBitsToFloat(n10);
                    object2[n7] = f5;
                    n7 += n4;
                }
                object = object2;
            }
            if (object == null) continue;
            object2 = this.t;
            long l15 = this.u;
            long l16 = this.k;
            object2.a((float[])object, l15 -= l16);
        }
    }

    public final String getName() {
        return "CameraMotionRenderer";
    }

    public final void j(int n3, Object object) {
        int n4 = 8;
        if (n3 == n4) {
            this.t = object = (jk_0)object;
        }
    }
}

