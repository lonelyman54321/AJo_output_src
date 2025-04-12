/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.b;

public final class b$a
implements VR2 {
    public final VR2 a;
    public boolean b;
    public final /* synthetic */ b c;

    public b$a(b b2, VR2 vR2) {
        this.c = b2;
        this.a = vR2;
    }

    public final boolean c() {
        Object object = this.c;
        boolean bl2 = ((b)object).j();
        if (!bl2 && (bl2 = (object = this.a).c())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void d() {
        this.a.d();
    }

    public final int e(long l2) {
        b b2 = this.c;
        boolean bl2 = b2.j();
        if (bl2) {
            return -3;
        }
        return this.a.e(l2);
    }

    public final int f(HV0 hV0, DecoderInputBuffer object, int n3) {
        long l2;
        long l3;
        b b2 = this.c;
        int n4 = b2.j();
        int n7 = -3;
        if (n4 != 0) {
            return n7;
        }
        n4 = this.b;
        int n8 = 4;
        int n10 = -4;
        if (n4 != 0) {
            ((fE)object).a = n8;
            return n10;
        }
        long l4 = b2.o();
        VR2 vR2 = this.a;
        n3 = vR2.f(hV0, (DecoderInputBuffer)object, n3);
        n4 = -5;
        long l7 = Long.MIN_VALUE;
        if (n3 == n4) {
            object = hV0.b;
            object.getClass();
            n3 = ((d)object).H;
            n7 = ((d)object).G;
            if (n7 != 0 || n3 != 0) {
                long l8;
                long l12;
                long l14 = b2.e;
                l4 = 0L;
                long l15 = l14 - l4;
                Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object2 != false) {
                    n7 = 0;
                }
                if ((l12 = (l8 = (l14 = b2.f) - l7) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) {
                    n3 = 0;
                }
                object = ((d)object).a();
                ((d$a)object).F = n7;
                ((d$a)object).G = n3;
                hV0.b = object = ((d$a)object).a();
            }
            return n4;
        }
        long l16 = b2.f;
        long l17 = l16 - l7;
        Object object3 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (object3 != false && (n3 == n10 && (object3 = (l3 = (l2 = ((DecoderInputBuffer)object).f) - l16) == 0L ? 0 : (l3 < 0L ? -1 : 1)) >= 0 || n3 == n7 && (object3 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1)) == false && (object3 = (Object)((DecoderInputBuffer)object).e) == false)) {
            ((DecoderInputBuffer)object).g();
            ((fE)object).a = n8;
            this.b = true;
            return n10;
        }
        return n3;
    }
}

