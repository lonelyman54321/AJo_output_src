/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.c$b;
import androidx.media3.exoplayer.video.d;
import androidx.media3.exoplayer.video.d$a;
import androidx.media3.exoplayer.video.e$a;

public final class e {
    public final e$a a;
    public final d b;
    public final d$a c;
    public final Dn3 d;
    public final Dn3 e;
    public final bb1_0 f;
    public wc3_0 g;
    public wc3_0 h;
    public long i;
    public long j;

    public e(c$b object, d d2) {
        this.a = object;
        this.b = d2;
        this.c = object = new d$a();
        this.d = object = new Dn3();
        this.e = object = new Dn3();
        object = new Object();
        int n3 = 16;
        int n4 = Integer.bitCount(n3);
        int n7 = 1;
        if (n4 != n7) {
            n3 = Integer.highestOneBit(15) << n7;
        }
        ((bb1_0)object).a = 0;
        ((bb1_0)object).b = 0;
        long[] lArray = new long[n3];
        ((bb1_0)object).c = lArray;
        ((bb1_0)object).d = n3 -= n7;
        this.f = object;
        this.h = object = wc3_0.d;
        this.j = -9223372036854775807L;
    }
}

