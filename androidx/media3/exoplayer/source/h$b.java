/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.a;
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.source.h$a;

public final class h$b
extends g {
    public final MediaItem b;

    public h$b(MediaItem mediaItem) {
        this.b = mediaItem;
    }

    public final int b(Object object) {
        int n3;
        Object object2 = h$a.e;
        if (object == object2) {
            n3 = 0;
            object = null;
        } else {
            n3 = -1;
        }
        return n3;
    }

    public final g$b g(int n3, g$b g$b, boolean bl2) {
        Integer n4;
        Object object = null;
        Integer n7 = bl2 ? (n4 = Integer.valueOf(0)) : null;
        if (bl2) {
            object = h$a.e;
        }
        a a2 = androidx.media3.common.a.g;
        g$b.j(n7, object, 0, -9223372036854775807L, 0L, a2, true);
        return g$b;
    }

    public final int i() {
        return 1;
    }

    public final Object m(int n3) {
        return h$a.e;
    }

    public final g$c n(int n3, g$c g$c, long l2) {
        Object object = g$c.q;
        object = this.b;
        boolean bl2 = true;
        g$c.c((MediaItem)object, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, bl2, null, 0L, -9223372036854775807L, 0L);
        object = g$c;
        g$c.k = true;
        return g$c;
    }

    public final int p() {
        return 1;
    }
}

