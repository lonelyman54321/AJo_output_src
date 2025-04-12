/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;

public final class v$a
implements VR2 {
    public final VR2 a;
    public final long b;

    public v$a(VR2 vR2, long l2) {
        this.a = vR2;
        this.b = l2;
    }

    public final boolean c() {
        return this.a.c();
    }

    public final void d() {
        this.a.d();
    }

    public final int e(long l2) {
        long l3 = this.b;
        return this.a.e(l2 -= l3);
    }

    public final int f(HV0 hV0, DecoderInputBuffer decoderInputBuffer, int n3) {
        VR2 vR2 = this.a;
        int n4 = vR2.f(hV0, decoderInputBuffer, n3);
        if (n4 == (n3 = -4)) {
            long l2 = decoderInputBuffer.f;
            long l3 = this.b;
            decoderInputBuffer.f = l2 += l3;
        }
        return n4;
    }
}

