/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.d;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.k$a;
import androidx.media3.exoplayer.source.t;
import androidx.media3.exoplayer.upstream.Loader;
import java.nio.ByteBuffer;

public final class t$a
implements VR2 {
    public int a;
    public boolean b;
    public final /* synthetic */ t c;

    public t$a(t t3) {
        this.c = t3;
    }

    public final void a() {
        boolean bl2 = this.b;
        if (!bl2) {
            Object object = this.c;
            k$a k$a = ((t)object).e;
            int n3 = ip1_0.g(((t)object).j.o);
            k$a.getClass();
            long l2 = 0L;
            long l3 = gz3.T(l2);
            long l4 = -9223372036854775807L;
            int n4 = 1;
            d d2 = ((t)object).j;
            jm1_0 jm1_02 = new jm1_0(n4, n3, d2, l3, l4);
            object = new mN1(k$a, jm1_02);
            k$a.a((n60_0)object);
            this.b = bl2 = true;
        }
    }

    public final boolean c() {
        return this.c.l;
    }

    public final void d() {
        Object object = this.c;
        int n3 = ((t)object).k;
        if (n3 == 0) {
            object = ((t)object).i;
            n3 = -1 << -1;
            ((Loader)object).c(n3);
        }
    }

    public final int e(long l2) {
        int n3;
        int n4;
        this.a();
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0 && (n4 = this.a) != (n3 = 2)) {
            this.a = n3;
            return 1;
        }
        return 0;
    }

    public final int f(HV0 object, DecoderInputBuffer object2, int n3) {
        byte[] byArray;
        this.a();
        t t3 = this.c;
        boolean bl2 = t3.l;
        int n4 = 2;
        if (bl2 && (byArray = t3.m) == null) {
            this.a = n4;
        }
        int n7 = this.a;
        int n8 = -4;
        if (n7 == n4) {
            ((fE)object2).e(4);
            return n8;
        }
        int n10 = n3 & 2;
        int n14 = 1;
        if (n10 == 0 && n7 != 0) {
            long l2;
            if (!bl2) {
                return -3;
            }
            object = t3.m;
            object.getClass();
            ((fE)object2).e(n14);
            ((DecoderInputBuffer)object2).f = l2 = 0L;
            int n15 = n3 & 4;
            if (n15 == 0) {
                n15 = t3.n;
                ((DecoderInputBuffer)object2).i(n15);
                object = ((DecoderInputBuffer)object2).d;
                object2 = t3.m;
                bl2 = false;
                int n16 = t3.n;
                ((ByteBuffer)object).put((byte[])object2, 0, n16);
            }
            if ((n15 = n3 & 1) == 0) {
                this.a = n4;
            }
            return n8;
        }
        ((HV0)object).b = object2 = t3.j;
        this.a = n14;
        return -5;
    }
}

