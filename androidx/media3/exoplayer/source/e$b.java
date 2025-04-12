/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.collect.ImmutableList;

public final class e$b
implements eI0 {
    public final d a;

    public e$b(d d2) {
        this.a = d2;
    }

    public final int a(fi0_0 fi0_02, Pw2 pw2) {
        int n3;
        int n4 = ((il0_0)(fi0_02 = (il0_0)fi0_02)).p(-1 >>> 1);
        if (n4 == (n3 = -1)) {
            return n3;
        }
        return 0;
    }

    public final boolean b(fi0_0 fi0_02) {
        return true;
    }

    public final void c(long l2, long l3) {
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 object) {
        String string2;
        wp3 wp32 = object.n(0, 3);
        Object object2 = new dX2$b(-9223372036854775807L);
        object.h((dx2_1)object2);
        object.j();
        object = this.a;
        object2 = ((d)object).a();
        ((d$a)object2).n = string2 = ip1_0.l("text/x-unknown");
        ((d$a)object2).j = object = ((d)object).o;
        object = new d((d$a)object2);
        wp32.d((d)object);
    }

    public final void release() {
    }
}

