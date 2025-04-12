/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 */
package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.d$a;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.b$a;
import androidx.media3.exoplayer.video.b$b;
import androidx.media3.exoplayer.video.d;
import androidx.media3.exoplayer.video.e;
import java.util.List;
import java.util.concurrent.Executor;

public final class a
implements VideoSink {
    public final d a;
    public final e b;
    public androidx.media3.common.d c;

    public a(d object, e object2) {
        this.a = object;
        this.b = object2;
        object = new d$a();
        this.c = object2 = new androidx.media3.common.d((d$a)object);
    }

    public final boolean b() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void d() {
        d d2 = this.a;
        int n3 = d2.e;
        if (n3 == 0) {
            d2.e = n3 = 1;
        }
    }

    public final Surface e() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void g(long l2, long l3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void h(long l2, long l3, long l4, long l7) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void i() {
        this.a.f();
    }

    public final boolean isInitialized() {
        return true;
    }

    public final boolean j(boolean bl2) {
        return this.a.b(bl2);
    }

    public final boolean k(long l2, boolean bl2, long l3, long l4, b$b b$b) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void l(Surface surface, A63 a63) {
        this.a.h(surface);
    }

    public final void m(androidx.media3.common.d d2) {
    }

    public final void n(boolean bl2) {
        this.a.e = (int)(bl2 ? 1 : 0);
    }

    public final void o() {
        this.a.e();
    }

    public final void p(androidx.media3.common.d d2) {
        int n3;
        Object object = this.c;
        int n4 = ((androidx.media3.common.d)object).v;
        int n7 = d2.v;
        int n8 = d2.w;
        if (n7 != n4 || n8 != (n3 = ((androidx.media3.common.d)object).w)) {
            wc3_0 wc3_02;
            object = this.b;
            object.getClass();
            ((e)object).g = wc3_02 = new wc3_0(n7, n8);
        }
        this.c = d2;
    }

    public final void q() {
        this.a.d(0);
    }

    public final void r(int n3) {
        OB3 oB3 = this.a.b;
        int n4 = oB3.j;
        if (n4 != n3) {
            oB3.j = n3;
            n3 = 1;
            oB3.d(n3 != 0);
        }
    }

    public final void release() {
    }

    public final void s() {
        this.a.h(null);
    }

    public final void setPlaybackSpeed(float f5) {
        this.a.i(f5);
    }

    public final void setVideoEffects(List object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void setVideoFrameMetadataListener(LB3 object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void t(boolean bl2) {
        Object object;
        Object object2;
        Object object3;
        long l2 = -9223372036854775807L;
        long l3 = 0L;
        int n3 = 1;
        if (bl2) {
            long l4;
            object3 = this.a;
            object2 = ((d)object3).b;
            ((OB3)object2).m = l3;
            ((OB3)object2).p = l4 = (long)-1;
            ((OB3)object2).n = l4;
            ((d)object3).h = l2;
            ((d)object3).f = l2;
            ((d)object3).d(n3);
            ((d)object3).i = l2;
        }
        object3 = this.b;
        object2 = ((e)object3).f;
        boolean bl3 = false;
        ((bb1_0)object2).a = 0;
        ((bb1_0)object2).b = 0;
        ((e)object3).j = l2;
        Object object4 = ((e)object3).e;
        int n4 = ((Dn3)object4).h();
        if (n4 > 0) {
            n4 = ((Dn3)object4).h();
            if (n4 > 0) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            ct3.a(n4 != 0);
            while ((n4 = ((Dn3)object4).h()) > n3) {
                ((Dn3)object4).e();
            }
            object = ((Dn3)object4).e();
            object.getClass();
            object = (Long)object;
            ((Dn3)object4).a(l3, object);
        }
        object4 = ((e)object3).g;
        object = ((e)object3).d;
        if (object4 == null) {
            int n7 = ((Dn3)object).h();
            if (n7 > 0) {
                n7 = ((Dn3)object).h();
                if (n7 > 0) {
                    bl3 = true;
                }
                ct3.a(bl3);
                while ((n7 = ((Dn3)object).h()) > n3) {
                    ((Dn3)object).e();
                }
                object4 = ((Dn3)object).e();
                object4.getClass();
                ((e)object3).g = object4 = (wc3_0)object4;
            }
        } else {
            ((Dn3)object).b();
        }
    }

    public final void u(boolean bl2) {
        this.a.c(bl2);
    }

    public final void v(b$a object, Executor executor) {
        object = new UnsupportedOperationException();
        throw object;
    }
}

